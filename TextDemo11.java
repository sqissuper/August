import java.util.Arrays;

/**
 * ClassName:TextDemo11
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/20 14:57
 */
public class TextDemo11 {
    public static String s1 = "0abcdefghijklmnopqrstuvwxyz";
    public static String s2 = "0zyxwvutsrqponmlkjihgfedcba";
    public static char findKthBit (int n, int k) {
        String[] str = new String[n + 1];
        str[1] = s1.charAt(1) + "";
        for(int i = 2; i <= n; i++) {
            String tmp = func(str[i - 1]);
            str[i] = str[i - 1] + (s1.charAt(i) + "") + tmp;
        }
        if(k < 0 || k > str[n].length()) return '0';
        return str[n].charAt(k - 1);
    }
    public static String func(String s) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(int i = 1; i < 27; i++) {
            if(j < s.length() && s1.charAt(i) == s.charAt(j)) {
                sb.append(s2.charAt(i));
                j++;
            }
        }
        return sb.reverse().toString();
    }

    public static int func(int[] arr) {
        if(arr.length == 0 || arr == null) return 0;
        Arrays.sort(arr);
        int[] dp = new int[arr.length];
        dp[0] = 1;
        int sum = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + 1;
            }
            sum += dp[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 26;
        System.out.println(findKthBit(n, k));

    }
}
