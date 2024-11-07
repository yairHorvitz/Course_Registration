public class SystemFacade implements FacadeStudentRegister{
    @Override
    public void registerToTheCourse(int courseId, Student student) {
        RegistrationSystem.getRegistrationSystem().registerToTheCourse(courseId, student);
    }

    @Override
    public void unregisterCourse(int courseId, Student student) {
        RegistrationSystem.getRegistrationSystem().unregisterCourse(courseId,student);
    }


    @Override
    public void registerToObserver(int courseId, Student student) {
        RegistrationSystem.getRegistrationSystem().registerToObserver(courseId, student);
    }

    @Override
    public void unregisterToObserver(int courseId, Student student) {
        RegistrationSystem.getRegistrationSystem().unregisterToObserver(courseId, student);
    }

    @Override
    public void loginToTheSystem(User user,String password){
        RegistrationSystem.getRegistrationSystem().loginToTheSystem(user,password);
    }

    @Override
    public void logoutFromTheSystem(User user) {
        RegistrationSystem.getRegistrationSystem().logoutFromTheSystem(user);
    }

    @Override
    public void addNewCourse(String type, String nameOfCourse, int idOfCourse, Teacher teacher) {

        RegistrationSystem.getRegistrationSystem().addNewCourse(type, nameOfCourse, idOfCourse, teacher);
    }

    @Override
    public void removeCourse(int idOfCourse) {
        RegistrationSystem.getRegistrationSystem().removeCourse(idOfCourse);
    }
    public Course getCourse(int idOfCourse){
        return RegistrationSystem.getRegistrationSystem().getCourse(idOfCourse);
    }
    public void printTheDataOfTheRegisteredSystem(){
        RegistrationSystem.getRegistrationSystem().printTheDataOfTheRegistrationSystem();
    }

}
