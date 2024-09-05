package arraylist;

import java.util.ArrayList;

public class Java02_Collection {
    public static void main(String[] args) {

        ArrayList list=new ArrayList();
        list.add("张三");
        list.add("lisi");
        list.add("wangwu");

        //数据增加的位置，数据
        list.add(1,"赵六");
        //list.addAll();追加集合


    }


}
