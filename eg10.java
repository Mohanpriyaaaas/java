class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] words=s.split("\\s+");
        String str="";
        for(int i=words.length-1;i>=0;i--){
            if(i==0){
                str+=words[i];
            }
            else{
                str+=words[i]+" ";
            } 
        }   
        return str;

    }
}
