class Solution {
    public int reverseDegree(String s) {
        int res=0, a=0;
        for(int i=s.length()-1; i>=0;i--){
            res+=a+='{'-s.charAt(i);
        }
        return res;
    }
}