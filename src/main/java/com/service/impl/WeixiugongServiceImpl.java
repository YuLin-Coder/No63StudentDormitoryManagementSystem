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


import com.dao.WeixiugongDao;
import com.entity.WeixiugongEntity;
import com.service.WeixiugongService;
import com.entity.vo.WeixiugongVO;
import com.entity.view.WeixiugongView;

@Service("weixiugongService")
public class WeixiugongServiceImpl extends ServiceImpl<WeixiugongDao, WeixiugongEntity> implements WeixiugongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiugongEntity> page = this.selectPage(
                new Query<WeixiugongEntity>(params).getPage(),
                new EntityWrapper<WeixiugongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiugongEntity> wrapper) {
		  Page<WeixiugongView> page =new Query<WeixiugongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiugongVO> selectListVO(Wrapper<WeixiugongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiugongVO selectVO(Wrapper<WeixiugongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiugongView> selectListView(Wrapper<WeixiugongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiugongView selectView(Wrapper<WeixiugongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
