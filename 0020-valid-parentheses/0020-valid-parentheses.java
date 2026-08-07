class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        char[]str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            char ch=str[i];
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
            
         
           if(ch==')'&&top!='('||ch=='}'&&top!='{'||ch==']'&&top!='['){
            return false;
           }
            }
        }
        return stack.isEmpty();
    }
}