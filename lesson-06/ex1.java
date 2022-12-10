public class Main
{
    
    
    public class Calculations {
        int a;int b;
        int max=0;
        int min=0;
        float avg;
    }
    
    
    
    public static void main(String[] args) {
        Calculations first = new Calculations();
        first.a=10;
        first.b=15;
        if(first.a<first.b){first.min=first.a;first.max=first.b;}else{first.max=first.a;first.min=first.b;}
        first.avg=(first.min+first.max)/2;
        System.out.println ("max="+first.max+"\n min="+first.min+"\n avg="+first.avg);
        
        
        
    }
    
}
