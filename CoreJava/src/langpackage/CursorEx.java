package langpackage;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorEx {
	
	public static void main(String[] args) {
		
		//Enumeration  Ex
//		Vector<String> vc = new Vector<>();
//		vc.add("Akit");
//		vc.add("Krishna");
//		vc.add("Anupam");
//		System.out.println(vc);
//		
//		Enumeration<String> e = vc.elements();
//		while(e.hasMoreElements()) {
//			String nextElement = e.nextElement();
//			
//			System.out.println(nextElement);
//		}
//	
		// Iterator Ex
//		ArrayList<Integer> as=  new ArrayList<>();
//		for (int i = 0; i <= 10; i++) {
//			as.add(i);
//		}
//		System.out.println(as);
//		Iterator<Integer> itr = as.iterator();
//		
//		while(itr.hasNext()){
//			Integer nextelement = itr.next();
//			if(nextelement%2==0) {
//				System.out.println(nextelement);
//			}else {
//				itr.remove();
//			}
//		}
		
		//ListIterator Example
		
		ArrayList<String> a1= new ArrayList<>();
		
		a1.add("Anku");
		a1.add("asha");
		a1.add("Radha");
		a1.add("Krishna");
		a1.add("Ram");
		
		System.out.println(a1);
		
		ListIterator<String> litr = a1.listIterator();
		while (litr.hasNext()) {
			 String nextname = litr.next();
			 if(nextname.equals("Ram")) {
				litr.remove(); 
			 } else if(nextname.equals("Anku")) {
				 litr.add("Ankit");
			 }if(nextname.equals("Krishna")) {
				 litr.add("Himanshu");
			 }
			 
		}
		
		System.out.println(a1);
	}

	}
