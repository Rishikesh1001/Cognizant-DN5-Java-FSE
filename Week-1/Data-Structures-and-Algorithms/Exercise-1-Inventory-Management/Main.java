public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 55000));
        inventory.addProduct(new Product(102, "Mouse", 50, 700));
        inventory.addProduct(new Product(103, "Keyboard", 20, 1200));

        System.out.println("\nAll Products");
        inventory.displayProducts();

        System.out.println("\nSearch Product");
        inventory.searchProduct(102);

        System.out.println("\nUpdate Product");
        inventory.updateProduct(102, 60, 750);

        System.out.println("\nProducts After Update");
        inventory.displayProducts();

        System.out.println("\nDelete Product");
        inventory.deleteProduct(103);

        System.out.println("\nFinal Inventory");
        inventory.displayProducts();
    }
}