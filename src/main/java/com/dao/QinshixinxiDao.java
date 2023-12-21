package com.dao;

import com.entity.QinshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QinshixinxiVO;
import com.entity.view.QinshixinxiView;


/**
 * 寝室信息
 * 
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
public interface QinshixinxiDao extends BaseMapper<QinshixinxiEntity> {
	
	List<QinshixinxiVO> selectListVO(@Param("ew") Wrapper<QinshixinxiEntity> wrapper);
	
	QinshixinxiVO selectVO(@Param("ew") Wrapper<QinshixinxiEntity> wrapper);
	
	List<QinshixinxiView> selectListView(@Param("ew") Wrapper<QinshixinxiEntity> wrapper);

	List<QinshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QinshixinxiEntity> wrapper);
	
	QinshixinxiView selectView(@Param("ew") Wrapper<QinshixinxiEntity> wrapper);
	
}
