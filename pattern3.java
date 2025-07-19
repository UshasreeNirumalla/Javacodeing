    public class pattern3{
        
        public static void main(String [] args){ 
        int n=5;
        //pattern1
        for (int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //pattern2
        for (int i=1;i>=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //pattern3
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i+1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    } 
}