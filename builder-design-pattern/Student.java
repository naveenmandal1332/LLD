import java.util.List;

public class Student {
  int rollNumber;
  String name;
  int age;
  String address;
  String fatherName;
  String motherName;
  List<String> subject;

  // Build Constructor:
  public Student(StudentBuilder builder) {
    this.rollNumber = builder.rollNumber;
    this.name = builder.name;
    this.age = builder.age;
    this.fatherName = builder.fatherName;
    this.motherName = builder.motherName;
    this.address = builder.address;
    this.subject = builder.subject;
  }

  public String toString() {
    String res = "" + " Roll Number: " + this.rollNumber + " Name: " + this.name + " Age: " + this.age + " Address: "
        + this.address + " Father Name: " + this.fatherName + " Mother Name: " + this.motherName;

    for (int i = 0; i < subject.size(); i++) {
      String sub = subject.get(i);
      res += sub + ", ";
    }

    return res;
  }
}