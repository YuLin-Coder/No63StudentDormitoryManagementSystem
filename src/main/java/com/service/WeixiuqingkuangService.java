package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiuqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiuqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiuqingkuangView;


/**
 * 维修情况
 *
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
public interface WeixiuqingkuangService extends IService<WeixiuqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiuqingkuangVO> selectListVO(Wrapper<WeixiuqingkuangEntity> wrapper);
   	
   	WeixiuqingkuangVO selectVO(@Param("ew") Wrapper<WeixiuqingkuangEntity> wrapper);
   	
   	List<WeixiuqingkuangView> selectListView(Wrapper<WeixiuqingkuangEntity> wrapper);
   	
   	WeixiuqingkuangView selectView(@Param("ew") Wrapper<WeixiuqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiuqingkuangEntity> wrapper);
   	
}

