//Name - Anish Kumar Thella
//Registration number - 2241020012
//problem statement - https://cses.fi/problemset/task/1083
import java.util.Scanner;
import java.util.Arrays;

public class Q4_1083 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        long[] array = new long[size];
        for(int index = 0 ; index < size-1 ; index++){
            array[index] = sc.nextLong();
        }
        Arrays.sort(array);

        for(int i = 0 ; i < array.length ; i++ ){
            if(array.length == 2){
                if(array[i+1]-array[i] == 1){
                    System.out.println(array[i+1]+1);
                }
                else{
                    System.out.println(array[i+1]-1);
                }
                break;

            }try{
            if(array[i+1] - array[i] != 1){
                System.out.println(array[i]+1);
                break;
            }}
            catch(Exception e ){
                System.out.println(array[i]+1);
            }
        }

    }
    
}


