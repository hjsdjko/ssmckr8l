package com.entity.view;

import com.entity.XiangcefenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 相册分享
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-28 23:53:30
 */
@TableName("xiangcefenxiang")
public class XiangcefenxiangView  extends XiangcefenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangcefenxiangView(){
	}
 
 	public XiangcefenxiangView(XiangcefenxiangEntity xiangcefenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, xiangcefenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
