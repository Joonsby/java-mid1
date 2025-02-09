package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";
        String[] splitStr = str.split(",");
        for(String s : splitStr){
            System.out.println(s);
        }

        String joinStr = "";

        for(int i = 0; i < splitStr.length; i++){
            String s = splitStr[i];
            joinStr += s;
            if(i != splitStr.length - 1){
                joinStr += "-";
            }
        }

        System.out.println(joinStr);

        String joinedStr = String.join("-","A","B","C");

        String result = String.join("-",splitStr);
        System.out.println(result);
    }
}
