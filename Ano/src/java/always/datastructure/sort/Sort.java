package always.datastructure.sort;

import org.junit.Test;

/**
 * @program: Sort
 * @description:排序算法，实现非递减排序
 * @author: Ano
 * @create: 2019-11-27 08:57
 **/
public class Sort {
    private static int[] data = {9, 8, 7, 6, 6, 5, 4, 3, 2, 1};
    //private static int[] data = {2,5,6,8,2,5,4,6,9};
    private static int n = data.length;
    /**
     * 直接插入排序
     * 稳定
     * Direct Insertion Sort 时间复杂度O(n2);空间复杂度O(1)
     */
    @Test
    public void insertSort() {
        int i, j, tmp;
        for (i = 1; i < n; i++) {
            //判断第i项是否有序，即是否小于前一项
            if (data[i] < data[i - 1]) {
                //记录第i项的值
                tmp = data[i];
                //循环移位前x项,x<i,且第前x+1项<=tmp
                for (j = i - 1; j >= 0 && data[j] > tmp; j--) {
                    data[j + 1] = data[j];
                }
                //由于j--;此处j+1=做后循环中的j，即第i项的目标位置
                data[j + 1] = tmp;
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.println(data[k]);
        }
    }

    /**
     * 冒泡排序
     * 稳定
     * 时间复杂度O(n2);空间复杂度O(1)
     */
    @Test
    public void bubbleSort() {
        int tmp;
        int count = 0, count_a = 0, count_b = 0;
        for (int i = 0; i < data.length - 1; i++) {
            count_a++;
            for (int j = 1; j < data.length - i; j++) {
                count_b++;
                if (data[j] < data[j - 1]) {
                    tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                    count++;
                }
            }
        }
        for (int l = 0; l < data.length; l++) {
            System.out.println(data[l]);
        }
        System.out.println("总交换次数:" + count + "总循环次数" + count_a + "*" + count_b);
    }

    /**
     * 选择排序
     * 不稳定
     * 时间复杂度O(n2);空间复杂度O(1)
     */
    @Test
    public void selectSort() {
        int k, tmp;
        //循环，将数组中的每一项（关键字）与其后所有项做比较
        for (int i = 0; i < n - 1; i++) {//这里i到n-1；
            //记录每一项（关键字）下标
            k = i;
            //循环与其后所有项做比较，找出最小项********算法不稳定，这里会找出排序靠后的最小项*********
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[k]) {
                    //记录最小项的下标
                    k = j;
                }
                //判断最小项下标是否被改变，多种写法k>i；k!=i;...
                //若找到最小项则将最小项与第i项进行交换
                if (k != i) {
                    tmp = data[i];
                    data[i] = data[k];
                    data[k] = tmp;
                }
            }
        }
        for (int l = 0; l < n; l++) {
            System.out.println(data[l]);
        }
    }

    /**
     * 快速排序
     * 不稳定
     * 时间复杂度O(nlogn);空间复杂度O(logn)
     */
    public static void quickSort(int[] data, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //temp就是基准位
        temp = data[low];
        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= data[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= data[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = data[j];
                data[j] = data[i];
                data[i] = t;
            }
        }
        //最后将基准为与i和j相等位置的数字交换
        data[low] = data[i];
        data[i] = temp;
        //递归调用左半数组
        quickSort(data, low, j - 1);
        //递归调用右半数组
        quickSort(data, j + 1, high);
    }

    public static void main(String[] args) {
        quickSort(data, 0, n - 1);
        for (int l = 0; l < n; l++) {
            System.out.println(data[l]);
        }
    }
}
