package javaapplication1;



import java.lang.reflect.Field;

import java.nio.charset.Charset;

import java.util.Locale;

import java.util.Scanner;



/**

 *

 * @author nkontopoulosgr@oracle.com

 */

public class JavaApplication1 {


    /**

     * @param args the command line arguments

     * @throws java.lang.NoSuchFieldException

     * @throws java.lang.IllegalAccessException

     */

public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {

System.setProperty("file.encoding","UTF-8");

Field charset = Charset.class.getDeclaredField("defaultCharset");

charset.setAccessible(true);

charset.set(null,null);

System.out.println("Δώσε κάτι στα Ελληνικά το οποίο θα περάσει στην Scanner και θα εμφανιστεί μετά");

Locale loc = new Locale("el", "GR");

Scanner sc = new Scanner(System.in, "ISO-8859-7");

sc.useLocale(loc);

System.out.println(sc.nextLine());

    }

    

}
