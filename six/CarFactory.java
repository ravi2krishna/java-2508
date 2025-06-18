package six;

public class CarFactory {
    public static void main(String[] args) {
        Car mahindaraCar = new Car(); // allocated memory to store mahindaraCar info
        mahindaraCar.carBrand = "Mahindra";
        mahindaraCar.carModel = "Thar";
        mahindaraCar.carPrice = 17.62;
        mahindaraCar.carColor = "Black";
        mahindaraCar.carOffer = 7.5;
        System.out.println("================ MAHINDRA THAR ================");
        mahindaraCar.displayCarInfoBanner();
        mahindaraCar.displayCarInfoPage();

    }
}
