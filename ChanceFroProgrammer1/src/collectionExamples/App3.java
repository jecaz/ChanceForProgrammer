package collectionExamples;

import java.util.*;

public class App3 {
	
	// Every element from array vehicles should be connected with rows in drivers array. 
	// For exampe, ambulance drivers are: Fred, Sue and Peter, and so on..
	public static String[] vehicles = {
			"ambulance", "helicopter", "lifeboat"
			};
	
	public static String[][] drivers = {
			{"Fred", "Sue", "Pete"},
			{"Sue", "Richard", "Bob", "Fred"},
			{"Pete", "Mary", "Bob", "Bob"}
	};

	public static void main(String[] args) {
		
		Map<String, Set<String>> personnel = new HashMap<>();
		
		for(int i=0; i < vehicles.length; i++){
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];
			
			
			Set<String> driverSet = new LinkedHashSet<>();
			
			for(String driver : driversList){
				//System.out.println(driver);
				driverSet.add(driver);
			}
			
			personnel.put(vehicle, driverSet);
		}
		{ // Brackets just to scope driversList variable so can use again later
		// Example usage
		System.out.println("Example usage:");
		Set<String> driversList = personnel.get("helicopter");
		
		for(String driver : driversList){
			System.out.println(driver);
		}
		}
		System.out.println();
		
		// Iterate through whole thing
		System.out.println("Iterate through whole thing using for loop:");
		for(String vehicle : personnel.keySet()){
			System.out.print(vehicle);
			System.out.print(": ");
			Set<String> driversList = personnel.get(vehicle);
			
			for(String driver : driversList){
				System.out.print(driver);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Iterate using Entry interface
		System.out.println("Iterate through whole thing using Entry interface:");
		for(Map.Entry<String, Set<String>> entry : personnel.entrySet()){
			String key = entry.getKey();
			Set<String> value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}

	}

}
