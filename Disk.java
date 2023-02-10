public class Disk implements Location {

    int size = 100;
    String title = "Disk";

    @Override
    public String getLocation() {
        return title;
    }
}
