package demo.day.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Map {
    public static void main(String[] args) {
        HashMap arr = new HashMap();
        HashMap arr2 = new HashMap();
        /*
        1.MAP：接口常用方法：
        put(Object obj):添加及修改
        putAll(Map a):把a中所有key-value添加到当前Map里
        remove(Object key):删除key所对应的value，并返回value值
        clear（）：删除当前集合里所有元素
        get（Object key）：查询Key所对应value
        contains（Object key/value）：判断是否包含指定的key/value
        size（）：获取集合长度
        isEmpty（）：判断集合是否为空
        2.Map的遍历操作
        keyset（）：遍历所有key集
        values（）：遍历所有value
        entryset（）：遍历key----value

         */
        //添加
        arr.put("name", "张三");
        arr.put("age", 15);
        arr.put("name2", "tom");
        arr.put(22, "张");
        arr2.put(1,"AA");
        arr2.put(2,"bb");
        arr2.put(3,"A");
        arr2.put(4,"CC");
        arr.putAll(arr2);
        System.out.println(arr+" //添加");
        //修改
        arr.put("name","mike");
        System.out.println(arr+" //添加集合");
        System.out.println(arr.get("name")+" //查询key=name的value");
        System.out.println(arr.size()+" //获取arr的长度");
        //遍历：key
        Iterator key = arr.keySet().iterator();
        while (key.hasNext()){
            System.out.println("key"+key.next());
        }
        //遍历：value
        Iterator value = arr.values().iterator();
        while (key.hasNext()){
            System.out.println("value"+value.next());
        }
        //遍历：key---value
            //方式1
        Iterator key2 = arr.keySet().iterator();
        while (key2.hasNext()){
            Object K = key2.next();
            Object value2 =arr.get(K);
            System.out.println("方式1:"+K+"------"+value2);
        }
            //方式2
        Iterator set = arr.entrySet().iterator();
        while (set.hasNext()){
            Entry o =(Entry) set.next();
            System.out.println("方式2:"+o.getKey()+"------"+o.getValue());
        }



        //删除集合
        arr.clear();
        System.out.println(arr+" //删除集合");
        System.out.println(arr.isEmpty()+" //判断集合是否为空");

    }
}
