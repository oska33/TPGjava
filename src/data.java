
public class data implements Comparable<data> {
	
	private int id;
	private String name;
	private double gpa;
	
	
	public data(int id, String name, double gpa)
	{
		this.id = id;
		this.name = name;
		this.gpa = gpa;

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	
	
	
	
	public int compareTo(data temp) {
		
		int sort = Double.valueOf(temp.gpa).compareTo(Double.valueOf(gpa));
		if (sort == 0)
		{
			sort = name.compareTo(temp.name);
			
			if (sort == 0)
			{
				sort = Integer.compare(id, temp.id);
			}
			
		}
		
		
		return sort;
		
	}
	
	
	
	
	
	
	
	public String toString()
	{
		return name + "\n";
		
	}
	
	
	
}
