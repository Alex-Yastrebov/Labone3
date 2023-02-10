
public abstract class Human extends Entity {
    boolean nicotineDependent;
    Gender sex;

    public Human(String name, Gender sex, boolean nicotineDependent, Location location) {
        super(name, location);
        this.sex = sex;
        this.nicotineDependent = nicotineDependent;
    }

    public void goTo(Location from, Location where) {
        if (from == where) {
            System.out.println(name + " уже находится в " + where.getLocation());
        } else {
            this.loc = where;
            System.out.println(name + " перешел из " + from.getLocation() + " в " + where.getLocation());
        }
    }

    public void toSee(Human who, Entity what) {
        System.out.println(who.name + " увидел " + what.name);
    }

    public String getSex() {
        return switch (sex) {
            case male -> name + " мужчина";
            case female -> name + " девушка";
            default -> "У " + name + " нет пола";
        };
    }


    public void toSmoke(Human human, Item item) {
        if (human.nicotineDependent == true) {
            System.out.println(human.name + " курит " + item.name);
        } else {
            System.out.println(human.name + " не курит");
        }
    }



    /*@Override
    public boolean equals(Object o){

    }

     */
}


