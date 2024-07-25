public class Xirurg extends Doctor{
    public static void Ishi(){
        System.out.println("Operatsiya qiladi");
    }
    public static void main(String[] args) {
        System.out.println("Xirurg: ");
        Xirurg Xirurg = new Xirurg();
        Xirurg.Ishi();
        Xirurg.Davolaydi();
    }
}
