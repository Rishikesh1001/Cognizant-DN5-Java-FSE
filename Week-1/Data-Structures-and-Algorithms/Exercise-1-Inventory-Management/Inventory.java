import java.util.ArrayList;

public class Inventory {

    ArrayList<Product> products = new ArrayList<>();

    // Add Product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product Added Successfully!");
    }

    // Display Products
    public void displayProducts() {
        for (Product p : products) {
            p.display();
        }
    }

    // Search Product
    public void searchProduct(int id) {

        for (Product p : products) {

            if (p.productId == id) {
                p.display();
                return;
            }
        }

        System.out.println("Product Not Found!");
    }

    // Update Product
    public void updateProduct(int id, int quantity, double price) {

        for (Product p : products) {

            if (p.productId == id) {

                p.quantity = quantity;
                p.price = price;

                System.out.println("Product Updated Successfully!");
                return;
            }
        }

        System.out.println("Product Not Found!");
    }

    // Delete Product
    public void deleteProduct(int id) {

        Product removeProduct = null;

        for (Product p : products) {

            if (p.productId == id) {
                removeProduct = p;
                break;
            }
        }

        if (removeProduct != null) {
            products.remove(removeProduct);
            System.out.println("Product Deleted Successfully!");
        } else {
            System.out.println("Product Not Found!");
        }
    }
}