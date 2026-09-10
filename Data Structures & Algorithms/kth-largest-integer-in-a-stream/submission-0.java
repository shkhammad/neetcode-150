class KthLargest {
    int i,k;
    Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(i=0;i<nums.length;++i)
            pq.offer(nums[i]);
    }
    
    public int add(int val) {
        i=k;
        List<Integer> ls = new ArrayList<>();
        pq.offer(val);

        while(i--!=0)
            ls.add(pq.poll());
        
        for(int e: ls)
            pq.offer(e);

        return ls.getLast();
    }
}
