package week05Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
	StringBuilder space = new StringBuilder();
	for (int i = 0; i < log.length(); i++) {
		space.append(log.charAt(i)).append(" ");
	}
		System.out.println(space.toString());
		
	}

	@Override
	public void error(String error) {
		StringBuilder space = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			space.append(error.charAt(i)).append(" ");
		}
			System.err.println("ERROR: " + space.toString());
		
	}
	
	
}
