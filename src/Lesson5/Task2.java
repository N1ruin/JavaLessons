package Lesson5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Введите число %d", i+1);
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                System.out.println(nums[i] + nums[nums.length - 1]);
            } else {
                System.out.println(nums[i] + nums[i - 1]);
            }
        }
    }
}
