public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 6, 9, 32, 54};
        int output = search(list, 9);
        System.out.println("Output : " + output);
    }
    public static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;
        while (right >= left){
//            int midpoint = left + (right - left) / 2;
//            if (nums[midpoint] == target){
//                return midpoint;
//            } else if (nums[midpoint] > target){
//                right = midpoint - 1;
//            } else {
//                left = midpoint + 1;
//            }
            int mid = (left + right) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            }
            else if (target == nums[mid]) {
                return mid;
            }
            else
                left = mid + 1;
        }
        return -1;
    }
}
