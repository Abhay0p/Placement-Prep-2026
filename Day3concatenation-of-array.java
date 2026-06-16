class Solution {
        public int[] getConcatenation(int[] nums) {
            int n=nums.length;
                int arr[]=new int[2*n];
                for(int i=0;i<n;i++) {
                    arr[i]=nums[i];
                         }
                for(int i=0;i<n;i++) {
                     arr[n+i]=nums[i];
                                       }
                                return arr;
                    }
                    public static void main(String[] args) {
                        Solution s = new Solution();
                        int[] nums = {1, 2, 3};
                        int[] result = s.getConcatenation(nums);
                        for (int num : result) {
                            System.out.print(num + " ");
                        }
                    }
}