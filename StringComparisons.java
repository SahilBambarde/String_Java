public class StringComparisons {
    public static void main(String[] args){
        String s1 = "deepak";
        String s2 = "amit";

        System.out.println(s1.equals(s2));

        String s3 = "Deepak";
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
