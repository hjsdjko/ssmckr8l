package com.dao;

import com.entity.DiscussbokewenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbokewenzhangVO;
import com.entity.view.DiscussbokewenzhangView;


/**
 * 博客文章评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-28 23:53:30
 */
public interface DiscussbokewenzhangDao extends BaseMapper<DiscussbokewenzhangEntity> {
	
	List<DiscussbokewenzhangVO> selectListVO(@Param("ew") Wrapper<DiscussbokewenzhangEntity> wrapper);
	
	DiscussbokewenzhangVO selectVO(@Param("ew") Wrapper<DiscussbokewenzhangEntity> wrapper);
	
	List<DiscussbokewenzhangView> selectListView(@Param("ew") Wrapper<DiscussbokewenzhangEntity> wrapper);

	List<DiscussbokewenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbokewenzhangEntity> wrapper);
	
	DiscussbokewenzhangView selectView(@Param("ew") Wrapper<DiscussbokewenzhangEntity> wrapper);
	
}
