package ch13_알고리즘;

//여러 개의 수가 정렬된 순서로 있을 때 특정한 수를 찾는 방법
//단순 반복문을 이용하면 수의 개수에 따라 비교 횟수가 증가하는 O(n)의 수행이 이루어짐
//수가 정렬된 상태에서는 이진 탐색(binary search)을 활용하면 매번 비교되는 요소의 수가 절반으로 감소될 수 있으므로 O(logN)의 수행으로 원하는 수를 찾을 수 있음
//수의 예 : [12, 25, 31, 48, 54, 66, 70, 83, 95, 108]
//83의 위치를 찾아보세요
public class BinarySearchProblem {

	public static void main(String[] args) {
		int[] list=  {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		int target = 83;
		int right =  list.length-1;
		int left = 0;
		int mid = (right+left)/2;
		int temp = list[mid];
		boolean isCheck = false;
		
		
		while(left <= right) {
			if(temp == target) {
				isCheck = true;
				break;
			}
			else if( target < temp) {
				right = mid -1;
			}
			else {
				left = mid +1;
			}
			mid = (left+right)/2;
			temp= list[mid];
		}
		
		if(isCheck == true) {
			System.out.println("찾았습니다 : "+ mid + "번째");
		}
		System.out.println("끝");

	}

}
