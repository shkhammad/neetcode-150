class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();

        for(int val: nums)
            st.add(val);

        return st.size() != nums.length;
    }
}