<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="true" %>
<%@ page import="java.util.*" %>
<%-- isELIgnored keeps JSP from evaluating anything in the page that looks like an expression --%>
<%
  String U = "https://images.unsplash.com/photo-";          // Unsplash photos (free licence)
  String IMG = "?auto=format&amp;fit=crop&amp;q=70";
  // name, category, pack size, price INR, MRP INR, photo id
  String[][] P = {
    {"Mixed bell peppers","veg","500 g","79","99","1774712471470-5aa92dfc94ae"},
    {"Farm vegetable box","veg","1 kg","129","169","1590779033100-9f60a05a013d"},
    {"Citrus fruits","veg","6 pcs","99","129","1610832958506-aa56368176cf"},
    {"Seasonal fruit mix","veg","1 kg","149","189","1488459716781-31db52582fe9"},
    {"Leafy and salad veg","veg","800 g","89","119","1597362925123-77861d3fbac7"},
    {"Tomatoes and peppers","veg","750 g","69","89","1775227612415-4569328d9631"},
    {"Farm eggs","dairy","12 pcs","96","120","1646834098697-5fc0da68a485"},
    {"Eggs and milk combo","dairy","6 pcs + 500 ml","89","110","1646834118758-479021c8d1fc"},
    {"Breakfast egg pack","dairy","12 pcs + 1 L","165","190","1646834107441-507129033287"},
    {"Choco chip cookies","bakery","200 g","99","120","1619115805622-aa28718e5abf"},
    {"Jam thumbprint cookies","bakery","250 g","129","149","1788072119439-d3d85b95f455"},
    {"Butter cookies assorted","bakery","300 g","149","179","1480215529400-2995f91ddb96"}
  };
  String[][] C = {   // key, title, thumbnail photo
    {"veg","Fruits &amp; vegetables","1610832958506-aa56368176cf"},
    {"dairy","Dairy &amp; eggs","1646834118758-479021c8d1fc"},
    {"bakery","Cookies &amp; biscuits","1619115805622-aa28718e5abf"}
  };
  // Server-side state, so links like zepto.jsp?cat=dairy or ?q=egg work and can be shared
  String qCat = request.getParameter("cat");
  if (qCat == null || !qCat.matches("veg|dairy|bakery")) qCat = "all";
  String qQ = request.getParameter("q");
  qQ = qQ == null ? "" : qQ.trim().toLowerCase().replaceAll("[^a-z0-9 \\-]", "");
  boolean[] ok = new boolean[P.length];
  boolean anyOk = false;
  for (int n = 0; n < P.length; n++) {
    ok[n] = (qCat.equals("all") || P[n][1].equals(qCat)) && P[n][0].toLowerCase().contains(qQ);
    anyOk |= ok[n];
  }
  int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
  String meal = hour < 11 ? "Breakfast" : hour < 16 ? "Lunch" : "Dinner";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Zepto | Groceries in 10 minutes (UI demo)</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@400;600;700;800&display=swap" rel="stylesheet">
