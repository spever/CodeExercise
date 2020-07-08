package code.Fibonacci;

/**
 * @author Spever
 * @date 2020/6/11
 */
public class Fabonacci {
    public static void main(String[] args) {

        System.out.println(getItem2(1000000));

    }


    /**
     * 获取第n个元素数值
     *
     * @param n
     * @return
     */
    private static long getItem1(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("n必须大于0");
        }
        if (n == 0 || n == 1) {

            return n;
        }

        return getItem1(n - 1) + getItem1(n - 2);
    }


    private static long getItem2(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("n必须大于0");
        }
        if (n == 0 || n == 1) {
            return n;
        }

        long a1 = 0, a2 = 1, temp = 0;
        for (long i = 2; i < n; i++) {
            temp = a1 + a2;
            a1 = a2;
            a2 = temp;
        }

        return temp;
    }

}
