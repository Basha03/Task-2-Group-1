import javax.swing.*;
import java.util.Scanner;
import static java.lang.System.*;/*


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Razia
 */


   public class Login {
   static int runs ;
public static String popup_menu = "What would you like to do? \n1. Add tasks\n2. Show report \n3.Quit " ,
     popup_confirmation = " do you still wish to continue? " ;    
   
    //TODO code application logic here
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        System.out.println(" enter your first name:");
        String Firstname=input.nextLine();
        
        System.out.println("Firstname + enter last name:");
        String LastName=input.nextLine();
        
        System.out.println("please enter your Username:");
        String UserName=input.nextLine();
        checkUserNameComplexity(UserName);
        
        System.out.println(" please enter your Password:");
        String Password=input.nextLine();
        
        checkPasswordComplexity(Password);
        System.out.println("Succesful");
        
    System.out.println("please enter your username:");
    String inpRegUser=input.nextLine();
       
    System.out.println(" enter your password:");
    String inpPassword=input.nextLine();
    
    
    
    /**
     * @param args the command line arguments
     */
    
     
     // to invoke methods from the class
        Task Task_Obj = new Task() ;
         /* funnelled here so compiler knows
            the set number of runs to do.
        */
        Task[] assoc ;
        // promptings are done.
        int select = Integer.parseInt(JOptionPane.showInputDialog(null,"Welcome to EasyKanban \n" + popup_menu));
        do
        {
          if (select == 2)
        {
             JOptionPane.showMessageDialog(null , " feature's are still in development - coming soon!!");
             // the method goes here.
               select = JOptionPane.showConfirmDialog(null ,popup_confirmation);
               switch (select) {
                case JOptionPane.NO_OPTION : exit(100); break ;
                case JOptionPane.CANCEL_OPTION : select = 0; break ;
                default:
                select = Integer.parseInt(JOptionPane.showInputDialog(null , popup_menu));
                break ;
                }
      
      }
      /* if user goes for option number 3.
      looking at the menu table which is to quit the application,
      this code below directs the to terminate the program.*/
      else if (select == 3)
                {
      //method goes here.
      select = JOptionPane.showConfirmDialog(null,popup_confirmation);
      switch (select) {
      case JOptionPane.NO_OPTION: exit(100); break ;
      case JOptionPane.CANCEL_OPTION: select = 0; break ;
      default :
      select = Integer.parseInt(JOptionPane.showInputDialog(null, popup_menu));
       break ;
                }
            }
              else if (select == 1)
         {
     runs = select = Integer.parseInt(JOptionPane.showInputDialog("state set number of runs: "));
     assoc = new Task[runs] ; /* number of runs as stated. */
     //invoke method.
    Task_Obj.Enroll_inputs(assoc, runs);
    select = JOptionPane.showConfirmDialog(null,popup_confirmation);
    switch (select) {
    case JOptionPane.NO_OPTION: exit(100); break ;
    case JOptionPane.CANCEL_OPTION: select = 0; break ;
    default :
    select = Integer.parseInt(JOptionPane.showInputDialog(null, popup_menu));
    break ;
                }
         }
/* if user enters an option not valid,
  application is to make user re-enter their election again. */
   else   {
     select = Integer.parseInt(JOptionPane.showInputDialog(null, "input is not supported.please do try again. \n"+popup_menu) );
              }
        } while ((select == 3));
    }


    
    //username is prompt by the user correctly 
   public static boolean checkUserNameComplexity(String UserName){
        
     boolean underscore=false;
     boolean Length=false;
     
     for(int i=0; i< UserName.length(); i++){
         if(UserName.charAt(i)==95){
         underscore=true;
         }
         if(UserName.length() <=5){
         Length=true;
         }
     }
     if(underscore && Length== true){
         
     //"UserName is successful!!"
     }
     else
     {
    // "UserName is not successful" ;
     }
     return true;
    }
    //this is a password complexity check for a correct password
     public static boolean checkPasswordComplexity(String Password){
    
     boolean uppercase=false;
     boolean digit=false;
     boolean specialcharacter=false;
     boolean length=false;
    
      for(int i=0; i< Password.length(); i++){
          
      if(Password.charAt(i) >=65 && Password.charAt(i) <=90){
     uppercase=true;
     }
      
     if(Password.charAt(i) >=48 && Password.charAt(i) <=57){
     digit=true;
     }
     
     if(Password.charAt(i)>=33 && Password.charAt(i)<=47 || Password.charAt(i)>=58 && Password.charAt(i)<=64 || Password.charAt(i)>=91 && Password.charAt(i)<=96 || Password.charAt(i)>=123 && Password.charAt(i)<=126)
     specialcharacter=true;
    
    if(Password.length() >=8){
     length=true;
    }
    }
    
    if(uppercase && digit && specialcharacter && length){
    System.out.println(" password successful:");
}
   else
{
System.out.println(" incorrect complexity");
}
return true;
    }
//this is to check if the user registered is on the system 
     
     
public static String registerUser(String UserName, String Password){


  if(checkUserNameComplexity(UserName) && checkPasswordComplexity(Password)==true){

System.out.println("YOU ARE REGISTERED!");
}
   else
 {
System.out.println("Password or Username is incorrect");
 }
return "Registered"; 
  }
//Registered user must meet all required steps to be successful logged in
public static boolean LoginUser (String UserName, String Password,  String insPassword,String insRegUser ){
boolean logUser=false;
boolean logPass=false;

if(UserName.equals(insRegUser)){

logUser=true;
   }

     if(Password.equals(insPassword)){//ins is where the user inserts the password
   logPass=true;
     }
     
   else{
    return false;
} 
 return true;       
}

//A login status for the successful registered user
public static String LoginStatus(String UserName, String Password, String inpRegUser, String inpPassword){
    
    if(inpRegUser.equals(UserName)&& inpPassword.equals(Password)==true){
        return ("Failed login");
       }
    else{
        return("Successful Login");

   }

 }

}

        
        
        
    

