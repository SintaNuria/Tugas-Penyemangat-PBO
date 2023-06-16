//kelas abstrak
abstract class Character {
    //Static Modifier dan Konstanta Final
    public static final String TYPE = "Character";

    public void move() {
        System.out.println("Ngoding yok!!");
    }
    //overload
    public void move(String destination) {
        System.out.println("Berjalan ke " + destination);
    }
}