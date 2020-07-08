package designPattern.decorationPattern;

/**
 * @author Spever
 * @date 2020/6/10
 */
public class Decorator2 implements IThirdParty {

    private IThirdParty thirdParty;

    public Decorator2(IThirdParty thirdParty) {
        this.thirdParty = thirdParty;
    }

    @Override
    public String sayMsg() {
        System.out.println("2");
        return "###2"+thirdParty.sayMsg()+"###2";
    }
}
