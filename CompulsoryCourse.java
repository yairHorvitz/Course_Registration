public class CompulsoryCourse extends Course{
    public CompulsoryCourse(String name, int id, Lecturer lecturer) {// capacity check if it extend from course!!!!!!!!!!!!!!!!!!!!!!!!!!!
        super(name, id, lecturer);
       setCapacity(30);
    }

}
