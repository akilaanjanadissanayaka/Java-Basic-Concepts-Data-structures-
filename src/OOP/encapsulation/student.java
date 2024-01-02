package OOP.encapsulation;

public class student {
    private String name;
    private int age;
//    in order to make this encapsule. need to set all attributes to private (to hide all things to outside the world)
//    access trogugth the getters and setters

    student(){

    }
    public student(String name, int age){
        this.name = name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public  static void main(String args[]){
        student student=new student("Akila",21);
        System.out.println(student.toString());
        student.setName("Anjana");
        System.out.println(student.name);

    }
}
