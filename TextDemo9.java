import java.util.HashMap;

/**
 * ClassName:TextDemo9
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/17 16:55
 */
public class TextDemo9 {
    public static int n = 1;
    void printA() {
        synchronized (this) {
            while(n != 1) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("A");
            n = 2;
            this.notifyAll();
        }
    }
    void printB() {
        synchronized (this) {
            while(n != 2) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("B");
            n = 3;
            this.notifyAll();
        }
    }
    void printC() {
        synchronized (this) {
            while(n != 3) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("C");
            n = 1;
            this.notifyAll();
        }
    }
    public static void main(String[] args) {
//        Object lock = new Object();
//        Thread t1 = new Thread(()->{
//           synchronized (lock) {
//               while(n != 1) {
//                   try {
//                       lock.wait();
//                   } catch (InterruptedException e) {
//                       e.printStackTrace();
//                   }
//               }
//               System.out.println("A");
//               n = 2;
//               lock.notify();
//           }
//        });
//        t1.start();
//        Thread t2 = new Thread(()->{
//           synchronized (lock) {
//               while(n != 2) {
//                   try {
//                       lock.wait();
//                   } catch (InterruptedException e) {
//                       e.printStackTrace();
//                   }
//               }
//               System.out.println("B");
//               n = 3;
//               lock.notify();
//           }
//        });
//        t2.start();
        TextDemo9 demo9 = new TextDemo9();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 3; i++) {
                demo9.printA();
            }

        });
        t1.start();
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 3; i++) {
                demo9.printB();
            }

        });
        t2.start();
        Thread t3 = new Thread(()->{
            for (int i = 0; i < 3; i++) {
                demo9.printC();
            }

        });
        t3.start();
    }
}
