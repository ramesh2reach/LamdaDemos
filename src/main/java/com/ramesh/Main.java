package com.ramesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // String[] strArray = {"x", "y", "xyz", "z", "b", "c", "a", "d", "abc", "pqr"};
       // System.out.println(Arrays.toString(strArray));
        List<String> list = Arrays.asList("x", "y", "xyz", "z", "b", "c", "a", "d", "abc", "pqr");

        List<String> outputArray = list.stream()
                .map(String::toUpperCase)
                .filter(element -> element.length() == 1)
                .toList();
       // System.out.println(Arrays.toString(outputArray));
    }
}