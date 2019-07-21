/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gurhan
 */

import java.util.ArrayList;

public class Changer {
    
    private ArrayList array;
    
    public Changer() {
        this.array = new ArrayList<Change>();
    }
    
    public void addChange(Change change) {
        this.array.add(change);
    }
    
    public String change(String characterString) {
        int i;
        for (i=0;i<this.array.size();i++) {
            Change modfy = (Change) (this.array.get(i));
            characterString = modfy.change(characterString);
        }
        return characterString;       
    }
}
