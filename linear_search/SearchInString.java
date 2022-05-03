package linear_search;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Mayank";
        char target = 'z';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char character : str.toCharArray()) {
            if(character == target){
                return true;
            }
        }
        return false;
    }
}
