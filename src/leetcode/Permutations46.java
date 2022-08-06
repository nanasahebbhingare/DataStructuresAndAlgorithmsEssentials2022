package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations46 {
public static void main(String[] args) {
	
}
public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    int index = 0;
    solve(nums, ans, index);
	return ans; 
 }
 
 private void solve(int[] nums, List<List<Integer>> ans, int index)
 {
     //base case
     if(index>=nums.length)
     {
       ans.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
       return;
     }
     
     //recursive case
     for(int j=index; j<nums.length;j++)
     {
         swap(index,j,nums);
         solve(nums, ans, index+1); 
         //Backtracking
         swap(index,j,nums);
     }
 }
 
 private void swap(int x, int y, int[] arr) {
	int temp = arr[x];
	arr[x] = arr[y];
	arr[y] = temp;
}
 }