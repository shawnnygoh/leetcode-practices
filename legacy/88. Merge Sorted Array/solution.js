/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    lastIndex = m + n - 1;
    nums2LastIndex = n - 1;
    nums1IndexBeforeZero = m - 1;

    while (nums2LastIndex >= 0) {
        if (nums1[nums1IndexBeforeZero] > nums2[nums2LastIndex]) {
            nums1[lastIndex] = nums1[nums1IndexBeforeZero];
            lastIndex--;
            nums1IndexBeforeZero--;
        } else {
            nums1[lastIndex] = nums2[nums2LastIndex];
            lastIndex--;
            nums2LastIndex--;
        }
    }
};