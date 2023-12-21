package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QinshianpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QinshianpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QinshianpaiView;


/**
 * 寝室安排
 *
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
public interface QinshianpaiService extends IService<QinshianpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QinshianpaiVO> selectListVO(Wrapper<QinshianpaiEntity> wrapper);
   	
   	QinshianpaiVO selectVO(@Param("ew") Wrapper<QinshianpaiEntity> wrapper);
   	
   	List<QinshianpaiView> selectListView(Wrapper<QinshianpaiEntity> wrapper);
   	
   	QinshianpaiView selectView(@Param("ew") Wrapper<QinshianpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QinshianpaiEntity> wrapper);
   	
}

