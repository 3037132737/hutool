package Demo;

import java.util.concurrent.TimeUnit;

import cn.hutool.core.convert.Convert;

/**
 * Convert 类型转换器
 * @author LGZ
 *
 */
public class ConvertDemo {

	public static void main(String[] args) {

		//时间类型转换，把分钟转换为秒
		long a = 66;
		long second = Convert.convertTime(a, TimeUnit.MINUTES, TimeUnit.SECONDS);
		System.out.println(second);
		
		//将阿拉伯数字转为中文表达方式
		double a1=5461644.6416;
		String amount=Convert.digitToChinese(a1);
		System.out.println(amount);
		
		//将阿拉伯数字转为英文表达方式
		int number1=3197;
		String number2=Convert.numberToWord(number1);
		System.out.println(number2);
		
		
	}
}
