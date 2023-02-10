public class Main {
    public static void main(String[] args) {
        Location room = new Room();
        Location street = new Street();
        Location stripe = new Stripe();
        Location beamloc = new Beam();

        Item cigarette = new Item(1, Color.noColor, "сигарета", room);
        Item eyepiece = new Item(1, Color.noColor, "окуляр", room);
        Item eye = new Item(1, Color.noColor, "глаз", room);
        Item beam = new Item (1, Color.red, "луч", beamloc);

        Amoeba amoeba = new Amoeba("Амеба", beamloc, Color.grainy);
        Professor professor = new Professor("Профессор", Gender.male, true, room);
        Assistant assistant = new Assistant("Ассистент", Gender.male, false, room);

        professor.zoomIn(eye, eyepiece);
        professor.toSee(professor, beam);
        professor.toSee(professor, amoeba);
        assistant.summon(professor);
        System.out.println(amoeba.wallow(beamloc));
        amoeba.toAppear(23);
        System.out.println(amoeba.reachOut(Color.gray.getName(), stripe));
        amoeba.fight();
        amoeba.reproduction(beamloc);
        professor.goTo(room, street);
        amoeba.reborn();
        professor.toSmoke(professor,cigarette);
        professor.goTo(street, room);
        professor.toStudy(amoeba);
        professor.toStudy(beam);
    }
}