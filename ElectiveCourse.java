public class ElectiveCourse extends Course{
    public ElectiveCourse(String name, int id, Teacher lecturer) {
        super(name, id, lecturer);
        setCapacity(40);
    }


}
