class VersionControl{
	static boolean isBadVersion(int version){
		return false;
	}
}
public class FindBadVersion {
	public class Solution extends VersionControl {
	    public int firstBadVersion(int n) {
	        if (n == 1) {
	            return 1;
	        }
	        
	        int left = 1;
	        int right = n;
	        
	        while (left + 1 < right) {
	            int mid = left + (right - left) / 2;
	            if (VersionControl.isBadVersion(mid)) {
	                right = mid;
	            } else {
	                left = mid;
	            }
	        }
	        
	        if (VersionControl.isBadVersion(left)) {
	            return left;
	        }
	        
	        return right;
}
	}
}
