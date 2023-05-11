package class12;

public class task {
    public static void main(String[] args) {
        String userName="Axwell";
        String password="pass123";
        String confirmpassword="pass123";
        if (userName.isBlank()&&password.isBlank()){
            System.out.println("Username or Password cannot be empty");

        }else if (password.length()<8){
            System.out.println("Password is too short");
        }else if (password.contains(userName)){
            System.out.println("Password cannot contain username");

        }else if (!password.equals(confirmpassword)){
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }
    }
}
