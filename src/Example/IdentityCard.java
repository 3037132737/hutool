package Example;

import cn.hutool.core.util.IdcardUtil;

/**
 * 获取身份证号中的信息(只支持15或18位身份证号码)
 * @author LGZ
 *
 */
public class IdentityCard {
	public static void main(String[] args) {
		//输入身份证号
		String identityCard="131081200108021618";
		System.out.println("身份证号:  "+identityCard);
		//是否有效身份证号
		boolean valid=IdcardUtil.isValidCard(identityCard);
		if (valid!=true) {
			System.out.println("此身份证号无效");
		} else {

			//根据身份编号获取年龄
			int age=IdcardUtil.getAgeByIdCard(identityCard);
			System.out.println("年龄:  "+age);
			//根据身份编号获取生日
			String birthDay=IdcardUtil.getBirth(identityCard);
			System.out.println("生日:  "+birthDay);
			//根据身份编号获取性别
			int sex=IdcardUtil.getGenderByIdCard(identityCard);
			String sex1;
			if (sex==1) {
				sex1="男";
			} else {
				sex1="女";
			}
			System.out.println("性别:  "+sex1);
			//根据身份编号获取户籍省份
			String province=IdcardUtil.getProvinceByIdCard(identityCard);
			System.out.println("省份:  "+province);
			
		}
		
		
	}
}
