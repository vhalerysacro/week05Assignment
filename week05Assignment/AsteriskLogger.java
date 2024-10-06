package week05Assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		
		System.out.println("***" + log + "***"); //prints 3 of * on each side of String
	}

	@Override
	public void error(String error) {
		int length = error.length(); //length of String
		String box = "*".repeat(length + 3) + "*"; //repeats String length as same value as concatenated input String 
		System.err.println(box); //creates top border
		System.err.println("*****" + "ERROR:" + "******"); // prints error w/ surrounding *
		System.err.println("**" + error + "**"); //prints error String w/ surrounding *
		System.err.println(box); //creates bottom border
	}
	
	

}
