class Solution {
    public int[][] kClosest(int[][] points, int k) {

        int i,n=points.length;
        int res[][] = new int[k][2];

        Queue<Pair> pq = new PriorityQueue<>((p1,p2) -> {
            double d1 = Math.sqrt((p1.x * p1.x) + (p1.y * p1.y));
            double d2 = Math.sqrt((p2.x * p2.x) + (p2.y * p2.y));
            return Double.compare(d2,d1);
        });

        for(i=0;i<n;++i){
            pq.offer(new Pair(points[i][0],points[i][1]));
            if(pq.size()>k)
                pq.poll();
        }

        for(i=0;i<k;++i){
            Pair pair = pq.poll();
            res[i][0] = pair.x;
            res[i][1] = pair.y;
        }

        return res;
    }
}

class Pair{
    int x,y;
    
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
