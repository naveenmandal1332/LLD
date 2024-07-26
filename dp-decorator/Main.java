import base.BasePizza;
import base.Margherita;
import topping.ExtraCheese;
import topping.ExtraMushroom;

public class Main {

  public static void main(String[] args) {

    BasePizza p1 = new Margherita();
    System.out.println("Plain Margherit price: " + p1.cost());

    BasePizza p2 = new ExtraCheese(p1);
    System.out.println("Extra Cheese - Margherit price: " + p2.cost());

    BasePizza p3 = new ExtraMushroom(p2);
    System.out.println("Extra - Mushroom - Cheese - Margherit price: " + p3.cost());
  }
}