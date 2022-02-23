public class StudentTester
{
    public static void main(String[] args)
    {
        
        /**
         * Create a student in the class of 2020
         */
         Student stud1 = new Student("Jess", 2020);
         
         /**
         * Create a student athlete in the class of 2022
         * that is eligible and plays soccer.
         */
         StudentAthlete stud2 = new StudentAthlete("Jon", 2022, "soccer", true);
         
         // Print out both objects
         System.out.println(stud1);
         System.out.println(stud2);
    }
}
