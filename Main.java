public class Main {
    public static void main(String[]args)
    {
       SystemFacade facade = new SystemFacade();

        Student student1 = new Student("John", 1, "joni@gmail.com",2);
        Student student2 = new Student("Doe", 2, "Doe1@gmail.com",1);
        Student student3 = new Student("Eithan Horvitz",3, "Eeitan@gmail.com",1);
        Student student4 = new Student("Moshe Horvitz",4, " Moshe@gmail.com",1);

        Lecturer lecturer1 = new Lecturer("Dan", 11, "lecture1@gmail.com");
        Lecturer lecturer2 = new Lecturer("Zanovski",10,"AsherZan@gmail.com");
        Lecturer lecturer3 = new Lecturer("Adi ",12,"Adipass@gmail.com");

        facade.loginToTheSystem(lecturer2);
        facade.addNewCourse("Seminar","Gmara", 111, lecturer2);
        facade.loginToTheSystem(lecturer3);
        facade.addNewCourse("CompulsoryCourse","Math", 112, lecturer3);
        facade.loginToTheSystem(student3);
        facade.registerToTheCourse(111,student3);
        RegistrationSystem.getRegistrationSystem().printCourseStudentsName(111);
        System.out.println("the lucture still:"+facade.getCourse(111).getLecturerName());
        System.out.println("after two years:");
        facade.loginToTheSystem(student4);
        facade.registerToTheCourse(111,student4);
        facade.loginToTheSystem(student1);
        facade.registerToObserver(111,student1);
        facade.loginToTheSystem(student2);
        facade.registerToObserver(111,student2);
        facade.unregisterCourse(111,student3);
        RegistrationSystem.getRegistrationSystem().printCourseStudentsName(111);
        facade.registerToTheCourse(111,student1);
        facade.printTheDataOfTheRegisteredSystem();
        facade.getCourse(111).printCourseObserversName();



        /* System.out.println("the name of the first student:"+student2.getName());
       facade.loginToTheSystem(lecturer1);
       facade.addNewCourse("ElectiveCourse", "Math", 1, lecturer1);
       facade.addNewCourse("ElectiveCourse", "Math", 1, lecturer1);*/
    }
}
