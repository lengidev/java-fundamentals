public class Main {
    public static void main(String[] args) {

        String greeting = "This is a new message!";
        //length()
        System.out.println(greeting.length());

        //toUpperCase(), toLowerCase()
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());

        //charAt
        System.out.println(greeting.charAt(6));

        //indexOf
        System.out.println(greeting.indexOf("W"));

        //substring(part of a string)
        // System.out.println((greeting.substring(6,8));

        //contains: returns true or false and is case sensitive
        System.out.println(greeting.contains("World"));

        //startsWith: returns true or false
        System.out.println(greeting.startsWith("Hel"));

        //split:
        String [] parts = greeting.split(",");
        for(String p:parts) {
            System.out.println(p);
        }

        // == (comparing addresses), equals, equalsIgnoreCase
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String ("Hello");
        String s4 = s3;

        /* Note: String data type is immutable
        String v = "Hello";
        v = v + "World"; */
    }
}
