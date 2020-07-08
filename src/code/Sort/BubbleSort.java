package code.Sort;

/**
 * @author Spever
 * @date 2020/7/3
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] items = {6,3,7,4,2,5,1};
        bubbleSort(items);


    }

    private static void bubbleSort(int[] arrays){

        for (int i = 0; i < arrays.length - 1; i++) {

            for (int j = 0; j < arrays.length-1-i; j++) {
                if (arrays[j]> arrays[j+1]){
                    int temp = arrays[j];
                    arrays[j]= arrays[j+1];
                    arrays[j+1] = temp;
                }


            }

        }


        for (int s :
                arrays) {
            System.out.println(s);
        }
    }


}
