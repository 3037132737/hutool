package Example;

import java.util.Date;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateBetween;
import cn.hutool.core.date.DateTime;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;

/**
 * hutool发送邮件
 * 
 * @author LGZ
 *
 */
public class SendMail {

	public static void main(String[] args) {
		DateTime nowDateTime = DateTime.now();//获取现在时间
		//输入你出生的时间
		String dateFirst="2001-09-13";
		Date date1=Convert.toDate(dateFirst);
		Date date2=Convert.toDate(nowDateTime);
		//求两个日期相差的天数
		DateBetween dateBetween=DateBetween.create(date1, date2);
		System.out.println(dateBetween);
		String str="你已经来到这个世界"+dateBetween+"了";
		
		
		
		MailAccount account = new MailAccount();
		account.setHost("smtp.163.com");// 邮件服务器的SMTP地址
		account.setPort(25);// 端口默认25
		account.setAuth(true);
		account.setFrom("my1304yx@163.com");// 发送邮件的邮箱
		account.setUser("my1304yx@163.com");
		account.setPass("CIBZTQCQAJCULFQB"); // 授权码
		MailUtil.send(account, CollUtil.newArrayList("3037132737@qq.com"), "邮件例子", str, false);
		System.out.println("发送成功");
	}
}
