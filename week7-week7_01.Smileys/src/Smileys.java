
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        
    }
    
    private static void printWithSmileys(String characterString) {
        int numberOfSmileys = (characterString.length() + 1) / 2 + 3;
        printSmileys(numberOfSmileys);
        String space = " ";
        if (characterString.length() % 2 == 1) {
            space = "  ";
        }
        System.out.println(":) "+characterString+space+":)");
        printSmileys(numberOfSmileys);
    }
    
    private static void printSmileys(int number) {
        int i;
        String result = "";
        for (i=0;i<number;i++) {
            result += ":)";
        }
        System.out.println(result);
    }

}
