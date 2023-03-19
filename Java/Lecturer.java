import java.util.ArrayList;

public class Lecturer extends Academics {

    private int nip;

    public Lecturer() {
    }

    public Lecturer(
            int nik,
            String name,
            String gender,
            ArrayList<CollegeTool> tools,
            ArrayList<Integer> semester_courses,
            int nip) {

        super(nik, name, gender, tools, semester_courses);

        this.nip = nip;
    }

    /* Setter & Getter */

    public void setNip(int nip) {
        this.nip = nip;
    }

    public int getNip() {
        return nip;
    }

    public void teaching(CollegeTool tool) {
        System.out.println("==> " + getName() + " is teaching...");
        tool.use();
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

    public void judgeAssignment(Course course) {
        if (course.getNum_of_assignments() > 0) {
            System.out.println("==> " + getName() + " is judging an assignment...");
            course.setNum_of_assignments(course.getNum_of_assignments() - 1);
            System.out.println("==> There is " + course.getNum_of_assignments() + " assignments left to judge.");
        } else {
            System.out.println("==> There is no assignment, " + getName() + " can't judge.");
        }
    }

    public void giveScore(Course course) {

        if (course.getNum_of_assignments() == 0 && !(course.isScored())) {
            System.out.println("==> " + getName() + " is giving score...");
            course.setIsScored(true);
        } else {
            System.out
                    .println("==> There are assignments that haven't been judged, " + getName()
                            + " can't give score. Please judge all the assignment first.");
            System.out.println("==> Number of assignments to judge : " + course.getNum_of_assignments());
        }
    }

}
