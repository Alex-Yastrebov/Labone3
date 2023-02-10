public abstract class Entity {

    String name;
    Location loc;

    public Entity(String name, Location location) {
        this.name = name;
        this.loc = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return loc.getLocation();
    }

    @Override
    public String toString(){
        return name + " находится в " + loc.getLocation();
    }

    @Override
    public int hashCode(){
        int hash = loc.size;
        hash = 31 * hash + (name != null ? name.hashCode() : 0 );
        hash = 31 * hash + (loc.getLocation() != null ? loc.getLocation().hashCode() : 0 );
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        Entity entity = (Entity) obj;
        return entity.hashCode() == this.hashCode();
    }
}