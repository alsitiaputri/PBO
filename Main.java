/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;
// Kelas utama (Main) untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Triangle dengan warna "Red", alas 10, dan tinggi 5
        Shape triangle = new Triangle("Red", 10, 5);
        
        // Membuat objek Circle dengan warna "Blue" dan jari-jari 7
        Shape circle = new Circle("Blue", 7);

        // Menampilkan warna dan luas segitiga
        System.out.println("Triangle Color: " + triangle.getColor());
        System.out.println("Triangle Area: " + triangle.getArea());

        // Menampilkan warna dan luas lingkaran
        System.out.println("Circle Color: " + circle.getColor());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
