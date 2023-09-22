package sep16;

import java.util.Scanner;

public class RogersIVR {
    public static void main(String[] args){
        System.out.println("Welcome To Rogers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for English" + '\n' + "Press 2 for French");
        int language = scanner.nextInt();

        switch(language) {
            case 1:
               // System.out.println("Enter the Service");
                System.out.println("Speak in English");
                break;
            case 2:
                System.out.println("Speak in French");
                break;
        }
        System.out.println("Enter the Service");
        int service = scanner.nextInt();
                switch(service) {

                    case 1:
                            System.out.println("User Entered Internet");
                            System.out.println("Select 1 for New Connection" +  "Select 2 for Existing Connection" + "Select 3 for Bill Payment and 4 for Techincal Support");
                            int IOption = scanner.nextInt();
                            if (IOption == 1) {
                                System.out.println("User entered New Connection");
                            } else if (IOption == 2) {
                                System.out.println("User entered Existing Connection");
                            } else if (IOption == 3) {
                                System.out.println("USer Entered Bill Payment");

                            }
break;

                        case 2:
                            System.out.println("User Entered Mobile");
                            Scanner myObj = new Scanner(System.in);
                            System.out.println("Select SIM & Device support,Data,Talk and Text, Lost Repair and Warranty or Voicemail");
                            String MOption = myObj.nextLine();
                         if (MOption.equals("SIM & Device support")){
                             System.out.println("Remove your Sim and Put it back");
                         }
                         else if (MOption.equals("Data,Talk and Text"))
                         {
                             System.out.println("Use the app to check usage");
                         }
                         else if (MOption.equals("Lost Repair")){
                             System.out.println("Go to the Store");

                         }
break;
                        case 3:
                                System.out.println("User Entered TV");
                                Scanner myObj1 = new Scanner(System.in);
                                System.out.println("Select Ignite TV Or Digital TV");
                                String TvOption = myObj1.nextLine();
                                if (TvOption.equals("Ignite TV")) {
                                    System.out.println("For Setup & Install call the technician");
                                }
                                else if(TvOption.equals("Digital TV")){
                                        System.out.println("For Channels Click on How to Watch HD Channels");
                                }
break;

                    default:
                        System.out.println("To go back to the previous menu Press *");
                            }

                }

        }





