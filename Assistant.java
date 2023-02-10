public class Assistant extends Human{


    public Assistant(String name, Gender sex, boolean nicotineDependent, Location location) {
        super(name, sex, nicotineDependent, location);
    }


    public void summon(Human who){
        if (who.loc == this.loc){
            System.out.println(who.name + "уже находится в " + this.loc.getLocation());
        } else {
            System.out.println(name + " призвал " + who.name + " в " + this.loc.getLocation());
            //who.goTo(who.loc, this.loc);
        }
    }
}