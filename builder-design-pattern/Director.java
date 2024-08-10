
public class Director {
  StudentBuilder studentBuilder;

  public Director(StudentBuilder studentBuilder) {
    this.studentBuilder = studentBuilder;
  }

  public Student createStudent() {
    if (studentBuilder instanceof EngineeringStudentBuilder) {
      return createEngineeringStudent();
    } else if (studentBuilder instanceof MbaStudentBuilder) {
      return createMbaStudent();
    }
    return null;
  }

  private Student createEngineeringStudent() {
    return studentBuilder.setRollNumber(1).setName("Naveen").setAge(24).setAddress("New Delhi").setMotherName("Anita")
        .build();
  }

  private Student createMbaStudent() {
    return studentBuilder.setRollNumber(2).setName("Vishal").setAddress("Punjab").setFatherName("Ashok").build();
  }
}