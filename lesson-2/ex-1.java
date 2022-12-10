public class task3{
    

        public static class Game{
            private String name;
            private String platform;
            private int parts;

            Game(String nameG, String formG, int partsG) {this.name=nameG; this.platform=formG; this.parts=partsG;}
        
        }


    public static void main(String[] args) {
        Game game1 = new Game("Skyrim", "steam", 1);


        System.out.println("Name: " +game1.name);
        System.out.println("Platform: " +game1.platform);
        System.out.println("Parts: " +game1.parts);
        
    }


}
