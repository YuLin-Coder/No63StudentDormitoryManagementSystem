package com.dao;

import com.entity.QinshibaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QinshibaoxiuVO;
import com.entity.view.QinshibaoxiuView;


/**
 * 寝室报修
 * 
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
public interface QinshibaoxiuDao extends BaseMapper<QinshibaoxiuEntity> {
	
	List<QinshibaoxiuVO> selectListVO(@Param("ew") Wrapper<QinshibaoxiuEntity> wrapper);
	
	QinshibaoxiuVO selectVO(@Param("ew") Wrapper<QinshibaoxiuEntity> wrapper);
	
	List<QinshibaoxiuView> selectListView(@Param("ew") Wrapper<QinshibaoxiuEntity> wrapper);

	List<QinshibaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<QinshibaoxiuEntity> wrapper);
	
	QinshibaoxiuView selectView(@Param("ew") Wrapper<QinshibaoxiuEntity> wrapper);
	
}
