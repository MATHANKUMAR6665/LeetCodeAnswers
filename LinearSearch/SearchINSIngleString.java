package LinearSearch;

public class SearchINSIngleString {
    public static void main(String[] args) {
        String name="mathan";
        char target1='h';
        char target='a';
        System.out.println(find(name,target1));
        System.out.println(countthevalue(name,target));
    }
    static int find(String name,char target){
        for (int index = 0; index < name.length(); index++) {
            if (target==name.charAt(index)){
                return index;//return 3 as a index
            }
        }
        return -1;
    }
    static int countthevalue(String name,char target){
        int count=0;
        for (int index = 0; index < name.length(); index++) {
            if (target==name.charAt(index)){
                count++;
            }
        }
        return count;
    }
}
