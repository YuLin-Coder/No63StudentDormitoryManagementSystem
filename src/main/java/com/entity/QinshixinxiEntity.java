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
 * 寝室信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
@TableName("qinshixinxi")
public class QinshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QinshixinxiEntity() {
		
	}
	
	public QinshixinxiEntity(T t) {
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
	 * 寝室编号
	 */
					
	private String qinshibianhao;
	
	/**
	 * 寝室名称
	 */
					
	private String qinshimingcheng;
	
	/**
	 * 寝室类型
	 */
					
	private String qinshileixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 楼号
	 */
					
	private String louhao;
	
	/**
	 * 楼层
	 */
					
	private String louceng;
	
	/**
	 * 可住人数
	 */
					
	private Integer kezhurenshu;
	
	/**
	 * 空余床位
	 */
					
	private Integer kongyuchuangwei;
	
	/**
	 * 寝室状态
	 */
					
	private String qinshizhuangtai;
	
	
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
	 * 设置：寝室编号
	 */
	public void setQinshibianhao(String qinshibianhao) {
		this.qinshibianhao = qinshibianhao;
	}
	/**
	 * 获取：寝室编号
	 */
	public String getQinshibianhao() {
		return qinshibianhao;
	}
	/**
	 * 设置：寝室名称
	 */
	public void setQinshimingcheng(String qinshimingcheng) {
		this.qinshimingcheng = qinshimingcheng;
	}
	/**
	 * 获取：寝室名称
	 */
	public String getQinshimingcheng() {
		return qinshimingcheng;
	}
	/**
	 * 设置：寝室类型
	 */
	public void setQinshileixing(String qinshileixing) {
		this.qinshileixing = qinshileixing;
	}
	/**
	 * 获取：寝室类型
	 */
	public String getQinshileixing() {
		return qinshileixing;
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
	 * 设置：楼号
	 */
	public void setLouhao(String louhao) {
		this.louhao = louhao;
	}
	/**
	 * 获取：楼号
	 */
	public String getLouhao() {
		return louhao;
	}
	/**
	 * 设置：楼层
	 */
	public void setLouceng(String louceng) {
		this.louceng = louceng;
	}
	/**
	 * 获取：楼层
	 */
	public String getLouceng() {
		return louceng;
	}
	/**
	 * 设置：可住人数
	 */
	public void setKezhurenshu(Integer kezhurenshu) {
		this.kezhurenshu = kezhurenshu;
	}
	/**
	 * 获取：可住人数
	 */
	public Integer getKezhurenshu() {
		return kezhurenshu;
	}
	/**
	 * 设置：空余床位
	 */
	public void setKongyuchuangwei(Integer kongyuchuangwei) {
		this.kongyuchuangwei = kongyuchuangwei;
	}
	/**
	 * 获取：空余床位
	 */
	public Integer getKongyuchuangwei() {
		return kongyuchuangwei;
	}
	/**
	 * 设置：寝室状态
	 */
	public void setQinshizhuangtai(String qinshizhuangtai) {
		this.qinshizhuangtai = qinshizhuangtai;
	}
	/**
	 * 获取：寝室状态
	 */
	public String getQinshizhuangtai() {
		return qinshizhuangtai;
	}

}
