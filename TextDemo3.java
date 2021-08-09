import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * ClassName:TextDemo3
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/8 16:54
 */
public class TextDemo3 {

    //JZ17 树的子结构
//    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
//        if(root1 == null || root2 == null) return false;
//        if(isSameTree(root1,root2)) return true;
//        if(HasSubtree(root1.left,root2)) return true;
//        if(HasSubtree(root1.right,root2)) return true;
//        return false;
//    }
//    public boolean isSameTree(TreeNode p,TreeNode q) {
//        if(q == null) return true;
//        if(p == null) return false;
//        if(p == null && q == null) return true;
//        if(p.val != q.val) return false;
//        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//    }

    //JZ18 二叉树的镜像
//    public TreeNode Mirror (TreeNode pRoot) {
//        if(pRoot == null) return null;
//        if(pRoot.left == null && pRoot.right == null) return pRoot;
//        TreeNode tmp = pRoot.left;
//        pRoot.left = pRoot.right;
//        pRoot.right = tmp;
//        Mirror(pRoot.left);
//        Mirror(pRoot.right);
//        return pRoot;
//    }

    //JZ20 包含min函数的栈
//    Stack<Integer> s = new Stack<>();
//    Stack<Integer> ms = new Stack<>();
//    public void push(int node) {
//        s.push(node);
//        if(ms.isEmpty()) ms.push(node);
//        if(ms.peek() >= node) ms.push(node);
//    }
//
//    public void pop() {
//        int x = s.pop();
//        if(x == ms.peek()) ms.pop();
//    }
//
//    public int top() {
//        return s.peek();
//    }
//
//    public int min() {
//        return ms.peek();
//    }

//    JZ21 栈的压入、弹出序列
//    public static boolean IsPopOrder(int [] pushA,int [] popA) {
//        Stack<Integer> s = new Stack<>();
//        int index = 0;
//        for(int i = 0; i < pushA.length; i++) {
//            s.push(pushA[i]);
//            while(!s.isEmpty() && s.peek() == popA[index]) {
//                s.pop();
//                index++;
//            }
//        }
//        return s.isEmpty();
//    }

    //JZ25 复杂链表的复制
//    public RandomListNode Clone(RandomListNode pHead) {
//        if(pHead == null) return null;
//        RandomListNode cur = pHead;
//        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
//        while(cur != null) {
//            RandomListNode node = new RandomListNode(cur.label);
//            map.put(cur,node);
//            cur = cur.next;
//        }
//        cur = pHead;
//        while(cur != null) {
//            map.get(cur).next = map.get(cur.next);
//            map.get(cur).random = map.get(cur.random);
//            cur = cur.next;
//        }
//        return map.get(pHead);
//    }
    public static void main(String[] args) {
//        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
//        int[] arr = {1,2,3,4,5};
//        int[] ret = {4,5,3,2,1};
//        System.out.println(IsPopOrder(arr, ret));
    }
}
