import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName:TextDemo12
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/21 19:00
 */


public class TextDemo12 {
//    public ListNode[] solve (int m, ListNode a) {
//        // write code here
//        ListNode[] arr = new ListNode[m];
//        for(int i = 0; i < m; i++) {
//            ListNode cur = null;
//            ListNode prev = a;
//            while(prev != null) {
//                if(prev.val % m == i) {
//                    if(arr[i] == null) {
//                        arr[i] = prev;
//                        cur = arr[i];
//                    } else {
//                        cur.next = prev;
//                        cur = cur.next;
//                    }
//                }
//                prev = prev.next;
//            }
//        }
//        return arr;
//    }

    public static int func(int[] arr,int n,int w) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int x : arr) {
            list.add(x);
        }
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            int j = i + 1;
            while(j < list.size()) {
                int x = list.get(i);
                int y = list.get(j);
                if(x + y < w && (x + y) % 2 == 0) {
                    sum += 1;
                    list.remove(i);
                    list.remove(j);
                }
            }
        }
        sum += list.size();
        return sum;
    }

    public static int func(int[] arr,int n) {
        if(n  < 2) return 0;
        Arrays.sort(arr);
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] == arr[i - 1]) continue;
            sum += arr[i] - arr[i - 1];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int T = in.nextInt();
            for(int i = 0; i < T; i++) {
                int n = in.nextInt();
                int w = in.nextInt();
                int[] arr = new int[n];
                for(int j = 0; j < n; j++) {
                    arr[j] = in.nextInt();
                }
                System.out.println(func(arr,n,w));
            }
        }
    }
//    public static long func(int[] arr,int n) {
//        long sum = 0;
//        Arrays.sort(arr);
//        for(int i = arr.length - 1; i >= 0; i--) {
//            sum += arr[i];
//            for(int j = i - 1; j >= 0; j--) {
//                arr[j] += arr[i];
//            }
//        }
//        return sum & 1000000007;
//    }
}
