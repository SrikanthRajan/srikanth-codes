package Week3.day1;

public class Studentsdet {
	
	public void getStudrntsInfo()
	
	{
		System .out .println("ENTETR");
		
	}
	
	public void getStudrntsInfo(int id )
	
	{
		
		int sid = id;
		
		System .out .println("ID IS " +id);
	}
	
	
	public void getStudrntsInfo(String name )

	{
		String sname = name;
		System .out .println("Name " +sname);
		
	}
	
	public void getStudrntsInfo(long phonenumber , String email) 
	
	{
		long spho = phonenumber;
		
		
		
		System .out .println("Phone number" +spho);
		
		String emaill = email;
		
		System .out .println("Phone number" +emaill);
		
	}

	{
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentsdet stuu = new Studentsdet();
		
		stuu.getStudrntsInfo(300);
		
		stuu.getStudrntsInfo("SRIKANTH");
		
		stuu.getStudrntsInfo("srikanth.guruprakash@gmail.com");
		
		stuu.getStudrntsInfo(77777777);
		
	}

}
