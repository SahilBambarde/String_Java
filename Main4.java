public class Main4 {
    public static void main(String[] agrs){
        //Difference between == & .equals method

        String s1 = new String("Deepak");
        //Heap -Deepak
        //SCP-Deepak

        String s2 = new String("Deepak");
        //Heap -Deepak,Deepak
        //SCP-Deepak

        System.out.println(s1==s2);
        //false

        String s3 = "amit";
        //Heap -Deepak,Deepak
        //SCP-Deepak, amit

        String s4 = "amit";
        //Heap -Deepak,Deepak
        //SCP-Deepak, amit

        System.out.println(s3==s4);
        //true

        //----------------------------------

    }
}
