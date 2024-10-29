import java.util.ArrayList;
import java.util.List;

public class Inventory {

  List<ProductCategory> productCategories;

  Inventory() {
    productCategories = new ArrayList<>();
  }

  public void addProductCategory(int categoryId, String name, double price) {
    ProductCategory pc = new ProductCategory();

    pc.categoryName = name;
    pc.price = price;
    pc.categoryId = categoryId;
    pc.price = price;

    productCategories.add(pc);
  }
}