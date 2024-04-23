public class Main5 {
    public static void main(String[] args){
        String s1 = "deepak";
        String s2 = "java";
        System.out.println(s1+s2);
        System.out.println(s1+10);
        System.out.println(s1+10+20);
        System.out.println(10+20+s1);
        System.out.println(10+s1+20);
        System.out.println(s1+20/10);
        System.out.println(s1+10/20);
        System.out.println(s1+10*20);
        //System.out.println(s1+10-5);

        System.out.println(s1.concat(s2));

        //Join is a static method

        //static join(charSequenceDelimiter c, char sequence elements)

        System.out.println(String.join(" ",s1,s2));
        System.out.println(String.join("+",s1,s2));





    }
}
