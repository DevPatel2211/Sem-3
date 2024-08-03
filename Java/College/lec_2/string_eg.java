public class string_eg {
    public static void main(String[] args) {
        String name1 = "java programming";
        String name = "Java Programming";
        String name2 = name1.concat(" its easy");

        System.out.println(name2);
        int len = name1.length();
        char firstChar = name1.charAt(0);
        boolean isUpper = Character.isUpperCase(firstChar);
        if (isUpper)
            System.out.println(name1 + "starts with capital latters");
        else
            System.out.println(name1 + " does not start with capital latters");
        System.out.println("length of :" + name1 + "is :" + len);

        // Method-1 = Compare the Strings
        String name3 = "java programing";
        if (name1 == name3) {
            System.out.println("Both strings are same");
        } else {
            System.out.println("both Strings are diffrent");
        }

        // Method-2 = Compare the Strings - ALWAYS RELY ON THIS METHOD
        boolean Eq = name1.equalsIgnoreCase(name);
        if (Eq) {
            System.out.println("String is Same");
        } else {
            System.out.println("Strings are different");
        }
    }
}