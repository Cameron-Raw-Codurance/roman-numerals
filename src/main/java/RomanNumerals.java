public class RomanNumerals {
    public String convert(int i) {
        StringBuilder romanNumerals = new StringBuilder();
        for(int x = 0; x < i; x++){
           romanNumerals.append("I");
        }
        return romanNumerals.toString();
    }
}
