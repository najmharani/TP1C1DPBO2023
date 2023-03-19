public class Course {

    private int course_code;
    private String course_name;
    private int lecturer_nip;
    private int num_of_assignments;
    private boolean isScored;

    public Course() {
    }

    public Course(int course_code, String course_name, int lecturer_nip) {
        this.course_code = course_code;
        this.course_name = course_name;
        this.lecturer_nip = lecturer_nip;
        this.isScored = false;
    }

    /* Setter & Getter */

    public void setCourse_code(int course_code) {
        this.course_code = course_code;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setLecturer_nip(int lecturer_nip) {
        this.lecturer_nip = lecturer_nip;
    }

    public void setNum_of_assignments(int num_of_assignments) {
        this.num_of_assignments = num_of_assignments;
    }

    public void setIsScored(boolean isScored) {
        this.isScored = isScored;
    }

    public int getCourse_code() {
        return course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public int getLecturer_nip() {
        return lecturer_nip;
    }

    public int getNum_of_assignments() {
        return num_of_assignments;
    }

    public boolean isScored() {
        return isScored;
    }

    public void addAssignment() {
        this.num_of_assignments++;
    }

}
