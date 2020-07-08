package designPattern.proxy;

/**
 * @author Spever
 * @date 2020/6/29
 * 目标对象
 */


public class UserDao implements IUserDao {
    @Override
    public void doSomething() {
        System.out.println("do something。。。。");
    }
}
