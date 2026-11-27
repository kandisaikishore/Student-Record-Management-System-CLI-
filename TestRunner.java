public class TestRunner {
    static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        check(manager.addStudent(new Student(1, "Alice", 90.0)), "valid student should be added");
        check(!manager.addStudent(new Student(1, "Bob", 80.0)), "duplicate ID must be rejected");
        check(!manager.addStudent(new Student(0, "Invalid ID", 80.0)), "non-positive ID must be rejected");
        check(!manager.addStudent(new Student(2, "   ", 80.0)), "blank name must be rejected");
        check(!manager.addStudent(new Student(3, "Negative marks", -1.0)), "negative marks must be rejected");
        check(!manager.addStudent(new Student(4, "Excess marks", 101.0)), "marks above 100 must be rejected");
        check(!manager.addStudent(new Student(5, "NaN marks", Double.NaN)), "NaN marks must be rejected");
        check(!manager.addStudent(new Student(6, "Infinite marks", Double.POSITIVE_INFINITY)), "infinite marks must be rejected");

        Student alice = manager.findStudentById(1);
        check(alice != null, "existing student should be found");
        check(manager.findStudentById(9) == null, "missing student should return null");

        check(!manager.updateStudent(1, "Changed Name", Double.NaN), "invalid update marks must be rejected");
        check(alice.getName().equals("Alice"), "invalid update must not partially change the name");
        check(alice.getMarks() == 90.0, "invalid update must preserve marks");

        check(manager.updateStudent(1, "  Alicia  ", 95.0), "valid update should succeed");
        check(alice.getName().equals("Alicia"), "updated name should be trimmed");
        check(alice.getMarks() == 95.0, "updated marks should be stored");
        check(manager.updateStudent(1, " ", null), "blank update fields should leave values unchanged");
        check(alice.getName().equals("Alicia") && alice.getMarks() == 95.0, "empty update should preserve values");

        check(manager.deleteStudent(1), "existing student should be deleted");
        check(!manager.deleteStudent(1), "deleting a missing student should fail");
        check(manager.getAllStudents().isEmpty(), "all records should be removed");

        System.out.println("Student tests passed");
    }
}
