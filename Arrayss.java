import java.util.Arrays;
public class Arrayss {
    public static void main(String []args){
        int[] arr1 = {5,1,3,8};
        
        System.out.println("Elements of arr1:"+Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("sorted array:"+Arrays.toString(arr1));
        System.out.println(arr1.length);      
        
        int[][] arr2={{0,1,2},
        {3,4,5}};
        System.out.println("Elements of arr2:"+Arrays.deepToString(arr2));
        }
}

