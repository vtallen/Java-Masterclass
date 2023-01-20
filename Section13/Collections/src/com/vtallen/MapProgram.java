package com.vtallen;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "a compiled high level, OO language");
        languages.put("Python", "an interpreted, OO, high level language");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Instruction code"));
        System.out.println(languages.put("Lisp", "straight to jail"));
        languages.put("Assembly", "believe it or not, straight to jail");

        System.out.println(languages.get("Java"));
        if (languages.containsKey("Java")) {
            System.out.println("java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }
        System.out.println(languages.get("Java"));

        //languages.remove("Lisp");

        System.out.println("============================================================");

        System.out.println(languages.replace("Lisp", "a functional programming lang"));
        System.out.println(languages.replace("Scala", "TEST"));
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }


    }

}

