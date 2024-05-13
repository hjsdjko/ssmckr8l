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


import com.dao.XiangcefenxiangDao;
import com.entity.XiangcefenxiangEntity;
import com.service.XiangcefenxiangService;
import com.entity.vo.XiangcefenxiangVO;
import com.entity.view.XiangcefenxiangView;

@Service("xiangcefenxiangService")
public class XiangcefenxiangServiceImpl extends ServiceImpl<XiangcefenxiangDao, XiangcefenxiangEntity> implements XiangcefenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangcefenxiangEntity> page = this.selectPage(
                new Query<XiangcefenxiangEntity>(params).getPage(),
                new EntityWrapper<XiangcefenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangcefenxiangEntity> wrapper) {
		  Page<XiangcefenxiangView> page =new Query<XiangcefenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangcefenxiangVO> selectListVO(Wrapper<XiangcefenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangcefenxiangVO selectVO(Wrapper<XiangcefenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangcefenxiangView> selectListView(Wrapper<XiangcefenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangcefenxiangView selectView(Wrapper<XiangcefenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
