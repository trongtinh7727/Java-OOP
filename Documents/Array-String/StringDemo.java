public class StringDemo {

    public static void main(String[] args) {

        //creat string
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello"); 

        char chr []= {' ','w','o','l','d'};
        String s4 = new String(chr); // convert char array to String
        
        //print string
        System.out.println("S1: "+s1);
        System.out.println("S2: "+s2);
        System.out.println("S3: "+s3);
        System.out.println("S4: "+s4);

        //compare string
        System.out.printf("S1 = S2: %b\n",s1 == s2); //true
        System.out.printf("S1 = S3: %b\n",s1 == s3); //false
        System.out.printf("S1 equal S3: %b\n",s1.equals(s3));
        
        
        // CONTAT()
        System.out.println("Contcat:");
        String s = s1.concat(s4);
        System.out.println("s1.concat(s4) = " + s);
        
        //Substring()
        String substr = s.substring(5);
        System.out.println("substr =" + substr);

        // INDEXOF()
        System.out.println();
        System.out.println("IndexOf:");
        String str = "This is text";
        int idx = str.indexOf('i');
        System.out.println("- indexOf('i') = " + idx);
        idx = str.indexOf("te");
        System.out.println("- indexOf(\"te\") = " + idx);

    }
}
