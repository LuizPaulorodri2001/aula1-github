package curso_programacao;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity)
	{
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public double totalValueInStock()
	{
		return price*quantity;
	}

	public void addProducts(int quantity)
	{
		this.quantity+=quantity; 
	}
	
	public void removeProducts(int quantity)
	{
		this.quantity-=quantity; 
	}
	
	public String toString()
	{
		return String.format("Nome: %s%n", name)+String.format("Preço: R$%.2f%n", price)+String.format("Quantidade: %d%n", quantity)+String.format("Valor Total no Estoque: R$%.2f%n%n",totalValueInStock());
	}
}
