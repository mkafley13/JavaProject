package day18;

public class User {

    private String email;
    private String username;
    private String password;
    private int age;

    public User(String email, String username, String password, int age) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public void registerUser() throws ageRestrictionException{
        validation();
      //  if (age < 18){
         //   System.out.println("Your age is less than 18, you can not register");
           // return;
           // throw new ageRestrictionException("Your age is less than 18, you can not register");
       // }
        System.out.println("User registered successfully");
    }
    public void validation() throws ageRestrictionException{
        if (age < 18){
            //   System.out.println("Your age is less than 18, you can not register");
            // return;
            throw new ageRestrictionException("Your age is less than 18, you can not register");
        }

    }
}
