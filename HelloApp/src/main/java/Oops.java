public class Oops {
    static class Student{
        String name;
        int age;
        void call(String nam, int ag ){
            this.name = nam;
            this.age = ag;
            System.out.println("Hello" + this.name);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student stud1 = new Student();
        Student stud2 = new Student();
        stud2.name = "Yashasvi";
        stud2.age = 18;

    }
}
