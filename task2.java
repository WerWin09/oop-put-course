public class task2 {


    public static class rectangle {
        int side1;
        int side2;
        
        rectangle (String c, String d)
        {this(Integer.parseInt(c),Integer.parseInt(d));}
        
        rectangle (int c, int d) 
        {this.side1= c;
        this.side2= d;}
        
    }





    public static void main(String args[]) 
    {
        rectangle FirstRectangle = new rectangle (10, 20);
        System.out.println ("Rectangle: ");
        System.out.println ("Side a: "+FirstRectangle.side1);
        System.out.println ("Side b: "+FirstRectangle.side2);
        System.out.println ("Field: "+FirstRectangle.side1*FirstRectangle.side2);
        
        rectangle Rectangle = new rectangle ("30", "2");
        System.out.println ("Rectangle: ");
        System.out.println ("Side a: "+Rectangle.side1);
        System.out.println ("Side b: "+Rectangle.side2);
        System.out.println ("Field: "+Rectangle.side1*Rectangle.side2);
    }
}
