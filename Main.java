public class Main {
    public static void main(String...args){
        String a = "Sahil";
        String b = new String("Sahil");

        if(a==b){
            System.out.println("1");
        }

        if(a.equals(b)){
            System.out.println("2");
        }

        char[] c ={'s','a','h','i','l'};
        String d= new String(a);
        String e = a;
        System.out.println("c ->");
        System.out.println(c);
        System.out.println("d ->"+d);
        System.out.println("e ->"+e);



    }
}
