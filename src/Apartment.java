public class Apartment implements NewHome {
    @Override
    public int getPrice() {
        return 1500;
    }

    @Override
    public String typeOfHome() {
        return "Apartment";
    }
}
