import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* String s1="java";
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);
        String s3=new String("example");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);*/

        /*String s1="salam necesen ne var ne yox yaxsisan sagol mende yaxsiyam";
        System.out.println(s1.split("men").length);*/

/*anagram eks etdirmek
       /* String s1 = "abc";
        String s2 = "cba";
        boolean b = true;
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i) != s2.charAt(s2.length()-1-i)){
                b= false;
                break;
            }
        }

        System.out.println(b);*/

    /*anagramani tap
       /* String s1 = "abcde";
       for (int i=0;i<s1.length();i++){
           System.out.print(s1.charAt(s1.length()-1-i));

     */

        // StringBuffer stringBuffer =  new StringBuffer("salam");
        /* stringBuffer.append(3.45f);*/
        //  stringBuffer.replace(1,2,"sagol");
        //  stringBuffer.deleteCharAt(3);
        // System.out.println(stringBuffer);
        //  stringBuffer.deleteCharAt(3);

        //  System.out.println(stringBuffer.capacity());









 /*       StringBuffer stringBuffer =  new StringBuffer("salam");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            stringBuffer.append(scanner.next());
        }
        System.out.println(stringBuffer);*/


        Scanner scan = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer("world");

        boolean b = true;
        while (b) {
            System.out.println("icra edeceyiniz emeliyyati secin");
            int opt = scan.nextInt();
            switch (opt) {
                case 1: {
                    stringBuffer.reverse();
                    System.out.println(stringBuffer);
                    break;
                }
                case 2: {
                    stringBuffer.append(scan.next());
                    System.out.println(stringBuffer);
                    break;
                }
                case 3: {
                    stringBuffer.insert(3, 145);
                    System.out.println(stringBuffer);
                    break;
                }
                case 4: {
                    stringBuffer.delete(1, 3);
                    System.out.println(stringBuffer);
                    break;
                }
                case 5: {
                    stringBuffer.deleteCharAt(3);
                    System.out.println(stringBuffer);
                    break;
                }
                case 6: {
                    stringBuffer.capacity();
                    System.out.println(stringBuffer.capacity());
                    break;
                }
                case 0:{
                    b=false;
                    break;
                }
            }

        }

    }

}