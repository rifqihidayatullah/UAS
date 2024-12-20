package MatematikaInheritance;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        // Operasi penjumlahan
        matematika.tambah(10, 5);
        System.out.println("Hasil penjumlahan: " + matematika.getResult());

        // Operasi pengurangan
        matematika.kurang(10, 5);
        System.out.println("Hasil pengurangan: " + matematika.getResult());

        // Operasi perkalian
        matematika.kali(10, 5);
        System.out.println("Hasil perkalian: " + matematika.getResult());

        // Operasi pembagian
        matematika.bagi(10, 5);
        System.out.println("Hasil pembagian: " + matematika.getResult());

      
    }
}

