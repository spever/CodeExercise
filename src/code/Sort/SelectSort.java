package code.Sort;

import java.util.Arrays;

/**
 * @author Spever
 * @date 2020/7/3
 * 选择排序的原理
 * 选择排序的原理是首先取第一个数字作为数组中的最小者minValue(以升序排序为例)，依次跟后续数字进行比较，如果发现有比minValue更小的数字，记录该数字的下标，并将该数字的值赋给minValue，直到遍历完数组的最后一个数字。然后根据记录的实际最小值的下标，跟第一个数字进行交换。
 * 第一趟比较执行完后就找到了数组中最小者，然后再从下一个数字开始，重复执行前面的步骤，直到倒数第二个数字比较完为止(最后数字无需比较即为最大数字)
 *
 *
 * 选择排序法的主要思想是将一组数（n个）中的最大值（或最小值）先挑出来，放在首（或尾），然后在剩下的n-1个数中再次挑出最大值（或最小值），放在前一个最大值（或最小值）的前面（或后面），以此类推。
 * 所以安排两层循环，一层固定一个数的时候，另一层逐次比较。
 *
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] items = {6, 3, 7, 4, 2, 5, 1};
        Selectsort(items);
    }

    private static void Selectsort(int[] items) {
       //method 1
//        for (int i = 0; i < items.length - 1; i++) {
//            int minIndex = i;
//            int minV = items[i];
//            for (int k = i + 1; k < items.length; k++) {
//                if (minV > items[k]) {
//                    minV = items[k];
//                    minIndex = k;
//                }
//            }
//
//            if (minIndex != i) {
//                items[minIndex] = items[i];
//                items[i] = minV;
//            }
//        }

        //method 2
        for (int m = 0; m < items.length; m++) {
            for (int n = m + 1; n < items.length; n++) {
                if (items[m] > items[n]) {
                    int temp = items[m];
                    items[m] = items[n];
                    items[n] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(items));
    }
}
