public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};

        if (nums.length == 0) {
            return result;
        }

        if (nums[0] == target) {
            result[0] = 0;
        } else {
            result[0] = findLowestIndex(nums, target);
        }

        if (nums[nums.length - 1] == target) {
            result[1] = nums.length - 1;
        } else {
            result[1] = findHighestIndex(nums, target);
        }

        return result;
    }

    private int findLowestIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                if (nums[mid - 1] != target) {
                    index = mid;
                }
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return index;
    }

    private int findHighestIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                if (nums[mid + 1] != target) {
                    index = mid;
                }
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return index;
    }
}