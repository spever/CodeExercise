package designPattern.proxy;

/**
 * @author Spever
 * @date 2020/6/29
 */
public class TestProxy {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();
        //静态代理
//        UserDaoProxy proxy = new UserDaoProxy(target);
//        proxy.doSomething();

        //动态代理,
        //代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
        //给目标对象创建代理对象
        IUserDao dao = (IUserDao) new ProxyFactory(target).getProxyInstance();
        dao.doSomething();

    }
}
