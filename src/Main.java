//  Написать метод, осуществляющий сортировку одномерного
//массива подсчётом. Важное ограничение состоит в том, что для этой
//сортировки диапазон значений исходного массива должен находиться в
//разумных пределах, например, не более 100.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] array = new int[] {1,3,4,2,6,3,7,9,5,7,1,3,2,5,8,9,5,6,6,2};
//        countSort(array);
//        System.out.println(Arrays.toString(array));
        int[] array = new int[] {1,2,3,4,5,6,7,8,9};
        int n = 1;
        shiftArray(array,n);

    }

    public static void countSort(int[] array) {
        final int max = 100;
        int[] count = new int[max];

        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[index] = i;
                index++;
            }
        }
    }

    // Написать метод «Шифр Цезаря», с булевым параметром зашифрования и расшифрования и числовым ключом

    // Написать метод, принимающий на вход массив чисел и параметр n.
    // Метод должен осуществить циклический
    // (последний элемент при сдвиге становится первым)
    // сдвиг всех элементов массива на n позиций;

    public static void shiftArray(int[] array, int n){
        int[] resultArray = new int[array.length];
        int k = 0;
        do{
            int m = 0;
            if (n > 0){
                m = array.length - 1 - k;
            }
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = array[m];
                m++;
                if (m == array.length){
                    m = 0;
                }
                k++;
            }
        }while(n > k);

        System.out.println(Arrays.toString(resultArray));
    }

}