package GuessNumberHigherOrLower.xiaokenzhanwei;

/**
 * @author 小坑占位 create date by 2019/6/20 16:40
 */
public class GuessGame {

    private int designationNumber;

    public GuessGame(int designationNumber) {
        this.designationNumber = designationNumber;
        System.out.println("指定数是：" + designationNumber);
    }

    public int guess(int num){
        return Integer.compare(num, designationNumber);
    }
}
