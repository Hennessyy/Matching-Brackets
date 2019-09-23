import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isBalanced() {

        String s1 = "( a + b * { c / ( d – e )} ) + [ d / e]";
        boolean actual = Main.isBalanced(s1);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void notBalanced() {

        String s1 = "( a + b * { c / ( d – e )} ) + [ d / e]]";
        boolean actual = Main.isBalanced(s1);
        boolean expected = false;
        assertEquals(expected,actual);
    }


}