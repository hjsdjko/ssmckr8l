package com.entity.view;

import com.entity.BokewenzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 博客文章
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-28 23:53:30
 */
@TableName("bokewenzhang")
public class BokewenzhangView  extends BokewenzhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BokewenzhangView(){
	}
 
 	public BokewenzhangView(BokewenzhangEntity bokewenzhangEntity){
 	try {
			BeanUtils.copyProperties(this, bokewenzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
