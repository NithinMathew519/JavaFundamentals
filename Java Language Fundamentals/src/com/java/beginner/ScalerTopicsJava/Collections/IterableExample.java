package com.java.beginner.ScalerTopicsJava.Collections;

import com.java.beginner.ScalerTopicsJava.Arrays.StringArray;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IterableExample{
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Nithin");
        list.add("Mathew");
        list.add("Nishanth");
        list.add("Nikhil");

        System.out.println(list);
//For Each
        for (String iter:list){
            System.out.print(iter+ "  ");
        }
        System.out.println();

//forEach using lambda Expression
        list.forEach(l -> System.out.print(l+"  "));
        System.out.println();
//Iterator <T> interface
        Iterator<String> itr=list.iterator();
        while (itr.hasNext()){
            String l = itr.next();
            System.out.print(l+"  ");
        }
    }
}
