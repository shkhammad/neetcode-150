class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>();

        for(int val: nums){
            pq.offer(val);
            if(pq.size() > k)
                pq.poll();
        }

        //System.out.println(pq.toString());

        return pq.peek();
    }
}
