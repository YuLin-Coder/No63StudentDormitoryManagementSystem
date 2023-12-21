package com.dao;

import com.entity.QinshianpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QinshianpaiVO;
import com.entity.view.QinshianpaiView;


/**
 * 寝室安排
 * 
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
public interface QinshianpaiDao extends BaseMapper<QinshianpaiEntity> {
	
	List<QinshianpaiVO> selectListVO(@Param("ew") Wrapper<QinshianpaiEntity> wrapper);
	
	QinshianpaiVO selectVO(@Param("ew") Wrapper<QinshianpaiEntity> wrapper);
	
	List<QinshianpaiView> selectListView(@Param("ew") Wrapper<QinshianpaiEntity> wrapper);

	List<QinshianpaiView> selectListView(Pagination page,@Param("ew") Wrapper<QinshianpaiEntity> wrapper);
	
	QinshianpaiView selectView(@Param("ew") Wrapper<QinshianpaiEntity> wrapper);
	
}
