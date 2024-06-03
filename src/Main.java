public class Main {
    public static void main(String[] args) {
        String s = "HELLO WORLD";
         String match = s.toLowerCase();
        if(s.equals(match)){
            System.out.println("matching occurs");
        }
        if(s.equalsIgnoreCase(match)){
            System.out.println("values match ignore case");
        }
        if(s.startsWith("HELLO")){
            System.out.println("String Starts with HELLO");
        }
        if(s.endsWith ("WORLD")){
            System.out.println("String ends with WORLD");
        }
        if(s.contains("HELLO")){
            System.out.println("String conatins HELLO");
        }
        if(s.contentEquals("HELLO WORLD") ){
            System.out.println("matching occurs");
        }

        System.out.println("the length of the string would be = "+s.length());
        System.out.println("the Char at five would be = "+s.charAt(4));
        System.out.println("the char at the last index would be = "+s.charAt(s.length()-1));
        System.out.println("The String is empty = " +s.isEmpty());
        System.out.println("index of H = "+s.indexOf('W'));
        System.out.println("index of world = "+s.indexOf("WORLD"));
        System.out.println("index of l = "+s.indexOf('L'));
        System.out.println("index of l = "+s.lastIndexOf('L'));
        System.out.println("index of l = "+s.indexOf('L',3));
        System.out.println("index of l = "+s.lastIndexOf('L',8));

        String i = new String("RAJAT");
        System.out.println("the length of the string would be = "+i.length());
        System.out.println("the char at two  would be = "+i.charAt(2));
        System.out.println("the length of the string would be = "+i.toLowerCase());
        System.out.println("the length of the string would be = "+i.indexOf('R'));
        System.out.println("the length of the string would be = "+i.indexOf('T'));





    }
}
