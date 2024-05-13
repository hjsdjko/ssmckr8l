package com.dao;

import com.entity.DiscussxiangcefenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxiangcefenxiangVO;
import com.entity.view.DiscussxiangcefenxiangView;


/**
 * 相册分享评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-28 23:53:30
 */
public interface DiscussxiangcefenxiangDao extends BaseMapper<DiscussxiangcefenxiangEntity> {
	
	List<DiscussxiangcefenxiangVO> selectListVO(@Param("ew") Wrapper<DiscussxiangcefenxiangEntity> wrapper);
	
	DiscussxiangcefenxiangVO selectVO(@Param("ew") Wrapper<DiscussxiangcefenxiangEntity> wrapper);
	
	List<DiscussxiangcefenxiangView> selectListView(@Param("ew") Wrapper<DiscussxiangcefenxiangEntity> wrapper);

	List<DiscussxiangcefenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxiangcefenxiangEntity> wrapper);
	
	DiscussxiangcefenxiangView selectView(@Param("ew") Wrapper<DiscussxiangcefenxiangEntity> wrapper);
	
}
