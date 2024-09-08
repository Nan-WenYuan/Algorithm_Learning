package sorting_algorithm;
import Tools.Tools;

import java.util.Arrays;

public class selection_sort
{
    public static void main(String[] args) {
        System.out.println("选择排序");
        int[] testData = Tools.generateRandomArray(10, 0, 100);
        int n = testData.length;
        // // 外循环：未排序区间为 [i, n-1]
        for (int i = 0; i < n - 1; i++) {
            // 内循环：找到未排序区间内的最小元素
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (testData[j] < testData[min]) {
                    min = j; // 记录最小元素的索引
                }
            }
            // 将该最小元素与未排序区间的首个元素交换
            int temp = testData[i];
            testData[i] = testData[min];
            testData[min] = temp;
        }
        System.out.println("排序后的数据:"+ Arrays.toString(testData));
    }
}
