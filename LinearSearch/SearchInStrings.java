package LinearSearch;

public class SearchInStrings {
    public static void main(String[]args){
        String[]arr={"mathan","Thara","zaara","manoj","abi"};
        String target="zAara";
        System.out.println(find(arr,target));
    }
    static int find(String[]arr,String target){
        for (int index = 0; index < arr.length; index++) {
            if (arr[index].equalsIgnoreCase(target)){
                return index;
            }
        }
        return -1;
    }
}
