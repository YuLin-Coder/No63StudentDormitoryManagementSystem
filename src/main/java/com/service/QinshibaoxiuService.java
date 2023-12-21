package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QinshibaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QinshibaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QinshibaoxiuView;


/**
 * 寝室报修
 *
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
public interface QinshibaoxiuService extends IService<QinshibaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QinshibaoxiuVO> selectListVO(Wrapper<QinshibaoxiuEntity> wrapper);
   	
   	QinshibaoxiuVO selectVO(@Param("ew") Wrapper<QinshibaoxiuEntity> wrapper);
   	
   	List<QinshibaoxiuView> selectListView(Wrapper<QinshibaoxiuEntity> wrapper);
   	
   	QinshibaoxiuView selectView(@Param("ew") Wrapper<QinshibaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QinshibaoxiuEntity> wrapper);
   	
}

