import java.util.*;

/**
 * ClassName:TextDemo16
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/29 10:31
 */
public class TextDemo16 {
//    public static int func(int[] arr,int n) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        List<Integer> list = new ArrayList<>();
//        for(int x : arr) {
//            if(map.containsKey(x)) {
//                int tmp = map.get(x);
//                map.put(x,tmp + 1);
//            } else {
//                map.put(x,1);
//            }
//            if(!list.contains(x)) list.add(x);
//        }
//        int sum = 0;
//
//        for(int i = 0; i < list.size(); i++) {
//            if(i > 0 && list.get(i) > list.get(i - 1)) {
//                int j = 0;
//                for(int k = 0; k < i; k++) {
//                    if(list.get(i) > list.get(k)) j++;
//                }
//                sum += map.get(list.get(i)) * j;
//            }
//        }
//        return sum;
//    }
//
//    public static int func(String s,String a) {
//        for(int i = 0; i < a.length() - 2; i++) {
//            if(!s.contains(a.charAt(i)+"")) return -1;
//            s += s;
//        }
//        int res = s.lastIndexOf(a.charAt(a.length() - 1)) - (a.length() - 1);
//        return res;
//    }
//    public static void main(String[] args) {
//        System.out.println(func("meituan", "uta"));
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n,p,q;
            n = sc.nextInt();
            p = sc.nextInt();
            q = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(func(arr,n,p,q));
        }
    }
    public static int func(int[] arr,int n,int p,int q) {
        Arrays.sort(arr);
        int max = 100;
        int count = 0;
        for(int i = n - 1; i >= 0; i--) {
            double tmp = arr[i] * (q * 1.0 / 100);
            double res = max * (p * 1.0 / 100);
            if(tmp + res >= 60) {
                count++;
                if(i > 0 && arr[i] != arr[i - 1]) max--;
            }
        }
        return count;
    }
}
