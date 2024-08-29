public class NilaiSaham {
    public static int profit(int[] prices){
        if(prices == null || prices.length == 0){
            return 0;
        }
        int price = prices[0];
        int profit = 0;

        for(int i = 1; i< prices.length; i++){
            if(prices[i] < price){
                price = prices[i];
            }else {
                int keuntungan = prices[i] - price;
                if(keuntungan > profit){
                    profit = keuntungan;
                }
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] question1 = {7,8,3,10,8};
        int[] question2 = {5,12,11,12,10};
        int[] question3 = {7,18,27,10,29};
        int[] question4 = {20,17,15,14,10};

        System.out.println("Soal 1 : " + profit(question1));
        System.out.println("Soal 2 : " + profit(question2));
        System.out.println("Soal 3 : " + profit(question3));
        System.out.println("Soal 4 : " + profit(question4));

    }
}
