public class BuyHome {
    private NewHome newHome;
    public void setNewHome(NewHome newHome) {
        this.newHome = newHome;
    }
    public void executeBuyHome(){
        System.out.println(newHome.typeOfHome());
        System.out.println(newHome.getPrice());
    }
}
