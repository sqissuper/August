import java.util.HashMap;

/**
 * ClassName:TextDemo10
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/8/20 13:00
 */
class Main{
    static {
        System.out.println("父类静态代码块");

    }
    public Main(){
        System.out.println("父类构造方法");
    }
    {
        System.out.println("普通代码块");
    }
    public void func() {
        System.out.println("baba");
    }
}
public class TextDemo10 extends Main{
    static {
        System.out.println("子类静态代码块");
    }
    public TextDemo10() {
        System.out.println("子类构造方法");
    }
    {
        System.out.println("子类普通代码块");
    }
    public void func() {
        System.out.println("erzi");
    }
    public static void main(String[] args) {
        Main m = new TextDemo10();
        m.func();
        HashMap<Integer,Integer> map = new HashMap<>();
    }
}
