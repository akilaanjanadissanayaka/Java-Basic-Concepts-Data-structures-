package OOP.AccessSpecifiers.Package1;

public class Student {
    private String name;
    private int age;

    Student(){

    }
    public Student(String name,int age){
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
        Student student=new Student("Akila",21);
        System.out.println(student.toString());
        student.setName("Anjana");
        System.out.println(student.name);

    }
}
