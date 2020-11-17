package java-txt-api;

import java.io.File;
import java.util.scanner;

/**
 * the `scanner` class breaks input down and read's it using a delimiter patter
 * This is really useful given the size of the input is large.
 */
public class App 
{
    public static void main( String[] args )
    {
        File file = new File("/home/jb/Documents/gitRepos/Java_text_api/bible_daily.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
