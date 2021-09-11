class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Queue<Integer> pq = new PriorityQueue( (a,b) -> map.get(a) - map.get(b));
            
        for(int i = 0;i < nums.length;i++){
            map.put( nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for( int n: map.keySet() ){
            pq.offer(n);
            if(pq.size() > k) pq.poll();
        }
            
        int[] top = new int[k];
        for(int i = k-1; i >= 0;i--){
            top[i] = pq.poll();
        }
        
        return top;
       
    }
}