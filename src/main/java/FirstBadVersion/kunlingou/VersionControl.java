package FirstBadVersion.kunlingou;

public class VersionControl {
	boolean isBadVersion(int version) {
		Boolean[] results = new Boolean[] {true,true,true};
		return results[version-1];
	}
}
