package org.soto;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author: liuqixin
 * @date: 2020/05/05 20:33
 */
public class Test {
    public static void main(String[] args) {
        /*NumberFormat numberFormat = NumberFormat.getPercentInstance();
        try {
            Number numbe = numberFormat.parse("1500");
            System.out.println(numbe);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }*/

        /*if (Double.parseDouble("1") > 0) {
            System.out.println("Yes");
        }*/

        /*List<Integer> ints = new ArrayList<>(10);

        for (int i = 1;i<=10;i++){
            ints.add(i);
        }
        for (Integer i :ints) {
            if(i%2==0){
                ints.remove(i);
            }
        }
        System.out.println(ints);*/

       /* File file = new File("C:\\app\\platform\\share\\io\\export\\20200520\\a.txt");
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        String tNum = "0.18";
//        System.out.println(StringUtils.isNum(tNum));

        String DTL_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
        System.out.println(new SimpleDateFormat(DTL_TIME_FORMAT).format(Calendar.getInstance().getTime()));


    }

    static void changeModel(Model model) {
        model.setDou(2D);
        model.setNum(2);
    }
}
