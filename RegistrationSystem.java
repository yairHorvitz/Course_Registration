import java.util.ArrayList;

public class RegistrationSystem  {
    private static RegistrationSystem instance;
    private ArrayList<Course> courses;
    private ArrayList<User> users;
    private int capacity;
    ArrayList<User> onLineCounter;

    private RegistrationSystem() {
        capacity = 100;
        courses = new ArrayList<>();
        users = new ArrayList<>();
        onLineCounter = new ArrayList<>();
    }

    public static RegistrationSystem getRegistrationSystem() {
        if (instance == null) {
            instance = new RegistrationSystem();
        }
        return instance;
    }

    public void addNewCourse(String type, String nameOfCourse, int idOfCourse, Teacher lecturer)throws IllegalArgumentException {
        if (!lecturer.getOnline()) {
            throw new IllegalArgumentException("Teacher is not online");
        }
        if (type == null) {
            throw new IllegalArgumentException(" this type of course is not available");
        }
        for(Course course: courses){
            if(course.getIdOfCourse()==idOfCourse){
                throw new IllegalArgumentException("this idOfCourse exist");
            }
        }
        Course course = getCourse(idOfCourse);
        if (course == null) {
            Course newCourse = CourseFactory.createCourse(type, nameOfCourse, idOfCourse, lecturer);
            courses.add(newCourse);
        }
    }

    public Course getCourse(int idOfCourse) {
        boolean courseExists = false;

        for (Course course : courses) {
            if (course.getIdOfCourse() == idOfCourse) {
                courseExists = true;
                return course;
            }
        }
        return null;
    }
       public void printCourseStudentsName ( int idOfCourse){
            Course course = getCourse(idOfCourse);
            if (course == null) {
                throw new IllegalArgumentException("Course does not exist");
            }
            else {
                course.printCourseStudentsName();
            }

        }


    public void removeCourse(int idOfCourse) {
        Course course = getCourse(idOfCourse);
            if (course!= null) {
                courses.remove(course);
            }
        }


  //  @Override
    public void registerToTheCourse(int idOfCourse, Student student) {
        if (!student.getOnline()) {
            throw new IllegalArgumentException("Student is not online");
        }
        Course course = getCourse(idOfCourse);
        if (course == null) {
            throw new IllegalArgumentException("Course does not exist");
        }
        course.registerCourse(student);
    }

  //  @Override
    public void unregisterCourse(int courseId, Student student) {
        Course course = getCourse(courseId);
        if (course != null) {
            course.unregisterCourse(student);
        }
    }

   // @Override
    public void registerToObserver(int courseId, Student student) {
        if(!student.getOnline()){throw new IllegalArgumentException("Student is not online");}//be sure that the student is online
        Course course = getCourse(courseId);
        if (course != null) {
            course.registerToObserver(student);
        }

    }

  //  @Override
    public void unregisterToObserver(int courseId, Student student) {
        if(!student.getOnline()){throw new IllegalArgumentException("Student is not online");}
        Course course = getCourse(courseId);
        if (course != null) {
            course.unregisterObserver(student);
        }
    }

   // @Override
    public void loginToTheSystem(User user,String password) {
        if(!password.equals(user.getPassword())) {
            throw new IllegalArgumentException("Wrong password");}
        if (onLineCounter.size() <= capacity) {
            if (!user.getOnline()) {
                user.setOnline(true);
                onLineCounter.add(user);
            }
        }
        else{
            System.out.println("Sorry the system is full");
        }

    }

   // @Override
    public void logoutFromTheSystem(User user) {
        if (user.getOnline()) {
            user.setOnline(false);
            onLineCounter.remove(user);
        }
    }




    public void printTheDataOfTheRegistrationSystem() {
        System.out.print("RegistrationSystem:\ncourses:" );
        for(Course course: courses) {
            System.out.println(course.getNameOfCourse());
        }
        System.out.println("users:");
        for( User user: users){System.out.print(user.getName());}
        System.out.println("capacity=" + capacity);
        System.out.print("onLineusers: ");
        for (User user: onLineCounter){System.out.print(user.getName()+",");}
    }
}

