import java.util.ArrayList;
import java.util.List;

// Care Taker:

public class ConfigurationCareTaker {

  List<ConfigurationMemento> history = new ArrayList<>();

  public void addMemento(ConfigurationMemento memento) {
    history.add(memento);
  }

  public ConfigurationMemento undo() {
    System.out.println("Size: " + history.size());
    if (!history.isEmpty()) {

      int lastIndex = history.size() - 1;
      ConfigurationMemento lastMemento = history.get(lastIndex);

      System.out.println(" Undo: " + "height: " + lastMemento.height + " | " + "widht: " + lastMemento.width);

      history.remove(lastIndex);

      return lastMemento;
    }

    return null;
  }
}