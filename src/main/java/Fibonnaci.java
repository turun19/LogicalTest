public class Fibonnaci {
    public static void main(String[] args) {
        int number = 15;
        int[] input = new int[number];

        input[0] = 0;
        input[1] = 1;

        for (int i = 2; i < number; i++){
            input[i] = input[i - 1] + input[i -2];
        }

        for (int i = 0; i < number ; i++){
            System.out.println(input[i] + " ");
        }
    }
}
