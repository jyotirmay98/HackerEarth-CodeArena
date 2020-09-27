import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main 
{
	private static String REGEX = "[aeiouAEIOU]";
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int noOfTestCases = Integer.valueOf(scan.nextLine());
		
		List<String> testCases = new ArrayList<String>();
		
		for(int i=0;i<noOfTestCases;i++)
		{
			testCases.add(scan.nextLine());
		}
		
		testCases.stream().map(s -> getSpecialSubstrings(s)).collect(Collectors.toList()).forEach(x -> System.out.println(x.size()));
		
		scan.close();
	}

	private static List<String> getSpecialSubstrings(String s) 
	{
		List<String> substringList = new ArrayList<String>();
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String str = s.substring(i, j);
				
				if(Character.toString(str.charAt(0)).matches(REGEX) && !Character.toString(str.charAt(str.length()-1)).matches(REGEX))
				{
					substringList.add(str);
				}
				if(!Character.toString(str.charAt(0)).matches(REGEX) && Character.toString(str.charAt(str.length()-1)).matches(REGEX))
				{
					substringList.add(str);
				}
				
				
			}
		}
		
		return substringList;
	}

}
