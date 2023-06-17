
public class Main {
    public static void main(String[] args) {

        // Overloading & Polymorphism - subclasses as objects of parent class
        ATB[] students = new ATB[5];
        students[0] = new ATB("John", 27, "Male", "Brazil", "282 8288");
        students[1] = new ATBEarlyBird("Bob", 34, "Male", "Canada", "383 8383", "Builder");
        students[2] = new ATBAdmin("Shiva", 29, "Female", "India", "989 8987");
        students[3] = new ATBFreeAccess("Juan", 30, "Male", "Spain", "888 8888", "Manual Tester");
        students[4] = new ATB("Lina", 31, "Female", "Italy", "444 4444");

        // Overriding from ATB
        ATBEarlyBird.access();
        ATBFreeAccess.access();
        ATBAdmin.access();
        System.out.println();

        students[2].myInstructor();
        students[2].access();

        // Using the toString method
        System.out.println(students[0]);
        // Overriding the toString method
        System.out.println(students[1]);
        System.out.println(students[3]);
        System.out.println();

        // Multilevel inheritance from ATB > EarlyBird > FreeAccess
        System.out.println(students[3].myInstructor());


    }

}