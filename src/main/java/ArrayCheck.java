public class ArrayCheck {
    public static void main(String[] args) {
        String[] arrays = {"b", "7", "h", "6", "h", "k", "i", "5", "g", "7", "8"};
        String[] arrays2 = {"7", "b", "8", "5", "6", "9", "n", "f", "y", "6", "9"};
        String[] arrays3 = {"u", "h", "b", "n", "7", "6", "5", "1", "g", "7", "9"};
        System.out.println("Soal 1 Jumlah Angka Pada String : " + count(arrays));
        System.out.println("Soal 2 Jumlah Angka Pada String : " + count(arrays2));
        System.out.println("Soal 3 Jumlah Angka Pada String : " + count(arrays3));
    }

    public static int count(String[] sum){
        int tampung = 0;
        int tampungNumber = 0;

        for(int i = 0; i < sum.length; i++){
            try{
                int j = Integer.parseInt(sum[i]);
                tampung++;
            }catch (NumberFormatException e){
                tampungNumber++;
            }
        }
        return tampung;
    }
}

