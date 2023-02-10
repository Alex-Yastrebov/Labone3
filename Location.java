public interface Location {
    int size = 0;
    Color color = Color.noColor;
    String title = "";

     default String getLocation(){
         return title;
     }
}
