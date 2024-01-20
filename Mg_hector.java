package java_program;
interface feature
{
	void name();
	void price();
	void fuel();
	void mileage();
	void seating();
}

public class Mg_hector implements feature
{
	String price,fuel,mileage;
	int seating;
	public static void main(String[] args) 
	{
		Mg_hector car1=new Mg_hector();
		car1.name();
		car1.price();
		car1.fuel();
		car1.mileage();
		car1.seating();
		
		Nissan car2=new Nissan();
		car2.name();
		car2.price();
		car2.fuel();
		car2.mileage();
		car2.seating();
		
		Toyota car3=new Toyota();
		car3.name();
		car3.price();
		car3.fuel();
		car3.mileage();
		car3.seating();
	}
	public void name()
	{
		System.out.println("\t\tMg_hector");
	}
	public void price() 
	{
		price="14L";
		System.out.println("price = "+price);
		
	}
	public void fuel() 
	{
		fuel="Diesel";
		System.out.println("Fuel type = "+fuel);
	}
	public void mileage()
	{
		mileage="12-16 Kmpl";
		System.out.println("Mileage = "+mileage);
		
	}
	public void seating() 
	{
		seating=5;
		System.out.println("Seating capacity = "+seating+ " seating");
	}

}
class Nissan implements feature
{
	String price,fuel,mileage;
	int seating;
	public void name()
	{
		System.out.println("\t\tNissan sunny");
	}
	public void price() 
	{
		price="7.07 L";
		System.out.println("Price = "+price);
	}
	public void fuel() 
	{
		fuel="Diesel";
		System.out.println("Fuel Type = "+fuel);
	}
	public void seating() 
	{
		seating=5;
		System.out.println("Seating capacity = "+seating+" seating");
	}
	public void mileage()
	{
		mileage="17.03-22.76 kmpl";
		System.out.println("Mileage = "+mileage);
	}
}
class Toyota implements feature
{
	String price,fuel,mileage;
	int seating;
	public void name() 
	{
		System.out.println("\t\tToyota Glanza");
	}
	public void price()
	{
		price="6.81 L";
		System.out.println("Price = "+price);
	}
	public void fuel() 
	{
		fuel="Diesel";
		System.out.println("Fuel Type = "+fuel);
	}
	public void mileage() 
	{
		mileage="22.3-30.61 kmpl";
		System.out.println("Mileage = "+mileage);
	}
	public void seating() 
	{
		seating=5;
		System.out.println("Seating capacity = "+seating+" seating");
	}
	
}
