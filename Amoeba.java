
public class Amoeba extends Entity {
    int count = 0;
    int size = 2;
    boolean anger;
    boolean alive;
    Color color;

    public Amoeba(String name, Location location, Color color) {
        super(name, location);
        this.color = color;
    }


     public void goTo(Location from, Location where){
        if (from == where){
            System.out.println(name + " уже находится в " + where.title);
        } else {
            this.loc = where;
            System.out.println(name + " перешел из " + from.title + " в " + where.title);
        }
    }

    public void toAppear(int count){
        this.count = this.count + count;
        alive = true;
        System.out.println(name + " появилась! И теперь их " + this.count);
    }

    public String reachOut(String color, Location location){
        return color + " " + this.name + " тянулись к " + location.color.getName() + " " + location.getLocation();
    }

    public String getColor(){
        return switch (color) {
            case red -> name + " красный";
            case grainy -> name + " зернистый";
            case gray -> name + " серый";
            case brown -> name + " коричневый";
            case multicoloured -> name + " разноцветный";
            default -> "У " + name + " нет цвета";
        };
    }
    public void reproduction(Location loc){
        if (loc.size > this.count * this.size){
            this.count = loc.size + this.count;
            System.out.println("Количество " + name + " стало больше размеров " + loc.getLocation());
        } else {
            System.out.println("Количество " + name + " стало больше размера " + loc.getLocation());
        }
    }

    public void reborn(){
        count = count*2;
        System.out.println( name + " почкуется. Количество возрасло");
    }

    public String wallow(Location location){
        return color.getName() + " " + name + " лежит на " + location.getLocation();
    }

    public void fight(){
        this.count = this.count/2;
        this.size = this.size * 2;
        boolean anger = true;
        System.out.println("Началась борьба. Количество " + name + " = " + this.count + ". Размер = " + this.size + ". Оставшиеся в живых озверели");
    }
}
