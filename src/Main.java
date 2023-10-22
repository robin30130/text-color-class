public class Main {
    public static void color(String[] args) {
        String color = "\u001B[35m";//change the number after "m" character  (35 here) affect the text color
        String colornb = "\u001B[32m";//change the number after "m" character (32 here) affect the text color
        String backgnd = "\u001B[43m";//change the number after "m" character (32 here) affect the highlighter color

    }
}
//use this class for change text color
//the variable color in the text when you identify this string.
//the variable colornb is like color but you can use it for another text without change "color" value.
//the variable backgnd change the background of the text when is set in system.out.println(); befor the characters chain.

//exemple of use:
//System.out.println(color + backgnd + "text");