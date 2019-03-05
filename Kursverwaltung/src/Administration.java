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
        connectStudent(studentsList.get(0), lecturesList.get(findLecture("Objektorientierte Programmierung")));
        connectStudent(studentsList.get(1), lecturesList.get(findLecture("Objektorientierte Programmierung")));

        // Kurs und Teilnehmer auflisten
        lecturesList.get(findLecture("Objektorientierte Programmierung")).listParticipants();


        // Aufgabe: Neue Teilneher erstellen, neuen Kurs erstellen
        //          Kurs und Teilnehmer verbinden
        //          Kurs und Teilnehmer ausgeben

        createStudent("Ali", "Anani");
        createStudent("Dawit", "Ayane");
        createStudent("Ferhat", "Derin");
        createStudent("Ingo", "Türke");

        createLecture("Netzwerktechnik", "Höpfle");


        connectStudent(studentsList.get(findStudent("Ferhat", "Derin")), lecturesList.get(findLecture("Netzwerktechnik")));
        connect("Dawit", "Ayane", "Netzwerktechnik");

        lecturesList.get(findLecture("Netzwerktechnik")).listParticipants();


        lecturesList.get(findLecture("Objektorientierte Programmierung")).listParticipants();

        removeStudent("Peter", "Pan");

        lecturesList.get(findLecture("Objektorientierte Programmierung")).listParticipants();



    }
    private void createStudent(String name, String lastName) {
        Student student1 = new Student("Alexander", "Böckle");
        student1.getName();
        studentsList.add(new Student(name, lastName));
    }
    private void createLecture(String name, String teacher) {
        lecturesList.add(new Lecture(name, teacher));
    }
    private void connectStudent(Student participant, Lecture lecture) {
        lecture.addParticipant(participant);
    }
    private int findLecture(String lectureName) {
        for(int i = 0; i < lecturesList.size(); i++) {
            if(lecturesList.get(i).getName().equals(lectureName)) {
                return i;
            }
        }

        return -1;
    }
    private int findStudent(String name, String lastName) {
        for(int i = 0; i < studentsList.size(); i++) {
            if(studentsList.get(i).getName().equals(name) && studentsList.get(i).getLastName().equals(lastName)) {
                return i;
            }
        }

        return -1;
    }
    private void removeStudent(String name, String lastName) {
        // Student aus allen Lectures entfernen
        // Schleife, um durch alle Lectures zu gehen
        // Dann jeweils den Student aus der participantsList entfernen
        for(int i = 0; i < lecturesList.size(); i++) {
            lecturesList.get(i).removeParticipant(name, lastName);
        }

        // Student aus der studentList entfernen
        try {
            studentsList.remove(findStudent(name, lastName));
        } catch (Exception e) {
            System.out.println(Colors.RED + "Student is not existing!" + Colors.RESET);
        }

    }
    private void connect(String studentName, String studentLastName, String lectureName) {
        connectStudent(studentsList.get(findStudent(studentName, studentLastName)), lecturesList.get(findLecture(lectureName)));
    }
}
