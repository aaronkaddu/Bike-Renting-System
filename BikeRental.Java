package rental;

import javax.swing.*;

public class BikeRental {


    public static void main(String [] args){

        //JFrame here isn't strictly
        JFrame frame = new JFrame("Input Diaglog Example");

        //prompt the user to their name
        String name = JOptionPane.showInputDialog(frame, "Please Enter Your Name?");


        //prompt the user to enter Number of hours
        String hours = JOptionPane.showInputDialog(frame, "How many hours do you want to rent?");
        int hourRate = Integer.parseInt(hours);

        //Choose Bike Type
        //this helps in choosing the bike you need
        String [] choices = {"Mountain bike","7-speed race bike","Tandem bike"};
        String input = (String) JOptionPane.showInputDialog(null, "1:Mountain bike, 2:7-speed race bike, 3:Tandem bike", "Choosing a Bike Type",
                JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);


        //Insurance J Dialog starting
        int insurance = JOptionPane.showConfirmDialog(null, "Do you need Insurance?", "INSURANCE", JOptionPane.YES_NO_CANCEL_OPTION);


        //GPS dialog
        int gps = JOptionPane.showConfirmDialog(null, "Do you need a GPS?", "GPS", JOptionPane.YES_NO_CANCEL_OPTION);

            //we instatitated an object from teh RentalXXXX class.
        /*
        * Through this object we were able to call the methods from the Rental Class
        * because in the rental class its where we compute our results from
        * */
            RentalXXXX object = new RentalXXXX();
            object.showResults(name,input,hours);
            object.showResults(insurance,gps);
            object.showResults(input,hours);

    }
}
