public class Seminar extends Course{
    public Seminar(String name, int id, Lecturer lecturer) {// capacity check if it extend from course!!!!!!!!!!!!!!!!!!!!!!!!!!!
        super(name, id, lecturer);
        setCapacity(2);
    }

}
