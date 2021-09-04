import java.util.Collection;
import java.util.Collections;

/**
 * ClassName:TextDemo
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/9/3 16:53
 */
//class Node {
//    public int val;
//    public Node next;
//    public Node(int val) {
//        this.val = val;
//    }
//    public Node() {
//
//    }
//    public Node head1;
//    public Node head2;
//
//    public void create1() {
//        this.head1 = new Node(1);
//        Node node = new Node(2);
//        this.head1.next = node;
//    }
//    public void create2() {
//        this.head2 = new Node(2);
//        Node node = new Node(3);
//        Node node2 = new Node(4);
//        this.head2.next = node;
//        node.next = node2;
//    }
//    public Node func(Node head1,Node head2) {
//        if(head1 == null || head2 == null) return null;
//        Node cur1 = head1;
//        Node cur2 = head2;
//        int sum1 = 0,sum2 = 0;
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//        while(cur1 != null) {
//            sb1.append(cur1.val);
//            cur1 = cur1.next;
//        }
//        while(cur2 != null) {
//            sb2.append(cur2.val);
//            cur2 = cur2.next;
//        }
//        sum1 = Integer.parseInt(sb1.reverse().toString());
//        sum2 = Integer.parseInt(sb2.reverse().toString());
//        int sum = sum1 + sum2;
//        Node newHead = new Node(0);
//        Node prev = newHead;
//        String s = String.valueOf(sum);
//        for(int i = 0; i < s.length(); i++) {
//            Node node = new Node(Integer.parseInt(s.charAt(i) + ""));
//            prev.next = node;
//            prev = node;
//        }
//        return newHead.next;
//    }
//}
public class TextDemo {

    //接雨水
//    public int trap(int[] height) {
//        int n = height.length;
//        if(n ==  0) return 0;
//        int[] left = new int[n];
//        left[0] = height[0];
//        for(int i = 1; i < n; i++) {
//            left[i] = Math.max(left[i - 1],height[i]);
//        }
//        int[] right = new int[n];
//        right[n - 1] = height[n - 1];
//        for(int i = n - 2; i >= 0; i--) {
//            right[i] = Math.max(right[i + 1],height[i]);
//        }
//        int sum = 0;
//        for(int i = 0; i < n; i++) {
//            sum += Math.min(left[i],right[i]) - height[i];
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        Node node = new Node();
//        node.create1();
//        node.create2();
//        Node tmp = node.func(node.head1,node.head2);
//        while (tmp != null) {
//            System.out.print(tmp.val + " ");
//            tmp = tmp.next;
//        }
//
//    }


}
