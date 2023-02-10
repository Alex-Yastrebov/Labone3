public class Street implements Location {
    int size = 2000;
    String title = "Улица";


    @Override
    public String getLocation() {
        return title;
    }
}
