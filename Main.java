import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eigenaar on 21-11-2016.
 */
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        ArrayList<Format> formats = new ArrayList();
        SaveAs save = new SaveAs();
        System.out.println("Save As:");


//        formats.add(new Format("Word'97", ".docx",1));
//        formats.add(new Format("Word(XML)", ".doc",2));
//        formats.add(new Format("RTF", ".rtf",3));
//        formats.add(new Format("HTML", ".html",4));
//        formats.add(new Format("Plain Text", ".txt",5));

//        System.out.println(formats.toString());

        try {
            Class c = SaveAs.class;
            Method[] m = c.getDeclaredMethods();
            String z = null;
            for (int i = 0; i < m.length; i++){
                z = m[i].toString();
                String[] x = z.split(" ");
                String methodName = x[2];
                String method1 = methodName.split("\\.")[1];
                System.out.println(i + " " + method1);
            }
        } catch (Throwable e) {
            System.err.println(e);
        }

        Scanner scanner = new Scanner(System.in);
        out.println("Kies uw index:");
        int index = new Integer(scanner.next());


        try {
            Class c = SaveAs.class;
            Method[] m = c.getDeclaredMethods();
            String z = null;

            z = m[index].toString();
            String[] x = z.split(" ");
            String methodName = x[2];
            String method1 = methodName.split("\\.")[1];
            Method methode = SaveAs.class.getDeclaredMethod(method1.substring(0, method1.length() - 2));
            System.out.println(methode.invoke(save));

        } catch (Throwable e) {
            System.err.println(e);
        }

//
//
//

//        for(Format f : formats) {
//            if(index == f.getIndex()) {
//                System.out.println("De format: " + f.getFormat() + " is gekozen");
//            }
//        }
    }
}