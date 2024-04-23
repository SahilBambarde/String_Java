public class Main2 {
    public static void main(String[] args){
        String s = new String("Deepak");
        //scp - deepak
        //heap - deepak

        s.concat(" java");
        //scp - deepak, java
        //heap - deepak , deepak java,

        System.out.println(s);
        //Deepak


        s = s.concat(" python");
        //scp - deepak, java , python
        //heap - deepak , deepak java,deepak python

        System.out.println(s);
        //Deepak python


    }
}
