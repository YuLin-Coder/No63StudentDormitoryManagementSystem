package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QinshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QinshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QinshixinxiView;


/**
 * 寝室信息
 *
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
public interface QinshixinxiService extends IService<QinshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QinshixinxiVO> selectListVO(Wrapper<QinshixinxiEntity> wrapper);
   	
   	QinshixinxiVO selectVO(@Param("ew") Wrapper<QinshixinxiEntity> wrapper);
   	
   	List<QinshixinxiView> selectListView(Wrapper<QinshixinxiEntity> wrapper);
   	
   	QinshixinxiView selectView(@Param("ew") Wrapper<QinshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QinshixinxiEntity> wrapper);
   	
}

