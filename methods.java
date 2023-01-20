public class methods {
    static double gross_tax(double income){
        double tax = 0.4;
        if(income < 1){
            Double error = 0.0;
            return error; 
        }else{
            return income * tax ;
        }
    }
    static String full_name(String fname, String lname){
        String fullname ="you are: " + fname + " " + lname;
        return fullname;
    }
    static boolean checkAge(int age){
        boolean isVerified = (age < 18) ? false : (age >= 18)? true:false;
        return isVerified;
    }
    //method overloading
    //same name different parameters
    //preffered over defining two methods that do the same thing
    static int balance(int accbal,int bill){
        return accbal - bill;
    }
    static double balance(double accbal,double bill){
        return accbal - bill;
    }

    static void greeting(String name, int age){
        //void does not return value
        System.out.println("Greetings "+ name +"\raged: "+ age);
    }
    public static void main(String[] args ){
        //methods
        System.out.println("Lezz do it");
        //greeting("josh",21);
        //String user = full_name("joshua","kefa");
        //System.out.println(gross_tax(900));
        //System.out.println(balance(500,200));
        //profile person = new profile();
        //Car bmw = new Car("green");
        //bmw.Drive('n', 88,"km/hr"); 
        //bmw.Break(); 
        int pass = 990;
        boolean isVerified = (pass == 990)?true:false;
        if(isVerified){
            System.out.println("login was succesfull");
        }else{
            System.out.println("invlaid credentials \rWrong password ");
        }
    }
}
