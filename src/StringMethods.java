public class StringMethods {
    public static void main(String[] args) {
        String birthdate = "28/08/2003";
        int StartingIndex = birthdate.indexOf("2003");
        System.out.println("index would be = "+StartingIndex);
        System.out.println("birth year would be = "+birthdate.substring(6,10));
        System.out.println("Month would be = "+birthdate.substring(3,5));
        System.out.println("Day would be = "+birthdate.substring(0,2));

        String newDate = String.join("/","28","08","2003");
        System.out.println("new String would be = " +newDate );
        newDate = "28"+"/"+"08"+"/"+"2003";
        System.out.println(newDate);
        newDate = "28".concat("/").concat("08").concat("/").concat("2003");

        System.out.println("new updated date = "+newDate.replace("/","-"));
        System.out.println("new updated date = "+newDate.replace("2","00"));
        System.out.println("new replaced char = "+newDate.replaceFirst("/","-"));
        System.out.println("new updated date = "+newDate.replaceAll("/","-"));
        System.out.println("ABC\n" .repeat(3));
        System.out.println("-" .repeat(20));

        System.out.println("ABC\n" .repeat(3).indent(8));
        System.out.println("-" .repeat(20));

        System.out.println("    ABC\n" .repeat(3).indent(-2));
        System.out.println("-" .repeat(20));







    }
}
