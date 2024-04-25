public class ElectiveCourse extends Course{
    public ElectiveCourse(String name, int id, Lecturer lecturer) {// capacity check if it extend from course!!!!!!!!!!!!!!!!!!!!!!!!!!!
        super(name, id, lecturer);
        setCapacity(40);
    }


}
