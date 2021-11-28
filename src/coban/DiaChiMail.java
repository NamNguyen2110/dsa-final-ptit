package coban;

import java.util.*;

public class DiaChiMail {
    public static Map<String,Integer> s3=new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sc=scanner.nextLine();
        int t=Integer.parseInt(sc);
        while (t>0){
            String s=scanner.nextLine();
            System.out.println(chuanHoa(s));
            t--;
        }
    }

    public static String chuanHoa(String s){
        String[] strings = s.trim().split(" ");
        String s1 = strings[strings.length - 1].toLowerCase();
        StringBuilder stringBuilder=new StringBuilder(s1);
        for (int i = 0; i < strings.length-1; i++) {
            String temp=strings[i];
            if(!"".equals(temp.trim())){
                stringBuilder.append(String.valueOf(temp.charAt(0)).toLowerCase());
            }
        }
        if(s3.containsKey(stringBuilder.toString())){
            s3.replace(stringBuilder.toString(), s3.get(stringBuilder.toString())+1);
            stringBuilder.append(s3.get(stringBuilder.toString()));
        }else {
            s3.put(stringBuilder.toString(),1);
        }
        stringBuilder.append("@ptit.edu.vn");
        return stringBuilder.toString();
    }
}
