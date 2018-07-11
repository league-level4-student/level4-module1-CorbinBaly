package _04_Intro_To_Enums;

public class IntroToEnums {
	// An enum (short for enumerated type) is a way to 
	// categorize a set of states for one by one referencing 
	
	// The syntax for an enum is like this:
	enum DataTypes {
		// Every entry must be unique
		INTEGER, DOUBLE, BOOLEAN, LONG, SHORT, BYTE
	}
	
	// Look at the StatesOfMatter enum for another example
	
	public static void main(String[] args) {
		// Enum objects can be created and initialized:
		DataTypes data = DataTypes.INTEGER;
		
		//They can then be used for comparison
		if(data == DataTypes.INTEGER) {
			System.out.println("INT");
		}
		
		//They can also be used in a switch statement
		switch(data) {
		// Notice that 'DataTypes.' is not requires when accessing categories
		case INTEGER:{
			System.out.println("INT");
			break;
		}
		case DOUBLE:{
			System.out.println("DOUBLE");
			break;
		}
		case BOOLEAN:{
			System.out.println("BOOLEAN");
			break;
		}
		case LONG:{
			System.out.println("LONG");
			break;
		}
		case SHORT:{
			System.out.println("SHORT");
			break;
		}
		case BYTE:{
			System.out.println("BYTE");
			break;
		}
		}
	}
}
