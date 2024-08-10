public class Main {

  public static void main(String[] args) {
    Director obj1 = new Director(new EngineeringStudentBuilder());
    // Director obj2 = new Director(new MbaStudentBuilder());

    Student eng = obj1.createStudent();
    // Student mba = obj2.createStudent();

    System.out.println(eng.toString());
    // System.out.println(mba.toString());
  }
}