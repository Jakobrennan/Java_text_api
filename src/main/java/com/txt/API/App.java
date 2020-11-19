package com.txt.API;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * the `scanner` class breaks input down and read's it using a delimiter pattern
 * This is really useful given the size of the input is so large.
 */
public class App 
{
    public static void main( String[] args )
    {
        File file = new File("/home/jb/Documents/gitRepos/Java_text_api/bible_daily.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        sc.useDelimiter(" ");
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}
