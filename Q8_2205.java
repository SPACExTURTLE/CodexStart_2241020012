//Name - Anish Kumar Thella
//Registraion number - 2241020012
//problem link - https://cses.fi/problemset/task/2205
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Q8_2205 {
    public static List<String> generateGrayCode(int n) {
        List<String> grayCode = new ArrayList<>();
        if (n <= 0) {
            return grayCode;
        }

        if (n == 1) {
            grayCode.add("0");
            grayCode.add("1");
        } else {
            List<String> prevGrayCode = generateGrayCode(n - 1);
            for (String code : prevGrayCode) {
                grayCode.add("0" + code);
            }
            for (int i = prevGrayCode.size() - 1; i >= 0; i--) {
                grayCode.add("1" + prevGrayCode.get(i));
            }
        }

        return grayCode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> grayCode = generateGrayCode(n);
        for (String code : grayCode) {
            System.out.println(code);
        }
    }
}
