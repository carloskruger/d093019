public  class labs {

    public static int maxOfTwoNumbers(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
       else
        {
            return num2;
        }
    }


    public static int maxOfThree(int num1, int num2, int num3){
        int max = 0;
        if (num1 > num2) {
            max = num1;}
        else { num2 = max; };
        if (num3 > max) return num3;
        else return max;

    }

    public static boolean isCharacterAVowel(char x){
        String myVowels = "aeiouAEIOU";
        if  (myVowels.indexOf(x)==-1) return false;
            else
        return true;
    }

//    Write a method that returns the number of arguments passed to it when called.

    public static void numberOfArguments(String... args) {
        System.out.println("Number of arguments passed: " + args.length);
    }
//
//    Define a method, reverseString(), that computes the reversal of a string. For example, reverseString("jag testar") should return the string "ratset gaj".
public static String reverseString(String str1){
        String str2 = "";
        for (int i =  str1.length() - 1; i >= 0; i--){
            str2 = str2 + str1.charAt(i);
        };
        return str2;
}



public static void main(String[] args) {
    System.out.println(maxOfTwoNumbers(3, 5));
    System.out.println(maxOfThree(3, 5, 6));
    System.out.println(isCharacterAVowel('b'));
    System.out.println(isCharacterAVowel('a'));
    numberOfArguments("one", "two", "three","four");
    System.out.println(reverseString("I just finished"));



}}




