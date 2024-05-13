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


import com.dao.BokewenzhangDao;
import com.entity.BokewenzhangEntity;
import com.service.BokewenzhangService;
import com.entity.vo.BokewenzhangVO;
import com.entity.view.BokewenzhangView;

@Service("bokewenzhangService")
public class BokewenzhangServiceImpl extends ServiceImpl<BokewenzhangDao, BokewenzhangEntity> implements BokewenzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BokewenzhangEntity> page = this.selectPage(
                new Query<BokewenzhangEntity>(params).getPage(),
                new EntityWrapper<BokewenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BokewenzhangEntity> wrapper) {
		  Page<BokewenzhangView> page =new Query<BokewenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BokewenzhangVO> selectListVO(Wrapper<BokewenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BokewenzhangVO selectVO(Wrapper<BokewenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BokewenzhangView> selectListView(Wrapper<BokewenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BokewenzhangView selectView(Wrapper<BokewenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
