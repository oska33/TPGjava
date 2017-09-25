import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sort {

	public static void main(String[] args) {
		
		long startTime = 0;
		long endTime = 0;
		List<data> table = new ArrayList<data>();
		
		try {
			File GPAlist = new File("GPAs.txt");
			FileReader fileReader = new FileReader(GPAlist);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			
			
			while ((line = bufferedReader.readLine()) != null) 
			{
				
				String[] parts = line.split(" ");
				int ID = Integer.parseInt(parts[0]); 
				String Name = parts[1]; 
				Double GPA = Double.parseDouble(parts[2]); 
				
				table.add(new data(ID, Name, GPA));
			
			}
			
			fileReader.close();
			
			}
			
			catch (IOException e) 
			{
			e.printStackTrace();
			}
			

		
		
		
		
		
		startTime = System.nanoTime();
		Collections.sort(table);
		endTime = System.nanoTime();
		double duration = ((endTime - startTime));
		duration = duration / ((long)1000000);							
		
		String formattedtable = table.toString()
			    .replace(",", "")  
			    .replace("[", "")  
			    .replace("]", "") 
			    .trim();          
		
		
		
		System.out.println(formattedtable);
		
		System.out.println("\n" + "The Collections.sort method took total of " + duration + " milliseconds");
		
		
	}

		

		
		
}

	
	