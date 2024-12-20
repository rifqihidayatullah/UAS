package MatematikaInheritance;

public class MatematikaCanggih extends Matematika {

    // Menambahkan metode untuk operasi modulus
    void modulus(int x, int y) {
        if (y != 0) {
            // Menggunakan setter di superclass untuk menyimpan hasil
            super.tambah(0, x % y); // Memanfaatkan metode tambah untuk mengubah `result`
        } else {
            System.out.println("Error: Modulus dengan nol!");
        }
    }
}

// sample interact Main
