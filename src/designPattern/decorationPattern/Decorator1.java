package designPattern.decorationPattern;

/**
 * @author Spever
 * @date 2020/6/10
 */
public class Decorator1 implements IThirdParty {

    private IThirdParty thirdParty;
    public Decorator1(IThirdParty thirdParty) {
        this.thirdParty = thirdParty;
    }

    @Override
    public String sayMsg() {
        System.out.println("1");
        return "   ###1"+thirdParty.sayMsg()+"###1   ";
    }
}
