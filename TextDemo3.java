import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName:TextDemo3
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/9/7 9:32
 */

public class TextDemo3 {
    public static void func(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for(j = i - 1; j >= 0; j--) {
                if(arr[j] < tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            for(int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            for(int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }
            func(arr1);
            for(int i = 0; i < m; i++) {
                boolean f = false;
                int tmp = 0;
                for(int j = 0; j < n; j++) {
                    if(arr1[j] < 0) continue;
                    if(arr1[j] <= arr2[i]) {
                        tmp = arr1[j];
                        arr1[j] = -1;
                        f = true;
                        break;
                    }
                }
                if(f) {
                    System.out.print(tmp + " ");
                } else {
                    System.out.print("-1 ");
                }
            }
//            int n = sc.nextInt();
//            String s = sc.nextLine().trim();
//            String[] str = new String[n];
//            for (int i = 0; i < n; i++) {
//                str[i] = sc.nextLine().toLowerCase();
//            }
//            s = s.toLowerCase();
//            int count = 0;
//            for (String tmp : str) {
//                for (int i = 0; i < tmp.length() - s.length(); i++) {
//                    String res = tmp.substring(i, i + s.length());
//                    if (res.equals(s)) {
//                        count++;
//                        break;
//                    }
//                }
//            }
//            System.out.println(count);
        }
    }
}
