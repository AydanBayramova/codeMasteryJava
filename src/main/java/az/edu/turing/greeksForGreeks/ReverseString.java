package az.edu.turing.greeksForGreeks;

public class ReverseString {
    public static String reverseWord(String str)
    {
        //1 First Solution
//        String reversed = "";
//        for (int i=str.length()-1; i>=0; i--){
//            reversed+=str.substring(i,i+1);
//        }
//        return reversed;

        //2 Second Solution
        StringBuilder reversed=new StringBuilder();
        for (int i=str.length()-1; i>=0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
