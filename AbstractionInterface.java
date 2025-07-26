interface Vehicle{
    void start();
    void stop();

}
class car implements Vehicle{
    public void start(){
        System.out.println("Car is starting");
    }
    public void stop(){
        System.out.println("Car is stopping");
    }
}
public class AbstractionInterface {
    public static void main(String[] args) {
        Vehicle myCar = new car();
        myCar.start();
        myCar.stop();
    }
    
}
