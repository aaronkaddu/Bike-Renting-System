package rental;

public class Rental {

    String renterName;
    String rentalDuration;
    String bikeType;
    int insurance;
    int bikeGps;
    double rentalSubTotal;
    double rentTax;
    double totalAmount;
    double bikeAmount;
    double extraAmount; //for GPS or Insurance

    //Our Names as variables
    String firstMember = "Deep 1236587921";

    //overloading my method
    public void showResults(){
        //empty method
    }

    public void showResults(String renterName, String bikeType, String rentalDuration){
        //method taking three parameters and display the details
        this.renterName = renterName;
        this.bikeType = bikeType;
        this.rentalDuration = rentalDuration;

        //Display these results when method is called
        System.out.println("Hello " + renterName + ", thanks for renting " + bikeType + " for " + rentalDuration + " hours");
    }

    public void showResults(int insurance,int bikeGps){
        //computing the GPS and insurance charges
        this.insurance = insurance;
        this.bikeGps = bikeGps;

        if(insurance == 0){ //if insurance is true
            extraAmount = 3;
            System.out.print("Insurance: " + " Required ");
        }else if(insurance == 1){ //if insurance is false
            extraAmount = 0;
            System.out.print("Insurance: " + " Not Needed");
        }

        //Bike Gps
        if(bikeGps == 0){ //if you need bikeGPS
            extraAmount = 5;
                System.out.println("GPS: " + " Required ");
            }else if(bikeGps == 1){ //if you don't need a bike GPS
            extraAmount = 0;
                System.out.println("GPS: " + " Not Needed");
            }
        }

        public void showResults(String bikeType, String rentalDuration){
        //computing the Amounts
            int hourRate = Integer.parseInt(rentalDuration);
            this.bikeType = bikeType;
            this.rentalDuration = rentalDuration;

            //Selecting Bike Type and computing
            switch(bikeType){
                case "Mountain bike":
                    bikeAmount = 10.5 * hourRate;
                    break;
                case "7-speed race bike":
                    bikeAmount = 13.0 * hourRate;
                    break;
                case "Tandem bike":
                    bikeAmount = 15.0 * hourRate;
                    break;
                default:
                    System.out.println("No Bike Type");
            }
            //computing rental subtotal for renting the bike
            rentalSubTotal = bikeAmount + extraAmount;
            System.out.println("Rental Subtotal: $" + rentalSubTotal); //outputs it to the console

            //computing rental Tax for borrowing the tax and the tax rate is 5% of the amount
            rentTax = rentalSubTotal * 5/100;
            System.out.println("Tax Amount: $" + rentTax);

            //computing the total Amount of everything tax including subtotal and tax
            totalAmount = rentTax + rentalSubTotal;
            System.out.println("Total Amount: $" + totalAmount);

            /*
            * Dont forget to output your names here make variables of your names and output them here
            * e.g i will use one name*/
            System.out.println("Program code by : " + firstMember);

        }

//Getters and Setters
    public String getRenterName() {
        return renterName;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }

    public String getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(String rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public int isInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    public int isBikeGps() {
        return bikeGps;
    }

    public void setBikeGps(int bikeGps) {
        this.bikeGps = bikeGps;
    }

    public double getRentalSubTotal() {
        return rentalSubTotal;
    }

    public void setRentalSubTotal(double rentalSubTotal) {
        this.rentalSubTotal = rentalSubTotal;
    }

    public double getRentTax() {
        return rentTax;
    }

    public void setRentTax(double rentTax) {
        this.rentTax = rentTax;
    }
}
