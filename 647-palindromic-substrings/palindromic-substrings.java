class Solution {
    public int countSubstrings(String s){
        int n = s.length();
        int count = 0;

        for(int i = 0; i < n; i++){
            count += 1+palinCount(i-1,i+1,s);
        }
         for(int i = 1; i < n; i++){
            count += palinCount(i-1,i,s);
        }
        return count;
    }

    public int palinCount(int left, int right, String s){
    int count = 0;
    while(left >= 0 && right < s.length()){
        if(s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        else{
            break;
        }
    }
    return count;
}
}

