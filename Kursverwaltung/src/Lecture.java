import java.util.ArrayList;

public class Lecture {
    // Attribute
    private String name;
    private String teacher;
    private ArrayList<Student> participantsList = new ArrayList<Student>();

    // Konstruktor
    public Lecture(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    // Methoden
    public void addParticipant(Student participant) {
        participantsList.add(participant);
    }
    public void removeParticipant(String name, String lastName) {
        try {
            participantsList.remove(findParticipant(name, lastName));
        } catch (Exception e) {
            // Keine Ausgabe
        }
    }

    public void listParticipants() {
        System.out.println("Lecture:" + "\t" + Colors.GREEN + name + Colors.RESET);
        for(int i = 0; i < participantsList.size(); i++) {
            System.out.println("\t\t\t" +
                    participantsList.get(i).getName() +
                    " " +
                    participantsList.get(i).getLastName());
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

    private int findParticipant(String name, String lastName) {
        for(int i = 0; i < participantsList.size(); i++) {
            if(participantsList.get(i).getName().equals(name) && participantsList.get(i).getLastName().equals(lastName)) {
                return i;
            }
        }

        return -1;
    }
}
