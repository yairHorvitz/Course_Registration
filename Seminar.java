public class Seminar extends Course{
    public Seminar(String name, int id, Teacher lecturer) {
        super(name, id, lecturer);
        setCapacity(2);
    }

}
