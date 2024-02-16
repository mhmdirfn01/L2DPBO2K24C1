// Kelas turunan Clothing dari kelas Product
public class Clothing extends Product {
    // Variabel untuk menyimpan ukuran pakaian
    String size;
    // Variabel untuk menyimpan bahan pakaian
    String material;
    // Variabel untuk menyimpan jenis kelamin pakaian
    String gender;

    // Konstruktor untuk menginisialisasi objek Clothing
    public Clothing(int idProduct, String name, String brand, double price, String size, String material, String gender) {
        // Memanggil konstruktor kelas Product menggunakan super() untuk menginisialisasi atribut dari kelas Product
        super(idProduct, name, brand, price);
        // Menginisialisasi atribut size, material, dan gender dari kelas Clothing
        this.size = size;
        this.material = material;
        this.gender = gender;
    }
}
