package code.binaryToDecimal;

/**
 * @author Spever
 * @date 2020/6/11
 */
public class BinaryToDecimal {
    public static void main(String[] args) {

        int a = 74;

        /**
         * method1
         */
        String result = Integer.toBinaryString(a);
        System.out.println(result);


        /**
         * method2
         * 利用“移位”操作实现
         */
        for (int i = 31; i >= 0; i--) {
            System.out.println(a >>> i & 1);
        }
    }
}
