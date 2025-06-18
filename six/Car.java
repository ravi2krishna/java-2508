package six;

public class Car {

    // data of a car 
    String carBrand;
    String carModel;
    double carPrice;
    String carColor;
    double carOffer;

    // behaviours of short description of car
    public void displayCarInfoBanner(){
        System.out.println("Car Brand: "+carBrand);
        System.out.println("Car Model: "+carModel);
        System.out.println("Car Price: "+carPrice);  
    }

    // behaviours of long description of car
    public void displayCarInfoPage(){
        System.out.println("Car Brand: "+carBrand);
        System.out.println("Car Model: "+carModel);
        System.out.println("Car Price: "+carPrice);
        System.out.println("Car Colour: "+carColor);
        System.out.println("Car Offer: "+carOffer);
    }

    // TASK -> Implement CAR EMI CALCULATION
}
