package com.dao;

import com.entity.XiangcefenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangcefenleiVO;
import com.entity.view.XiangcefenleiView;


/**
 * 相册分类
 * 
 * @author 
 * @email 
 * @date 2021-05-28 23:53:30
 */
public interface XiangcefenleiDao extends BaseMapper<XiangcefenleiEntity> {
	
	List<XiangcefenleiVO> selectListVO(@Param("ew") Wrapper<XiangcefenleiEntity> wrapper);
	
	XiangcefenleiVO selectVO(@Param("ew") Wrapper<XiangcefenleiEntity> wrapper);
	
	List<XiangcefenleiView> selectListView(@Param("ew") Wrapper<XiangcefenleiEntity> wrapper);

	List<XiangcefenleiView> selectListView(Pagination page,@Param("ew") Wrapper<XiangcefenleiEntity> wrapper);
	
	XiangcefenleiView selectView(@Param("ew") Wrapper<XiangcefenleiEntity> wrapper);
	
}
