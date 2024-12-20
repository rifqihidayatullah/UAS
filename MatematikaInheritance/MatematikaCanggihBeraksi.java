package MatematikaInheritance;

public class MatematikaCanggihBeraksi{
    public static void main(String[] args) {
        // Membuat objek dari kelas MatematikaCanggih
        MatematikaCanggih mathCanggih = new MatematikaCanggih();

        // Operasi penjumlahan
        mathCanggih.tambah(20, 10);
        System.out.println("Hasil tambah: " + mathCanggih.getResult());

        // Operasi pengurangan
        mathCanggih.kurang(20, 10);
        System.out.println("Hasil kurang: " + mathCanggih.getResult());

        // Operasi perkalian
        mathCanggih.kali(20, 10);
        System.out.println("Hasil kali: " + mathCanggih.getResult());

        // Operasi pembagian
        mathCanggih.bagi(20, 10);
        System.out.println("Hasil bagi: " + mathCanggih.getResult());

        // Operasi modulus
        mathCanggih.modulus(20, 3);
        System.out.println("Hasil modulus: " + mathCanggih.getResult());
    }
}
