package eu.kunas.javalistmapset.performances;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Kunas on 09.06.2015.
 */
public class LinkedHashSetSpeedPerformance {

    public static void addSomeString(String someText, Integer times) {
        Set<String> list = new LinkedHashSet<String>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < times; i++) {
            list.add(someText + " " + i);
        }

        long stop = System.currentTimeMillis();

        System.out.println(stop - start + " Millis LinkedHashSet for add of some String");

    }

    public static void removeNext(String someText, Integer times) {
        Set<String> list = new LinkedHashSet<String>();

        for (int i = 0; i < times; i++) {
            list.add(someText + " " + i);
        }

        long start = System.currentTimeMillis();

        Iterator<String> iterator = list.iterator();

        Boolean next = true;

        while(iterator.hasNext()){
            iterator.next();
            if(next){
                next = false;
                iterator.remove();
            }else{
                next = true;
            }
        }

        long stop = System.currentTimeMillis();
        System.out.println(stop - start + " Millis LinkedHashSet remove next");

    }
}
