
class Solution {
    public int solution(int N) {
    
    String string = Integer.toBinaryString(N);
    int max = 0;
    int count = 0;
    for(int i = 0; i < string.length(); i++) {
        if(string.charAt(i) == 48) {
           count++;
        } else {
            if(max < count) {
                max = count;
            }
             count =0;
        }
    }
    
    if(max == 0) {
        return 0;
    }
    return max;
    
    }
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
    	System.out.println(solution.solution(34));
    }
    
    
}
