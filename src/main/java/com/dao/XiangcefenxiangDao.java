package com.dao;

import com.entity.XiangcefenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangcefenxiangVO;
import com.entity.view.XiangcefenxiangView;


/**
 * 相册分享
 * 
 * @author 
 * @email 
 * @date 2021-05-28 23:53:30
 */
public interface XiangcefenxiangDao extends BaseMapper<XiangcefenxiangEntity> {
	
	List<XiangcefenxiangVO> selectListVO(@Param("ew") Wrapper<XiangcefenxiangEntity> wrapper);
	
	XiangcefenxiangVO selectVO(@Param("ew") Wrapper<XiangcefenxiangEntity> wrapper);
	
	List<XiangcefenxiangView> selectListView(@Param("ew") Wrapper<XiangcefenxiangEntity> wrapper);

	List<XiangcefenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<XiangcefenxiangEntity> wrapper);
	
	XiangcefenxiangView selectView(@Param("ew") Wrapper<XiangcefenxiangEntity> wrapper);
	
}
