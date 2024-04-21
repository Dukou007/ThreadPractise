package cn.itcast.heima2;

public class TelePhone {
    public static void main(String[] args) {
        int []arr={5,0,6,7,3,9,1,4};
        int []index={6,0,2,1,3,6,7,0,2,5,4};
        String tel="";
        for (int i :index) {
            tel+=arr[i];
        }
        //tel=15607145693
        System.out.println(tel);
    }
}
