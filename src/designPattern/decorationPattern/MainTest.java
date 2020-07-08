package designPattern.decorationPattern;

/**
 * @author Spever
 * @date 2020/6/10
 */
public class MainTest {
    public static void main(String[] args) {
        IThirdParty party = new ThirdParty();
        IThirdParty party1 = new Decorator1(party);
        IThirdParty party2 = new Decorator2(party1);
        System.out.println(party2.sayMsg());
    }
}
