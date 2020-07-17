package accessmodifiers.demo.employee.differentpackage;

import accessmodifiers.demo.employee.Employee;

public class FulltimeEmployee extends Employee {
  @Override
  public void printName(){
    System.out.println("Fulltime Employee name printed from a public method: "+ this.name);
  }

  /** NOTE: Package protected method cannot be overridden in child class that is in a different package than the parent class **/
//  @Override
//  void printAddress(){
//    System.out.println("Employee address printed from a default method: "+ this.address);
//  }

  @Override
  protected void printEmail() {
    System.out.println("Fulltime Employee email printed from a protected method: "+ this.emailId);
  }



}
