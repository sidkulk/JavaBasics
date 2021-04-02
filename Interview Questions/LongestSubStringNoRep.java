package myClassPack;

import java.util.*;
import static java.lang.System.out;
/*
	This java program prints the first longest substring without repeating characters
*/
class Solution {
	public static void main(String[] args) {
		String str = "abcdzysaab";
		String[] strArr = str.split("");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<strArr.length;i++) {
			if(sb.indexOf(strArr[i]) < 0) {
				sb.append(strArr[i]);
			}
		}
		
		out.println(sb.toString());
	}
}

