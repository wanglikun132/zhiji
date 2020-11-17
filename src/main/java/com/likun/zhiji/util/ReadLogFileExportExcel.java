package com.likun.zhiji.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;

import java.util.*;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/11/6
 */
public class ReadLogFileExportExcel {

	public static List<String>  readFileLine(String path){
		//默认UTF-8编码，可以在构造中传入第二个参数做为编码
		FileReader fileReader = new FileReader(path);
		List<String> list = fileReader.readLines();
		return list;
	}

	public static void exportExcel(List<Map<String,Object>> rows,String filePath){
		// 通过工具类创建writer
		ExcelWriter writer = ExcelUtil.getWriter(filePath);
		// 合并单元格后的标题行，使用默认标题样式
//		writer.merge(rows.size() - 1, "客服登录统计");
		// 一次性写出内容，使用默认样式，强制输出标题
		writer.write(rows, true);
		// 关闭writer，释放内存
		writer.close();
	}

	public static void main(String[] args) {
		List<Map<String,Object>> rows = new ArrayList<>();
		List<String> list = readFileLine("E:\\ideaproject\\zhiji\\qianniu201");
//		list.forEach(it->{
//			if (it.contains("登录时间")&&it.contains("用户信息")){
//				Map<String,Object> map = new HashMap<>(16);
//				//登录时间:Thu Nov 05 16:02:29 CST 2020
//				String substring = it.substring(it.indexOf("登录时间:"), it.indexOf(","));
////				System.out.println(it);
//				//登录时间:Fri Nov 06 06:59:02 CST 2020,用户信息:
////[ INFO ] [2020-11-05 19:11:23.509] com.joyoung.qianniu.controller.WaiterController [59] [http-nio-8701-exec-58]- 登录时间:Thu Nov 05 19:11:23 CST 2020,用户信息:Result(succ=true, ts=1604574683509, data=UserDTO(id=10214, userId=21cc14e2bc82210c23af12bf9cfd4f17, nickName=null, waiterName=丹雪, code=10104008, job=1, tel=15914751670, dealerId=15, status=0, isDel=1, opUid=7912784, gmtCreate=1602809624, gmtModified=1602809624, dealer=北京浩远中粤科技有限公司, userName=null), code=null, msg=null)
//				String[] split = it.split("登录时间:");
////				System.out.println(split[1]);
//				String[] split1 = split[1].split(",用户信息:");
////				System.out.println(split1[0]);
////				System.out.println(split1[1]);
//				map.put("登录时间",split1[0]);
//				String[] split2 = split1[1].split(",");
//				for (int i = 0;i<split2.length;i++){
////					System.out.println(split2[i]);
//					String[] split3 = split2[i].split("=");
//					System.out.println(split3[0]);
//					System.out.println(split3[1]);
//					if (split3[1].contains("id")){
//						map.put("id",split3[2]);
//					}
//					if (split3[0].contains("userId")){
//						map.put("userId",split3[1]);
//					}
//					if (split3[0].contains("waiterName")){
//						map.put("waiterName",split3[1]);
//					}
//					if (split3[0].contains("tel")){
//						map.put("tel",split3[1]);
//					}
//					if (split3[0].contains("dealer")){
//						map.put("dealer",split3[1]);
//					}
//				}
//				rows.add(map);
//			}
//		});
		list.forEach(it -> {

			if (it.contains("未找到图谱数据,uri:")){
				Map<String,Object> map = new HashMap<>(16);
				System.out.println(it);
				map.put("查询参数","http"+it.substring(it.lastIndexOf(":")));
				map.put("查询目标","根据型号名称进行查询");
				rows.add(map);
			}
			if (it.contains("图谱实体数据查询失败,name:")){
				Map<String,Object> map = new HashMap<>(16);
				String[] split = it.split(",");
				map.put("查询参数",split[1].split(":")[1]);
				map.put("查询目标",split[2].split(":")[1]);
				rows.add(map);
			}
		});
		exportExcel(rows,"e:/食谱视频查询失败日志.xlsx");
	}

}

