package test;

import model.ExperimentalNumberList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Seyma Kanat <s.kanat@st.hanze.nl>
 * BirthdayParadox-experiment-getallenlijst-algoritmes
 */
class ExperimentalNumberListTest {
    private int[] testRijDubbeleWaarde = {-12, 5, 0, -34, 8, 16, 25, 8, -4};
    private int[] testRijGeenDubbele = {-34, 6, 23, 1, 15, -3};

    @org.junit.jupiter.api.Test
    public void testDubbeleWaardeTrue() {
        ExperimentalNumberList testList = new ExperimentalNumberList(testRijDubbeleWaarde);
        assertTrue(testList.equalValuesExist());
    }

    @org.junit.jupiter.api.Test
    public void testDubbelWaardeFalse() {
        ExperimentalNumberList testList = new ExperimentalNumberList(testRijGeenDubbele);
        assertFalse(testList.equalValuesExist());
    }

    @Test
    public void testCountPositives() {
        ExperimentalNumberList testList = new ExperimentalNumberList(testRijDubbeleWaarde);
        assertEquals(5, testList.countPositives());
    }
}