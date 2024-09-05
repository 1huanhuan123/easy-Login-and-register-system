package arraylist;
import java.util.ArrayList;
public class Java01_Collection {
        public static void main(String[] args) {
                ArrayList list = new ArrayList();
                //1.不需要传递构造参数,直接new就可以,底层数组为空数组
                //2.构造参数需要传递一个int类型的值，用于设定底层数组的长度
                //3.构造参数需要传递一个Collection集合类型的值,用于将其他集合中的数据放置在当前集合中

                //增加数据
                list.add("张三");
                System.out.println(list.size());
                list.add("李四");
                list.add("王五");
                list.add("欢欢");
                list.add("李四");
                System.out.println(list.size());
                for (int i = 0; i < list.size(); i++) {

                        System.out.println(list.get(i));
                }
                for(Object obj:list)
                {
                        System.out.println("集合中的对象"+obj);
                }
                list.set(1,"张三");//修改，返回的是修改前的值(对象)
                list.remove(1);//删除，返回的是删除前的值(对象)

        }



}
