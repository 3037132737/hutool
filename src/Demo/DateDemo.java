package Demo;

import java.util.Date;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateBetween;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Week;

/**
 * 日期相关的方法
 * @author LGZ
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		
		String dateFirst="2001-01-01";
		String dateSecond="2008.08.08";
		System.out.println("dateFirs:  "+dateFirst+"\n"+"dateSecond:  "+dateSecond);
		
		//将dateFirst，dateSecond转换为Date
		Date date1=Convert.toDate(dateFirst);
		Date date2=Convert.toDate(dateSecond);
		System.out.println("date1:  "+date1+"\n"+"date2:  "+date2);
		
		//获取现在时间
		DateTime nowDateTime=DateTime.now();
		System.out.println(nowDateTime);
		
		//求两个日期相差的天数
		DateBetween dateBetween=DateBetween.create(date1, date2);
		System.out.println(dateBetween);
				
		//获得指定日期是这个日期所在月份的第几天，从1开始
		int dayofmonth=DateUtil.dayOfMonth(date2);
		System.out.println(dayofmonth);
		//获得指定日期是星期几
		Week dayofweek=DateUtil.dayOfWeekEnum(date2);
		System.out.println(dayofweek);
		
		
		
	}

	
}
