package curso_programacao;

public class Bank {
	
	private int number;
	private String name;
	private double cash;
	
	public Bank(int number, String name, double deposit) {
		this.number=number;
		this.name=name;
		Deposit(deposit);
	}
	
	public Bank(int number, String name) {
		this.number=number;
		this.name=name;		
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getCash()
	{
		return cash;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void Deposit(double cash)
	{
		this.cash+=cash;
	}
	
	public void Withdraw(double cash)
	{
		this.cash-=(cash+5.00);
	}
	
	public String toString()
	{
		return String.format("Account %d, Holder: %s, Balance: $ %.2f", number, name, cash);
	}
}
