public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 6, 9, 32, 54};
        int output = search(list, 9);
    }
    public static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] == target){
                return midpoint;
            } else if (nums[midpoint] > target){
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
        }
        return -1;
    }
}
