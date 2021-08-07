import java.util.Scanner;

/**
 * ClassName:TextDemo1
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/5 16:09
 */
public class TextDemo1 {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                for (int k = j + 1; k < arr.length; k++) {
//                    if(arr[i] < arr[j] && arr[j] < arr[k]) count++;
//                    if(arr[i] > arr[j] && arr[j] > arr[k]) count++;
//                }
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//        int[] a = {0,2,3,1,5,4,3};//品牌
//        int[] b = {0,2,2,3,1,5,2};//钱数
//        int N = sc.nextInt();
//        int[][] dp = new int[7][N + 1];
//        dp[0][0] = 0;
//        for(int i = 1; i < 7; i++) {
//            for(int j = 1; j <= N; j++) {
//                if(j < b[i]) {
//                    dp[i][j] = dp[i - 1][j];
//                } else {
//                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - b[i]] + a[i]);
//                }
//            }
//        }
//        System.out.println(dp[6][N]);

//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        String[] strs = str.split(",");
//        int[] arr = new int[strs.length];
//        for(int i = 0; i < strs.length; i++) {
//            arr[i] = Integer.parseInt(strs[i]);
//        }
//        int a = arr[0] + arr[1] + arr[2] + arr[3];
//        int b = arr[3] + arr[4] + arr[5] + arr[6];
//        int c = arr[6] + arr[7] + arr[8] + arr[0];
//        if(a == b && b == c) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }

        //
//        public static int getMaximumResource (int[][] grid) {
//            for (int i = 0; i < grid.length; i++) {
//                for (int j = 0; j < grid[0].length; j++) {
//                    if(grid[i][j] != 0) backtrack(grid,i,j,0);
//                }
//            }
//            return max;
//        }
//        static int max = 0;
//        public void backtrack(int[][] grid,int i,int j,int sum){
//            if(grid[i][j] == 0) return;
//            sum += grid[i][j];
//            int temp = grid[i][j];
//            grid[i][j] = 0;
//            max = Math.max(max,sum);
//            if(i < grid.length-1) backtrack(grid,i+1,j,sum);
//            if(i > 0) backtrack(grid,i-1,j,sum);
//            if(j < grid[0].length-1)backtrack(grid,i,j+1,sum);
//            if(j > 0) backtrack(grid,i,j-1,sum);
//            grid[i][j] = temp;
//        }
    }

}
