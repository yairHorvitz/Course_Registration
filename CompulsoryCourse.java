public class CompulsoryCourse extends Course{
    public CompulsoryCourse(String name, int id, Teacher lecturer) {
        super(name, id, lecturer);
       setCapacity(30);
    }

}
