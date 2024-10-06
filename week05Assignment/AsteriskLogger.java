package week05Assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		int length = error.length();
		String box = "*".repeat(length + 3) + "*";
		System.err.println(box);
		System.err.println("*****" + "ERROR:" + "******");
		System.err.println("**" + error + "**");
		System.err.println(box);
	}
	
	

}
