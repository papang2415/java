package TestStudent;

public class Student {

    private int studentId = 0;

    public Student() {
        studentId++;
    }

    static int getStudentId() {
        return/* */studentId;
    }
}
