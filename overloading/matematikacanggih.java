/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

/**
 *
 * @author user
 */
public class matematikacanggih extends matematika{
    public void modulus(double a, double b, double c) {
        hasilDouble =a%b%c;
        System.out.println("hasil modulus;%.1f%n" + hasilDouble);
    }
    
    public void modulus(int a, int b, int c) {
        hasil =a%b%c;
        System.out.println("hasil modulus;" + hasil);
    }
    
     public void modulus(int a, int b) {
        hasil =a%b;
        System.out.println("hasil modulus;" + hasil);
    }
     
     public void modulus(double a, double b ) {
        hasilDouble =a%b;
        System.out.println("hasil modulus;%.1f%n" + hasilDouble);
    }
     
      int gabungan(int a, int b, int c) {
        return a+(b*c);
    }
}
