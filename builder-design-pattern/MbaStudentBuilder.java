import java.util.ArrayList;
import java.util.List;

public class MbaStudentBuilder extends StudentBuilder {

  @Override
  public StudentBuilder setSubject() {
    List<String> sub = new ArrayList<>();
    sub.add("Economics");
    sub.add("Marketing");
    sub.add("Financing");
    sub.add("Market Research");
    this.subject = sub;
    return this;
  }
}