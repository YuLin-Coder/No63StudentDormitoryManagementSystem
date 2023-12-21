package com.entity.vo;

import com.entity.QinshianpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 寝室安排
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
public class QinshianpaiVO  implements Serializable {
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
	
	private String kezhurenshu;
		
	/**
	 * 空余床位
	 */
	
	private String kongyuchuangwei;
		
	/**
	 * 寝室状态
	 */
	
	private String qinshizhuangtai;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 安排日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date anpairiqi;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 手机
	 */
	
	private String shouji;
				
	
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
	 
	public void setKezhurenshu(String kezhurenshu) {
		this.kezhurenshu = kezhurenshu;
	}
	
	/**
	 * 获取：可住人数
	 */
	public String getKezhurenshu() {
		return kezhurenshu;
	}
				
	
	/**
	 * 设置：空余床位
	 */
	 
	public void setKongyuchuangwei(String kongyuchuangwei) {
		this.kongyuchuangwei = kongyuchuangwei;
	}
	
	/**
	 * 获取：空余床位
	 */
	public String getKongyuchuangwei() {
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
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：安排日期
	 */
	 
	public void setAnpairiqi(Date anpairiqi) {
		this.anpairiqi = anpairiqi;
	}
	
	/**
	 * 获取：安排日期
	 */
	public Date getAnpairiqi() {
		return anpairiqi;
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
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
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
			
}
