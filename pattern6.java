public class pattern6 {
    //solid rectangle
    //loop in rectangle
    //half pyramid
    //reverse pyramid
    //inverted half pyramid
    //
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //floyed triangle
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
    }
    int num1=15;
    for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(num1+" ");
                num1--;
            }
            System.out.println();
        }
     //01
     for(int i=1;i<=n;i++){
        if(i%2==0){
                num=0;
                }
                else{
                    num=1;
                }
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num=1-num;;
            }
            System.out.println();
     }//01
     for(int i=1;i<=n;i++){
       for(int j=1;j<=i;j++){

        int sum=i+j;
        if(sum%2==0){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
       }
       System.out.println();
     }//01 reverse
    for(int i=1;i<=n;i++){
       for(int j=i;j<=n;j++){
        int sum=i+j;
        if(sum%2==0){
            System.out.print(1+" ");
        }
        else{
            System.out.print(0+" ");
        }
       }
       System.out.println();
     }



}
}