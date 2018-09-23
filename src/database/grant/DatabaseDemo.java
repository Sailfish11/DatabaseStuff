package database.grant;

public class DatabaseDemo {
	private final String userName = "root";
	
	private final String password = "gSQLh1116!";
	
	public static void main(String[] args) {
		HelpClass test = new HelpClass();
		try {
			test.readDataBase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
