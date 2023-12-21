package com.dao;

import com.entity.WeixiugongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiugongVO;
import com.entity.view.WeixiugongView;


/**
 * 维修工
 * 
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
public interface WeixiugongDao extends BaseMapper<WeixiugongEntity> {
	
	List<WeixiugongVO> selectListVO(@Param("ew") Wrapper<WeixiugongEntity> wrapper);
	
	WeixiugongVO selectVO(@Param("ew") Wrapper<WeixiugongEntity> wrapper);
	
	List<WeixiugongView> selectListView(@Param("ew") Wrapper<WeixiugongEntity> wrapper);

	List<WeixiugongView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiugongEntity> wrapper);
	
	WeixiugongView selectView(@Param("ew") Wrapper<WeixiugongEntity> wrapper);
	
}
