class Solution {
    public boolean strongPasswordCheckerII(String password) {

        boolean hasupper = false;
        boolean haslower = false;
        boolean hasdigit = false;
        boolean hasspecial = false;

        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasupper = true;
            } 
            else if (Character.isLowerCase(ch)) {
                haslower = true;
            } 
            else if (Character.isDigit(ch)) {
                hasdigit = true;
            } 
            else {
                hasspecial = true;
            }

            // Check adjacent characters
            if (i > 0 && password.charAt(i) == password.charAt(i - 1)) {
                return false;
            }
        }

        return hasupper && haslower && hasdigit && hasspecial;
    }
}