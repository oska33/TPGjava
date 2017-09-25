import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

 
public class IPValidationRegex {
	

	
	static String IPregex = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
	public static Pattern IPpattern;	
	public static Matcher IPmatcher;

	
	
	public static void main(String[] args)
	{
		IPpattern = Pattern.compile(IPregex);
		int i = 0;
		long startTime = 0;
		long endTime = 0;

		
		
		try {
			File IPlist = new File("IPs.txt");
			FileReader fileReader = new FileReader(IPlist);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			
			
			    System.out.println("Valid IP address(es) are/is - \n");
				while ((line = bufferedReader.readLine()) != null) 
				{
					i++;
					
					startTime = System.nanoTime();

					if (IPvalidate(line) == true)
					{
					System.out.println("Line number " + i +": "+ line);
					}
					endTime = System.nanoTime();

					
				}
				fileReader.close();
				double duration = ((endTime - startTime));
				duration = duration / ((long)1000000);							
				System.out.println("\n" + "The IPvalidate method took total of " + duration + " milliseconds");
				
				
			
			} 
		
		catch (IOException e) 
			{
			e.printStackTrace();
			}
		

		
	}
	
	
	public static boolean IPvalidate(String line)
	{
		
		IPmatcher = IPpattern.matcher(line);
		return IPmatcher.matches();

	}
	
	
	
	
	
	

	

}
