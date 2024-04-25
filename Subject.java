public interface Subject {
    void registerToObserver(Student studentObserver);
    void unregisterObserver(Student studentObserver);
    void notifyObserver(String nameOfCourse,int idOfCourse);
}
