package com.entity.view;

import com.entity.WeixiuqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 维修情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
@TableName("weixiuqingkuang")
public class WeixiuqingkuangView  extends WeixiuqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeixiuqingkuangView(){
	}
 
 	public WeixiuqingkuangView(WeixiuqingkuangEntity weixiuqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, weixiuqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
