package restoran;

public class MainRestoran {

    public static void main(String[] args) {

        Menu menu = new Menu();

        System.out.println("=======================================");
        System.out.println("\t\tMENU");
        System.out.println("=======================================");
        
        menu.getMakanan();
        System.out.println("");
        menu.getMinuman();
        
        Pesanan pesanan = new Pesanan();
        pesanan.Pesanan();
    }
}
