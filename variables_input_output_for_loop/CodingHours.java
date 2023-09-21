public class CodingHours {
    public static void main(String[] args) {


        int seged = 6 * 5 * 17;
        int seged2 = 52 * 17;

        double percentage = ((double) seged / seged2) * 100;

        System.out.println("1.: "+seged+" h");
        System.out.println("2.: "+(double)Math.round(percentage*100)/100 +" %");


    }
}
