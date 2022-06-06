package customizeProblem;

public class Employee {

  private int id;
  private String name;
  private double salary;
  private String gender;
  private int age;

  public Employee(int id, String name, double salary, String gender, int age) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.gender = gender;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", salary=" + salary +
            ", gender='" + gender + '\'' +
            ", age=" + age +
            '}';
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public   String getGender() {
    return gender;
  }

  public int getAge() {
    return age;
  }
}
