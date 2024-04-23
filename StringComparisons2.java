public class StringComparisons2 {
    //Lexicographical Comparison
    public static void main(String[] args){
        //compareTo
        //compareToIgnoreCase

        String s1 ="a"; //97
        String s2 ="A"; //65

        System.out.println(s1.compareTo(s2)); //97-65 = 32
        //32

        s1="abc";
        s2="ABC";
        System.out.println(s1.compareTo(s2));
        s2="Abc";
        System.out.println(s1.compareTo(s2));


    }
}
