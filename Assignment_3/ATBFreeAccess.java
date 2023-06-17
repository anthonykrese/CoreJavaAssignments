
    public class ATBFreeAccess extends ATBEarlyBird {


        //Multilevel Inheritance from ATB and ATB EarlyBird
        ATBFreeAccess (String name, int age, String gender, String country, String phone, String occupation){
            super(name, age, gender, country, phone, occupation);


        }

        //Overriding ATBEarlyBird Access
        public static void access() {
            System.out.println("Hello! You have access to ATB, Automation and More!");
        }
        public String toString() {
            return "ATB Free Access Student {name='" + name + "', age=" + age + ", country='" + country + "'}";

        }
    }

