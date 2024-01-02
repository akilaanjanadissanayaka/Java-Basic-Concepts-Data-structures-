package OOP.inheritance;

public class child extends parent{
    String Address;
    child(){

    }
    public child (String name,int age,String address){
        this.Address=address;
        super.setName(name);
        super.setAge(age);
    }
    public void display(){
        System.out.println("im in child");
    }
}
