class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        ArrayList<Integer> lst=new ArrayList<>(map.keySet());
        lst.sort((a, b)->map.get(b)-map.get(a));
        int ans[] = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = lst.get(i);
        }
        return ans;
    }
}