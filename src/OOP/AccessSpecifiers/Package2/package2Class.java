package OOP.AccessSpecifiers.Package2;


import OOP.AccessSpecifiers.Package1.Student;

public class package2Class {
    public  static void main(String args[]){
//        in a diffrent package then can't access from outside if Student class it default(but if it public then can )
        Student student=new Student("Akila",21);
        student.setAge(21);
        student.setName("disa");



    }
}
