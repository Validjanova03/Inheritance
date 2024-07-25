import java.sql.SQLOutput;

public class Lor extends Doctor{
    public static void Yonalish(){

        System.out.printf("Quloq-Burun doktori");
    }
    public static void main(String[] args) {
        System.out.println("Lor: ");
        Lor dr = new Lor();
        Lor.Davolaydi();
        Lor.Yonalish();
    }
}
