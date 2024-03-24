import java.util.Arrays;

public class ConvertTheTemperature {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Convert(36.50)));

    }
    public static double[] Convert(double celsius){
        double[] result = new double[2];
        result[0] = celsius+273.15;
        result[1] = celsius * 1.80 + 32.00;
        return result;
    }
}

