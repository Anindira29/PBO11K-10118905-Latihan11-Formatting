/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan11;

/**
 *
 * @author 
 * Nama         : Anindira Dina Fitriani
 * Kelas        : IF11 - K
 * Deskripsi    : formatting
 */
public class Latihan11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i =3546764;
        int iMinus = -i;
        System.out.println("i : " + i);
        System.out.println("%%d : %d%n", i);
        System.out.println("%%10d : %10d%n", i);
        System.out.println("%%+10d : %+10d%n", i);
        System.out.println("%%+10d : %+10d%n", iMinus);
        System.out.println("%%-10d : %,10d%n", i);
        System.out.println("%%-10d : %-10d%n" + i);
        double f = 5675482.982;
        System.out.println("f : " + f);
        System.out.println("%%f : %f%n" + f);
        System.out.println("%%.2f : %.2f%n" + f);
        System.out.println("%%12.2f : %12.2f%n" + f);
        System.out.println("%%,12.2f : %,12.2f%n" +f);
    }
    
}
