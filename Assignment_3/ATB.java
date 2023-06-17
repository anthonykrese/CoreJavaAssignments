public class ATB {
     String name;
     int age;
     String gender;
     String country;
     String phone;


     ATB () {

     }
     ATB (String name, int age, String gender, String country, String phone){
          this.name = name;
          this.age = age;
          this.gender = gender;
          this.country = country;
          this.phone = phone;

     }
     //Overloading for Student with no phone number entered
     ATB (String name, int age, String gender, String country) {
          this.name = name;
          this.age = age;
          this.gender = gender;
          this.country = country;
     }

     public static void access() {
          System.out.println("Hello!");
     }


     public String toString() {
         return "ATB Student {name='" + name + "', age=" + age + "}";
     }

     public String myInstructor() {
          return "My instructor is Pramod Dutta.";
     }


}
