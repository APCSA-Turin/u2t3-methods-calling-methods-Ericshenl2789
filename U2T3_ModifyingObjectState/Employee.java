public class Employee{
           String first_name;
           String last_name;

   public Employee (String fname, String lname){
           first_name=fname;
           last_name=lname;
   }
   public Employee(){
   }

   public static void main (String args[]){
Employee emp1 = new Employee ("James" , "Green");
Employee emp2 = new Employee ("Sheen" , "Blue");
Employee emp3 = new Employee ();
System.out.println (" Employee no. 1 is: " +  emp1.first_name+ " "+ emp1.last_name);
System.out.println (" Employee no. 2 is: " +  emp2. first_name+ " "+ emp2.last_name);
System.out.println (" Employee no. 3 is: " +  emp3.first_name+ " "+ emp3.last_name);
    }

}