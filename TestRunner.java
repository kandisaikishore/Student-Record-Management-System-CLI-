public class TestRunner {
  static void check(boolean x,String m){if(!x)throw new AssertionError(m);}
  public static void main(String[] a){
    StudentManager m=new StudentManager();
    check(m.addStudent(new Student(1,"Alice",90.0)),"add");
    check(!m.addStudent(new Student(1,"Bob",80.0)),"duplicate");
    check(m.findStudentById(1)!=null,"find");
    check(m.findStudentById(9)==null,"missing");
    check(m.updateStudent(1,"Alicia",95.0),"update");
    check(m.findStudentById(1).getMarks()==95.0,"marks");
    check(m.deleteStudent(1),"delete");
    check(!m.deleteStudent(1),"delete missing");
    check(m.getAllStudents().isEmpty(),"empty");
    System.out.println("Student tests passed");
  }
}