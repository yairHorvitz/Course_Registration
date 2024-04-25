public interface FacadeStudentRegister {
    //Course searchCourse(int courseId); check if I need it
    void registerToTheCourse(int courseId,Student student);
    void unregisterCourse(int courseId, Student student);
    void registerToObserver(int courseId, Student student);
    void unregisterToObserver(int courseId, Student student);
    void loginToTheSystem(User user);
    void logoutFromTheSystem(User user);
    void addNewCourse(String type, String nameOfCourse, int idOfCourse, Lecturer lecturer);
    void removeCourse(int idOfCourse/*Course course that will be removed*/);

}
