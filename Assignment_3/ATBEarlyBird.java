public class ATBEarlyBird extends ATB {

    String occupation;

    ATBEarlyBird () {

    }
    //Single Inheritance from ATB
    ATBEarlyBird (String name, int age, String gender, String country, String phone, String occupation){
        super(name, age, gender, country, phone);
        this.occupation = occupation;

    }
    //Overriding ATBEarlyBird access method
    public static void access() {
        System.out.println("Hello! You have access to early bird materials!");
    }
        public String toString() {
            return "ATB Earlybird Student {name='" + this.name + "', age=" + this.age + ", country='" + this.country + "'}";

        }


}
