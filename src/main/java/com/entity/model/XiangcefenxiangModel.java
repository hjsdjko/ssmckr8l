package com.entity.model;

import com.entity.XiangcefenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 相册分享
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-28 23:53:30
 */
public class XiangcefenxiangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 相册分类
	 */
	
	private String xiangcefenlei;
		
	/**
	 * 封面图
	 */
	
	private String fengmiantu;
		
	/**
	 * 简介
	 */
	
	private String jianjie;
		
	/**
	 * 相册内容
	 */
	
	private String xiangceneirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：相册分类
	 */
	 
	public void setXiangcefenlei(String xiangcefenlei) {
		this.xiangcefenlei = xiangcefenlei;
	}
	
	/**
	 * 获取：相册分类
	 */
	public String getXiangcefenlei() {
		return xiangcefenlei;
	}
				
	
	/**
	 * 设置：封面图
	 */
	 
	public void setFengmiantu(String fengmiantu) {
		this.fengmiantu = fengmiantu;
	}
	
	/**
	 * 获取：封面图
	 */
	public String getFengmiantu() {
		return fengmiantu;
	}
				
	
	/**
	 * 设置：简介
	 */
	 
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
				
	
	/**
	 * 设置：相册内容
	 */
	 
	public void setXiangceneirong(String xiangceneirong) {
		this.xiangceneirong = xiangceneirong;
	}
	
	/**
	 * 获取：相册内容
	 */
	public String getXiangceneirong() {
		return xiangceneirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
