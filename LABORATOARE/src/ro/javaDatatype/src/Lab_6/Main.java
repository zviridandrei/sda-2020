
package Lab_6;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

	public static void main(String[] args) {
		double[] notemate;
		notemate = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double[] noterom = new double[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		// Create a HashMap object called catalog
		studentdetails elev1 = new studentdetails("Zvirid", "Andrei", noterom[0], notemate[9]);
		studentdetails elev2 = new studentdetails("Popescu", "Ionut", noterom[1], notemate[8]);
		studentdetails elev3 = new studentdetails("Dumitru", "Mihai", noterom[2], notemate[7]);
		studentdetails elev4 = new studentdetails("Petrescu", "Vlad", noterom[3], notemate[6]);
		studentdetails elev5 = new studentdetails("Ionescu", "Zvirid", noterom[4], notemate[5]);
		studentdetails elev6 = new studentdetails("Mihai", "Petrescu", noterom[5], notemate[4]);
		studentdetails elev7 = new studentdetails("Radu", "Ionescu", noterom[6], notemate[3]);
		studentdetails elev8 = new studentdetails("Sebi", "Andrei", noterom[7], notemate[2]);
		studentdetails elev9 = new studentdetails("Ioan", "Dumitru", noterom[8], notemate[1]);
		studentdetails elev10 = new studentdetails("Andrei", "Popescu", noterom[9], notemate[0]);

		HashMap<String, studentdetails> catalog = new HashMap<String, studentdetails>();

		// Add keys and values (CNP,Name)
		catalog.put("1a", elev1);
		catalog.put("2b", elev2);
		catalog.put("3c", elev3);
		catalog.put("4d", elev4);
		catalog.put("5e", elev5);
		catalog.put("6f", elev6);
		catalog.put("7g", elev7);
		catalog.put("8h", elev8);
		catalog.put("9i", elev9);
		catalog.put("10", elev10);
		//System.out.println(catalog);
		System.out.println(catalog.get("9i"));
		// for(String getkey:catalog.keySet())
		// {
		// System.out.println(getkey);
		// }
	

		LinkedHashMap<String, studentdetails> catalog1 = new LinkedHashMap<String, studentdetails>();
		catalog1.put("19f", elev1);
		catalog1.put("sdg", elev2);
		catalog1.put("4ff", elev3);
		catalog1.put("9i", elev4);
		catalog1.put("adf", elev5);
		catalog1.put("555", elev6);
		catalog1.put("5547h", elev7);
		catalog1.put("88", elev8);
		catalog1.put("098", elev9);
		catalog1.put("abcd", elev10);
		// for(String getkeys:catalog1.keySet())
		// {
		// System.out.println(getkeys);
		// }
		System.out.println(catalog1.get("9i"));
	}

}
