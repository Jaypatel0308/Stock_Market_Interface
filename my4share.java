package all4share;
import java.io.*;
import java.util.*;

class my4share{
  public static void main(String args[]){

    //Companies comp=new Companies;
    pattern.logo();
    Scanner sc=new Scanner(System.in);
	System.out.println();
    System.out.print("Are you an existing user? [yes/no] - ");
    String yesno=sc.nextLine();
    System.out.println();

    if(yesno.equalsIgnoreCase("no")){
      newUser add=new newUser();
    }

    UserFile me= new UserFile();
    displayMenu disp= new displayMenu(me);
    disp.mainmenu();

    //as soon as the user will login with a user id all the companies wishlisted or invested will show its current rates

  }

}
