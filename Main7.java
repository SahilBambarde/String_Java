public class Main7 {
    public static void main(String[] args){
        String s1 ="Sahil Bambarde";
        System.out.println(s1.replace("Sahil","Mrunmai"));
        System.out.println(s1.replace("a","x"));

        System.out.println(s1.replaceFirst("a","x"));

        System.out.println(s1.replaceAll("a","x"));

        /*
        * replaceAll(String regex,String replacement) method replaces all the substrings
        * that fits the specified regular expression with the replacement string
        * if the specified regular expression regex is not valid then it will provide
        * exception
        * */

        System.out.println(s1.replaceAll("a(.)","x"));
        System.out.println(s1.replaceAll("a(.*)","x"));
    }
}
