package com.jiangsu.Josephus;

import java.util.ArrayList;

public class Josephus {

	/**
	 * 约瑟夫环
	 * 幸运数字
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * 获取幸运数字
	 * @param num
	 * @return
	 */
	public static int getLuckyNmu(int num){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=num ;i++){
			list.add(i);
		}
		int count = 1;
		for(int i = 0 ;list.size()!=1;i++){			//集合元素数量不唯一就继续删
			 if(i == list.size()) i = 0;			//如果 i 增长到集合最大索引+1时，归零
			 if(count % 3 == 0) list.remove(i--);	//是三的倍数就删除该元素，并且索引减一，回到这个位置
			 count++;
		}
		return count;
	}

}
