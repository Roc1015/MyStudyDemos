/**
 * @version 1.0
 * @author: WP
 * @date: 2021/1/10 22:31
 */
public class leixingzhuanhuan{
    public static void main(String[] args) {
        int a = 128;
        byte b = (byte) a;//注意内存溢出：从高到低，类型范围可能存在变化
        byte c = 10;
        int d =  c;

        //强制转换 （类型）变量名
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);

        //精度问题
        System.out.println("===============================");
        System.out.println((int)0.0001f);
        System.out.println((int)10.000111);
        System.out.println((int)9223372036854775807L);
    }
}
