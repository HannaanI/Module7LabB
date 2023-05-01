/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollmanagement;

import java.time.LocalDate;

/**
 *
 * @author hannaan
 */
// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest {
   public static void main(String[] args) {
      // create subclass objects                                          
      SalariedEmployee salariedEmployee =                                 
         new SalariedEmployee("John", "Smith", "111-11-1111", new Date(01,15,1969), 800.00);    
      HourlyEmployee hourlyEmployee =                                     
         new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(02,22,1972), 16.75, 40);  
      CommissionEmployee commissionEmployee =                             
         new CommissionEmployee(                                          
         "Sue", "Jones", "333-33-3333", new Date(07,17,1995), 10000, .06);                      
      BasePlusCommissionEmployee basePlusCommissionEmployee =             
         new BasePlusCommissionEmployee(                                  
         "Bob", "Lewis", "444-44-4444", 5000, new Date(04,05,1999), .04, 300);    
      BasePlusCommissionEmployee hannaanBasePlusCommissionEmployee =             
         new BasePlusCommissionEmployee(                                  
         "Hannaan", "Ismail", "555-55-555", 6000, new Date(11,15,2002), .02, 200); 
      
      
/*
      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings());
*/
      // create four-element Employee array
      Employee[] employees = new Employee[5]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee;          
      employees[1] = hourlyEmployee;            
      employees[2] = commissionEmployee;        
      employees[3] = basePlusCommissionEmployee;
      employees[4] = hannaanBasePlusCommissionEmployee;
      
      int currentMonth = LocalDate.now().getMonthValue();
      
      for (Employee employee : employees) {
     // System.out.printf("%n%s%nearnings: $%,.2f%n", employee, employee.earnings());

     /*
      if (employee.getBirthDate().getMonth() == currentMonth) {
         System.out.println("Happy Birthday! You have received a $100 bonus!");
         System.out.printf("New earnings: $%,.2f%n", employee.earnings() + 100);
      }
      
      */
      //System.out.print("Employees earning less than $600:\n");
      if (employee.earnings() <= 600) {
         // System.out.print("Employees earning less than $600:\n");
          System.out.printf("%n%s%nearnings: $%,.2f%n", employee, employee.earnings());
      }
      else {
          System.out.printf("\n\nEmployee " + employee.getFirstName() + " " + employee.getLastName()  + " is earning more than $600\n\n");
      }
      
     
      }
   }
      
}



      //System.out.printf("Employees processed polymorphically:%n%n");
/*
      // generically process each element in array employees
      for (Employee currentEmployee : employees) {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } 

         System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());
      } 

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++) {      
         System.out.printf("Employee %d is a %s%n", j,  
            employees[j].getClass().getName());         
      } */                                                
 
 
