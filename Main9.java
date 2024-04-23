public class Main9 {
    public static void main(String[] args){
        String s="Deepak";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        /*
        * valueOf() methos converts different types of values into string.
        * by the help of String.valueOf() method, we can convert int or long or float
        *or double or object or any other type into string
        * */

        int a =10;
        System.out.println(String.valueOf(a));

        /*
        * the toCharArray method converts the given string into a sequence of characters.
        * the returned array length is equal to length of the string
        * */

        char[] c = s.toCharArray();
    }
}
