
public class Main {
    public static void main(String[] args){
    }

    public static boolean isPalindrome(int num){
        num = Math.abs(num);

        String numString = Integer.toString(num);
        int length = numString.length();

        for(int i = 0; i < length / 2; i++){
            if(numString.charAt(i) != numString.charAt(length - i - 1)){
                return false;
            }
        }

        return true;
    }
}