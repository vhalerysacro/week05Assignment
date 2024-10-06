package week05Assignment;

public class App {

	public static void main(String[] args) {
		
		Logger aLogger = new AsteriskLogger();
		
		Logger sLogger = new SpacedLogger();
		
		aLogger.log("You're a wizard Vhalery!");
		aLogger.error("Aveda Kedavra");
		
		sLogger.log("LUMOS");
		sLogger.error("NOX");
	}

}
