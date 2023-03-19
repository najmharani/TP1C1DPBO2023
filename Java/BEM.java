import java.util.ArrayList;

public class BEM extends Student {

    private String division;

    public BEM() {
        super();
    }

    public BEM(int nik, String name, String gender, ArrayList<CollegeTool> tools, ArrayList<Integer> semester_courses,
            int nim, String division) {
        super(nik, name, gender, tools, semester_courses, nim);

        this.division = division;
    }

    /* Setter & Getter */

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public void doProgram(DPM dpm) {
        System.out.println("==> " + getName() + " is doing BEM's agenda...");
        dpm.monitor();
        dpm.appreciate();
    }

    public void planning() {
        System.out.println("==> " + getName() + " is planning something...");
    }

    public void meeting(DPM dpm) {
        System.out.println("==> " + getName() + " is currently meeting with the team to work on an innovation...");
        dpm.recommend();
    }
}
