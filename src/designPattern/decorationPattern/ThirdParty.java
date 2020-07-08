package designPattern.decorationPattern;

/**
 * @author Spever
 * @date 2020/6/10
 */
public class ThirdParty implements IThirdParty {
    @Override
    public String sayMsg() {
        System.out.println("go");
        return " hello ";
    }
}
