/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

/**
 *
 * @author user
 */
public class matematika {
    int hasil;
    double hasilDouble;
    
    public void pertambahan(double a, double b, double c) {
        hasilDouble =a+b+c;
        System.out.println("hasil pertambahan;%.1f%n" + hasilDouble);
    }
    
    public void pertambahan(int a, int b, int c) {
        hasil =a+b+c;
        System.out.println("hasil pertambahan;" + hasil);
    }
    
     public void pertambahan(int a, int b) {
        hasil =a+b;
        System.out.println("hasil pertambahan;" + hasil);
    }
     
     public void pertambahan(double a, double b ) {
        hasilDouble =a+b;
        System.out.println("hasil pertambahan;%.1f%n" + hasilDouble);
    }
     
     public void pengurangan(double a, double b, double c) {
        hasilDouble =a-b-c;
        System.out.println("hasil pengurangan;%.1f%n" + hasilDouble);
    }
    
    public void pengurangan(int a, int b, int c) {
        hasil =a-b-c;
        System.out.println("hasil pengurangan;" + hasil);
    }
    
     public void pengurangan(int a, int b) {
        hasil =a-b;
        System.out.println("hasil pengurangan;" + hasil);
    }
     
     public void pengurangan(double a, double b ) {
        hasilDouble =a-b;
        System.out.println("hasil pengurangan;%.1f%n" + hasilDouble);
    }
     
     public void perkalian(double a, double b, double c) {
        hasilDouble =a*b*c;
        System.out.println("hasil perkalian;%.1f%n" + hasilDouble);
    }
    
    public void perkalian(int a, int b, int c) {
        hasil =a*b*c;
        System.out.println("hasil perkalian;" + hasil);
    }
    
     public void perkalian (int a, int b) {
        hasil =a*b;
        System.out.println("hasil perkalian;" + hasil);
    }
     
     public void perkalian(double a, double b ) {
        hasilDouble =a*b;
        System.out.println("hasil perkalian;%.1f%n" + hasilDouble);
    }
     
     public void pembagian(double a, double b, double c) {
        hasilDouble =a/b/c;
        System.out.println("hasil pembagian;%.1f%n" + hasilDouble);
    }
    
    public void pembagian(int a, int b, int c) {
        hasil =a/b/c;
        System.out.println("hasil pembagian;" + hasil);
    }
    
    public void pembagian(int a, int b) {
        hasil =a/b;
        System.out.println("hasil pembagian;" + hasil);
    }
     
    public void pembagian(double a, double b ) {
        hasilDouble =a/b;
        System.out.println("hasil pembagian;%.1f%n" + hasilDouble);
    }
    
}
