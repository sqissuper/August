/**
 * ClassName:TextDemo7
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/16 15:59
 */
public class TextDemo7 {
    //409. 最长回文串
//    public int longestPalindrome(String s) {
//        if(s == null || s.length() == 0) return 0;
//        int max = 0;
//        HashMap<Character,Integer> map = new HashMap<>();
//        char[] c = s.toCharArray();
//        int[] ch = new int[58];
//        for(char tmp : c) {
//            ch[tmp - 'A']++;
//        }
//        for(int x : ch) {
//            max += x / 2 * 2;
//            if(x % 2 == 1 && max % 2 == 0) {
//                max++;
//            }
//        }
//        return max;
//    }

    //剑指 Offer 07. 重建二叉树
//    public int index = 0;
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        if(preorder == null || inorder == null) return null;
//        int s = 0,e = preorder.length - 1;
//        return rebuildTree(preorder,inorder,s,e);
//
//    }
//    public TreeNode rebuildTree(int[] pre,int[] in,int s,int e) {
//        if(s > e) return null;
//        TreeNode root = new TreeNode(pre[index]);
//        int idx = findKey(in,s,e,pre[index]);
//        index++;
//        root.left = rebuildTree(pre,in,s,idx - 1);
//        root.right = rebuildTree(pre,in,idx + 1,e);
//        return root;
//    }
//    public int findKey(int[] in,int s,int e,int key) {
//        for(int i = s; i <= e; i++) {
//            if(in[i] == key) return i;
//        }
//        return -1;
//    }

    //剑指 Offer 28. 对称的二叉树
//    public boolean isSymmetric(TreeNode root) {
//        if(root == null) return true;
//        if(root.left == null && root.right == null) return true;
//        return isSymmetricTree(root.left,root.right);
//    }
//    public boolean isSymmetricTree(TreeNode q,TreeNode p) {
//        if(q == null && p == null) return true;
//        if(p == null && q != null || p != null && q == null) return false;
//        if(q.val != p.val) return false;
//        return isSymmetricTree(q.left,p.right) && isSymmetricTree(q.right,p.left);
//    }

    //剑指 Offer 68 - I. 二叉搜索树的最近公共祖先
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root == null) return null;
//        TreeNode cur = root;
//        while(true) {
//            if(p.val < cur.val && q.val < cur.val) {
//                cur = cur.left;
//            } else if(p.val > cur.val && q.val > cur.val) {
//                cur = cur.right;
//            } else {
//                break;
//            }
//        }
//        return cur;
//    }
    public static void main(String[] args) {

    }
}
