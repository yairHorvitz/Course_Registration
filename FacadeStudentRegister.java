public interface FacadeStudentRegister {
    void registerToTheCourse(int courseId,Student student);
    void unregisterCourse(int courseId, Student student);
    void registerToObserver(int courseId, Student student);
    void unregisterToObserver(int courseId, Student student);
    void loginToTheSystem(User user,String password);
    void logoutFromTheSystem(User user);
    void addNewCourse(String type, String nameOfCourse, int idOfCourse, Teacher teacher);
    void removeCourse(int idOfCourse);

}
