package restoran;

public class Menu {
    String[] makanan = {"Lotek", "Nasgor", "Mie Ayam", "Lontong", "Bubur Ayam"};
    String[] minuman = {"Es Teh", "Air Mineral", "Es Jeruk"};
    
    public void getMakanan() {
        System.out.println("MAKANAN");
        for (int i = 0; i < makanan.length; i++) {
            System.out.println((i+1) + ". " + makanan[i]);
        }
    }
    
    public void getMinuman() {
        System.out.println("MINUMAN");
        for (int i = 0; i < minuman.length; i++) {
            System.out.println((i+1) + ". " + minuman[i]);
        }
    }
    
    
    
}
