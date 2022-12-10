public class Main
{ 

    
    public interface Currency {
        Currency addedCurrency(float value, String currency);
        Currency subtractedCurrency(float value, String currency);
        String abbreviation();
        String symbol();
        String balance();
        float toDollarExchangeRate();
    }


    import java.util.HashMap;

    public class FakeCantor {
        private final HashMap<String, Float> rates = new HashMap<>() {{put("USD", 1.0366f);put("GBP", 0.87063f);put("CHF", 0.9881f);put("JPY", 145.12f);}};
        public float euroToRate(String currency) {return this.rates.get(currency);}
        public FakeCantor() {}
    }
   

    public class euro implements Currency{
        public String abbreviation () { return "EUR";}
        public String symbol() { return "€"; }
        public float toDollarExchangeRate() {return FakeCantor.euroToRate("USD");}
        
    }
    
    
    public static void main(String[] args) {
        
    }
}
