//Name - Anish Kumar Thella
//Registration number - 2241020012
//problem statement - https://cses.fi/problemset/task/1068
import java.util.*;
public class Q1_1068{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Weird_algorithm");
        //System.out.print("Enter the value of n : ");
        long n = sc.nextLong();

        while(n!=1){
            System.out.print(n+" ");
            if(n%2 == 0){
                n = n/2;
            }
            else{
                n = (n*3)+1;
            }
        }
        System.out.print(n);
    }
}