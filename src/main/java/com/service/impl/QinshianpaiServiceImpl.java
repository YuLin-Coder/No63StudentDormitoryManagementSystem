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


import com.dao.QinshianpaiDao;
import com.entity.QinshianpaiEntity;
import com.service.QinshianpaiService;
import com.entity.vo.QinshianpaiVO;
import com.entity.view.QinshianpaiView;

@Service("qinshianpaiService")
public class QinshianpaiServiceImpl extends ServiceImpl<QinshianpaiDao, QinshianpaiEntity> implements QinshianpaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QinshianpaiEntity> page = this.selectPage(
                new Query<QinshianpaiEntity>(params).getPage(),
                new EntityWrapper<QinshianpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QinshianpaiEntity> wrapper) {
		  Page<QinshianpaiView> page =new Query<QinshianpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QinshianpaiVO> selectListVO(Wrapper<QinshianpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QinshianpaiVO selectVO(Wrapper<QinshianpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QinshianpaiView> selectListView(Wrapper<QinshianpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QinshianpaiView selectView(Wrapper<QinshianpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
