public class Smallest_Distinct_Window {
        public static int findSubString(String str) {
        int first=0;
        int second=0;
        int[] freq=new int[255];
        int len=str.length();
        int diff=0;
        while(first<str.length()){
            if(freq[str.charAt(first)]==0){
                diff++;
            }
            freq[str.charAt(first)]++;
            first++;
        }
        for(int i=0;i<255;i++){
            freq[i]=0;
        }
        first=0;
        while(second<str.length()){
            while(diff>0 && second<str.length()){
                if(freq[str.charAt(second)]==0){
                    diff--;
                }
                freq[str.charAt(second)]++;
                second++;
            }
            len=Math.min(len, second-first);
            while(diff==0){
                len=Math.min(len, second-first);
                freq[str.charAt(first)]--;
                if(freq[str.charAt(first)]==0){
                    diff++;
                }
                first++;
            }
        }
        return len;
    }
    public static void main(String args[]){
            String s="abcaabcdacbd";
            System.out.println(findSubString(s));
    }
}
