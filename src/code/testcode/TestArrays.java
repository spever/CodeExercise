package code.testcode;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 * @author Spever
 * @date 2020/6/29
 */
public class TestArrays {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("JavaCloud");
        System.out.println(list.getClass());
        Object[] object = list.toArray();
        System.out.println(object.getClass());
        object[0] = new Object();
    }
}
