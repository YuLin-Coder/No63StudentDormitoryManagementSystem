package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 寝室报修
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
@TableName("qinshibaoxiu")
public class QinshibaoxiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QinshibaoxiuEntity() {
		
	}
	
	public QinshibaoxiuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 报修编号
	 */
					
	private String baoxiubianhao;
	
	/**
	 * 报修名称
	 */
					
	private String baoxiumingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 报修类型
	 */
					
	private String baoxiuleixing;
	
	/**
	 * 报修内容
	 */
					
	private String baoxiuneirong;
	
	/**
	 * 附件
	 */
					
	private String fujian;
	
	/**
	 * 报修日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date baoxiuriqi;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 报修位置
	 */
					
	private String baoxiuweizhi;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 职称
	 */
					
	private String zhicheng;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：报修编号
	 */
	public void setBaoxiubianhao(String baoxiubianhao) {
		this.baoxiubianhao = baoxiubianhao;
	}
	/**
	 * 获取：报修编号
	 */
	public String getBaoxiubianhao() {
		return baoxiubianhao;
	}
	/**
	 * 设置：报修名称
	 */
	public void setBaoxiumingcheng(String baoxiumingcheng) {
		this.baoxiumingcheng = baoxiumingcheng;
	}
	/**
	 * 获取：报修名称
	 */
	public String getBaoxiumingcheng() {
		return baoxiumingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：报修类型
	 */
	public void setBaoxiuleixing(String baoxiuleixing) {
		this.baoxiuleixing = baoxiuleixing;
	}
	/**
	 * 获取：报修类型
	 */
	public String getBaoxiuleixing() {
		return baoxiuleixing;
	}
	/**
	 * 设置：报修内容
	 */
	public void setBaoxiuneirong(String baoxiuneirong) {
		this.baoxiuneirong = baoxiuneirong;
	}
	/**
	 * 获取：报修内容
	 */
	public String getBaoxiuneirong() {
		return baoxiuneirong;
	}
	/**
	 * 设置：附件
	 */
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	/**
	 * 获取：附件
	 */
	public String getFujian() {
		return fujian;
	}
	/**
	 * 设置：报修日期
	 */
	public void setBaoxiuriqi(Date baoxiuriqi) {
		this.baoxiuriqi = baoxiuriqi;
	}
	/**
	 * 获取：报修日期
	 */
	public Date getBaoxiuriqi() {
		return baoxiuriqi;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：报修位置
	 */
	public void setBaoxiuweizhi(String baoxiuweizhi) {
		this.baoxiuweizhi = baoxiuweizhi;
	}
	/**
	 * 获取：报修位置
	 */
	public String getBaoxiuweizhi() {
		return baoxiuweizhi;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：职称
	 */
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	/**
	 * 获取：职称
	 */
	public String getZhicheng() {
		return zhicheng;
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