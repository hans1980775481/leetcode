package PascalsTriangle.SouthLight_Lin;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角形
 * 输入整数n
 * 输出杨辉三角形
 */
public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		if(numRows==0)
			return result;

		for(int i=0; i<numRows; i++){
			List<Integer> list = new ArrayList<>();
			if(i==0){
				list.add(1);
				result.add(list);
				continue;
			}

			else{
				// 首加1
				list.add(1);
				for(int j=1; j<i; j++){
					// 得到上一个数组
					List<Integer> tmpList = result.get(i-1);
					int tmp = tmpList.get(j)+tmpList.get(j-1);
					list.add(tmp);
				}
				// 尾加1
				list.add(1);

				// 添加结果
				result.add(list);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		PascalTriangle triangle = new PascalTriangle();
		List<List<Integer>> result = triangle.generate(5);
		for(List<Integer> list:result){
			for(Integer num:list){
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
