package org.soto.test;

import java.util.TreeSet;

/**
 * @author: liuqixin
 * @date: 2020/08/06 16:52
 */
public class Lambda {

    public static void main(String[] args) {
//        Runnable r1 = () -> System.out.println("Lamdba");
        TreeSet<String> ts = new TreeSet<>(
                (o1, o2) -> Integer.compare(o1.length(), o2.length())
        );
        testFinally();

    }

    public static void testFinally() {
        System.out.println("testFinally");
        try {
            int i = 1 / 0;

        } catch (Exception e) {
            System.out.println("Exception");
            return;
        } finally {
            System.out.println("finally");
        }
    }

}
