import java.util.ArrayList;

public abstract class Course implements Subject {
   private String nameOfCourse;
   private int idOfCourse;
   private User lecturer;
   private int capacity;
   private ArrayList<Student> studentsInTheCourse;
   private ArrayList<Observer> TheCourseObservers;
    Course(String nameOfCourse, int idOfCourse, User lecturer)
    {
        this.nameOfCourse=nameOfCourse;
        this.idOfCourse=idOfCourse;
        this.lecturer= lecturer;
        studentsInTheCourse=new ArrayList<>();
        TheCourseObservers=new ArrayList<>();
    }
    protected void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    public void printCourseStudentsName()
    {
        for(Student student:studentsInTheCourse)
        {
            System.out.println(student.getName());
        }
    }
    public void registerCourse(Student student){
        if(studentsInTheCourse.size()<capacity){
            studentsInTheCourse.add(student);
            student.addCourse(this);
        }
        else{
            try {
                throw new Exception("Course is full");
            } catch (Exception e) {
                e.printStackTrace();
            }
          //  System.out.println("Course is full");
        }
    }
    public void unregisterCourse(Student student){
        if (!studentsInTheCourse.contains(student))
        {throw new IllegalArgumentException("Student is not in the course");}
        else{
            studentsInTheCourse.remove(student);
            if(studentsInTheCourse.size()<this.capacity){
                notifyObserver(this.nameOfCourse, this.idOfCourse);
            }
        }

    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public String getLecturerName() {
        return lecturer.getName();
    }

    public int getCapacity() {
        return capacity;
    }

    public void registerToObserver(Student studentObserver)
    {
        TheCourseObservers.add(studentObserver);
    }
    public void unregisterObserver(Student studentObserver)
    {
        TheCourseObservers.remove(studentObserver);
    }

    public int getIdOfCourse() {
        return idOfCourse;
    }

    public void notifyObserver(String nameOfCourse,int idOfCourse)
    {
        for(Observer observer:TheCourseObservers)
        {
            observer.update(nameOfCourse,idOfCourse, observer.getName());
        }

    }
    public void printCourseObserversName () {
        System.out.print("\nthe observers of the course are: ");
        for (Observer observer : TheCourseObservers) {
            System.out.print(observer.getName()+", ");
        }
    }
  /*      public void printCourseObserversName(Course course){
            for(Observer observer:TheCourseObservers)
            {
                System.out.println(observer.getName();
            }
        }
*/


}
