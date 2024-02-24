package clintname.pratic;

import java.util.Scanner;

/**
 * class1
 */
public class class1 {
    String pass, newpass;
    int attamp = 3, current = 0, in1, in2;

    /**
     * 
     */
    void solve() {
        Scanner ds = new Scanner(System.in);
        System.out.println("Set  the pass");
        pass = ds.next();
        while (current < attamp) {
            System.out.println("entre the password");
            newpass = ds.next();
            if (newpass.equals(pass)) {
                System.out.println("write passward now mcq");
                break;
            } else
                System.out.println("try again");
            current++;
        }
        if (current == attamp) {
            System.out.println("no more attamp");
            ds.close();
        }
        System.out.println("_____MCQ QUESTION____");
        System.out.println("1) Which of the following is not a Java features?");
        System.out.println("1.Dynamic");
        System.out.println("2.Architecture Neutral");
        System.out.println("3.Use of pointers");
        System.out.println("4.Object-oriented");
        Scanner as = new Scanner(System.in);

        System.out.println("Enter the Answer");
        in1 = as.nextInt();
        if (in1 == 3) {
            System.out.println("correct answer");

        } else {
            System.out.println("wroang answer try next time");
            as.close();

        }
        System.out.println("2)Which component is used to compile, debug and execute the java programs?");
        System.out.println("JRE");
        System.out.println("JIT");
        System.out.println("JDK");
        System.out.println("JVM");
        System.out.println("Enter the Answer");
        in2 = as.nextInt();
        if (in2 == 3) {
            System.out.println("correct answer");

        } else {
            System.out.println("wroang answer");
            as.close();
        }
    }

    /**
     * 
     */
    void solv() {

    }

    public static void main(String[] args) {
        class1 dc = new class1();
        dc.solve();
        dc.solv();
    }
}