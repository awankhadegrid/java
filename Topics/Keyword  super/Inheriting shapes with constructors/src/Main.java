import java.util.Scanner;

// Define the base class Shape
class Shape {
    // TODO: Add a constructor that takes the shape's name as a parameter

    // TODO: Add a getter method to retrieve the shape's name
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Define the derived class Rectangle
class Rectangle extends Shape {
    // TODO: Add a constructor that takes the shape's name, width, and height as parameters
    // TODO: Call the base class constructor using the super keyword

    // TODO: Add getter methods to retrieve the rectangle's width and height
    private int width;
    private int height;

    public Rectangle(String name, int width, int height) {
        super(name); // Call base class constructor
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.close();

        Rectangle rectangle = new Rectangle(name, width, height);

        System.out.println("Name: " + rectangle.getName());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        // TODO: Read the shape's name, width, and height from the user input

        // TODO: Create a Rectangle object using the user input

        // TODO: Print out the rectangle's name, width, and height

    }
}