import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Instansiasi Objek2 */

        Course dpbo = new Course(111, "DPBO", 911);

        ArrayList<Course> listCourse = new ArrayList<Course>();
        listCourse.add(dpbo);
        ArrayList<Integer> courses = new ArrayList<Integer>();

        ArrayList<CollegeTool> lecturer_tools = new ArrayList<CollegeTool>();

        CollegeTool laptop = new CollegeTool("Laptop");
        lecturer_tools.add(laptop);
        CollegeTool board_markers = new CollegeTool("Board_Markers");
        lecturer_tools.add(board_markers);

        courses.add(111);
        Lecturer rosa = new Lecturer(7, "Rosa", "Perempuan", lecturer_tools, courses, 911);

        ArrayList<CollegeTool> student_tools = new ArrayList<CollegeTool>();

        student_tools.add(laptop);
        CollegeTool textbooks = new CollegeTool("Textbooks");
        student_tools.add(textbooks);

        BEM rapi = new BEM(1, "Rapi", "Laki-Laki", student_tools, courses, 21000, "President");

        DPM alga = new DPM(2, "Alga", "Laki-Laki", student_tools, courses, 21111, "Supervison_Staff");

        Assistant najmi = new Assistant(3, "Najmi", "Perempuan", student_tools, courses, 21222, 111);
        Assistant bulan = new Assistant(4, "Bulan", "Laki-Laki", student_tools, courses, 21333, 111);

        Student afri = new Student(5, "Afri", "Laki-Laki", student_tools, courses, 21444);
        Student anin = new Student(6, "Anin", "Perempuan", student_tools, courses, 21555);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(rapi);
        students.add(alga);
        students.add(najmi);
        students.add(bulan);
        students.add(afri);
        students.add(anin);

        ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
        lecturers.add(rosa);

        ArrayList<Human> humans = new ArrayList<Human>(students);
        humans.add(rosa);

        /* Pendahuluan */

        System.out.println("| This is a simple simulation of daily activities in the Department of Computer Science.");
        System.out.println("| There are some characters in this simulation.");
        System.out.println();
        System.out.println("| Students :");

        for (Student student : students) {
            System.out.print("| - " + student.getName());
            if (student instanceof BEM) {
                System.out.print(" (BEM)");
            } else if (student instanceof DPM) {
                System.out.print(" (DPM)");
            } else if (student instanceof Assistant) {
                System.out.print(" (Assistant)");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("| Lecturers :");

        for (Lecturer lecturer : lecturers) {
            System.out.println("| - " + lecturer.getName());
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("| Type 1 to choose the characters.");
        System.out.println("| Type 0 leave the program.");

        System.out.print("| Next : ");
        int command = scanner.nextInt();

        if (command == 1) {

            boolean start = true;
            int chara_num = 0;
            Human character = new Human();

            while (start) {
                System.out.println();
                System.out.println("+----------------------------");
                System.out.println("| Character List :");
                System.out.println("+----------------------------");

                for (Human human : humans) {
                    System.out.print("| (" + human.getNik() + ") " + human.getName());
                    if (human instanceof BEM) {
                        System.out.print(" (BEM)");
                    } else if (human instanceof DPM) {
                        System.out.print(" (DPM)");
                    } else if (human instanceof Assistant) {
                        System.out.print(" (Assistant)");
                    } else if (human instanceof Lecturer) {
                        System.out.print(" (Lecturer)");
                    } else {
                        System.out.print(" (Regular Student)");
                    }
                    System.out.println();
                }

                System.out.println();
                System.out.println("| (0) Leave the Program");

                System.out.println();
                System.out.print("| Choose your character's NIK (Number) : ");
                chara_num = scanner.nextInt();

                Boolean notDone = true;
                if (chara_num != 0) {

                    for (Human human : humans) {
                        if (chara_num == human.getNik()) {
                            character = human;
                        }
                    }

                } else {
                    notDone = false;
                    start = false;
                }

                int activity_num = 0;

                while (notDone) {

                    System.out.println();
                    System.out.print("| Choose " + character.getName() + "'s activity : ");
                    System.out.println();
                    System.out.println();

                    System.out.println("| (0) Back to the Characters Menu");
                    System.out.println("| (1) Eat");
                    System.out.println("| (2) Drink");
                    System.out.println("| (3) Sleep");

                    if (character instanceof Student) {
                        System.out.println("| (4) Study");
                        System.out.println("| (5) Attend Class");
                        System.out.println("| (6) Do Assignment");

                    } else if (character instanceof Lecturer) {
                        System.out.println("| (4) Teaching");
                        System.out.println("| (5) Give Assignment");
                        System.out.println("| (6) Give Score");
                    }

                    if (character instanceof BEM) {
                        System.out.println("| (7) Do BEM's Agenda");
                        System.out.println("| (8) Planning");
                        System.out.println("| (9) Meeting");

                    } else if (character instanceof Assistant) {
                        System.out.println("| (7) Teaching");
                        System.out.println("| (8) Give Assignment/Homework");

                    } else if (character instanceof Lecturer) {
                        System.out.println("| (7) Judge Assignment");
                    }

                    System.out.println();
                    System.out.print("| Activity number : ");
                    activity_num = scanner.nextInt();
                    System.out.println();

                    switch (activity_num) {
                        case 1: // eat
                            character.eat();
                            break;
                        case 2: // drink
                            character.drink();
                            break;

                        case 3: // sleep
                            character.sleep();
                            break;

                        case 4: // study or teaching
                            if (character instanceof Student) {

                                Student student = (Student) character;
                                CollegeTool used = new CollegeTool();

                                System.out.println("| Choose a tool for study :");
                                for (CollegeTool tool : student.getTools()) {
                                    System.out.println("| - " + tool.getTool_name());
                                }

                                System.out.println();
                                System.out.print("| Type the tool's name : ");
                                String tool_name = scanner.next();
                                System.out.println();

                                for (CollegeTool tool : student.getTools()) {
                                    if (tool_name.equals(tool.getTool_name())) {
                                        used = tool;
                                    }
                                }

                                student.study(used);

                            } else if (character instanceof Lecturer) {
                                Lecturer lecturer = (Lecturer) character;

                                CollegeTool used = new CollegeTool();

                                System.out.println("| Choose a tool for teaching :");
                                for (CollegeTool tool : lecturer.getTools()) {
                                    System.out.println("| - " + tool.getTool_name());
                                }

                                System.out.println();
                                System.out.print("| Type the tool's name : ");
                                String tool_name = scanner.next();
                                System.out.println();

                                for (CollegeTool tool : lecturer.getTools()) {
                                    if (tool_name.equals(tool.getTool_name())) {
                                        used = tool;
                                    }
                                }

                                lecturer.teaching(used);
                            }

                            break;

                        case 5: // attend class or give assignment
                            if (character instanceof Student) {
                                Student student = (Student) character;
                                student.attendClass();

                            } else if (character instanceof Lecturer) {
                                Lecturer lecturer = (Lecturer) character;
                                ArrayList<Integer> lecturer_course = lecturer.getSemester_courses();
                                Course course_now = new Course();

                                for (Course course : listCourse) {
                                    for (Integer code_of_courses : lecturer_course) {
                                        if (course.getCourse_code() == code_of_courses) {
                                            course_now = course;
                                        }
                                    }
                                }

                                lecturer.giveAssignment(course_now);
                            }
                            break;

                        case 6: // do assignment or give score
                            if (character instanceof Student) {
                                Student student = (Student) character;
                                ArrayList<Integer> student_course = student.getSemester_courses();
                                boolean done = true;

                                for (Course course : listCourse) {
                                    for (Integer code_of_courses : student_course) {
                                        if (course.getCourse_code() == code_of_courses) {
                                            if (course.getNum_of_assignments() > 0) {
                                                done = false;
                                            }
                                        }
                                    }
                                }

                                if (!(done)) {
                                    CollegeTool used = new CollegeTool();

                                    System.out.println("| Choose a tool to be used :");
                                    for (CollegeTool tool : student.getTools()) {
                                        System.out.println("| - " + tool.getTool_name());
                                    }

                                    System.out.println();
                                    System.out.print("| Type the tool's name : ");
                                    String tool_name = scanner.next();
                                    System.out.println();

                                    for (CollegeTool tool : student.getTools()) {
                                        if (tool_name.equals(tool.getTool_name())) {
                                            used = tool;
                                        }
                                    }

                                    student.doAssignment(used);
                                } else {
                                    System.out.println("==> There is no assignment to do.");
                                }

                            } else if (character instanceof Lecturer) {
                                Lecturer lecturer = (Lecturer) character;
                                ArrayList<Integer> lecturer_course = lecturer.getSemester_courses();
                                Course course_now = new Course();

                                for (Course course : listCourse) {
                                    for (Integer code_of_courses : lecturer_course) {
                                        if (course.getCourse_code() == code_of_courses) {
                                            course_now = course;
                                        }
                                    }
                                }

                                lecturer.giveScore(course_now);
                            }
                            break;
                        case 7: // do program or teaching or judge assignment
                            if (character instanceof BEM) {
                                BEM bem = (BEM) character;
                                System.out.println("==> To do the program, at least one DPM member should be present.");
                                System.out
                                        .println("==> Alga is the only DPM member on the character list, invite Alga?");
                                System.out.println();
                                System.out.print("| type 'YES' or 'NO' : ");
                                String confirm = scanner.next();

                                System.out.println();
                                if (confirm.equals("YES")) {
                                    bem.doProgram(alga);
                                } else if (confirm.equals("NO")) {
                                    System.out.println("==> " + bem.getName()
                                            + " can't do the program, please invite at least one DPM member");
                                }

                            } else if (character instanceof Assistant) {
                                Assistant assistant = (Assistant) character;
                                Integer course_code = assistant.getCourse_code();
                                Course course_now = new Course();

                                for (Course course : listCourse) {
                                    if (course.getCourse_code() == course_code) {
                                        course_now = course;
                                    }
                                }
                                assistant.teaching(course_now);

                            } else if (character instanceof Lecturer) {
                                Lecturer lecturer = (Lecturer) character;
                                ArrayList<Integer> lecturer_course = lecturer.getSemester_courses();
                                Course course_now = new Course();

                                for (Course course : listCourse) {
                                    for (Integer code_of_courses : lecturer_course) {
                                        if (course.getCourse_code() == code_of_courses) {
                                            course_now = course;
                                        }
                                    }
                                }

                                lecturer.judgeAssignment(course_now);

                            } else {
                                System.out.println("| Activity not available.");
                            }
                            break;
                        case 8: // planning or give assignment
                            if (character instanceof BEM) {
                                BEM bem = (BEM) character;
                                bem.planning();

                            } else if (character instanceof Assistant) {
                                Assistant assistant = (Assistant) character;
                                Integer course_code = assistant.getCourse_code();
                                Course course_now = new Course();

                                for (Course course : listCourse) {
                                    if (course.getCourse_code() == course_code) {
                                        course_now = course;
                                    }
                                }

                                assistant.giveAssignment(course_now);

                            } else {
                                System.out.println("| Activity not available.");
                            }
                            break;
                        case 9:
                            if (character instanceof BEM) {
                                BEM bem = (BEM) character;
                                System.out.println("==> To do the meeting, at least one DPM member should be present.");
                                System.out.println("==> Alga is the only DPM on the character list, invite Alga?");
                                System.out.println();
                                System.out.print("| type 'YES' or 'NO' : ");
                                String confirm = scanner.next();

                                System.out.println();
                                if (confirm.equals("YES")) {
                                    bem.meeting(alga);
                                } else if (confirm.equals("NO")) {
                                    System.out.println("==> " + bem.getName()
                                            + " can't do the meeting, please invite at least one DPM member.");
                                }

                            } else {
                                System.out.println("| Activity not available.");
                            }
                            break;
                        case 0:
                            notDone = false;
                            break;

                        default:
                            System.out.println("| Activity not available.");
                            break;
                    }
                }
            }

        }

        System.out.println();
        System.out.println("| See u again! :D");

    }
}
