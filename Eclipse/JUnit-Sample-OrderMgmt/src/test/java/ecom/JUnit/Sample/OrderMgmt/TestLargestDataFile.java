package ecom.JUnit.Sample.OrderMgmt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TestLargestDataFile {
	
	public void testFromFile() throws IOException {
		String line;
		BufferedReader rdr = new BufferedReader(new FileReader("testData.txt"));
		
		while((line = rdr.readLine()) != null) {
			if(line.startsWith("#")) {
				continue; // Igonre Comments
			}
			StringTokenizer st = new StringTokenizer(line);
			if(!st.hasMoreTokens()) {
				continue; // blank line
			}
			
			// Get the excepted value 
			String val = st.nextToken();
			int excepted = Integer.valueOf(val).intValue();
			
			//Added the arrgument to largest 
			ArrayList arrugment_List = new ArrayList<>();
			
			while(st.hasMoreTokens()) {
				arrugment_List.add(Integer.valueOf(st.nextToken()));
			}
			
			// Transfer Object List into native ArrayList
			int[] arguments = new int[arrugment_List.size()];
			
			for(int i = 0; i<arrugment_List.size(); i++) {
				arguments[i] = ((Integer)arrugment_List.get(i)).intValue();
			}
			
			assertEquals(excepted, new Largest().largestNumber(arguments));
			
			
		}
	}

}
