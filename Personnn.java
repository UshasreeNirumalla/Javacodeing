class person{
    int age;
    String name;
    void displayPerson(){
        System.out.println("Name:" +this.name);
        System.out.println("Age:" +this.age);
    }
}
class Student extends person{
    int rn;
    void displayStudent(){  
        super.displayPerson(); 
        System.out.println("Roll Number: " +this.rn);
    }
}

public class Personnn {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="usha";
        s1.age=20;
        s1.rn=547;
        s1.displayStudent();
    }
    
}
