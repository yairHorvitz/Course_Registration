public class Lecturer extends User {

    public Lecturer(String name, int idOfCourse, String email) {
        super(name, idOfCourse, email);
    }// check to student be a father
    public void createCourse(String courseName, String name, int idOfCourse) {//check if this right
        CourseFactory.createCourse(courseName, name, idOfCourse, this);

    }
}
