package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void ex1_p() {

        int n = 4;

        ArrayList<String> Expect = new ArrayList<>();
        Expect.add("1");
        Expect.add("2");
        Expect.add("3");
        Expect.add("4");

        //n = 5;

        List<String> Actual = Main.ex1_p(n);

        assertEquals(Expect, Actual);

    }

    void ex2() {
        StringBuilder textexp = new StringBuilder("llatsni ekam");

        StringBuilder textact = Main.ex2("make install");

        assertEquals(textexp.charAt(2), textact.charAt(2));

    }

    @org.junit.jupiter.api.Test
    void ex3() {
        String resexp = "no roots";
        String resact = Main.ex3(1, 0, 1);

        assertEquals(resexp, resact);
    }

    @org.junit.jupiter.api.Test
    void ex4() {
        if (Main.ex4() < 1.0000000000000004E-6) {
            assertEquals(1, 1);
        } else assertEquals(0, 1);
    }

    @org.junit.jupiter.api.Test
    void ex5() {
        boolean exp = true;
        boolean act = Main.ex5("tacocat");
        assertEquals(exp, act);

    }
}