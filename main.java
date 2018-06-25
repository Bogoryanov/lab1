import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;



public class main {




    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String charset = System.getProperty("file.encoding");

        String s = new String("Русская".getBytes(), Charset.forName(charset));
        System.out.println(s);



       // Random random = new Random();
        //int randomValue = random.nextInt(bound101);

       // String s1 = System.console().readline();

    }
}
