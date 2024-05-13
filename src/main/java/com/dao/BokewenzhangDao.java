package com.dao;

import com.entity.BokewenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BokewenzhangVO;
import com.entity.view.BokewenzhangView;


/**
 * 博客文章
 * 
 * @author 
 * @email 
 * @date 2021-05-28 23:53:30
 */
public interface BokewenzhangDao extends BaseMapper<BokewenzhangEntity> {
	
	List<BokewenzhangVO> selectListVO(@Param("ew") Wrapper<BokewenzhangEntity> wrapper);
	
	BokewenzhangVO selectVO(@Param("ew") Wrapper<BokewenzhangEntity> wrapper);
	
	List<BokewenzhangView> selectListView(@Param("ew") Wrapper<BokewenzhangEntity> wrapper);

	List<BokewenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<BokewenzhangEntity> wrapper);
	
	BokewenzhangView selectView(@Param("ew") Wrapper<BokewenzhangEntity> wrapper);
	
}
