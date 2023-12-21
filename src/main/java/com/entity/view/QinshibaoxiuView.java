package com.entity.view;

import com.entity.QinshibaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 寝室报修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
@TableName("qinshibaoxiu")
public class QinshibaoxiuView  extends QinshibaoxiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QinshibaoxiuView(){
	}
 
 	public QinshibaoxiuView(QinshibaoxiuEntity qinshibaoxiuEntity){
 	try {
			BeanUtils.copyProperties(this, qinshibaoxiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
