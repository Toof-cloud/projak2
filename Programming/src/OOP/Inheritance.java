package OOP;
import java.util.Scanner;

		
		
	interface Shape {
		   	double calculateArea();
		    double calculatePerimeter();
	}

		
	class Rectangle implements Shape {
		    private double length;
		    private double width;

		    public Rectangle(double length, double width) {
		        this.length = length;
		        this.width = width;
	}

		   
		    public double calculateArea() {
		        return length * width;
		    }

		    @Override
		    public double calculatePerimeter() {
		        return 2 * (length + width);
		    }
	}

		
		class Circle implements Shape {
		    private double radius;

		    public Circle(double radius) {
		        this.radius = radius;
		    }

		    
		    public double calculateArea() {
		        return Math.PI * radius * radius;
		    }

		    
		    public double calculatePerimeter() {
		        return 2 * Math.PI * radius;
		    }
		}

		
		public class Inheritance  {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Choose a shape: ");
		        System.out.println("1. Rectangle");
		        System.out.println("2. Circle");
		        System.out.println("3. Square");

		        int choice = scanner.nextInt();

		        if (choice == 1) {
		            System.out.println("Enter length and width of the rectangle: ");
		            double length = scanner.nextDouble();
		            double width = scanner.nextDouble();
		            Rectangle rectangle = new Rectangle(length, width);
		            System.out.println("Area: " + rectangle.calculateArea());
		            System.out.println("Perimeter: " + rectangle.calculatePerimeter());
		        } else if (choice == 2) {
		            System.out.println("Enter radius of the circle: ");
		            double radius = scanner.nextDouble();
		            Circle circle = new Circle(radius);
		            System.out.println("Area: " + circle.calculateArea());
		            System.out.println("Circumference: " + circle.calculatePerimeter());
		        } else {
		            System.out.println("Invalid choice!");
		        }
		        
		        scanner.close();
		    
		}
	}

