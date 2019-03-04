import java.util.ArrayList;

public class Lecture {
    // Attribute
    private String name;
    private String teacher;
    private ArrayList<Student> participants = new ArrayList<Student>();

    // Konstruktor
    public Lecture(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    // Methoden
    public void addParticipant(Student participant) {
        participants.add(participant);
    }

    public void listParticipants() {
        System.out.println("Lecture:" + "\t" + Colors.GREEN + name + Colors.RESET);
        for(int i = 0; i < participants.size(); i++) {
            System.out.println("\t\t\t" +
                    participants.get(i).getName() +
                    " " +
                    participants.get(i).getLastName());
        }
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }
}
