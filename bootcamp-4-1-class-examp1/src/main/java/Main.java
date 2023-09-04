import student.Student;

public class Main {
    public static void main(String[] args) {
        Student s=new Student("sara");
        System.out.println(s.name);
        System.out.println(Student.getFamily());
    }

}
