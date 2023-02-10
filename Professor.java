public class Professor extends Human {

    Gender sex = Gender.male;

    public Professor(String name, Gender sex, boolean nicotineDependent, Location location) {
        super(name, sex, nicotineDependent, location);
    }

    public void zoomIn(Item what, Item where) {
        if (what == where) {
            System.out.println("Нельзя приблизить " + what.getName() + " к " + where.getName());
        } else {
            System.out.println(getName() + " приблизил " + what.getName() + " к " + where.getName());
        }
    }

    public void toStudy(Entity what){
        System.out.println(name + " изучает " + what.getName());
    }
}