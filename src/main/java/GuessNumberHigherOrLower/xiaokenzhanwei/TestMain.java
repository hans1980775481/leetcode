package GuessNumberHigherOrLower.xiaokenzhanwei;

/**
 * @author 小坑占位 create date by 2019/6/20 16:51
 */
public class TestMain {

    public static void main(String[] args) {
        for (int i = 0 ; i < 1000 ; i++){
            Solution solution = new Solution((int) (Math.random() * Integer.MAX_VALUE + 1));
            System.out.println(solution.guessNumber(Integer.MAX_VALUE));
        }
    }

}
