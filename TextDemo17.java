import java.util.Scanner;

/**
 * ClassName:TextDemo17
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/29 22:41
 */
public class TextDemo17 {
    //滑动窗口的最大值
//    public ArrayList<Integer> maxInWindows(int [] num, int size) {
//        ArrayList<Integer> list = new ArrayList<>();
//        if(size == 0) return list;
//        for(int i = 0; i <= num.length - size; i++) {
//            int j = i + size;
//            int max = 0;
//            for(int k = i; k < j; k++) {
//                max = Math.max(num[k],max);
//            }
//            list.add(max);
//        }
//        return list;
//    }

    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int sum = 2;
        System.out.println(sum * a + 1);
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()) {
//            int a,b,c,d,e;
//            a = sc.nextInt();
//            b = sc.nextInt();
//            c = sc.nextInt();
//            d = sc.nextInt();
//            e = sc.nextInt();
//            int n = sc.nextInt();
//            int[][] arr = new int[n][5];
//            int res = 0,count = 0;
//            int[] ret = new int[n];
//            for(int i = 0; i < n; i++) {
//                int sum = 0;
////                sum += arr[i][0] * a;
////                sum += arr[i][1] * b;
////                sum += arr[i][2] * c;
////                sum += arr[i][3] * d;
////                sum += arr[i][4] * e;
//                for(int j = 0; j < 5; j++) {
//                    sum += arr[i][j] * (char)(a + j);
//                }
//                ret[i] = sum;
//                res = Math.max(res,sum);
//            }
//            for(int i = 0; i < n; i++) {
//                if(ret[i] == res) count++;
//            }
//            System.out.println(res);
//            System.out.println(count);
//            for(int i = 0; i < n; i++) {
//                if(ret[i] == res) {
//                    System.out.println(i + 1);
//                }
//            }
//        }
    }
}
