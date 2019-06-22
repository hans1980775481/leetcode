package FirstBadVersion.xiaokenzhanwei;

/**
 * @author 小坑占位 create date by 2019/6/20 15:09
 */
public class VersionControl {

    private int firstBadVersion;

    public VersionControl(int firstBadVersion) {
        this.firstBadVersion = firstBadVersion;
        System.out.println("第一个坏的版本号是：" + firstBadVersion);
    }

    public boolean isBadVersion(int version) {
        return firstBadVersion <= version ;
    }
}
