package CourcePartII.Lesson10ExcampleGenerics;

public class Test12 {
    public static void main(String[] args) {
        //создание участников
        School school1 = new School("SCH1", 14);
        School school2 = new School("SCH2", 15);
        School school3 = new School("SCH3", 14);
        School school4 = new School("SCH4", 15);
        Student student1 = new Student("ST1", 24);
        Student student2 = new Student("ST2", 25);
        Employee employee1 = new Employee("EM1", 44);
        Employee employee2 = new Employee("EM2", 54);

        //создание команд
        Team<School> schoolTeam1 = new Team<>("Start1"); //team adding only school
        schoolTeam1.addParticipant(school1);
        schoolTeam1.addParticipant(school2);
        //schoolTeam.addParticipant(student1); // нельзя
        Team<School> schoolTeam2 = new Team<>("Start2");
        schoolTeam2.addParticipant(school3);
        schoolTeam2.addParticipant(school4);

        Team<Student> studentTeam = new Team<>("Medium");
        studentTeam.addParticipant(student1);
        studentTeam.addParticipant(student2);
        Team<Employee> employeeTeam = new Team<>("Hard");
        employeeTeam.addParticipant(employee1);
        employeeTeam.addParticipant(employee2);
        //Team<String> stringTeam = new Team<>("Don't"); нельзя тк extends in Team

        //ИГРА
        schoolTeam1.playWith(schoolTeam2);
        //schoolTeam1.playWith(studentTeam);
    }
}
