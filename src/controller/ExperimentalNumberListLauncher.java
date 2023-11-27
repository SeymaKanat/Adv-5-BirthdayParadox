package controller;

import model.ExperimentalNumberList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Seyma Kanat <s.kanat@st.hanze.nl>
 * BirthdayParadox-experiment-getallenlijst-algoritmes
 */
public class ExperimentalNumberListLauncher {
    public static void main(String[] args) {
        //5.1.b
        // Write your own main method.


        // Example
        ExperimentalNumberList exList = new ExperimentalNumberList(20);
        exList.generateNumbers(-10, 10);
        System.out.println(exList);
        System.out.println(exList.numberOfDifferentValues());
    }
}
