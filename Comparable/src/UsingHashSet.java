import java.util.HashSet;

import javax.lang.model.element.Element;

public class UsingHashSet {
public static void main(String[] args) {
		int []inputArray = {12,21,12,21,54,88,88};
        HashSet<Integer> set = new HashSet<Integer>();
           
        for (int element : inputArray) 
        {
			
            if(  set.add(element))
            {
                System.out.println("In set Element : "+element);
            }else if(!set.add(element)){
            	System.out.println("Duplicate are:- "+element);
            }
        }
    }
}

