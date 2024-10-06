package week05Assignment;

public class App {

	//class that instantiates an instance for each logger classes that implement Logger interface 
	public static void main(String[] args) {
		
		Logger aLogger = new AsteriskLogger();
		
		Logger sLogger = new SpacedLogger();
		
		// passing Strings using methods from AsteriskLogger and SpacedLogger classes
		
		aLogger.log("You're a wizard Vhalery!"); 
		aLogger.error("Aveda Kedavra");
		
		sLogger.log("LUMOS");
		sLogger.error("NOX");
	}

}
