package TestPackage;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValue {

	public static void main(String[] args) {
		
		String testing [] = {"Java", "Cucumber", "Java", "TestNG", "Maven"}; 
		
		Set<String> Store = new HashSet <String>();
		
		for (String name: testing) {
			if(Store.add(name)== false) {
				
				System.out.println("Duplicate value is " + name);
			}
		}
		
		//we need 3 methods to find duplicate value:
		//need set interface, advanced for loop, and if condition

	}

}
