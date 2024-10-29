import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
  int categoryId;
  String categoryName;
  List<Product> products = new ArrayList<>();
  double price;

  public void addProduct(Product product) {
    products.add(product);
  }

  public void removeProduct(int removeCount) {
    while (removeCount > 0) {
      products.remove(products.size() - 1);
      removeCount--;
    }
  }

  // Get Product:
}