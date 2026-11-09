<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="true" %>
<%@ page import="java.util.*,java.text.NumberFormat" %>
<%-- isELIgnored="true" keeps JSP from swallowing the JavaScript template strings below --%>
<%
  // Photos: Unsplash (free licence). Fields: name, category, price INR, garment colour, tile colour, tag, photo id
  String U = "https://images.unsplash.com/photo-";
  String IMG = "?auto=format&amp;fit=crop&amp;q=70";
  String[][] P = {
    {"Black tee","tee","1299","#14161C","#DCE3FF","New","1618354691373-d851c5c3a990"},
    {"White tee","tee","1199","#F3F5F8","#9AA6BF","","1581655353564-df123a1eb820"},
    {"Moss tee","tee","1499","#3F6B4F","#FFE76A","Few left","1633966887768-64f9a867bdba"},
    {"Ash hoodie","hoodie","3499","#9AA0A8","#DDE2EA","Bestseller","1556821840-3a63f95609a7"},
    {"Chalk hoodie","hoodie","3799","#F3F5F8","#2340FF","","1615397587950-3cbb55f95b77"},
    {"Night hoodie","hoodie","3299","#14161C","#9AA6BF","New","1616702932373-8875c950f85e"},
    {"Teal cap","cap","899","#1F8A8A","#FFD60A","","1777023584333-189f50092f25"},
    {"Street cap","cap","949","#F3F5F8","#14161C","","1783720069306-215606e66b69"}
  };
  NumberFormat nf = NumberFormat.getInstance(new Locale("en","IN"));

  // Server-side state, so links like index.jsp?cat=hoodie&sort=low work and can be shared
  String qCat = request.getParameter("cat");
  if (qCat == null || !qCat.matches("tee|hoodie|cap")) qCat = "all";
  String qQ = request.getParameter("q");
  qQ = qQ == null ? "" : qQ.trim().toLowerCase().replaceAll("[^a-z0-9 \\-]", "");
  String qSort = request.getParameter("sort");
  if (qSort == null || !qSort.matches("low|high")) qSort = "";
  final String[][] PP = P;
  List<Integer> order = new ArrayList<Integer>();
  for (int n = 0; n < P.length; n++)
    if ((qCat.equals("all") || P[n][1].equals(qCat)) && P[n][0].toLowerCase().contains(qQ)) order.add(n);
  if (qSort.equals("low")) Collections.sort(order, new Comparator<Integer>() { public int compare(Integer x, Integer y) { return Integer.parseInt(PP[x][2]) - Integer.parseInt(PP[y][2]); } });
  if (qSort.equals("high")) Collections.sort(order, new Comparator<Integer>() { public int compare(Integer x, Integer y) { return Integer.parseInt(PP[y][2]) - Integer.parseInt(PP[x][2]); } });
  int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
  String hello = hour < 12 ? "Good morning" : hour < 17 ? "Good afternoon" : "Good evening";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Rangrez | Tees, hoodies and caps</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Archivo:wdth,wght@62..125,100..900&family=Instrument+Sans:wght@400;600;700&display=swap" rel="stylesheet">
