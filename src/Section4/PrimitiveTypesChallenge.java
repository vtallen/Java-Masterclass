package Section4;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
       byte byteVar = 10;

       short shortVar = 2000;

       int intVar = 300000000;

       long sumVars = (50_000l + 10l * (byteVar + shortVar + intVar));

       System.out.print(sumVars);
    }
}