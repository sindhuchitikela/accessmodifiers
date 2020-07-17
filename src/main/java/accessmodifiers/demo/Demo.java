package accessmodifiers.demo;

import accessmodifiers.demo.employee.ContractEmployee;
import accessmodifiers.demo.employee.Employee;

public class Demo {
  public static void main(String args[]){

    /**====================== Simple Demo of access modifiers on class variables  ============**/
    Employee employee1 = new Employee();

    /* Id can be accessed only through constructor or setters/getters*/
    employee1.setId("Id123");

    /* name can be accessed directly from external class since it is public */
    employee1.name = "Employee name";

    //employee1.address; can't be accessed since this is protected.

    //employee1.email; can't be accessed from a non-subclass/external class - since this is protected.

    /**======================Demo of access modifiers on methods ===============**/
    /**
     * (1) Plan to show ContractEmployee class and the overridden methods
     * (2) Then demonstrate Fulltime Employee class's overridden methods
     */

    Employee employee = new ContractEmployee(); //Note that 'employee' is a super class reference variable
    employee.setName("ContractEmployee1");
    employee.printName();


    /** For the demo of access modifiers on Classes, please refer ClassModifiersDemoMain.java**/
  }
}
