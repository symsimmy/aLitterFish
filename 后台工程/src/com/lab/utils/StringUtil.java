package com.lab.utils;

import com.lab.bean.Staff;
import org.apache.commons.lang3.StringUtils;

public class StringUtil {

	public static boolean loginCheck(Staff staff1, Staff staff2){
		boolean result = false;

		/*判断密码和id是否一致*/
		if(StringUtils.equals(staff1.getPassword(), staff2.getPassword())
				             &&StringUtils.equals(staff1.getId(), staff2.getId())){
			result = true;
		}else{
			result = false;
		}
		
		return result;
	}
}
