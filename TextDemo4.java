import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:TextDemo4
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/9 15:53
 */
public class TextDemo4 {
    //JZ26 二叉搜索树与双向链表
//    public TreeNode prev = null;
//    public TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree == null) return null;
//        func(pRootOfTree);
//        TreeNode head = pRootOfTree;
//        while(head.left != null) head = head.left;
//        return head;
//    }
//    public void func(TreeNode pRootOfTree) {
//        if(pRootOfTree == null) return;
//        func(pRootOfTree.left);
//        pRootOfTree.left = prev;
//        if(prev != null) prev.right = pRootOfTree;
//        prev = pRootOfTree;
//        func(pRootOfTree.right);
//    }


    //JZ15 反转链表
//    public ListNode ReverseList(ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode prev = null;
//        ListNode cur = head;
//        while(cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        head = prev;
//        return head;
//    }

    //JZ55 链表中环的入口结点
//    public ListNode EntryNodeOfLoop(ListNode pHead) {
//        if(pHead == null) return null;
//        ListNode fast = pHead;
//        ListNode slow = pHead;
//        while(fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow) break;
//        }
//        slow = pHead;
//        if(fast == null || fast.next == null) return null;
//        while(fast != slow) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow;
//    }

    //JZ56 删除链表中重复的结点
//    public ListNode deleteDuplication(ListNode pHead) {
//        if(pHead == null) return null;
//        ListNode newHead = new ListNode(0);
//        ListNode cur = pHead;
//        ListNode prev = newHead;
//        while(cur != null) {
//            if(cur.next != null && cur.val == cur.next.val) {
//                while(cur.next != null && cur.val == cur.next.val) {
//                    cur = cur.next;
//                }
//                cur = cur.next;
//            } else {
//                prev.next = cur;
//                cur = cur.next;
//                prev = prev.next;
//            }
//            prev.next = null;
//        }
//        return newHead.next;
//    }

    //JZ58 对称的二叉树
//    boolean isSymmetrical(TreeNode pRoot) {
//        if(pRoot == null) return true;
//        return func(pRoot.left,pRoot.right);
//    }
//    public boolean func(TreeNode left,TreeNode right) {
//        if(left == null && right != null || left != null && right == null) return false;
//        if(left == null && right == null) return true;
//        if(left.val != right.val) return false;
//        return func(left.left,right.right) && func(left.right,right.left);
//    }


    //JZ57 二叉树的下一个结点
//    public TreeLinkNode GetNext(TreeLinkNode pNode) {
//        if(pNode == null) return null;
//        if(pNode.right != null) {
//            pNode = pNode.right;
//            while(pNode.left != null) pNode = pNode.left;
//            return pNode;
//        }
//        while(pNode.next != null) {
//            if(pNode.next.left == pNode) return pNode.next;
//            pNode = pNode.next;
//        }
//        return null;
//    }
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
    }
}
