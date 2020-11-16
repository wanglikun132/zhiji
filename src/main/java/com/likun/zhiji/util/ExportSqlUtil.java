//
//package com.likun.zhiji.util;
//
//import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
//import com.baomidou.mybatisplus.core.toolkit.StringUtils;
//
//import java.io.*;
//import java.util.Scanner;
//
///**
// * @author 汪立坤
// * @version 1.0
// * @description
// * @create 2020/7/3
// */
//public class ExportSqlUtil {
//
//
//
//		public static void writeFile(String path,String str){
//			try{
//
//
//				FileOutputStream o = null;
//				byte[] buff = new byte[]{};
//				File file =new File(path);
//
//				if(!file.exists()){
//					file.createNewFile();
//				}
//				str = str+"\r\n";
//				buff=str.getBytes();
//				o=new FileOutputStream(file,true);
//				o.write(buff);
//				o.flush();
//				o.close();
//
//
//			}catch(IOException e){
//
//				e.printStackTrace();
//
//			}
//		}
//
//		/**
//		 * 测试
//		 * @param args
//		 */
//		public static void main(String[] args) {
//
//
//			BufferedReader br = null;
//			try {
//				br = new BufferedReader(new FileReader(ScannerUtil.scanner("文件路径")));
//
//				String path = ScannerUtil.scanner("生成文件路径");
//				String tableName = ScannerUtil.scanner("要筛选的表名");
//				StringBuffer result = new StringBuffer();
//				boolean flag = false;
//				String s = br.readLine();
//				while (s != null){
//
//					if (flag == true && s.contains("DROP TABLE IF EXISTS")){
//						flag = false;
//					}
//					if (s.contains("DROP TABLE IF EXISTS `"+tableName)){
//						flag = true;
//					}
//					if (flag){
//						writeFile(path,s);
//					}
//					s=br.readLine();
//				}
//
//			}catch (Exception e){
//				System.out.println("读取文件失败");
//			}
//
//		}
//
//}