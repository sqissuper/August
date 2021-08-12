package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    //5. 最长回文子串
//    public String longestPalindrome(String s) {
//        if(s.length() < 2 || s == null) return s;
//        int len = s.length();
//        String res = "";
//        int resLen = res.length();
//        for(int i = 0; i < len; i++) {
//            for(int j = 0; j < len; j++) {
//                if(j - i + 1 > resLen && isPalindrome(s,i,j)) {
//                    resLen = j - i + 1;
//                    res = s.substring(i,j + 1);
//                }
//            }
//        }
//        return res;
//    }
//    public boolean isPalindrome(String s,int i,int j) {
//        while(i < j) {
//            if(s.charAt(i) != s.charAt(j)) return false;
//            i++;
//            j--;
//        }
//        return true;
//    }

    //83. 删除排序链表中的重复元素
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode newHead = new ListNode(0);
//        ListNode prev = newHead;
//        ListNode cur = head;
//        prev.next = cur;
//        while(cur != null) {
//            if(cur.next != null && cur.val == cur.next.val) {
//                while(cur.next != null && cur.val == cur.next.val) {
//                    cur = cur.next;
//                }
//            }
//            cur = cur.next;
//            prev = prev.next;
//            prev.next = cur;
//        }
//        return newHead.next;
//    }

    //19. 删除链表的倒数第 N 个结点
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if(head == null) return null;
//        if(head.next == null && n == 1) return null;
//        ListNode newHead = new ListNode(0);
//        ListNode fast = head;
//        ListNode cur = newHead;
//        ListNode slow = head;
//        while(n != 0) {
//            fast = fast.next;
//            n--;
//        }
//        while(fast != null) {
//            cur.next = slow;
//            fast = fast.next;
//            slow = slow.next;
//            cur = cur.next;
//        }
//        cur.next = slow.next;
//        return newHead.next;
//    }
    public static void main(String[] args) {
//        String s = "hello word";
//        String[] strs = s.split(" ");
//        for (int i = 0; i < strs.length; i++) {
//            char[] c = strs[i].toCharArray();
//            c[0] -= 32;
//            strs[i] = new String(c);
//        }
//        System.out.println(Arrays.toString(strs));

//        int[] arr = {1,2,5,9,8,7,4,6,3};
//        int target = 10;
//        for (int i = 0; i < arr.length; i++) {
//            ArrayList<Integer> list = new ArrayList<>();
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] + arr[j] == target) {
//                    System.out.println(i + " " + j);
//                }
//            }
//        }
    }
}
