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


import com.dao.WeixiuqingkuangDao;
import com.entity.WeixiuqingkuangEntity;
import com.service.WeixiuqingkuangService;
import com.entity.vo.WeixiuqingkuangVO;
import com.entity.view.WeixiuqingkuangView;

@Service("weixiuqingkuangService")
public class WeixiuqingkuangServiceImpl extends ServiceImpl<WeixiuqingkuangDao, WeixiuqingkuangEntity> implements WeixiuqingkuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiuqingkuangEntity> page = this.selectPage(
                new Query<WeixiuqingkuangEntity>(params).getPage(),
                new EntityWrapper<WeixiuqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiuqingkuangEntity> wrapper) {
		  Page<WeixiuqingkuangView> page =new Query<WeixiuqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiuqingkuangVO> selectListVO(Wrapper<WeixiuqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiuqingkuangVO selectVO(Wrapper<WeixiuqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiuqingkuangView> selectListView(Wrapper<WeixiuqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiuqingkuangView selectView(Wrapper<WeixiuqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
