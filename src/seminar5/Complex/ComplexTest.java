package seminar5.Complex;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;



public class ComplexTest
{
    public static void main (String[] args)
    {Complex z1 = new Complex(6, 4),
            z2 = new Complex(7, -2),
            z3 = new Complex(z1),
            z4 = new Complex(z2);




        try {
            Scanner in = new Scanner(new File("input.txt"));
            StringBuffer data = new StringBuffer();
            while (in.hasNext())
                data.append(in.nextLine()).append("\n");
            System.out.println(data.toString());
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }





        System.out.println();
        System.out.print("z1 = "); z1.pr();
        System.out.print("z2 = "); z2.pr();


        z1.add(z2);
        System.out.println("z1 + z2 = "); z1.pr();
        z3.mul(z2);
        System.out.println("z1 * z2 = ");z3.pr();


        try{
            PrintWriter pw = new PrintWriter(new File("output.txt"));

            pw.print("(6+4i) + (7-2i) = ");
            pw.println(z1 + "i");
            pw.print("(6+4i) * (7-2i) = ");
            pw.print(z3 + "i");
            pw.close();
        }catch(Exception e){e.printStackTrace();}
    }

}
