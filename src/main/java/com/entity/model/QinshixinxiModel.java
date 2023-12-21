package com.entity.model;

import com.entity.QinshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 寝室信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
public class QinshixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
