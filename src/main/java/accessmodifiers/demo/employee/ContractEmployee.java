package accessmodifiers.demo.employee;

public class ContractEmployee extends Employee {
  @Override
  public void printName(){
    System.out.println("Contract Employee name printed from a public method: "+ this.name);
  }

  @Override
  void printAddress(){
    System.out.println(" Contract Employee address printed from a default method: "+ this.address);
  }

  @Override
  protected void printEmail() {
    System.out.println("Contract Employee email printed from a protected method: "+ this.emailId);
  }

  /** NOTE: Private method cannot be overridden in child class **/
//  @Override
//  private void printId(){
//    System.out.println("Employee id printed from a private method: "+ this.id);
//  }

}
