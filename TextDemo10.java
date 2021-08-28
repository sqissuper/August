import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName:TextDemo10
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/20 13:00
 */

public class TextDemo10{

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int n = 50;
//            int[] arr = new int[n];
//            for(int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//            int score = sc.nextInt();
//            for (int i = 0; i < n; i++) {
//                int tmp = arr[i];
//                int j;
//                for (j = i - 1;  j >= 0; j--) {
//                    if(tmp > arr[j]) {
//                        arr[j + 1] = arr[j];
//                    } else {
//                        break;
//                    }
//                }
//                arr[j + 1] = tmp;
//            }
//            int res = 0;
//            for(int i = 0; i < n; i++) {
//                if(score == arr[i]) {
//                    res = i + 1;
//                    break;
//                }
//            }
//            if(res >= 1 && res <= 5) {
//                System.out.println("A+");
//            } else if (res >= 6 && res <= 15) {
//                System.out.println("A0");
//            } else if(res >= 16 && res <= 30) {
//                System.out.println("B+");
//            } else if(res >= 31 && res <= 35) {
//                System.out.println("B0");
//            } else if(res >= 46 && res <= 48) {
//                System.out.println("C0");
//            } else if(res >= 49 && res <= 50) {
//                System.out.println("F");
//            }
//        }

//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = 0;
//        for(int i = 0; i < n - 1; i++) {
//            int k = i + 1;
//            int tmp = arr[i];
//            arr[i] = arr[k];
//            arr[k] = tmp;
//            int j = 0;
//            for(j = i + 1; j < n; j++) {
//                if(arr[i] != arr[j]) break;
//            }
//            max = Math.max(max,j - i);
//            int res = arr[i];
//            arr[i] = arr[k];
//            arr[k] = res;
//        }
//        System.out.println(max);

//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            for(int i = 0; i < n; i++) {
//                double x = sc.nextInt();
//                double st = sc.nextInt();
//                double sum = 0;
//                if(x - st < 0 || x + st > 60) {
//                    sum = 1 - (1.0 / (2 * st));
//                }
//                String s = String.valueOf(sum);
//                System.out.println(sum);
//            }
//        }
    }
}
