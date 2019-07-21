import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Changer changer = new Changer();
        changer.addChange( new Change('a', 'b') );
        changer.addChange( new Change('k', 'x') );
        changer.addChange( new Change('o', 'å') );
        String word = "carrot";
        System.out.println(changer.change(word));
    }
    
    
}
