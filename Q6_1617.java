//Name - Anish Kumar Thella
//Registration number - 2241020012
//problem statement - https://cses.fi/problemset/task/1617
import java.util.Scanner;

public class Q6_1617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long result = 1;
        long modulo = 1000000007L;

        for(int i = 0 ; i < n ; i++){
            result = (result*2) % modulo;
        }
        System.out.println(result);



    }
    
}
