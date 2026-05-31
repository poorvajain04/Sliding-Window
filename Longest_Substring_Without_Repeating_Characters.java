public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s="abcdecbeadf";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s){
        boolean[] freq=new boolean[128];
        int left=0;
        int ans=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(freq[ch]){
                freq[s.charAt(left)]=false;
                left++;
            }
            freq[ch]=true;
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
