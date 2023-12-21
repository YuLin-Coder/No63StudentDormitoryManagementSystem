package com.entity.view;

import com.entity.QinshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 寝室信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
@TableName("qinshixinxi")
public class QinshixinxiView  extends QinshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QinshixinxiView(){
	}
 
 	public QinshixinxiView(QinshixinxiEntity qinshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, qinshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
