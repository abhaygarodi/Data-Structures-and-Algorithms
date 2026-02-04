class Solution {
    private static final long INF = (long) 1e18;

    public long maxSumTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return -1; // A Trionic array requires at least 4 elements

        // dp1: Max sum ending at i in the First Increasing phase
        // dp2: Max sum ending at i in the Decreasing phase
        // dp3: Max sum ending at i in the Second Increasing phase
        long[] dp1 = new long[n];
        long[] dp2 = new long[n];
        long[] dp3 = new long[n];
        
        // Initialize with -INF
        Arrays.fill(dp1, -INF);
        Arrays.fill(dp2, -INF);
        Arrays.fill(dp3, -INF);

        long maxEle = -INF;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                // Phase 1: First Increasing
                // Option A: Start a new increasing sequence here (nums[i-1], nums[i])
                // Option B: Extend an existing increasing sequence from dp1[i-1]
                dp1[i] = Math.max((long) nums[i] + nums[i - 1], dp1[i - 1] + nums[i]);

                // --- Phase 3: Second Increasing
                // Option A: Transition from Phase 2 (Peak-Valley transition)
                if (dp2[i - 1] != -INF) {
                    dp3[i] = Math.max(dp3[i], dp2[i - 1] + nums[i]);
                }
                // Option B: Extend existing Phase 3
                if (dp3[i - 1] != -INF) {
                    dp3[i] = Math.max(dp3[i], dp3[i - 1] + nums[i]);
                }
            } else if (nums[i] < nums[i - 1]) {
                // Phase 2: Decreasing
                // Option A: Transition from Phase 1 (Peak transition)
                if (dp1[i - 1] != -INF) {
                    dp2[i] = Math.max(dp2[i], dp1[i - 1] + nums[i]);
                }
                // Option B: Extend existing Phase 2
                if (dp2[i - 1] != -INF) {
                    dp2[i] = Math.max(dp2[i], dp2[i - 1] + nums[i]);
                }
            }
            // Note: If nums[i] == nums[i-1], strict monotonicity breaks.
            // All dp[i] states remain -INF.

            maxEle = Math.max(maxEle, dp3[i]);
        }

        return maxEle == -INF ? -1 : maxEle;
    }
}