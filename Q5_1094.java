//Name - Anish Kumar Thella
//Registration number - 2241020012
//problem statement - https://cses.fi/problemset/task/1094
import java.util.Scanner;
public class Q5_1094{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        long[] array = new long[size];
        for(int index = 0 ; index < array.length ; index++){
            array[index] = sc.nextInt();
        }
        long moves = 0;

        for(int i = 1 ; i < array.length; i++){
            if(array[i] <= array [i-1]){
                moves += (array[i-1]-array[i]);
                array[i] = array[i-1];

            }

        }System.out.println(moves);



    }
}