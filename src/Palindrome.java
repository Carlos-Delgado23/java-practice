public class Palindrome {
    public static void main(String[] args) {

        System.out.println(palindromeCheck("Taco cat"));
    }

    public static String palindromeCheck (String input){
        // takes in the string input and replaces spaces by joining them.
        String stringToCheck = input.replace(" ", "");
        String reverse = "";

        //Takes in the input length - 1 cause of index starts at 0. i-- makes string go backwards since i starts off
        // at 3
        for(int i = stringToCheck.length() - 1; i >= 0; i--){
            reverse += stringToCheck.charAt(i);
        }
        // checks if both variables of stringToCheck and reverse are the same.
        if (stringToCheck.equalsIgnoreCase(reverse)){
            return "PALINDROME!";
        } else {
            return "NOT A PALINDROME!";
        }
    }
}
