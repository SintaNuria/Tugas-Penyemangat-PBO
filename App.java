import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Dosen dsn = new Dosen("Aryo Pinandito, S.T., M.MT, Ph.D");
        dsn.move();
        dsn.teach();

        Mahasiswa mhs = new Mahasiswa("Sinta Nuria Prawansyah");
        mhs.move();
        mhs.study();

        Dosen dsn2 = new Dosen("Tri Afirianto, Ir., S.T., M.T.");
        dsn2.move();
        dsn2.teach();

        Employee employee = new Employee("John Doe", "Manager");
        employee.move("Office");
        employee.work();

        ArrayList<Studyable> characters = new ArrayList<>();
        characters.add(new Dosen("Wibisono Sukmo Wardhono, S.T., M.T."));
        characters.add(new Mahasiswa("Melina Dyah Anggraini"));
        characters.add(new Dosen("Nurul Hidayat, S.Pd., M.Sc."));
        characters.add(new Mahasiswa("Alivia Putri Zuhriah"));

        //polymorphism
        //arraylist
        for (Studyable character : characters) {
            character.study();
        }
    }
}
