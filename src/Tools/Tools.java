package Tools;

import java.util.Arrays;
import java.util.Random;

public class Tools {

    // 生成随机数组的方法
    public static int[] generateRandomArray(int size, int minValue, int maxValue) {
        Random random = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            // 生成[minValue, maxValue]范围内的随机整数
            arr[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }
        System.out.println("测试数据为:" + Arrays.toString(arr));
        return arr;
    }
}
