package nithish_221047018;


class Pizza{
	
	String bread;
	String sauce;
	String cheese;
	String toppings;
	
	//1st constructor
	Pizza(String bread, String sauce, String cheese, String toppings){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.toppings = toppings;
	}
	
	//2nd overloading constructor
	Pizza(String bread, String cheese, String toppings){
		this.bread = bread;
		this.cheese = cheese;
		this.toppings = toppings;
	}
	
	//3rd overloading constructor
		Pizza(String bread, String cheese){
			this.bread = bread;
			this.cheese = cheese;
		}
}

public class Constructor_overloading {

	public static void main(String[] args) {
		
		//if customer needs all the four ingredients
		Pizza customer1 = new Pizza("thin Crust", "tomoto", "Mozzarella", "Pepperoni");
		System.out.println("\ningredient of your pizza selected: ");
		System.out.println(customer1.bread);
		System.out.println(customer1.sauce);
		System.out.println(customer1.cheese);
		System.out.println(customer1.toppings);
		
		//if 2nd customer doesn't like sauce
		Pizza customer2 = new Pizza("thin Crust", "Mozzarella", "Pepperoni");
		System.out.println("\ningredient of your pizza selected: ");
		System.out.println(customer2.bread);
		System.out.println(customer2.sauce);
		System.out.println(customer2.toppings);
		
		//if 3rd customer needs only bread with cheese
		Pizza customer3 = new Pizza("thin Crust", "Mozzarella");
		System.out.println("\ningredient of your pizza selected: ");
		System.out.println(customer3.bread);
		System.out.println(customer3.sauce);;
	}

}
