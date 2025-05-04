import java.util.*;
public class Questions {
    // Question 1: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates found
    }
    /*Question 2: There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[nums.length-1], nums[0], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity. */
    public int search(int[] nums, int target) {
        int min = minSearch(nums);
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return search(nums, min, nums.length - 1, target);
        } else {
            return search(nums, 0, min - 1, target);
        }
    }

    public int search(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int minSearch(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    /*Question 3: You are given an array prices where prices[i] is the price of a given stock on the ith day.
     return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    */
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - buy);
            }
        }
        return maxProfit;
    }

    /*Question 4: Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining. */
    public int trap(int[] height) {
        int n = height.length;
        
        int res = 0, l = 0, r = n - 1;
        int rMax = height[r], lMax = height[l];

        while (l < r){
            if (lMax < rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }
        }
        return res;
    }

    public static void main(String[] args){
        // Example usage of containsDuplicate function
        int arr[] = {1, 2, 3, 4, 1};
        containsDuplicate(arr);
        System.out.println(containsDuplicate(arr));

        // Example usage of search function
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        Questions q = new Questions();
        int result = q.search(nums, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        // Example usage of maxProfit function
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = q.maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);

        // Example usage of trap function
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trappedWater = q.trap(height);
        System.out.println("Trapped water: " + trappedWater);
    }
}
