package OOP.inheritance;

import OOP.AccessSpecifiers.Package1.Student;

public class main {
    public  static void main(String args[]){
        child c =new child("Akila",21,"add1");
        c.setName("dissanayaka");
        System.out.println(c.toString());
        c.displayParent();

    }
}
