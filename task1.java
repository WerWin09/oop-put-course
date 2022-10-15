public class task1 {
    
    public static class rectangle {
    int side1;
    int side2;
    int fieldR;
    }


    public static class triangle {
    int side;
    int hight;
    int fieldT;

    }

    public static void main(String[] args) {
        rectangle red = new rectangle ();
        red.side1=5;
        red.side2=10;
        System.out.println ("Rectangle: ");
        System.out.println ("Side a: "+red.side1);
        System.out.println ("Side b: "+red.side2);
        }

}
