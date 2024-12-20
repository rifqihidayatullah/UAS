package MatematikaInheritance;

public class Matematika {
    private int result;

    void tambah(int x, int y) {
        result = x + y;
    }

    void kurang(int x, int y) {
        result = x - y;
    }

    void kali(int x, int y) {
        result = x * y;
    }

    void bagi(int x, int y) {
        if (y != 0) {
            result = x / y;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            result = 0; // Mengatur nilai default jika terjadi pembagian dengan nol
        }
    }

    int getResult() {
        return result;
    }
}
