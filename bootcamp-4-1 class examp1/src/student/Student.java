package student;

public class Student {
    public final String name;
    public  static String family;
    public int age;

    public Student(String name){
        this.name=name;

    }
    public static String getFamily(){
    family="nazemi";
    return family;
    }

}
