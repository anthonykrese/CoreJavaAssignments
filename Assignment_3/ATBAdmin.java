public class ATBAdmin extends ATB {

    String occupation;

    ATBAdmin () {

    }
    //Hierarchical Inheritance from ATB
    ATBAdmin(String name, int age, String gender, String country, String phone){
        super(name, age, gender, country, phone);

    }
    //Overriding ATB access method
    public static void access() {
        System.out.println("Hello! You have access to everything!");
    }

}
