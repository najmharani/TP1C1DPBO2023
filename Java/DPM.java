import java.util.ArrayList;

public class DPM extends Student {

    private String position;

    public DPM() {
        super();
    }

    public DPM(int nik, String name, String gender, ArrayList<CollegeTool> tools, ArrayList<Integer> semester_courses,
            int nim, String position) {
        super(nik, name, gender, tools, semester_courses, nim);

        this.position = position;
    }

    /* Setter & Getter */

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void monitor() {
        System.out.println("==> " + getName() + " is monitoring the program...");
    }

    public void appreciate() {
        System.out.println("==> " + getName() + " says, 'I appreciate your work'");
    }

    public void recommend() {
        System.out.println("==> " + getName() + " is giving recommendations...");
    }
}
