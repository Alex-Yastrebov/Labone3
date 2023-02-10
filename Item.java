public class Item extends Entity {
    Color color;
    int count;

    Item(int count, Color color, String name, Location location){
        super(name, location);
        this.count = count;
        this.color = color;
    }
}
