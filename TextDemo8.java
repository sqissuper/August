import java.util.concurrent.atomic.AtomicInteger;

/**
 * ClassName:TextDemo8
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/16 18:22
 */
//class D{
//    static {
//        i = 2;
//        System.out.println("11111");
//    }
//    static int i;
//}
public class TextDemo8 {
    //NC15 求二叉树的层序遍历
//    public ArrayList<ArrayList<Integer>> res = new ArrayList<>();
//    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
//        if(root == null) return res;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()) {
//            int size = queue.size();
//            ArrayList<Integer> list = new ArrayList<>();
//            for(int i = 0; i < size; i++) {
//                TreeNode cur = queue.poll();
//                list.add(cur.val);
//                if(cur.left != null) queue.offer(cur.left);
//                if(cur.right != null) queue.offer(cur.right);
//            }
//            res.add(list);
//        }
//        return res;
//    }
    public static void main(String[] args) throws InterruptedException {
        String s = "ABC";
        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(3);
                System.out.println(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        t1.start();
        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(3);
                System.out.println(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        t2.start();
//        Thread t1 = new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                try {
//
//                    Thread.sleep(3);
//                    System.out.println(s);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        t1.start();
//        Thread t2 = new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                try {
//
//                    Thread.sleep(3);
//                    System.out.println(s);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        t2.start();
//        AtomicInteger count = new AtomicInteger();
//        Thread t1 = new Thread(()->{
//            for (int i = 0; i < 100; i++) {
//                count.getAndIncrement();
//            }
//        });
//        t1.start();
//        t1.join();
//        Thread t2 = new Thread(()->{
//            for (int i = 0; i < 100; i++) {
//                count.getAndIncrement();
//            }
//        });
//        t2.start();
//        Thread t3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//        System.out.println(count.get());
//        System.out.println(D.i);
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(2,2);
//        map.put(3,3);
//        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
    }

}
