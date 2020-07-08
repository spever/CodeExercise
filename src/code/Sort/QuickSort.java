package code.Sort;

import java.util.Arrays;

/**
 * @author Spever
 * @date 2020/7/3
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] items = {6, 3, 7, 4, 2, 5, 1};
        quicksort(items, 0, items.length - 1);
//        System.out.println( Arrays.toString(items));
    }

    private static void quicksort(int[] array, int left, int right) {
        int l, r, flag;
        if (left >= right) {
            return;
        }
        l = left;
        r = right;
        flag = array[left];


        while (l < r) {
            //现在右边找
            while (array[r] >= flag && l < r) {
                r--;
            }

            //再从左边找
            while (array[l] <= flag && l < r) {
                l++;
            }

            //交换
            if (l < r) {
                int temp = array[r];
                array[r] = array[l];
                array[l] = temp;
            }

//            System.out.println( Arrays.toString(array));

        }

        //一趟交换完,基准值放入临界位置
        array[left] = array[l];
        array[l] = flag;

//        System.out.println("change==="+ Arrays.toString(array));
        quicksort(array, left, l - 1);
        quicksort(array, l + 1, right);


    }

}
