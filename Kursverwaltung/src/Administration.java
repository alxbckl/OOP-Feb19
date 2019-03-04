import java.util.ArrayList;

public class Administration {
    // Attribute
    // Participants list
    ArrayList<Student> studentsList = new ArrayList<Student>();
    ArrayList<Lecture> lecturesList = new ArrayList<Lecture>();

    // Methoden
    public void start() {
        // Teilnehmer erstellen
        createStudent("Max", "Mustermann");
        createStudent("Peter", "Pan");
        createStudent("Manfred", "Maier");
        createStudent("Bernd", "Klopp");

        // Kurs erstellen
        createLecture("Objektorientierte Programmierung", "Böckle");

        // Teilnehmer und Kurs verbinden
        connectStudent(studentsList.get(0), lecturesList.get(0));
        connectStudent(studentsList.get(1), lecturesList.get(0));

        // Kurs und Teilnehmer auflisten
        lecturesList.get(0).listParticipants();


        // Aufgabe: Neue Teilneher erstellen, neuen Kurs erstellen
        //          Kurs und Teilnehmer verbinden
        //          Kurs und Teilnehmer ausgeben

        createStudent("Ali", "Anani");
        createStudent("Dawit", "Ayane");
        createStudent("Ferhat", "Derin");
        createStudent("Ingo", "Türke");

        createLecture("Netzwerktechnik", "Höpfle");

        connectStudent(studentsList.get(4), lecturesList.get(1));
        lecturesList.get(1).listParticipants();

    }
    private void createStudent(String name, String lastName) {
        studentsList.add(new Student(name, lastName));
    }
    private void createLecture(String name, String teacher) {
        lecturesList.add(new Lecture(name, teacher));
    }
    private void connectStudent(Student participant, Lecture lecture) {
        lecture.addParticipant(participant);
    }
}
