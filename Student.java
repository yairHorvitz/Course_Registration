public class Student extends User implements Observer {
    int whichYearStudy;
    Student(String name, int id, String email, int whichYearStudy)
    {
        super(name,id,email);
        this.whichYearStudy=whichYearStudy;
    }

    @Override
    public void update(String nameOfCourse, int idOfCourse, String observerName){
        System.out.println("hellow: "+observerName+" the course: " + nameOfCourse+ " that the id is: "+idOfCourse+ " became available register fast before it is full");

    }

}
