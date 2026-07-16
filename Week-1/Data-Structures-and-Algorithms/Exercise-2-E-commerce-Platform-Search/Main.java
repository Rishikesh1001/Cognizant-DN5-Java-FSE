public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Printer", "Office")
        };

        System.out.println("Linear Search");

        Product p1 = Search.linearSearch(products, 104);

        if (p1 != null)
            p1.display();
        else
            System.out.println("Product Not Found");

        System.out.println("Binary Search");

        Product p2 = Search.binarySearch(products, 104);

        if (p2 != null)
            p2.display();
        else
            System.out.println("Product Not Found");
    }
}