public enum Color {
    red("Крассный"),
    grainy("Зернистый"),
    gray("Серый"),
    brown("Коричневый "),
    multicoloured("Разноцветный"),
    noColor("Бессцветный");


    String color;
    Color(String color) {
        this.color = color;
    }

    public String getName(){
        return color;
    }
}


