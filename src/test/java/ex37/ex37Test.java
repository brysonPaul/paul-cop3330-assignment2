package ex37;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ex37Test {

    @Test
    void generatePass() {
        int nums=8;
        int letters=4;
        int specials=4;
        ArrayList<Character> pass = App.generatePass(nums,letters,specials);

        for(char c:pass){
            if(App.isNumber(c)){
                nums--;
            }
            if(App.isLetter(c)){
                letters--;
            }
            if(App.isSpecialChar(c)){
                specials--;
            }
        }
        assertEquals(nums,0);
        assertEquals(letters,0);
        assertEquals(specials,0);
    }
}