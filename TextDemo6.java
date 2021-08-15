/**
 * ClassName:TextDemo6
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/15 15:26
 */
public class TextDemo6 {
    //144. 二叉树的前序遍历
//    public List<Integer> list = new ArrayList<>();
//    public List<Integer> preorderTraversal(TreeNode root) {
//        if(root == null) return list;
//        Stack<TreeNode> s = new Stack<>();
//        TreeNode cur = root;
//        while(cur != null || !s.isEmpty()) {
//            while(cur != null) {
//                s.push(cur);
//                list.add(cur.val);
//                cur = cur.left;
//            }
//            TreeNode tmp = s.pop();
//            cur = tmp.right;
//        }
//        return list;
//    }

    //二叉树中序续遍历
//    public List<Integer> list = new ArrayList<>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        if(root == null) return list;
//        Stack<TreeNode> s = new Stack<>();
//        TreeNode cur = root;
//        while(cur != null || !s.isEmpty()) {
//            while(cur != null) {
//                s.push(cur);
//                cur = cur.left;
//            }
//            TreeNode tmp = s.pop();
//            list.add(tmp.val);
//            cur = tmp.right;
//        }
//        return list;
//    }

    //145. 二叉树的后序遍历
//    public List<Integer> list = new ArrayList<>();
//    public List<Integer> postorderTraversal(TreeNode root) {
//        if(root == null) return list;
//        Stack<TreeNode> s = new Stack<>();
//        TreeNode cur = root;
//        TreeNode prev = null;
//        while(cur != null || !s.isEmpty()) {
//            while(cur != null) {
//                s.push(cur);
//                cur = cur.left;
//            }
//            TreeNode tmp = s.peek();
//            if(tmp.right == null || tmp.right == prev) {
//                s.pop();
//                list.add(tmp.val);
//                prev = tmp;
//            } else {
//                cur = tmp.right;
//            }
//        }
//        return list;
//    }
    public static void main(String[] args) {

    }
}
