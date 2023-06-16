//inheritance
public class Dosen extends Character implements Studyable {
    //enkapsulasi
    private String name;

    //constructor
    public Dosen(String name) {
        this.name = name;
    }

    //instance method
    public void move() {
        System.out.println("Dosen " + name + " berjalan ke kelas");
    }
    //instance method
    //overriding
    public void teach() {
        System.out.println("Dosen " + name + " mengajar di ruang kuliah");
    }

    public void doResearch() {
        System.out.println("Dosen " + name + " melakukan penelitian");
    }
    //instance method
    //overriding
    public void study() {
        System.out.println("Dosen " + name + " sedang belajar");
    }
}