public class Room implements Location {

    int size = 100;
    String title = "Комната";

    @Override
    public String getLocation() {
        return title;
    }
}
