// Kelas turunan Shirt dari Clothing
public class Shirt extends Clothing {
    // Variabel untuk menyimpan warna kemeja
    String color;
    // Variabel untuk menyimpan jenis lengan kemeja
    String sleeveType;

    // Konstruktor untuk menginisialisasi objek Shirt
    public Shirt(int idProduct, String name, String brand, double price, String size, String material, String gender, String color, String sleeveType) {
        // Memanggil konstruktor kelas Clothing menggunakan super() untuk menginisialisasi atribut dari kelas Clothing
        super(idProduct, name, brand, price, size, material, gender);
        // Menginisialisasi atribut color dan sleeveType dari kelas Shirt
        this.color = color;
        this.sleeveType = sleeveType;
    }
}
