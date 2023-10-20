
package Try;
import java.util.Scanner;

public class Test {
     public static int task(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=9){
                sum+=arr[i];
            }
        }
    return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array: ");
        int arr[]=new int[5];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(task(arr));
    }
}
