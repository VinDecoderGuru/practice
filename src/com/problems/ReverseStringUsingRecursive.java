package com.problems;

/**
 * Created by vinay.pawar on 2/9/14.
 */
public class ReverseStringUsingRecursive {

    public static String reverse(String rev) {
        if(rev != null && rev.length() > 1) {
            return rev.charAt(rev.length()-1) + reverse(rev.substring(0,rev.length()-1));

        }
        return rev;
    }

    public static void main(String args[]) {
        System.out.println(reverse("Vinayak Pawar"));
    }
}
