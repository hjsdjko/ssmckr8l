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


import com.dao.DiscussbokewenzhangDao;
import com.entity.DiscussbokewenzhangEntity;
import com.service.DiscussbokewenzhangService;
import com.entity.vo.DiscussbokewenzhangVO;
import com.entity.view.DiscussbokewenzhangView;

@Service("discussbokewenzhangService")
public class DiscussbokewenzhangServiceImpl extends ServiceImpl<DiscussbokewenzhangDao, DiscussbokewenzhangEntity> implements DiscussbokewenzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbokewenzhangEntity> page = this.selectPage(
                new Query<DiscussbokewenzhangEntity>(params).getPage(),
                new EntityWrapper<DiscussbokewenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbokewenzhangEntity> wrapper) {
		  Page<DiscussbokewenzhangView> page =new Query<DiscussbokewenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbokewenzhangVO> selectListVO(Wrapper<DiscussbokewenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbokewenzhangVO selectVO(Wrapper<DiscussbokewenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbokewenzhangView> selectListView(Wrapper<DiscussbokewenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbokewenzhangView selectView(Wrapper<DiscussbokewenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
