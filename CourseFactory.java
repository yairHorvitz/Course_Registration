public class CourseFactory {
    public static Course createCourse(String courseType, String name, int idOfCourse, Lecturer lecturer) {

        switch (courseType) {
            case "CompulsoryCourse" -> {
                 return new CompulsoryCourse(name, idOfCourse, lecturer);

            }
            case "ElectiveCourse" -> {
                return new ElectiveCourse(name, idOfCourse, lecturer);

            }
            case "Seminar" -> {
                return new Seminar(name, idOfCourse, lecturer);
            }
            default -> throw new IllegalArgumentException("Unsupported course type: " + courseType);
        }
        }
    }
