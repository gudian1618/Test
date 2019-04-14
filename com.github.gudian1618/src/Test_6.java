/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @create 2019-04-14 15:30
 * @description
 *
 * 基本数据类型包装类
 *
 * 包与访问修饰符：
 * 包用于多个java源文件的管理，就像我们的目录一样
 *
 *
 */

public class Test_6 {
    public static void main(String[] args) {
        // 把基本数据类型转换为包装类，称为自动装箱
        Integer i1 = new Integer(10);
        // 逆过程，自动拆箱
        int i2 = i1.intValue();

        Integer i3 = 10;
        Integer i4 = new Integer("123");

        String num1 = "12";
        int i5 = Integer.parseInt(num1);

    }


}
