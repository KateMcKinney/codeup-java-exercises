package movies;
public class Movie {

    private String name;
    private String category;

    // USE COMMAND + N TO MAKE ALL THIS STUFF

    public Movie (String x, String y){ //constructor
        this.name = x;
        this.category = y;
    }
        // Get and set name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Get and set category
        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
}