<style>
:root{--ink:#14161C;--paper:#F3F5F8;--cobalt:#2340FF;--signal:#FFD60A;--mist:#DDE2EA}
*{box-sizing:border-box;margin:0;padding:0}
[hidden]{display:none!important}
body{font:16px/1.5 'Instrument Sans',system-ui,sans-serif;background:var(--paper);color:var(--ink)}
button,input{font:inherit;color:inherit}
button{cursor:pointer;border:0;background:none}
h1,h2,h3,.brand{font-family:'Archivo',system-ui,sans-serif}
:focus-visible{outline:3px solid var(--cobalt);outline-offset:2px}
.hl :focus-visible{outline-color:var(--signal)}
.wrap{max-width:1200px;margin:0 auto;padding:0 20px}
.bar{background:var(--signal);font-size:14px;text-align:center;padding:6px 12px;font-weight:600}
header{position:sticky;top:0;z-index:5;background:var(--paper);border-bottom:1px solid var(--mist)}
.hd{display:flex;align-items:center;gap:24px;height:68px}
.brand{font-size:28px;font-weight:800;font-stretch:125%;letter-spacing:-.02em;text-decoration:none;color:var(--ink)}
nav{display:flex;gap:18px}
nav a{text-decoration:none;font-weight:600}
nav a:hover{text-decoration:underline;text-underline-offset:6px;text-decoration-thickness:2px}
.s{flex:1}
.s input{width:100%;border:1px solid var(--mist);border-radius:999px;padding:9px 18px;background:#fff}
.cartbtn{background:var(--ink);color:#fff;border-radius:999px;padding:9px 18px;font-weight:700}
.hero{display:grid;grid-template-columns:1.5fr 1fr;gap:16px;padding:16px 0}
.hl{background:linear-gradient(100deg,rgba(35,64,255,.95) 30%,rgba(35,64,255,.4)),url(<%=U%>1618453292459-53424b66bb6a?auto=format&fit=crop&q=70&w=1400) center/cover var(--cobalt);color:#fff;border-radius:24px;padding:clamp(28px,5vw,64px);display:flex;flex-direction:column;justify-content:space-between;min-height:480px}
.hl h1{font-size:clamp(2.6rem,6.4vw,5.4rem);line-height:.95;font-weight:800;font-stretch:125%;letter-spacing:-.03em;overflow-wrap:anywhere}
.hl p{max-width:44ch;margin:20px 0 28px;font-size:18px;opacity:.92}
.btn{display:inline-block;padding:13px 22px;border-radius:999px;font-weight:700;text-decoration:none}
.btn.y{background:var(--signal);color:var(--ink)}
.btn.o{box-shadow:inset 0 0 0 2px #fff;color:#fff;margin-left:8px}
.hr{background:var(--ink);color:#fff;border-radius:24px;padding:24px;display:flex;flex-direction:column;gap:16px}
.hr h2{font-size:26px;font-weight:800;font-stretch:112%}
.hr .tile{aspect-ratio:auto;flex:1;min-height:200px}
.cd{display:grid;grid-template-columns:repeat(4,1fr);gap:8px}
.cd div{background:#232733;border-radius:12px;padding:10px;text-align:center}
.cd b{display:block;font:800 28px 'Archivo',sans-serif;font-variant-numeric:tabular-nums}
.cd span{font-size:13px;opacity:.7}
.hr .rm{background:#fff;color:var(--ink);border-radius:12px;padding:12px;font-weight:700}
.sec{padding:48px 0 24px}
.sh{display:flex;justify-content:space-between;align-items:end;flex-wrap:wrap;gap:16px;margin-bottom:20px}
.sh h2{font-size:34px;font-weight:800;font-stretch:112%;letter-spacing:-.02em}
.chips{display:flex;gap:8px;flex-wrap:wrap}
.chip{padding:8px 16px;border-radius:999px;box-shadow:inset 0 0 0 1.5px var(--ink);font-weight:600}
.chip[aria-pressed=true]{background:var(--ink);color:#fff}
#sort{border-radius:999px;border:0;box-shadow:inset 0 0 0 1.5px var(--ink);background:transparent;padding:8px 14px;font-weight:600}
.grid{display:grid;grid-template-columns:repeat(4,1fr);gap:28px 16px}
.tile{position:relative;aspect-ratio:4/5;border-radius:20px;display:grid;place-items:center;overflow:hidden}
.g{width:68%}
.tile img{position:absolute;inset:0;width:100%;height:100%;object-fit:cover}
.tag{position:absolute;z-index:1;left:12px;top:12px;background:var(--ink);color:#fff;font-size:13px;font-weight:600;padding:3px 10px;border-radius:999px}
.heart{position:absolute;z-index:1;right:10px;top:8px;font-size:22px;line-height:1;width:36px;height:36px;border-radius:50%;background:rgba(255,255,255,.88)}
.meta{display:flex;justify-content:space-between;gap:8px;margin:10px 2px 8px}
.meta h3{font-size:16px;font-weight:700}
.add{width:100%;padding:10px;border-radius:12px;background:var(--mist);font-weight:700;transition:background .15s}
.add:hover{background:var(--signal)}
#none{padding:40px 0;font-size:18px}
.perks{display:grid;grid-template-columns:repeat(3,1fr);gap:16px;padding:40px 0}
.perks div{padding-top:14px;border-top:2px solid var(--ink)}
.perks b{display:block;font-family:'Archivo',sans-serif;font-size:18px}
footer{background:var(--ink);color:#fff;margin-top:24px;padding:48px 0 28px}
footer h2{font-size:30px;font-weight:800;font-stretch:112%;max-width:18ch;line-height:1.1}
#nl{display:flex;gap:8px;margin:20px 0 36px;flex-wrap:wrap}
#nl input{flex:1;min-width:220px;border-radius:999px;border:0;padding:12px 18px;background:#fff;color:var(--ink)}
#nl button{background:var(--signal);color:var(--ink);border-radius:999px;padding:12px 22px;font-weight:700}
footer small{opacity:.65}
.veil{position:fixed;inset:0;background:rgba(20,22,28,.5);opacity:0;visibility:hidden;transition:.2s;z-index:10}
.veil.open{opacity:1;visibility:visible}
.drawer{position:fixed;top:0;right:0;height:100%;width:min(420px,100%);background:#fff;z-index:11;display:flex;flex-direction:column;visibility:hidden;transform:translateX(100%);transition:transform .25s,visibility .25s}
.drawer.open{visibility:visible;transform:none}
.dh{display:flex;justify-content:space-between;align-items:center;padding:20px;border-bottom:1px solid var(--mist)}
.dh h2{font-size:22px}
.ship{padding:14px 20px;font-size:14px}
.trk{height:8px;border-radius:9px;background:var(--mist);margin-top:8px;overflow:hidden}
.trk i{display:block;height:100%;width:0;background:var(--cobalt);transition:width .3s}
.drawer ul{list-style:none;flex:1;overflow:auto;padding:0 20px}
.drawer li{display:flex;justify-content:space-between;align-items:center;padding:14px 0;border-bottom:1px solid var(--mist)}
.drawer li.empty{display:block;border:0;padding:24px 0;opacity:.75}
.drawer small{display:block;opacity:.7}
.qty{display:flex;align-items:center;gap:10px}
.qty button{width:30px;height:30px;border-radius:50%;box-shadow:inset 0 0 0 1.5px var(--ink)}
.df{padding:20px;border-top:1px solid var(--mist)}
.tot{display:flex;justify-content:space-between;font-weight:700;font-size:18px;margin-bottom:14px}
.df .btn{width:100%;text-align:center;background:var(--ink);color:#fff}
.toast{position:fixed;left:50%;bottom:24px;transform:translate(-50%,20px);background:var(--ink);color:#fff;padding:12px 18px;border-radius:12px;opacity:0;transition:.2s;z-index:12;pointer-events:none}
.toast.on{opacity:1;transform:translate(-50%,0)}
@media(max-width:900px){.grid{grid-template-columns:repeat(2,1fr)}.hero{grid-template-columns:1fr}.hl{min-height:400px}nav{display:none}.hd{flex-wrap:wrap;height:auto;padding:12px 20px;gap:12px}.s{order:3;flex-basis:100%}.brand{flex:1}.perks{grid-template-columns:1fr}.btn.o{margin:10px 0 0}}
@media(prefers-reduced-motion:reduce){*{transition:none!important}}
</style>
</head>
<body>
<svg width="0" height="0" style="position:absolute" aria-hidden="true">
  <symbol id="tee" viewBox="0 0 100 100"><path fill="currentColor" d="M30 12 12 24l8 14 8-4v54h44V34l8 4 8-14L70 12Q50 26 30 12Z"/></symbol>
  <symbol id="hoodie" viewBox="0 0 100 100"><path fill="currentColor" d="M36 12Q50 2 64 12l8 18 18 40-12 6-8-18v40H30V58l-8 18-12-6 18-40Z"/><path d="M38 14Q50 36 62 14" fill="none" stroke="rgba(0,0,0,.3)" stroke-width="3"/></symbol>
  <symbol id="cap" viewBox="0 0 100 100"><path fill="currentColor" d="M16 62Q16 28 50 28t34 34l12 4q2 8-10 8H16Z"/></symbol>
</svg>

<div class="bar"><%=hello%>. Free shipping over ₹2,999, cash on delivery available.</div>

<header>
  <div class="wrap hd">
    <a class="brand" href="index.jsp">Rangrez</a>
    <nav aria-label="Categories">
      <a href="#shop" data-cat="all">New in</a>
      <a href="#shop" data-cat="tee">Tees</a>
      <a href="#shop" data-cat="hoodie">Hoodies</a>
      <a href="#shop" data-cat="cap">Caps</a>
    </nav>
    <div class="s"><input type="search" id="q" placeholder="Search tees, hoodies, caps" aria-label="Search products" value="<%=qQ%>"></div>
    <button class="cartbtn" id="open" aria-label="Open cart">Cart (<span id="count">0</span>)</button>
  </div>
</header>

<main class="wrap">
  <section class="hero">
    <div class="hl">
      <h1>Clothes that keep up with your day.</h1>
      <div>
        <p>Tees, hoodies and caps cut for hot afternoons and cold offices. Made in small batches, so they sell out.</p>
        <a class="btn y" href="#shop" data-cat="all">Shop the drop</a><a class="btn o" href="#shop" data-cat="all">Browse everything</a>
      </div>
    </div>
    <aside class="hr" id="drop">
      <h2>Friday drop</h2>
      <div class="tile" style="background:#3F6B4F"><img src="<%=U%>1633966887768-64f9a867bdba<%=IMG%>&amp;w=700&amp;h=700" alt="Moss tee on a concrete floor" loading="lazy" onerror="this.remove()"></div>
      <p>Moss tee, dyed in small batches. 200 pieces, live at 7 pm.</p>
      <div class="cd" role="timer" aria-label="Time until the drop">
        <div><b>00</b><span>days</span></div><div><b>00</b><span>hours</span></div><div><b>00</b><span>minutes</span></div><div><b>00</b><span>seconds</span></div>
      </div>
      <button class="rm" id="remind">Remind me</button>
    </aside>
  </section>

  <section class="sec" id="shop">
    <div class="sh">
      <h2>Shop</h2>
      <div class="chips" role="group" aria-label="Filter by category">
        <button class="chip" data-cat="all" aria-pressed="<%=qCat.equals("all")%>">All</button>
        <button class="chip" data-cat="tee" aria-pressed="<%=qCat.equals("tee")%>">Tees</button>
        <button class="chip" data-cat="hoodie" aria-pressed="<%=qCat.equals("hoodie")%>">Hoodies</button>
        <button class="chip" data-cat="cap" aria-pressed="<%=qCat.equals("cap")%>">Caps</button>
        <select id="sort" aria-label="Sort products">
          <option value="">Featured</option>
          <option value="low"<%= qSort.equals("low") ? " selected" : "" %>>Price: low to high</option>
          <option value="high"<%= qSort.equals("high") ? " selected" : "" %>>Price: high to low</option>
        </select>
      </div>
    </div>
    <div class="grid">
<%
  List<Integer> all = new ArrayList<Integer>(order);   // matches first, in the requested order; the rest stay hidden for instant client filtering
  for (int n = 0; n < P.length; n++) if (!order.contains(n)) all.add(n);
  for (int k = 0; k < all.size(); k++) { int i = all.get(k); String[] p = P[i]; boolean show = order.contains(i); String base = U + p[6] + IMG; %>
      <article class="p"<%= show ? "" : " hidden" %> data-id="<%=i%>" data-name="<%=p[0]%>" data-price="<%=p[2]%>" data-cat="<%=p[1]%>">
        <div class="tile" style="background:<%=p[4]%>">
          <svg class="g" style="color:<%=p[3]%>" viewBox="0 0 100 100" aria-hidden="true"><use href="#<%=p[1]%>"/></svg>
          <img src="<%=base%>&amp;w=640&amp;h=800" srcset="<%=base%>&amp;w=360&amp;h=450 360w, <%=base%>&amp;w=640&amp;h=800 640w, <%=base%>&amp;w=900&amp;h=1125 900w" sizes="(max-width:900px) 46vw, 280px" alt="<%=p[0]%>" loading="lazy" onerror="this.remove()">
          <% if (!p[5].isEmpty()) { %><span class="tag"><%=p[5]%></span><% } %>
          <button class="heart" aria-label="Save <%=p[0]%>" aria-pressed="false">♡</button>
        </div>
        <div class="meta"><h3><%=p[0]%></h3><span>₹<%=nf.format(Integer.parseInt(p[2]))%></span></div>
        <button class="add">Add to cart</button>
      </article>
<% } %>
    </div>
    <p id="none"<%= order.isEmpty() ? "" : " hidden" %>>Nothing matches that search. Try a different word or pick All.</p>
  </section>

  <section class="perks">
    <div><b>Free shipping over ₹2,999</b>Delivered in 3 to 5 days across India.</div>
    <div><b>15-day returns</b>Wrong size? Swap it, no questions.</div>
    <div><b>Cash on delivery</b>Pay when it arrives, if you prefer.</div>
  </section>
</main>

<footer>
  <div class="wrap">
    <h2>Get the Friday drop before it sells out.</h2>
    <form id="nl">
      <input type="email" required placeholder="Email address" aria-label="Email address">
      <button type="submit">Get drop alerts</button>
    </form>
    <small>© <%= java.time.Year.now() %> Rangrez. Dyed and sewn in India.</small>
  </div>
</footer>

<div class="veil" id="veil"></div>
<aside class="drawer" id="drawer" aria-label="Cart" aria-hidden="true">
  <div class="dh"><h2>Your cart</h2><button id="close" aria-label="Close cart">Close</button></div>
  <div class="ship"><span id="shipmsg"></span><div class="trk"><i id="bar"></i></div></div>
  <ul id="lines"></ul>
  <div class="df">
    <div class="tot"><span>Total</span><span id="total">₹0</span></div>
    <a class="btn" id="go" href="checkout.jsp" hidden>Checkout</a>
  </div>
</aside>
<div class="toast" id="toast" role="status" aria-live="polite"></div>

<script>
const $=s=>document.querySelector(s),$$=s=>[...document.querySelectorAll(s)];
const inr=n=>'₹'+n.toLocaleString('en-IN'),FREE=2999;
const items=$$('.p').map(el=>({id:el.dataset.id,name:el.dataset.name,price:+el.dataset.price,cat:el.dataset.cat,el}));
const cart={};let cat='<%=qCat%>',q='<%=qQ%>',sort='<%=qSort%>',tt;

function toast(m){const t=$('#toast');t.textContent=m;t.classList.add('on');clearTimeout(tt);tt=setTimeout(()=>t.classList.remove('on'),1800)}
function drawer(on){$('#drawer').classList.toggle('open',on);$('#veil').classList.toggle('open',on);$('#drawer').setAttribute('aria-hidden',!on);if(on)$('#close').focus();else $('#open').focus()}

function filter(){
  const list=items.slice().sort((x,y)=>sort==='low'?x.price-y.price:sort==='high'?y.price-x.price:x.id-y.id),grid=$('.grid');
  list.forEach(i=>grid.appendChild(i.el));
  items.forEach(i=>{i.el.hidden=!((cat==='all'||i.cat===cat)&&i.name.toLowerCase().includes(q))});
  $('#none').hidden=items.some(i=>!i.el.hidden);
  $$('.chip').forEach(c=>c.setAttribute('aria-pressed',c.dataset.cat===cat));
  const u=new URLSearchParams();if(cat!=='all')u.set('cat',cat);if(q)u.set('q',q);if(sort)u.set('sort',sort);
  try{history.replaceState(null,'',location.pathname+(u.toString()?'?'+u:''))}catch(_){}
}
function render(){
  const ids=Object.keys(cart),n=ids.reduce((a,id)=>a+cart[id],0);
  const total=ids.reduce((a,id)=>a+cart[id]*items.find(x=>x.id===id).price,0);
  $('#count').textContent=n;
  $('#lines').innerHTML=ids.length?ids.map(id=>{
    const i=items.find(x=>x.id===id);
    return '<li><div><b>'+i.name+'</b><small>'+inr(i.price)+'</small></div><div class="qty"><button data-d="-1" data-id="'+id+'" aria-label="Remove one '+i.name+'">−</button><span>'+cart[id]+'</span><button data-d="1" data-id="'+id+'" aria-label="Add one '+i.name+'">+</button></div></li>';
  }).join(''):'<li class="empty">Your cart is empty. Add something from the drop.</li>';
  $('#total').textContent=inr(total);
  $('#bar').style.width=Math.min(100,total/FREE*100)+'%';
  $('#shipmsg').textContent=total>=FREE?'You get free shipping.':'Add '+inr(FREE-total)+' more for free shipping.';
  $('#go').hidden=!n;
}
function nextDrop(){const d=new Date();d.setHours(19,0,0,0);d.setDate(d.getDate()+((5-d.getDay()+7)%7));if(d<new Date())d.setDate(d.getDate()+7);return d}
const dropAt=nextDrop();
function tick(){
  const s=Math.max(0,Math.floor((dropAt-Date.now())/1000));
  const v=[Math.floor(s/86400),Math.floor(s%86400/3600),Math.floor(s%3600/60),s%60];
  $$('.cd b').forEach((b,i)=>b.textContent=String(v[i]).padStart(2,'0'));
}

document.addEventListener('click',e=>{
  const t=e.target.closest('button,a');if(!t)return;
  if(t.classList.contains('add')){const id=t.closest('.p').dataset.id;cart[id]=(cart[id]||0)+1;render();toast('Added to cart')}
  else if(t.classList.contains('heart')){const on=t.getAttribute('aria-pressed')!=='true';t.setAttribute('aria-pressed',on);t.textContent=on?'♥':'♡';toast(on?'Saved':'Removed from saved')}
  else if(t.dataset.cat){cat=t.dataset.cat;filter()}
  else if(t.dataset.d){const id=t.dataset.id;cart[id]+=+t.dataset.d;if(cart[id]<1)delete cart[id];render()}
  else if(t.id==='open')drawer(true);
  else if(t.id==='close')drawer(false);
  else if(t.id==='remind')toast('We will remind you before the drop.');
});
$('#veil').onclick=()=>drawer(false);
document.addEventListener('keydown',e=>{if(e.key==='Escape')drawer(false)});
$('#q').addEventListener('input',e=>{q=e.target.value.trim().toLowerCase();filter()});
$('#sort').addEventListener('change',e=>{sort=e.target.value;filter()});
$('#nl').addEventListener('submit',e=>{e.preventDefault();e.target.reset();toast('You are on the list.')});

render();tick();filter();setInterval(tick,1000);
</script>
</body>
</html>
