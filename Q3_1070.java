//Name - Anish Kumar Thella
//Registration number - 22410120012
//question link - https://cses.fi/problemset/task/1070/
import java.util.Scanner;
public class Q3_1070 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number == 1){
            System.out.println("1");
        }
        else if(number == 2 || number == 3){
            System.out.println("NO SOLUTION");
        }
        else {
            StringBuilder beautifulPermutation = new StringBuilder();

           //for 2 to n
            for (int i = 2; i <= number; i += 2) {
                beautifulPermutation.append(i).append(" ");
            }

            //for 1 to n
            for (int i = 1; i <= number; i += 2) {
                beautifulPermutation.append(i).append(" ");
            }

            System.out.println(beautifulPermutation.toString());
        }

    }
    
}
