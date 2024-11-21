package StringMethods;

public class ConcatDemo {
    public static void main(String[] args) {
        String str1 = "Learn ";
        String str2 = "Java";
        System.out.println(str1.concat(str2));
        System.out.println(str2.concat(str1));

        String s3 =  "hello";
        String s4 = "Learners";
        String s5 = s3 + " " + s4;
        System.out.println(s5);
        String message = "Welcome " + "to " + "Java";
        System.out.println(message);
        String s6= s5 +" "+ message;
        System.out.println(s6);
        String s = "Chapter" + 2;
        System.out.println(s);
        String s1 = "Supplement" + 'B';
        System.out.println(s1);

    }
}
