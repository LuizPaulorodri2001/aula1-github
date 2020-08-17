package curso_programacao;

public class Student {

	public String name;
	public double test1;
	public double test2;
	public double test3;
	
	public double finalNote()
	{
		return test1+test2+test3;
	}
	
	public String toString()
	{
		String result=
				(finalNote()>=60)?
						String.format("FINAL GRADE = %.2f%nPASS", finalNote()):
							String.format("FINAL GRADE = %.2f%nFAILED%nMISSING %.2f POINTS", finalNote(),(60.00-finalNote()));
		
		return result;
	}
}
