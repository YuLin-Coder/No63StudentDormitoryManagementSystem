package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WeixiuqingkuangEntity;
import com.entity.view.WeixiuqingkuangView;

import com.service.WeixiuqingkuangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 维修情况
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-22 17:39:28
 */
@RestController
@RequestMapping("/weixiuqingkuang")
public class WeixiuqingkuangController {
    @Autowired
    private WeixiuqingkuangService weixiuqingkuangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WeixiuqingkuangEntity weixiuqingkuang, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			weixiuqingkuang.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("weixiugong")) {
			weixiuqingkuang.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WeixiuqingkuangEntity> ew = new EntityWrapper<WeixiuqingkuangEntity>();
		PageUtils page = weixiuqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weixiuqingkuang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WeixiuqingkuangEntity weixiuqingkuang, HttpServletRequest request){
        EntityWrapper<WeixiuqingkuangEntity> ew = new EntityWrapper<WeixiuqingkuangEntity>();
		PageUtils page = weixiuqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weixiuqingkuang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WeixiuqingkuangEntity weixiuqingkuang){
       	EntityWrapper<WeixiuqingkuangEntity> ew = new EntityWrapper<WeixiuqingkuangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( weixiuqingkuang, "weixiuqingkuang")); 
        return R.ok().put("data", weixiuqingkuangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WeixiuqingkuangEntity weixiuqingkuang){
        EntityWrapper< WeixiuqingkuangEntity> ew = new EntityWrapper< WeixiuqingkuangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( weixiuqingkuang, "weixiuqingkuang")); 
		WeixiuqingkuangView weixiuqingkuangView =  weixiuqingkuangService.selectView(ew);
		return R.ok("查询维修情况成功").put("data", weixiuqingkuangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WeixiuqingkuangEntity weixiuqingkuang = weixiuqingkuangService.selectById(id);
        return R.ok().put("data", weixiuqingkuang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WeixiuqingkuangEntity weixiuqingkuang = weixiuqingkuangService.selectById(id);
        return R.ok().put("data", weixiuqingkuang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WeixiuqingkuangEntity weixiuqingkuang, HttpServletRequest request){
    	weixiuqingkuang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(weixiuqingkuang);

        weixiuqingkuangService.insert(weixiuqingkuang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WeixiuqingkuangEntity weixiuqingkuang, HttpServletRequest request){
    	weixiuqingkuang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(weixiuqingkuang);

        weixiuqingkuangService.insert(weixiuqingkuang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WeixiuqingkuangEntity weixiuqingkuang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(weixiuqingkuang);
        weixiuqingkuangService.updateById(weixiuqingkuang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        weixiuqingkuangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WeixiuqingkuangEntity> wrapper = new EntityWrapper<WeixiuqingkuangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("weixiugong")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = weixiuqingkuangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
