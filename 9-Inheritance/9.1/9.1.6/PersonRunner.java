public class PersonRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Person person = new Person("Thomas Edison", "February 11, 1847");
        Student student = new Student("Albert Einstein", "March 14, 1879", 12, 5.0);
        
        System.out.println(person.getName());
        System.out.println(person.getBirthday());
        
        System.out.println(student.getName());
        System.out.println(student.getBirthday());
        System.out.println(student.getGrade());
        System.out.println(student.getGpa());
    }
}
