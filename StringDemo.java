public class StringDemo {
    public static void main(String[] args){
        String s1 ="deepak";
        String s2 = new String("abc");
        //Heap -abc
        //SCP -abc

        String s3 = new String();
        System.out.println(s3.length());

        StringBuffer sb = new StringBuffer("Deepak");
        String s4 =new String(sb);
        System.out.println(sb);

        StringBuilder sbb =new StringBuilder("Deepak");
        String s5 = new String(sbb);
        System.out.println(sbb);

        byte[] b = {101,102,103};
        String s6 = new String(b);
        System.out.println(s6);

        char[] c = {'a','b','c'};
        String s7 = new String(c);
        System.out.println(s7);
    }
}
