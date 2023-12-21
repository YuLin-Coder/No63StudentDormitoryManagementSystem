package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiugongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiugongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiugongView;


/**
 * 维修工
 *
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
public interface WeixiugongService extends IService<WeixiugongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiugongVO> selectListVO(Wrapper<WeixiugongEntity> wrapper);
   	
   	WeixiugongVO selectVO(@Param("ew") Wrapper<WeixiugongEntity> wrapper);
   	
   	List<WeixiugongView> selectListView(Wrapper<WeixiugongEntity> wrapper);
   	
   	WeixiugongView selectView(@Param("ew") Wrapper<WeixiugongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiugongEntity> wrapper);
   	
}

