package all4share;
import java.io.*;
import java.util.Scanner;

class User{

   String username;
   String password;
   private static File grahak=new File("grahak.txt");
   Scanner sc= new Scanner(System.in);

    User(){

      try{
        grahak.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }

      initializer();

    }

    void initializer(){
		System.out.println();
		System.out.println();
      System.out.println("Please enter your login details");
      System.out.println();
	  System.out.print("Username: (Do not use space!)");
      String u=sc.nextLine();
      System.out.print("Password: (Do not use space!)");
      String p=sc.nextLine();

      Checker check=new Checker();
      if(check.detailsCheck(u,p)){
        this.username=u;
        this.password=p;
        System.out.printf("\nPassword matched!");
		System.out.println("Now you are loged in.");
      }
      else{
        System.out.println("Username or Password incorrect!");
        System.out.print("Enter 'yes' to create a new account[yes/no]: ");
        String yessno=sc.nextLine();
        if(yessno.equalsIgnoreCase("yes")){
           newUser naya=new newUser();
         }
        else initializer();
      }
    }
   //MyCompany invest1=new MyCompany;

}
