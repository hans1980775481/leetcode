/** 

* @author ¿µ≥ø¿  

*/
public class FindSmallestLetterGreaterThanTarget {

	public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;
        int mid=(left+right)/2;
        char result=0;
        while (left<=right) {
        	//System.out.println("left:"+mid);
        	//System.out.println("right:"+mid);
        	//System.out.println("mid:"+mid);
        	if(letters[mid]>target) {
            	//System.out.println("11111");

        		right=mid-1;
        		mid=(left+right)/2;
        	}
        	else if(letters[mid]<target) {
        		//System.out.println("22222");
        		left=mid+1;
        		mid=(left+right)/2;
        	}
        	else if(letters[mid]==target) {
                while(letters[mid%letters.length]==target){
                    mid++;
                }
        		result=letters[(mid)%(letters.length)];
        		return result;
        	}
        }
        return letters[left%letters.length];
    }
	/*public static void main(String[] args) {
		char[] ls= {'c','f','j'};
		System.out.println(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(ls,'a'));
		System.out.println(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(ls,'c'));
		System.out.println(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(ls,'d'));
		System.out.println(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(ls,'g'));
		System.out.println(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(ls,'j'));

		System.out.println(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(ls,'k'));
	}*/
}


