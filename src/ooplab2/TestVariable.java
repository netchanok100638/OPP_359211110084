package ooplab2;

public class TestVariable {
    public static void main(String[] args) {


        //   Integer

        int i;
        i = 10;
        System.out.println("i = " + i);
        int j = 20;
        System.out.println("j =" + j);
        System.out.println("i+j=" + (i + j));

//  double
        double v = 15.15;
        System.out.println(v);
        System.out.println(v * 10);

//  claracter
        char c = 'T';
        System.out.println(c);
//    String
        String S = "Hello, World";
        System.out.println(S);
        String name = "I'm ANNE";
        System.out.println(name);
        String msg = S + " " + name;
        System.out.println(msg);
        String msg2 = S.concat(" " + name);
        System.out.println(msg2);
        System.out.println(msg.length());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.toLowerCase());

//  boolean
        boolean b = true;
        boolean b1 = false;
        System.out.println(b);
        System.out.println(b1);

    }
    }// class
