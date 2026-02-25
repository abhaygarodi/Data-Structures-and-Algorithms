class Solution {
    public class Pair{
        int ocnt;
        int val;
        public Pair(int ocnt,int val){
            this.ocnt=ocnt;
            this.val=val;
        }
    }
    public int getOneCnt(int n){
        int cnt = 0;
        String str = Integer.toBinaryString(n);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1') cnt++;
        }
        return cnt;

    }
    public int[] sortByBits(int[] arr) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->{
            if(x.ocnt!=y.ocnt){
                return x.ocnt-y.ocnt;
            }else{
                return x.val-y.val;
            }
        });
        for(int i : arr){
            int val = getOneCnt(i);
            pq.add(new Pair(val,i));
        }
        int[] ans = new int[arr.length];
        int idx = 0;
        while(!pq.isEmpty()){
            ans[idx++] = pq.poll().val;
        }
        return ans;
    }
}