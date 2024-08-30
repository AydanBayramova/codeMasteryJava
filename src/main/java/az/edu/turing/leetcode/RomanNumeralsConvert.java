package az.edu.turing.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsConvert {
    public int romanToInt(String romanNumeral) {
        Map<Character, Integer> romanNumerals = new HashMap<Character, Integer>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int resultSet=0;
        int prevSet=0;
        for (int i=romanNumeral.length()-1; i>=0; i--) {
            int currentValue=romanNumerals.get(romanNumeral.charAt(i));
            if (currentValue<prevSet){
                resultSet-=currentValue;
            }
           else {
                resultSet+=currentValue;
            }
           prevSet=currentValue;
        }
        return resultSet;
    }
    public static void main(String[] args) {
        RomanNumeralsConvert converter = new RomanNumeralsConvert();
        System.out.println("III: " + converter.romanToInt("III")); // Output: 3
        System.out.println("LVIII: " + converter.romanToInt("LVIII")); // Output: 58
        System.out.println("MCMXCIV: " + converter.romanToInt("MCMXCIV")); // Output: 1994
    }
}
