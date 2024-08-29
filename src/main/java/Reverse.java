public class Reverse {

    public static void main(String[] args) {


        System.out.println(reverse("italem irad irigayaj"));
        System.out.println(reverse("iadab itsap ulalreb"));
        System.out.println(reverse("nalub kusutret gnalali"));


    }
    public static String reverse(String reverse){
        String[] words = reverse.split(" ");
        StringBuilder builder = new StringBuilder();

        for (String word : words){
            String reverses = new StringBuilder(word).reverse().toString();
            builder.append(reverses).append(" ");
        }
        return builder.toString().trim();
    }
}
