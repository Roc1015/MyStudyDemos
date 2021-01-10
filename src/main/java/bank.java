import java.math.BigDecimal;
import java.util.function.BinaryOperator;

/**
 * @version 1.0
 * @author: WP
 * @date: 2021/1/10 21:23
 */
public class bank {
    public static void main(String[] args) {
        float a = 0.1f;
        double b = 1.0/10d;

        System.out.println(a);//0.1
        System.out.println(b);//0.1
        System.out.println(a==b);

        System.out.println("=========================================");

        float c = 1000000000000000.01f;
        float d = c+1;
        double e = 1111111111;
        double f = e+1;

        System.out.println(c==d);
        System.out.println(e==f);

        System.out.println("=========================================");

        BigDecimal bd = BigDecimal.valueOf(1000000000000000.01);
        BigDecimal db = BigDecimal.valueOf(1000000000000001.01);

        System.out.println(bd==db);
    }
}
