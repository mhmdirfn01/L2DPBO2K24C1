// Kelas dasar untuk merepresentasikan produk
public class Product {
    // Variabel untuk menyimpan ID produk
    int idProduct;
    // Variabel untuk menyimpan nama produk
    String name;
    // Variabel untuk menyimpan merek produk
    String brand;
    // Variabel untuk menyimpan harga produk
    double price;

    // Konstruktor untuk menginisialisasi objek Product
    public Product(int idProduct, String name, String brand, double price) {
        // Menginisialisasi atribut ID, nama, merek, dan harga produk
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
}
