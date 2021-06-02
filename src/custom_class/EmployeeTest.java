package custom_class;

import java.time.*;
import java.util.Objects;

/**
 * This program tests the Employee class.
 * @version 1.13 2018-04-10
 * @author Cay Horstmann
 */
public class EmployeeTest
{
   public static void main(String[] args)
   {
      // fill the staff array with three Employee objects
      Employee[] staff = new Employee[4];
      
   //  String name = "김길동";
    		  
      staff[0] = new Employee(null, 75000, 1987, 12, 15);
      staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
      staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
      staff[3] = new Employee();
      staff[3].setHireDay(LocalDate.of(2021, 6, 2));
      
      // raise everyone's salary by 5%
      for (Employee e : staff)
         e.raiseSalary(5);

      // print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" 
            + e.getHireDay());
   }
}

class Employee
{
   private String name;
   private double salary;
   private LocalDate hireDay;
   
   public Employee() {
	   this (" ", 0.0, 2021, 6, 3);
	  // name = "";
	  // salary = 0.0;
	  // hireDay = LocalDate.now();
   }

   public Employee(String name, double salary, int year, int month, int day) {
     // Objects.requireNonNull(name, "이름은 널이 될수 없다");
      this.name = name;
      name = (name != null && name.trim().length() > 0) ? 
    		  name : "(추후입력)";
      this.salary = salary;
      this.hireDay = LocalDate.of(year, month, day);
   }

public String getName()
   {
      return this.name;
   }

	void setHireDay(LocalDate hireDay) {
	this.hireDay = hireDay;
}

   public double getSalary(){
      return this.salary;
   }

   public LocalDate getHireDay(){
      return hireDay;
   }

   public void raiseSalary(double byPercent){
      this.salary += this.salary * byPercent / 100;
   }
}
