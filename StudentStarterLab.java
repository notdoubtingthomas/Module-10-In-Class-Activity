public class StudentStarterLab {
    public static void main(String[] args) {

        // TODO 1: Create an array of Product objects with size 3
        Product[] products = new Product[3];

        // TODO 2: Add an Electronics object to the array
        // Example: new Electronics("Laptop", 1200.00, 24)

        products[0] = new Electronics("Laptop", 1200.00, 24);

        // TODO 3: Add a Clothing object to the array
        // Example: new Clothing("Jacket", 89.99, "Large")

        products[1] = new Clothing("Jacket", 89.99, "Large");

        // TODO 4: Add a Grocery object to the array
        // Example: new Grocery("Milk", 4.99, "2026-04-15")

        products[2] = new Grocery("Milk", 4.99, "2026-04-15");

        // TODO 5: Use a loop to go through each product in the array
        // and call displayDetails()

        for (Product product : products) {
            product.displayDetails();

            if (product instanceof Shippable) {
                ((Shippable) product).shipItem();
            }

            if (product instanceof Returnable) {
                ((Returnable) product).processReturn();
            }

            System.out.println("---------------------------");
        }

        // TODO 6: Use instanceof to check whether the product is Shippable
        // If true, cast it and call shipItem()

        // TODO 7: Use instanceof to check whether the product is Returnable
        // If true, cast it and call processReturn()

        // TODO 8: Print a separator line after each product
    }
}

// TODO 9: Create an abstract class named Product
// Include protected fields: name and price
// Include a constructor that initializes both fields
// Include an abstract method named displayDetails()
abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayDetails();
}

// TODO 10: Create an interface named Shippable
interface Shippable {
    void shipItem();
}

// TODO 11: Create an interface named Returnable
interface Returnable {
    void processReturn();
}

// TODO 12: Create a class named Electronics
// It should extend Product and implement Shippable and Returnable
class Electronics extends Product implements Shippable, Returnable {
    private int warrantyMonths;

    public Electronics(String name, double price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayDetails() {
        // TODO 13: Print the type of product
        // TODO 14: Print name, price, and warrantyMonths

        System.out.println("Electronics Product");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warrantyMonths);
    }

    @Override
    public void shipItem() {
        // TODO 15: Print a shipping message for electronics
        System.out.println("Shipping electronics item securely.");
    }

    @Override
    public void processReturn() {
        // TODO 16: Print a return message for electronics
        System.out.println("Processing return for electronics item after inspection.");
    }
}

// TODO 17: Create a class named Clothing
// It should extend Product and implement Shippable and Returnable
class Clothing extends Product implements Shippable, Returnable {
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayDetails() {
        // TODO 18: Print the type of product
        // TODO 19: Print name, price, and size

        System.out.println("Clothing Product");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Size: " + size);
    }

    @Override
    public void shipItem() {
        // TODO 20: Print a shipping message for clothing
        System.out.println("Shipping clothing item in protective packaging.");
    }

    @Override
    public void processReturn() {
        // TODO 21: Print a return message for clothing
        System.out.println("Processing return for clothing item after inspection.");
    }
}

// TODO 22: Create a class named Grocery
// It should extend Product and implement Shippable
class Grocery extends Product implements Shippable {
    private String expirationDate;

    public Grocery(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayDetails() {
        // TODO 23: Print the type of product
        // TODO 24: Print name, price, and expirationDate
        System.out.println("Grocery Product");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Expiration date: " + expirationDate);
    }

    @Override
    public void shipItem() {
        // TODO 25: Print a shipping message for grocery items
        System.out.println("Shipping grocery item with freshness protection.");
    }
}
