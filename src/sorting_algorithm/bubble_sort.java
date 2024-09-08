package sorting_algorithm;

import Tools.Tools;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        System.out.println("冒泡排序");
        int[] testData = Tools.generateRandomArray(10, 0, 100);
        // 外循环：未排序区间为 [0, i]
        for (int i = testData.length - 1; i > 0; i--) {
            // 内循环：将未排序区间 [0, i] 中的最大元素交换至该区间的最右端
            for (int j = 0; j < i; j++) {
                if (testData[j] > testData[j + 1]) {
                    // 交换 testData[j] 与 testData[j + 1]
                    int temp = testData[j];
                    testData[j] = testData[j + 1];
                    testData[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后的数据:" + Arrays.toString(testData));
    }
}
