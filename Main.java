public class Main {
    public static void main(String[]args)
    {//There are certain lines in the code where I chose not to use a facade pattern for them.
     // This decision was made to avoid imposing constraints on users of the host system.
       SystemFacade facade = new SystemFacade();
        Student student1 = new Student("John", 1, "111","joni@gmail.com",2);
        Student student2 = new Student("Doe", 2, "222","Doe1@gmail.com",1);
        Student student3 = new Student("Eithan Horvitz",3, "333","Eeitan@gmail.com",1);
        Student student4 = new Student("Moshe Horvitz",4, "444"," Moshe@gmail.com",1);

        Practitioner practitioner1 = new Practitioner("Dan", 11, "1111","Dan@gmail.com");

        Lecturer lecturer2 = new Lecturer("Zanovski",10,"1010","AsherZan@gmail.com");
        Lecturer lecturer3 = new Lecturer("Adi ",12,"1212","Adis@gmail.com");

        facade.loginToTheSystem(practitioner1,"1111");
        facade.addNewCourse("ElectiveCourse","liniarit",000,practitioner1);
        facade.loginToTheSystem(lecturer2, "1010");
        facade.addNewCourse("Seminar","Gmara", 111, lecturer2);
        facade.loginToTheSystem(lecturer3, "1212");
        facade.addNewCourse("CompulsoryCourse","Math", 112, lecturer3);
        facade.loginToTheSystem(student3, "333");
        facade.registerToTheCourse(111,student3);
        RegistrationSystem.getRegistrationSystem().printCourseStudentsName(111);
        System.out.println("the lucture still:"+facade.getCourse(111).getLecturerName());
        facade.loginToTheSystem(student4, "444");
        facade.registerToTheCourse(111,student4);
        facade.loginToTheSystem(student1, "111");
        facade.registerToTheCourse(111,student1);// return exception the course is full
        facade.registerToObserver(111,student1);
        facade.loginToTheSystem(student2, "222");
        facade.registerToObserver(111,student2);
        facade.unregisterCourse(111,student3);
        RegistrationSystem.getRegistrationSystem().printCourseStudentsName(111);
        facade.registerToTheCourse(111,student1);
        facade.printTheDataOfTheRegisteredSystem();
        facade.getCourse(111).printCourseObserversName();

    }
}
