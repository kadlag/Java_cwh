public class StringMethods {
    
    public static void main(String args[])
    {
        String name="Sakshi";

        System.out.println("Length is:"+name.length());

        System.out.println("lowercase:"+name.toLowerCase());

        System.out.println("Uppercase:"+name.toUpperCase());

        System.out.println("Trim remove leading and trailing spaces:"+name.trim());

        System.out.println("substring:"+name.substring(5));

        System.out.println("substring:"+name.substring(2,5));

        System.out.println("Replace:"+name.replace('i','u'));

        System.out.println("If name start with:"+name.startsWith("Sa"));

        System.out.println("If name end with:"+name.endsWith("hi"));

        System.out.println("Character at:"+name.charAt(2));

        System.out.println("Index of character:"+name.indexOf('s'));

        System.out.println("Equals:"+name.equals("Sakshi"));

        System.out.println("Equals with ignore case:"+name.equalsIgnoreCase("sakshi"));


        




    }
}
