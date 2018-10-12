package lab3.A6;

public class StudentParticipant extends Student {

    public StudentParticipant(String name, String id) {
        super(name, id);
    }

    @Override
    public void Study() {
        System.out.println("Студент вдома вивчив матеріал");
    }
}
