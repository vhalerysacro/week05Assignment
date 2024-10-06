package week05Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
	StringBuilder space = new StringBuilder();//StringBuilder for more efficient string manipulation; mutable
	for (int i = 0; i < log.length(); i++) { //iterates through each char in log string until reaches the log string length
		space.append(log.charAt(i)).append(" ");// append method to add char from log String and space to StringBuilder
	}
		System.out.println(space.toString());// converts StringBuilder to String to print
		
	}

	@Override
	public void error(String error) {
		StringBuilder space = new StringBuilder();//StringBuilder for more efficient string manipulation; mutable
		for (int i = 0; i < error.length(); i++) {//iterates through each char in log string until reaches the log string length
			space.append(error.charAt(i)).append(" ");// append method to add char from log String and space to StringBuilder
		}
			System.err.println("ERROR: " + space.toString());//prints ERROR: and converts StringBuilder to String to print
		
	}
	
	
}
