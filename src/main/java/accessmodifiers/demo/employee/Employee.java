package accessmodifiers.demo.employee;
public class Employee {
    private String id; // Private access modifier
    public String name; // Public access modifier
    String address;     // default access modifier - package protected
    protected String emailId; //Protected access modifier

  /**======================= Getters and Setters for data members ====================*/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  /**==========================Class methods =============================*/
  private void printId(){
    System.out.println("Employee id printed from a private method: "+ this.id);
  }

  public void printName(){
    System.out.println("Employee name printed from a public method: "+ this.name);
  }

  void printAddress(){
    System.out.println("Employee address printed from a default method: "+ this.address);
  }

  protected void printEmail() {
    System.out.println("Employee email printed from a protected method: "+ this.emailId);
  }
}
