public class Main {
    public static void main(String[] args) {
        BuyHome buyHome = new BuyHome();
        buyHome.setNewHome(new Apartment());
        buyHome.executeBuyHome();

        buyHome.setNewHome(new Cottage());
        buyHome.executeBuyHome();

        buyHome.setNewHome(new MobileHome());
        buyHome.executeBuyHome();
    }
}