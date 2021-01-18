package pratices;

import java.util.Scanner;

public class Reverse_using_chatAt_chatArray_buffer {
    public static void main(String[] args) {
        // using the String buffer
        String str = "aditya is my name";
        StringBuffer sb = new StringBuffer(str);
        System.out.println("This is the reverse string using the String Buffer class"+sb.reverse());


        // using the charAT
        String str1 = "this is aditya";
        String rev1 = "";
        int len =str1.length();
        for(int i=len-1;i>=0;i--){
            rev1=rev1+str1.charAt(i);
        }
        System.out.println("this is the reverse string using the CharAt "+rev1);


        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        String rev2 = "";
        char a[] =str2.toCharArray();
        int len2 = a.length;
        for (int i=len2-1;i>=0;i--){
            rev2=rev2+a[i];
        }
        System.out.println(rev2);
    }

}
