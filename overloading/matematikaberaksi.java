/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;


/**
 *
 * @author user
 */
public class matematikaberaksi extends matematika{
    public static void main(String[] args) {
        matematikacanggih mtk = new matematikacanggih();
        
        System.out.println("-------pertambhan-------");
        mtk.pertambahan(12.5,28.7, 14.2);
        mtk.pertambahan(12, 28, 14);
        mtk.pertambahan(23, 34);
        mtk.pertambahan(3.4, 4.9);
        
        System.out.println("\n-------pengurangan-------");
        mtk.pengurangan(12.5,28.7, 14.2);
        mtk.pengurangan(12, 28, 14);
        mtk.pengurangan(23, 34);
        mtk.pengurangan(3.4, 4.9);
        
        System.out.println("\n-------perkalian-------");
        mtk.perkalian(12.5,28.7, 14.2);
        mtk.perkalian(12, 28, 14);
        mtk.perkalian(23, 34);
        mtk.perkalian(3.4, 4.9);
        
        System.out.println("\n-------pembagian-------");
        mtk.pembagian(12.5,28.7, 14.2);
        mtk.pembagian(12, 28, 14);
        mtk.pembagian(23, 34);
        mtk.pembagian(3.4, 4.9);
        
        System.out.println("\n-------modulus-------");
        mtk.modulus(12.5,28.7, 14.2);
        mtk.modulus(12, 28, 14);
        mtk.modulus(23, 34);
        mtk.modulus(3.4, 4.9);
        
        System.out.println("\nHasil Operasi Gabungan : " + mtk.gabungan(10, 5, 2) );

    }
}
