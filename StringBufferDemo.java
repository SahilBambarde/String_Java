public class StringBufferDemo {
    //StringBUffer is in java.Lang package
    public static void main(String[] args){

        StringBuffer sb1= new StringBuffer();
        System.out.println(sb1.capacity());
        StringBuffer sb2= new StringBuffer("deepak");
        System.out.println(sb2.capacity());

        StringBuffer sb3= new StringBuffer(1000);
        System.out.println(sb3.capacity());


        System.out.println(sb2.length());

        System.out.println(sb2.charAt(3));

        //System.out.println(sb2.delete(2,5));

        System.out.println(sb2.deleteCharAt(3));

        StringBuffer sb4= new StringBuffer("deepak");
        StringBuffer sb5= new StringBuffer("deepak");
        System.out.println(sb4.equals(sb5)); //false

        StringBuffer sb6= new StringBuffer("deepak java");
        StringBuffer sb7= sb6.append("hi");
        System.out.println(sb6.equals(sb7)); //true

        System.out.println(sb6.indexOf("a")); //4
        System.out.println(sb6.lastIndexOf("a")); //10
        //System.out.println(sb6.insert(3,"zzz")); //deezzzpak javahi
        //System.out.println(sb6.replace(3,6,"m")); //deem javahi

        //System.out.println(sb6.reverse()); //ihavaj kapeed
        //System.out.println(sb6.subSequence(3,8)); //pak j


        sb6.setCharAt(4,'c');
        System.out.println(sb6); //deepck javahi







    }
}
