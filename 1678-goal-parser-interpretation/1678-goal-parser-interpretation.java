class Solution {
    public String interpret(String command) {
        String str="";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                str=str+"o";
                i++;
            }
            
            else if(command.charAt(i)=='(' || command.charAt(i)==')' ){
                
            }
            else{
                str=str+command.charAt(i);
            }
        }
        return str;
    }
}