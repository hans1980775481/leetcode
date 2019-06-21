package FirstBadVersion;

public class VersionControl {
	private int FirstBadVersion;
	
	public boolean isBadVersion(int version) {
		return FirstBadVersion <= version;
		
	}

}