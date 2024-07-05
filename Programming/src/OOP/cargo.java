package OOP;
import java.util.Scanner;

interface Container{
	
	double calculateTotalWeight();	
	double calculateTotalPrice();
	
}

class Ship {
	
	private String Name;
	private String ShipClass;
	private double Tonnage;
	
	public Ship(String Name, String ShipClass, double Tonnage) {
		
		this.Name = Name;
		this.ShipClass = ShipClass;
		this.Tonnage = Tonnage;
		
	}
	
	public String getName(){
		return Name;
	}
	public String getShipClass(){
		return ShipClass;
	}
	public double getTonnage(){
		return Tonnage;
	}
}

class CargoShip extends Ship {
	
	private int Capacity;
	
	public CargoShip(String Name, String ShipClass, double Tonnage, int Capacity) {
	super(Name, ShipClass, Tonnage);
	this.Capacity = Capacity;
	
	}
	public int getCapacity() {
		return Capacity;
	}
	
	public void displayInfo() {
		System.out.println("Cargo Ship: " + getName());
		System.out.println("Class: " + getShipClass());
		System.out.println("Tonnage: " + getTonnage());
		System.out.println("Capacity: " + getCapacity());
	}
}

class FortyFootContainer implements Container {
	
	private String origin;
	private String destination;
	private int NumberOfContainers;
	private double WeightPerContainer;
	private double PricePerContainer;
	private double TaxPerContainer;
	
	public FortyFootContainer(String origin, String destination, int NumberOfContainers, double WeightPerContainer, double PricePerContainer, double TaxPerContainer) {
		
		this.origin = origin;
		this.destination = destination;
		this.NumberOfContainers = NumberOfContainers;
		this.WeightPerContainer = WeightPerContainer;
		this.PricePerContainer = PricePerContainer;
		this.TaxPerContainer = TaxPerContainer;
		
	}
	
	public double calculateTotalWeight() {
		return NumberOfContainers * WeightPerContainer;
	}
	
	public double calculateTotalPrice() {
		return NumberOfContainers * (PricePerContainer * TaxPerContainer);
	}
	
	public void DisplayInfo() {
		
		System.out.println("40-Foot Container: ");
		System.out.println("Origin: " +origin );
		System.out.println("Destination: " +destination);
		System.out.println("Number of Containers: " +NumberOfContainers);
		System.out.println("Price per Container: " +PricePerContainer);
		System.out.println("Tax per Container: " +TaxPerContainer);
		System.out.println("Total Price including Tax: " +calculateTotalPrice() + "Php");
		
	}
}

class TwentyFootContainer implements Container {
	

	private String origin;
	private String destination;
	private int NumberOfContainers;
	private double WeightPerContainer;
	private double PricePerContainer;
	private double TaxPerContainer;
	
	public TwentyFootContainer(String origin, String destination, int NumberOfContainers, double WeightPerContainer, double PricePerContainer, double TaxPerContainer) {
		
		this.origin = origin;
		this.destination = destination;
		this.NumberOfContainers = NumberOfContainers;
		this.WeightPerContainer = WeightPerContainer;
		this.PricePerContainer = PricePerContainer;
		this.TaxPerContainer = TaxPerContainer;
		
	}
	
	public double calculateTotalWeight() {
		return NumberOfContainers * WeightPerContainer;
	}
	
	public double calculateTotalPrice() {
		return NumberOfContainers * (PricePerContainer * TaxPerContainer);
	}
	
	public void DisplayInfo() {
		
		System.out.println("20-Foot Container: ");
		System.out.println("Origin: " +origin );
		System.out.println("Destination: " +destination);
		System.out.println("Number of Containers: " +NumberOfContainers);
		System.out.println("Price per Container: " +PricePerContainer);
		System.out.println("Tax per Container: " +TaxPerContainer);
		System.out.println("Total Price including Tax: " +calculateTotalPrice() + "Php");
		
	}
}

public class cargo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CargoShip cargoship = new CargoShip("HMM Algericas", "Container Ship", 232311, 23820);
		cargoship.displayInfo();
		
		System.out.println("\n40-Footer Containers: ");
		System.out.print("Origin of Shipment: ");
		String origin40 = sc.nextLine();
		System.out.print("Port of destination and disembarkation: ");
		String destination40 = sc.nextLine();
		System.out.print("Number of 40-Foot Containers: ");
		int number40 = Integer.parseInt(sc.nextLine());
		System.out.print("Weight per Container (kg): ");
		double weight40 = Double.parseDouble(sc.nextLine());
		System.out.print("Price per Container (Php): ");
		double price40 = Double.parseDouble(sc.nextLine());
		System.out.print("Tax per Container (Php): ");
		double tax40 = Double.parseDouble(sc.nextLine());
		
		FortyFootContainer fortyFootContainer = new FortyFootContainer(origin40, destination40, number40, weight40, price40, tax40);
	    fortyFootContainer.DisplayInfo();

	    System.out.println("\n20-footer containers:");
	    System.out.print("Origin of shipment: ");
	    String origin20 = sc.nextLine();
	    System.out.print("Port of destination and disembarkation: ");
	    String destination20 = sc.nextLine();
	    System.out.print("Number of 20-foot containers: ");
	    int number20 = Integer.parseInt(sc.nextLine());
	    System.out.print("Weight per container (kg): ");
	    double weight20 = Double.parseDouble(sc.nextLine());
	    System.out.print("Price per container (USD): ");
	    double price20 = Double.parseDouble(sc.nextLine());
	    System.out.print("Tax per container (USD): ");
	    double tax20 = Double.parseDouble(sc.nextLine());

	    TwentyFootContainer twentyFootContainer = new TwentyFootContainer(origin20, destination20, number20, weight20, price20, tax20);
	    twentyFootContainer.DisplayInfo();
	    
	    System.out.println("rep");
	    System.out.println("rep2");
	
	}
}
