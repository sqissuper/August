import java.util.Arrays;

/**
 * ClassName:TextDemo2
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/8 15:53
 */
public class TextDemo2 {
//    public static void quickSort(int[] arr,int left,int right) {
//        if(left < right) {
//            //拿到基准值
//            int piv = getPivot(arr,left,right);
//            //递归左边
//            quickSort(arr,left,piv - 1);
//            //递归右边
//            quickSort(arr,piv + 1,right);
//        }
//    }

//    public static void quickSort(int[] arr,int left,int right) {
//        if(left < right) {
//            int piv = pivot(arr,left,right);
//            quickSort(arr,left,piv - 1);
//            quickSort(arr,piv + 1,right);
//        }
//    }
//    public static int pivot(int[] arr,int left,int right) {
//        int tmp = arr[left];
//        while(left < right) {
//            //找右边比tmp小的
//            while(left < right && arr[right] > tmp) {
//                right--;
//            }
//            arr[left] = arr[right];
//
//            //找左边比tmp大的
//            while(left < right && arr[left] < tmp) {
//                left++;
//            }
//            arr[right] = arr[left];
//        }
//        //当left = right
//        arr[left] = tmp;
//        //返回基准值
//        return left;
//    }
//    public static int pivot(int[] arr,int left,int right) {
//        int tmp = arr[left];
//        while(left < right) {
//            while(left < right && arr[right] > tmp) {
//                right--;
//            }
//            arr[left] = arr[right];
//            while(left < right && arr[left] < tmp) {
//                left++;
//            }
//            arr[right] = arr[left];
//
//        }
//        arr[left] = tmp;
//        return left;
//    }

    //JZ39 平衡二叉树
//    public boolean IsBalanced_Solution(TreeNode root) {
//        if(func(root) >= 0) return true;
//        return false;
//    }
//    public int func(TreeNode root) {
//        if(root == null) return 0;
//        int l = func(root.left);
//        int r = func(root.right);
//        if(l >= 0 && r >= 0 && Math.abs(l - r) <= 1) {
//            return Math.max(l,r) + 1;
//        } else {
//            return -1;
//        }
//    }

    //JZ5 用两个栈实现队列
//    Stack<Integer> stack1 = new Stack<Integer>();
//    Stack<Integer> stack2 = new Stack<Integer>();
//
//    public void push(int node) {
//        stack1.push(node);
//    }
//
//    public int pop() {
//        while(!stack1.isEmpty()) {
//            stack2.push(stack1.pop());
//        }
//        int res = stack2.pop();
//        while(!stack2.isEmpty()) {
//            stack1.push(stack2.pop());
//        }
//        return res;
//    }
    public static void main(String[] args) {
//        int[] arr = {3,5,8,9,6,4,0,2,1};
//        quickSort(arr,0,arr.length - 1);
//        System.out.println(Arrays.toString(arr));
    }
}
