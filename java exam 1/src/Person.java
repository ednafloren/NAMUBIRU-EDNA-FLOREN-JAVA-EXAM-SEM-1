// number 4 b
public class Person {
   protected String name;
   protected double salary;
  protected   int age;

    public Person(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1=new Person("Mark",500000,28);
        Person person2=new Person("John",900000,38);
        System.out.println("Before updating:"+person1.getAge());
        person1.setAge(50);
        System.out.println(person1.getAge());
           System.out.println(person2.getAge());
    }
}
