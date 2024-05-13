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


import com.dao.DiscussxiangcefenxiangDao;
import com.entity.DiscussxiangcefenxiangEntity;
import com.service.DiscussxiangcefenxiangService;
import com.entity.vo.DiscussxiangcefenxiangVO;
import com.entity.view.DiscussxiangcefenxiangView;

@Service("discussxiangcefenxiangService")
public class DiscussxiangcefenxiangServiceImpl extends ServiceImpl<DiscussxiangcefenxiangDao, DiscussxiangcefenxiangEntity> implements DiscussxiangcefenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxiangcefenxiangEntity> page = this.selectPage(
                new Query<DiscussxiangcefenxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussxiangcefenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxiangcefenxiangEntity> wrapper) {
		  Page<DiscussxiangcefenxiangView> page =new Query<DiscussxiangcefenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxiangcefenxiangVO> selectListVO(Wrapper<DiscussxiangcefenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxiangcefenxiangVO selectVO(Wrapper<DiscussxiangcefenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxiangcefenxiangView> selectListView(Wrapper<DiscussxiangcefenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxiangcefenxiangView selectView(Wrapper<DiscussxiangcefenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
