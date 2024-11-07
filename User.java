import java.util.ArrayList;

public abstract class User {
    private String name;
    private int id;
    private boolean isOnline;
    private String email;
    private String password;
    ArrayList<Course> courses;
    protected User(String name, int id, String password, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        courses = new ArrayList<>();
        isOnline = false;


    }

    public boolean getOnline() {
        return isOnline;
    }
    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }


    public ArrayList<Course> getCourses() {
        return courses;
    }

    void addCourse(Course course)
    {
        courses.add(course);
    }
}
