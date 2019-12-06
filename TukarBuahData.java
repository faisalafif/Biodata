public class TukarBuahData{
    public static void main(String[] args){
        String a = "merah";
        String b = "biru";
        String c;
        
        c = a;
        a = b;
        b = c;

        System.out.println("A isinya "+a);
        System.out.println("B isinya "+b);
    }
}