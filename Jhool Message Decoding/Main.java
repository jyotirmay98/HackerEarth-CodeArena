import java.util.*;


public class Main 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		String message = scan.nextLine();
		
		int FirstL = message.toUpperCase().indexOf("L");
		
		int FirstOFromL = message.toUpperCase().indexOf("O" , FirstL);
		
		int FirstVFromO = message.toUpperCase().indexOf("V" , FirstOFromL);
		
		int FirstEFromV = message.toUpperCase().indexOf("E" , FirstVFromO);
		
		if(FirstL == -1 || FirstOFromL == -1 || FirstVFromO == -1 || FirstEFromV == -1)
		{
			System.out.println("Let us breakup!");
		}
		else
		{
			System.out.println("I love you, too!");
		}
		
		scan.close();
	}

	
}
