package com.trl.codingchallenges.a2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StockListTest {

    @Test
    public void test1() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        assertEquals("(A : 200) - (B : 1140)",
                StockList.stockSummary(art, cd));
    }

}

/*

expected:<(A : []0) -   (B : 1290) - (C...>
 but was:<(A : [15]0) - (B : 1290) - (C...>

expected:<(A : [0) -  (B : 114) - (C : 70) - (W : 0])>
but was: <(A : [20) - (B : 114) - (C : 70) - (W : 25])>

expected:<... - (R : 225) - (D : [60) -  (X : 0])>
but was:<... -  (R : 225) - (D : [123) - (X : 102])>


*/
