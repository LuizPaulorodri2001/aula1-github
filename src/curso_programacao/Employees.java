package curso_programacao;

public class Employees {
	
	private int id;
	private String name;
	private double salary;
	
	public Employees(int id, String name, double salary) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void increase(double tax)
	{
		this.salary*=(1+tax/100.0);
	}
	
	public String toString ()
	{
		return String.format("%d, %s, %.2f", id,name,salary);
	}

	public int getId()
	{
		return id;
	}
}
