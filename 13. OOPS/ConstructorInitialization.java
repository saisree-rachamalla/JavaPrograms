

public class ConstructorInitialization 
{

    public static void main(String args[])
    {
        Student s1 = new Student("Phani");                 //Constructor initialization.
        System.out.println(s1.name); 
    }
}


class Student
{
    String name;
    int roll;

    Student(String name)                        //Constructor
    {
        this.name = name;

    }

}
