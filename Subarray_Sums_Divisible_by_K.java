public class Subarray_Sums_Divisible_by_K {
    public static int subarraysDivByK(int[] nums, int k) {
        int[] freq = new int[k];

        freq[0] = 1;

        int prefix = 0;
        int count = 0;

        for (int num : nums) {
            prefix += num;

            int rem = prefix % k;
            if (rem < 0) {
                rem += k;
            }

            count += freq[rem];
            freq[rem]++;
        }

        return count;
    }

    public static void main(String[] args) {
        int [] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums,k));
    }
}