<style>
:root{--brand:#4A1A8C;--pink:#FF3D7F;--soft:#F3EEFB;--ink:#1C1330;--mut:#6B6480;--ok:#0F8A3B;--line:#E7E2F0}
*{box-sizing:border-box;margin:0;padding:0}
[hidden]{display:none!important}
body{font:15px/1.45 'Plus Jakarta Sans',system-ui,sans-serif;color:var(--ink);background:#fff;padding-bottom:84px}
button,input,select{font:inherit;color:inherit}
button{cursor:pointer;border:0;background:none}
:focus-visible{outline:3px solid var(--pink);outline-offset:2px}
.w{max-width:1240px;margin:0 auto;padding:0 20px}
header{position:sticky;top:0;z-index:5;background:#fff;border-bottom:1px solid var(--line)}
.hd{display:flex;align-items:center;gap:20px;height:72px}
.logo{font-weight:800;font-size:32px;letter-spacing:-.06em;font-style:italic;color:var(--brand);text-decoration:none}
.loc{display:flex;flex-direction:column;line-height:1.25}
.loc b{font-size:15px}
.loc select{border:0;background:none;color:var(--mut);font-size:13px;padding:0;width:max-content;cursor:pointer}
.s{flex:1}
.s input{width:100%;border:0;background:var(--soft);border-radius:14px;padding:13px 18px}
.cartbtn{background:var(--brand);color:#fff;border-radius:14px;padding:12px 18px;font-weight:700}
.cats{display:flex;gap:10px;overflow-x:auto;padding:16px 0 4px;scrollbar-width:none}
.cat{flex:none;display:flex;align-items:center;gap:10px;padding:6px 18px 6px 6px;border-radius:999px;background:var(--soft);font-weight:700}
.cat img,.cat i{width:40px;height:40px;border-radius:50%;object-fit:cover;display:grid;place-items:center;background:#fff;font-style:normal}
.cat[aria-pressed=true]{background:var(--brand);color:#fff}
.hero{display:grid;grid-template-columns:2fr 1fr;grid-template-rows:1fr 1fr;gap:14px;padding:16px 0 4px}
.b{border-radius:22px;padding:24px;color:#fff;text-decoration:none;background:center/cover var(--brand);display:flex;flex-direction:column;justify-content:flex-end;min-height:160px}
.b.big{grid-row:span 2;min-height:380px;padding:36px}
.b h1{font-size:clamp(2rem,4.2vw,3.2rem);line-height:1.05;font-weight:800;letter-spacing:-.03em;max-width:14ch}
.b h3{font-size:22px;font-weight:800;line-height:1.15}
.b p{opacity:.92;margin-top:6px}
.pill{align-self:flex-start;background:var(--pink);font-weight:700;font-size:13px;padding:4px 12px;border-radius:999px;margin-bottom:auto}
.go{align-self:flex-start;margin-top:18px;background:#fff;color:var(--brand);padding:11px 22px;border-radius:12px;font-weight:700}
.rail{padding:30px 0 0}
.rh{display:flex;justify-content:space-between;align-items:baseline;margin-bottom:14px}
.rh h2{font-size:22px;font-weight:800;letter-spacing:-.02em}
.more{color:var(--pink);font-weight:700}
.row{display:flex;gap:16px;overflow-x:auto;scroll-snap-type:x proximity;padding-bottom:8px;scrollbar-width:thin}
main.one .row{flex-wrap:wrap;overflow:visible}
.card{flex:none;width:188px;scroll-snap-align:start}
.img{position:relative;aspect-ratio:1;border-radius:16px;overflow:hidden;background:var(--soft)}
.img img{width:100%;height:100%;object-fit:cover}
.off{position:absolute;left:8px;top:8px;background:var(--ok);color:#fff;font-size:12px;font-weight:700;padding:2px 8px;border-radius:8px}
.eta{font-size:12px;color:var(--mut);margin:8px 0 2px}
.card h3{font-size:14px;font-weight:700;line-height:1.3}
.card small{color:var(--mut)}
.buy{display:flex;justify-content:space-between;align-items:center;margin-top:8px;min-height:38px}
.pr b{display:block}
.pr s{color:var(--mut);font-size:12px}
.add{border:1.5px solid var(--pink);color:var(--pink);font-weight:800;border-radius:10px;padding:7px 22px;transition:background .15s,color .15s}
.add:hover{background:var(--pink);color:#fff}
.step{display:flex;align-items:center;background:var(--pink);color:#fff;border-radius:10px;font-weight:800}
.step button{width:32px;height:34px;font-size:18px;color:#fff}
.step span{min-width:20px;text-align:center}
#none{padding:48px 0;font-size:18px}
.perks{display:grid;grid-template-columns:repeat(3,1fr);gap:16px;padding:48px 0 16px}
.perks div{background:var(--soft);border-radius:18px;padding:20px}
.perks b{display:block;font-size:17px;margin-bottom:4px}
footer{border-top:1px solid var(--line);margin-top:32px;padding:28px 0;color:var(--mut);font-size:13px}
footer .logo{font-size:26px}
.cb{position:fixed;left:50%;bottom:18px;transform:translateX(-50%);z-index:6;background:var(--pink);color:#fff;border-radius:16px;padding:10px 12px 10px 20px;display:flex;gap:28px;align-items:center;font-weight:700;box-shadow:0 8px 24px rgba(74,26,140,.3)}
.cb button{background:#fff;color:var(--pink);border-radius:10px;padding:8px 16px;font-weight:800}
.veil{position:fixed;inset:0;background:rgba(28,19,48,.5);opacity:0;visibility:hidden;transition:.2s;z-index:10}
.veil.open{opacity:1;visibility:visible}
.drawer{position:fixed;top:0;right:0;height:100%;width:min(420px,100%);background:#fff;z-index:11;display:flex;flex-direction:column;visibility:hidden;transform:translateX(100%);transition:transform .25s,visibility .25s}
.drawer.open{visibility:visible;transform:none}
.dh{display:flex;justify-content:space-between;align-items:center;padding:20px;border-bottom:1px solid var(--line)}
.dh h2{font-size:22px}
.ship{padding:14px 20px;font-size:14px;background:var(--soft)}
.trk{height:8px;border-radius:9px;background:#fff;margin-top:8px;overflow:hidden}
.trk i{display:block;height:100%;width:0;background:var(--ok);transition:width .3s}
.drawer ul{list-style:none;flex:1;overflow:auto;padding:0 20px}
.drawer li{display:flex;justify-content:space-between;align-items:center;gap:12px;padding:14px 0;border-bottom:1px solid var(--line)}
.drawer li.empty{display:block;border:0;padding:24px 0;color:var(--mut)}
.drawer li small{display:block;color:var(--mut)}
.qty{display:flex;align-items:center;gap:10px}
.qty button{width:30px;height:30px;border-radius:50%;box-shadow:inset 0 0 0 1.5px var(--pink);color:var(--pink);font-weight:800}
.bill{padding:16px 20px;border-top:1px solid var(--line);font-size:14px}
.bill div{display:flex;justify-content:space-between;padding:3px 0}
.bill .sv{color:var(--ok);font-weight:700}
.bill .tot{font-weight:800;font-size:17px;border-top:1px dashed var(--line);margin-top:6px;padding-top:10px}
.pay{display:block;margin:0 20px 20px;text-align:center;background:var(--brand);color:#fff;border-radius:14px;padding:14px;font-weight:700;text-decoration:none}
.toast{position:fixed;left:50%;bottom:92px;transform:translate(-50%,20px);background:var(--ink);color:#fff;padding:12px 18px;border-radius:12px;opacity:0;transition:.2s;z-index:12;pointer-events:none}
.toast.on{opacity:1;transform:translate(-50%,0)}
@media(max-width:860px){.hero{grid-template-columns:1fr;grid-template-rows:auto}.b.big{grid-row:auto;min-height:320px}.hd{flex-wrap:wrap;height:auto;padding:10px 20px;gap:10px}.s{order:3;flex-basis:100%}.loc{flex:1}.card{width:152px}.perks{grid-template-columns:1fr}}
@media(prefers-reduced-motion:reduce){*{transition:none!important}}
</style>
</head>
<body>
<header>
  <div class="w hd">
    <a class="logo" href="zepto.jsp" aria-label="Zepto home">zepto</a>
    <label class="loc"><b>Delivery in 10 minutes</b>
      <select id="city" aria-label="Delivery city"><option>Bengaluru</option><option>Chennai</option><option>Delhi NCR</option><option>Hyderabad</option><option>Mumbai</option><option>Pune</option></select>
    </label>
    <div class="s"><input type="search" id="q" placeholder='Search for "milk"' aria-label="Search products" value="<%=qQ%>"></div>
    <button class="cartbtn" data-open>Cart (<span id="count">0</span>)</button>
  </div>
</header>

<main class="w<%= qCat.equals("all") ? "" : " one" %>" id="top">
  <nav class="cats" aria-label="Categories">
    <button class="cat" data-cat="all" aria-pressed="<%=qCat.equals("all")%>"><i>✨</i>All</button>
<% for (String[] c : C) { %>
    <button class="cat" data-cat="<%=c[0]%>" aria-pressed="<%=qCat.equals(c[0])%>"><img src="<%=U+c[2]+IMG%>&amp;w=80&amp;h=80" alt="" loading="lazy"><%=c[1]%></button>
<% } %>
  </nav>

  <section class="hero" aria-label="Offers">
    <a class="b big" href="#rails" data-cat="veg" style="background-image:linear-gradient(100deg,rgba(60,15,120,.93) 32%,rgba(60,15,120,.1)),url(<%=U%>1785670719039-97d931c57436<%=IMG%>&amp;w=1400)">
      <span class="pill">Delivery in 10 minutes</span>
      <h1><%=meal%> at your door in 10 minutes</h1>
      <p>Fresh vegetables and fruit, picked this morning.</p>
      <span class="go">Shop vegetables</span>
    </a>
    <a class="b" href="#rails" data-cat="dairy" style="background-image:linear-gradient(100deg,rgba(255,61,127,.92) 30%,rgba(255,61,127,.1)),url(<%=U%>1646834118758-479021c8d1fc<%=IMG%>&amp;w=800)">
      <h3>Eggs and milk</h3><p>Breakfast, sorted.</p>
    </a>
    <a class="b" href="#rails" data-cat="bakery" style="background-image:linear-gradient(100deg,rgba(28,19,48,.9) 30%,rgba(28,19,48,.1)),url(<%=U%>1619115805622-aa28718e5abf<%=IMG%>&amp;w=800)">
      <h3>Tea-time cookies</h3><p>Baked small, sold fast.</p>
    </a>
  </section>

  <div id="rails">
<% for (String[] c : C) {
     boolean any = false;
     for (int i = 0; i < P.length; i++) if (P[i][1].equals(c[0]) && ok[i]) any = true; %>
    <section class="rail"<%= any ? "" : " hidden" %>>
      <div class="rh"><h2><%=c[1]%></h2><button class="more" data-cat="<%=c[0]%>">See all</button></div>
      <div class="row">
<%   for (int i = 0; i < P.length; i++) {
       if (!P[i][1].equals(c[0])) continue;
       String[] p = P[i];
       int off = Math.round((Integer.parseInt(p[4]) - Integer.parseInt(p[3])) * 100f / Integer.parseInt(p[4]));
       String base = U + p[5] + IMG; %>
        <article class="card"<%= ok[i] ? "" : " hidden" %> data-id="<%=i%>" data-name="<%=p[0]%>" data-cat="<%=p[1]%>" data-price="<%=p[3]%>" data-mrp="<%=p[4]%>">
          <div class="img">
            <img src="<%=base%>&amp;w=400&amp;h=400" srcset="<%=base%>&amp;w=240&amp;h=240 240w, <%=base%>&amp;w=400&amp;h=400 400w, <%=base%>&amp;w=640&amp;h=640 640w" sizes="188px" alt="<%=p[0]%>" loading="lazy">
            <span class="off"><%=off%>% off</span>
          </div>
          <div class="eta">10 mins</div>
          <h3><%=p[0]%></h3><small><%=p[2]%></small>
          <div class="buy">
            <div class="pr"><b>₹<%=p[3]%></b><s>₹<%=p[4]%></s></div>
            <button class="add" aria-label="Add <%=p[0]%>">Add</button>
            <div class="step" hidden><button data-d="-1" data-id="<%=i%>" aria-label="Remove one <%=p[0]%>">−</button><span>0</span><button data-d="1" data-id="<%=i%>" aria-label="Add one <%=p[0]%>">+</button></div>
          </div>
        </article>
<%   } %>
      </div>
    </section>
<% } %>
  </div>
  <p id="none"<%= anyOk ? " hidden" : "" %>>Nothing matches that search. Try milk, eggs or cookies.</p>

  <section class="perks">
    <div><b>Fast delivery</b>Most orders reach you in about 10 minutes.</div>
    <div><b>Fair prices</b>Every item shows its MRP and what you save.</div>
    <div><b>Fresh picks</b>Produce and eggs are restocked through the day.</div>
  </section>
</main>

<footer>
  <div class="w"><a class="logo" href="zepto.jsp">zepto</a>
  <p>© <%= java.time.Year.now() %> UI demo inspired by Zepto. Not affiliated with or endorsed by Zepto. Photos from Unsplash.</p></div>
</footer>

<div class="cb" id="cb" hidden><span id="cbt"></span><button data-open>View cart</button></div>
<div class="veil" id="veil"></div>
<aside class="drawer" id="drawer" aria-label="Cart" aria-hidden="true">
  <div class="dh"><h2>My cart</h2><button id="close" aria-label="Close cart">Close</button></div>
  <div class="ship"><span id="shipmsg"></span><div class="trk"><i id="bar"></i></div></div>
  <ul id="lines"></ul>
  <div class="bill" id="bill" hidden>
    <div><span>Item total</span><span id="sub"></span></div>
    <div><span>Delivery fee</span><span id="fee"></span></div>
    <div><span>Handling fee</span><span>₹2</span></div>
    <div class="sv" id="svrow"><span>You save</span><span id="sv"></span></div>
    <div class="tot"><span>To pay</span><span id="total"></span></div>
  </div>
  <a class="pay" id="go" href="checkout.jsp" hidden>Proceed to pay</a>
</aside>
<div class="toast" id="toast" role="status" aria-live="polite"></div>

<script>
const $=s=>document.querySelector(s),$$=s=>[...document.querySelectorAll(s)];
const inr=n=>'₹'+n.toLocaleString('en-IN'),FREE=199;
const items=$$('.card').map(el=>({id:el.dataset.id,name:el.dataset.name,price:+el.dataset.price,mrp:+el.dataset.mrp,cat:el.dataset.cat,el}));
const cart={};let cat='<%=qCat%>',q='<%=qQ%>',tt;

function toast(m){const t=$('#toast');t.textContent=m;t.classList.add('on');clearTimeout(tt);tt=setTimeout(()=>t.classList.remove('on'),1800)}
function drawer(on){$('#drawer').classList.toggle('open',on);$('#veil').classList.toggle('open',on);$('#drawer').setAttribute('aria-hidden',!on);if(on)$('#close').focus()}

function filter(){
  items.forEach(i=>{i.el.hidden=!((cat==='all'||i.cat===cat)&&i.name.toLowerCase().includes(q))});
  $$('.rail').forEach(r=>{r.hidden=!r.querySelector('.card:not([hidden])')});
  $('#none').hidden=!!$('.card:not([hidden])');
  $('#top').classList.toggle('one',cat!=='all');
  $$('.cat').forEach(c=>c.setAttribute('aria-pressed',c.dataset.cat===cat));
  const u=new URLSearchParams();if(cat!=='all')u.set('cat',cat);if(q)u.set('q',q);
  try{history.replaceState(null,'',location.pathname+(u.toString()?'?'+u:''))}catch(_){}
}
function render(){
  const ids=Object.keys(cart);let n=0,sub=0,mrp=0;
  ids.forEach(id=>{const i=items.find(x=>x.id===id);n+=cart[id];sub+=cart[id]*i.price;mrp+=cart[id]*i.mrp});
  items.forEach(i=>{const k=cart[i.id]||0,s=i.el.querySelector('.step');i.el.querySelector('.add').hidden=k>0;s.hidden=!k;s.querySelector('span').textContent=k});
  const fee=sub>=FREE?0:25,total=n?sub+fee+2:0;
  $('#count').textContent=n;
  $('#cb').hidden=!n;$('#cbt').textContent=n+(n>1?' items':' item')+' | '+inr(total);
  $('#lines').innerHTML=n?ids.map(id=>{const i=items.find(x=>x.id===id);
    return '<li><div><b>'+i.name+'</b><small>'+inr(i.price*cart[id])+'</small></div><div class="qty"><button data-d="-1" data-id="'+id+'" aria-label="Remove one '+i.name+'">−</button><span>'+cart[id]+'</span><button data-d="1" data-id="'+id+'" aria-label="Add one '+i.name+'">+</button></div></li>'}).join(''):'<li class="empty">Your cart is empty. Add something fresh.</li>';
  $('#bill').hidden=$('#go').hidden=!n;
  $('#sub').textContent=inr(sub);$('#fee').textContent=fee?inr(fee):'Free';
  $('#sv').textContent=inr(mrp-sub);$('#svrow').hidden=mrp<=sub;$('#total').textContent=inr(total);
  $('#bar').style.width=Math.min(100,sub/FREE*100)+'%';
  $('#shipmsg').textContent=sub>=FREE?'You get free delivery.':'Add '+inr(FREE-sub)+' more for free delivery.';
}

document.addEventListener('click',e=>{
  const t=e.target.closest('button,a');if(!t)return;
  if(t.classList.contains('add')){cart[t.closest('.card').dataset.id]=1;render();toast('Added to cart')}
  else if(t.dataset.d){const id=t.dataset.id;cart[id]=(cart[id]||0)+ +t.dataset.d;if(cart[id]<1)delete cart[id];render()}
  else if(t.dataset.cat){cat=t.dataset.cat;filter();if(t.tagName==='BUTTON')$('#rails').scrollIntoView({behavior:'smooth',block:'start'})}
  else if(t.hasAttribute('data-open'))drawer(true);
  else if(t.id==='close')drawer(false);
});
$('#veil').onclick=()=>drawer(false);
document.addEventListener('keydown',e=>{if(e.key==='Escape')drawer(false)});
$('#q').addEventListener('input',e=>{q=e.target.value.trim().toLowerCase();filter()});
$('#city').addEventListener('change',e=>toast('Showing stores in '+e.target.value));

const words=['milk','eggs','tomatoes','cookies','oranges'];let wi=0;
setInterval(()=>{$('#q').placeholder='Search for "'+words[++wi%words.length]+'"'},2200);

render();filter();
</script>
</body>
</html>
