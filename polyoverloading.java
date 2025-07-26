class Student{ //compile time polymorphism (method overloading)
    String name;
    int age;
    public void displayInfo(String name){
        System.out.println(name);
    }
    public void displayInfo(int age){
        System.out.println(age);
    }
    public void displayInfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }

}

public class polyoverloading {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.displayInfo(20);

        Student s2=new Student();
        s2.displayInfo("ushaa",20);

        Student s3=new Student();
        s3.displayInfo("ushaaa");

    }
}
