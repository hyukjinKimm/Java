package array;

import java.util.Scanner;
public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num + "개의 정수를 입력하세요:");

        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = scanner.nextInt();
        }


        int min = nums[0];
        for (int i = 1; i < num; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.print(min);
    }
}
