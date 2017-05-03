package com.haasjustin.rotatearray;

import java.util.ArrayList;

import static java.util.Collections.rotate;

import java.util.*;
import java.util.ArrayList;

/**
 * Created by justinhaas on 5/3/17.
 */


import static java.util.Collections.rotate;

public class Array extends ArrayList {

    public static void main(String[] arg) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < 7; i++) {
            list.add(i);
        }

        System.out.println(list);

        rotate(list, 4);

        System.out.println(list);
    }
}



