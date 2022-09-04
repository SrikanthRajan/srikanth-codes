package weekone;

public class Fiboniciseries {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		int n =11;
	 int firstTerm = 0;
	 
	 int secondTerm = 1;
	 
	 System.out.println("Fibnoci serie"  + n+ "till") ;
		
	 for ( int i =1 ; i<=n ;i++)
	 {
		 
		 System.out.println(firstTerm + ",") ;
	 {

		 
		 int nextTerm = firstTerm + secondTerm;
		 
		 firstTerm =secondTerm;
		 secondTerm = nextTerm;
		 
	}

}
}
}
