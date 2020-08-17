package curso_programacao;

public class CurrencyConverter {

	public static double dollarPrice;
	public static double numDollar;
	public static final double IOF=0.06;
	
	public static double Amount() {
		return dollarPrice*numDollar*(1+IOF);
	}
	
}
