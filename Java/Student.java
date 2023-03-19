import java.util.ArrayList;

// deklarasi kelas mahasiswa, child dari kelas sivitas akademik
public class Student extends Academics {

    /* Atribut-atribur private milik kelas */
    private int nim;

    // constructor kosong
    public Student() {
    }

    // constructor dengan parameter seluruh atribut milik kelas dan parent-nya
    public Student(
            int nik,
            String name,
            String gender,
            ArrayList<CollegeTool> tools,
            ArrayList<Integer> semester_courses,
            int nim) {

        // constructor super untuk kelas parent
        super(nik, name, gender, tools, semester_courses);

        this.nim = nim;
    }

    /* Setter dan getter */

    // set nim
    public void setNim(int nim) {
        this.nim = nim;
    }

    // get nim
    public int getNim() {
        return nim;
    }

    public void study(CollegeTool tool) {
        System.out.println("==> " + getName() + " is studying...");
        tool.use();
    }

    public void attendClass() {
        System.out.println("==> " + getName() + " is attending a class...");
    }

    public void doAssignment(CollegeTool tool) {
        System.out.println("==> " + getName() + " is doing an assignment...");
        tool.use();
    }
}