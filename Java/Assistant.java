import java.util.ArrayList;

public class Assistant extends Student {

    private int course_code;

    public Assistant() {
        super();
    }

    public Assistant(int nik, String name, String gender, ArrayList<CollegeTool> tools,
            ArrayList<Integer> semester_courses,
            int nim, int course_code) {
        super(nik, name, gender, tools, semester_courses, nim);

        this.course_code = course_code;
    }

    /* Setter & Getter */

    public void setCourse_code(int course_code) {
        this.course_code = course_code;
    }

    public int getCourse_code() {
        return course_code;
    }

    public void teaching(Course course) {
        System.out.println("==> " + getName() + " is teaching " + course.getCourse_name() + "...");
    }

    public void giveAssignment(Course course) {
        if (!(course.isScored())) {
            System.out
                    .println("==> " + getName() + " is giving an assignment on " + course.getCourse_name()
                            + " course...");
            course.addAssignment();
        } else {
            System.out.println("==> The course has already completed.");
        }
    }
}
