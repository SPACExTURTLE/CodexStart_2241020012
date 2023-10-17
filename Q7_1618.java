//Name - Anish Kumar Thella
//Registration number - 2241020012
//problem statement - https://cses.fi/problemset/task/1618
import java.util.Scanner;
public class Q7_1618{
    public static void main(String[] args) {
        Q7_1618 obj = new Q7_1618();
        Scanner sc = new Scanner(System.in);
        long result = 0;
        long number = sc.nextLong();
        while(number / 5 > 0 ){
            result +=  (number/5);
            number = number/5;
        }
        System.out.println(result);
        
    }
}