//Name - Anish Kumar Thella
//Registration number - 2241020012
//problem statement - https://cses.fi/problemset/task/1069
import java.util.Scanner;
public class Q2_1069
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String st = sc.nextLine();
        
        char[] letter = {'A','G','C','T'};
        long count = 0;
        for(int i = 0 ; i < letter.length ; i++){
            
            long current = 0;
            for(int j = 0 ; j < st.length() ; j++){
                if(letter[i] == st.charAt(j)){
                    current += 1;
                    if(current > count){
                    count = current;
                    }
                }
                else{
                    current = 0;
                    continue;
                }
            }
            
        }System.out.println(count);
    }
}
