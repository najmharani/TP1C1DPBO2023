import java.util.ArrayList;

public class Academics extends Human {
    private ArrayList<CollegeTool> tools;
    private ArrayList<Integer> semester_courses;

    public Academics() {
        super();
    }

    public Academics(int nik, String name, String gender, ArrayList<CollegeTool> tools,
            ArrayList<Integer> semester_courses) {
        super(nik, name, gender);

        this.tools = tools;
        this.semester_courses = semester_courses;
    }

    /* Setter & Getter */

    public void setTools(ArrayList<CollegeTool> tools) {
        this.tools = tools;
    }

    public void setSemester_courses(ArrayList<Integer> semester_courses) {
        this.semester_courses = semester_courses;
    }

    public ArrayList<CollegeTool> getTools() {
        return tools;
    }

    public ArrayList<Integer> getSemester_courses() {
        return semester_courses;
    }
}
