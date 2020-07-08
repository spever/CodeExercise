package designPattern.proxy;

/**
 * @author Spever
 * @date 2020/6/29
 * 代理对象,静态代理
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void doSomething() {
        System.out.println("准备处理....");
        target.doSomething();
        System.out.println("处理完毕");
    }
}
