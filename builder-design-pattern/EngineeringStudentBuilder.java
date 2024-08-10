import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

  @Override
  public StudentBuilder setSubject() {
    List<String> sub = new ArrayList<>();
    sub.add("OOPs");
    sub.add("DBMS");
    sub.add("DSA");
    sub.add("Networking");
    this.subject = sub;
    return this;
  }
}