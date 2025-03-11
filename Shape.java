/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBO;
// Kelas abstrak Shape
abstract class Shape {
    protected String color; // Variabel untuk menyimpan warna bentuk

    // Konstruktor untuk inisialisasi warna
    public Shape(String color) {
        this.color = color;
    }

    // Metode abstrak untuk menghitung luas (harus diimplementasikan oleh subclass)
    public abstract double getArea();

    // Getter untuk mendapatkan warna bentuk
    public String getColor() {
        return color;
    }
}

// Kelas Triangle yang merupakan turunan dari Shape
class Triangle extends Shape {
    private double base;   // Variabel untuk menyimpan panjang alas segitiga
    private double height; // Variabel untuk menyimpan tinggi segitiga

    // Konstruktor untuk inisialisasi warna, alas, dan tinggi
    public Triangle(String color, double base, double height) {
        super(color); // Memanggil konstruktor dari kelas induk (Shape)
        this.base = base;
        this.height = height;
    }

    // Implementasi metode getArea() untuk menghitung luas segitiga
    @Override
    public double getArea() {
        return 0.5 * base * height; // Rumus luas segitiga = 1/2 * alas * tinggi
    }
}

// Kelas Circle yang merupakan turunan dari Shape
class Circle extends Shape {
    private double radius; // Variabel untuk menyimpan jari-jari lingkaran

    // Konstruktor untuk inisialisasi warna dan jari-jari
    public Circle(String color, double radius) {
        super(color); // Memanggil konstruktor dari kelas induk (Shape)
        this.radius = radius;
    }

    // Implementasi metode getArea() untuk menghitung luas lingkaran
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Rumus luas lingkaran = π * r^2
    }
}

