import java.util.Objects;

/**
 * @version 1.0
 * @author: WP
 * @date: 2021/1/10 21:01
 */
public class equals {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        Integer aa = new Integer(10);
        Integer bb = new Integer(10);

        String aaa = "10";
        String bbb = "100";


        System.out.println(a==b);
        System.out.println(aa==bb);
        System.out.println(a==bb);
        System.out.println(aaa==bbb);

        System.out.println(Objects.equals(a, b));
        System.out.println(Objects.equals(aa, bb));
        System.out.println(Objects.equals(a, bb));
        System.out.println(Objects.equals(aaa,bbb));
    }

}
