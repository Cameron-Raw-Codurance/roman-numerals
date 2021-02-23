public class RomanNumerals {
    public String convert(int i) {
        StringBuilder romanNumerals = new StringBuilder();
        if(i <= 3){
            for(int x = 0; x < i; x++){
                romanNumerals.append("I");
            }
        }
        if(i == 4){
            romanNumerals.append("IV");
        }
        if(i >= 5 && i < 9){
            romanNumerals.append("V");
            i -= 5;
            for(int x = 0; x < i; x++){
                romanNumerals.append("I");
            }
        }
        if(i == 9){
            romanNumerals.append("IX");
        }
        if(i == 10){
            romanNumerals.append("X");
        }
        return romanNumerals.toString();
    }
}
