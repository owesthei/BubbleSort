public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 12, 7, -5, -77, 102 };

        showArray(nums);

        for (int i = 0; i < (nums.length - 1); i++) {
            for (int j = 0; j < (nums.length - 1 - i); j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, (j + 1));
                }
            }
        }

        showArray(nums);
    }

    private static void swap(int[] nums, int i, int j) {
        if (i == j) {
            return;
        }

        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private static void showArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}