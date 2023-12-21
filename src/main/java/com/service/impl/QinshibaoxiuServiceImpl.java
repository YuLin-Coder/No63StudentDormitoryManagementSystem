package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QinshibaoxiuDao;
import com.entity.QinshibaoxiuEntity;
import com.service.QinshibaoxiuService;
import com.entity.vo.QinshibaoxiuVO;
import com.entity.view.QinshibaoxiuView;

@Service("qinshibaoxiuService")
public class QinshibaoxiuServiceImpl extends ServiceImpl<QinshibaoxiuDao, QinshibaoxiuEntity> implements QinshibaoxiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QinshibaoxiuEntity> page = this.selectPage(
                new Query<QinshibaoxiuEntity>(params).getPage(),
                new EntityWrapper<QinshibaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QinshibaoxiuEntity> wrapper) {
		  Page<QinshibaoxiuView> page =new Query<QinshibaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QinshibaoxiuVO> selectListVO(Wrapper<QinshibaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QinshibaoxiuVO selectVO(Wrapper<QinshibaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QinshibaoxiuView> selectListView(Wrapper<QinshibaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QinshibaoxiuView selectView(Wrapper<QinshibaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
