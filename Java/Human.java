// deklarasi kelas human
public class Human {

    /* Atribut-atribur private milik kelas */
    private int nik;
    private String name;
    private String gender;

    // constructor kosong
    public Human() {
    }

    // constructor dengan parameter seluruh atribut milik kelas
    public Human(int nik, String name, String gender) {
        this.nik = nik;
        this.name = name;
        this.gender = gender;
    }

    /* Setter dan getter */

    public void setName(String name) {
        this.name = name;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNik() {
        return this.nik;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    /* Human Behaviour */

    public void eat() {
        System.out.println("==> " + this.name + " is eating...");
    }

    public void drink() {
        System.out.println("==> " + this.name + " is drinking...");
    }

    public void sleep() {
        System.out.println("==> " + this.name + " is sleeping...");
    }

}
