package Example;
/**
 * 生成图片验证码
 * @author LGZ
 *
 */

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.captcha.ShearCaptcha;
import cn.hutool.core.lang.Console;

public class ImageVerification {
	public static void main(String[] args) {
		
		//生成一个有线段干扰的验证码
		//定义图形验证码的长和宽
		LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);
		//图形验证码写出，可以写出到文件，也可以写出到流
		lineCaptcha.write("d:/code1.png");
		//输出code
		Console.log(lineCaptcha.getCode());
		//验证图形验证码的有效性，返回boolean值
		lineCaptcha.verify("1234");
		
		//生成一个有斜线干扰的验证码
		//定义图形验证码的长、宽、验证码字符数、干扰线宽度
		ShearCaptcha captcha = CaptchaUtil.createShearCaptcha(200, 100, 4, 7);
		//图形验证码写出，可以写出到文件，也可以写出到流
		captcha.write("d:/code2.png");
		//验证图形验证码的有效性，返回boolean值
		captcha.verify("1234");
		
		//生成一个有圆圈干扰的验证码
		//定义图形验证码的长、宽、验证码字符数、干扰元素个数
		CircleCaptcha ccaptcha = CaptchaUtil.createCircleCaptcha(200, 100, 4, 50);
		//图形验证码写出，可以写出到文件，也可以写出到流
		ccaptcha.write("d:/code3.png");
		//验证图形验证码的有效性，返回boolean值
		ccaptcha.verify("1234");
	}
}
