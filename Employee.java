//inheritance
public class Employee extends Character {
    //enkapsulasi
    private String name;
    private String position;

    //constructor
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    //instance method
    public void move() {
        System.out.println("Employee " + name + " berjalan ke tempat kerja");
    }
    //instance method
    public void move(String destination) {
        System.out.println("Employee " + name + " berjalan ke " + destination);
    }
    //instance method
    public void work() {
        System.out.println("Employee " + name + " sedang bekerja sebagai " + position);
    }
}