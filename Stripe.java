public class Stripe implements Location {

    Color color = Color.red;

    int size = 10;
    String title = "Полоса";


    @Override
    public String getLocation() {
        return title;
    }
}
