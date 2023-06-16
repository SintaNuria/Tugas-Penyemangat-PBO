//inheritance
public class Mahasiswa extends Character implements Studyable {
    //enkapsulasi
    private String name;

    //constructor
    public Mahasiswa(String name) {
        this.name = name;
    }
    //instance method
    public void move() {
        System.out.println("Mahasiswa " + name + " berjalan ke kampus");
    }
    //instance method
    //overriding
    public void study() {
        System.out.println("Mahasiswa " + name + " sedang belajar");
    }
    //instance method
    public void doHomework() {
        System.out.println("Mahasiswa " + name + " mengerjakan tugas");
    }
}