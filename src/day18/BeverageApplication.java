package day18;

public class BeverageApplication {

    public static void main(String[] args){

        User manoj = new User("mkafley9@gmail.com","mkafley13","Pasword",20);
        try {
            manoj.registerUser();
        } catch (ageRestrictionException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block called");
        }
    }
}
