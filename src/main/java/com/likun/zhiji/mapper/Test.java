package com.likun.zhiji.mapper;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/6/28
 */
public class Test {

	private static void thread(){
		Thread[] ths = new Thread[3];
		for (int i=0;i<3;i++){
			ths[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int j = 0;j<5;j++){
						System.out.print(j);
					}
					System.out.print(" ");
				}
			});
		}
		for (Thread thread: ths){
			thread.start();
		}
	}

	public static void main(String[] args) {
//		String projectPath = System.getProperty("user.dir");
//		System.out.println(projectPath);

		for (int i =0; i < 100;i++){
			thread();
			System.out.println();
		}
	}
}
