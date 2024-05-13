package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbokewenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbokewenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbokewenzhangView;


/**
 * 博客文章评论表
 *
 * @author 
 * @email 
 * @date 2021-05-28 23:53:30
 */
public interface DiscussbokewenzhangService extends IService<DiscussbokewenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbokewenzhangVO> selectListVO(Wrapper<DiscussbokewenzhangEntity> wrapper);
   	
   	DiscussbokewenzhangVO selectVO(@Param("ew") Wrapper<DiscussbokewenzhangEntity> wrapper);
   	
   	List<DiscussbokewenzhangView> selectListView(Wrapper<DiscussbokewenzhangEntity> wrapper);
   	
   	DiscussbokewenzhangView selectView(@Param("ew") Wrapper<DiscussbokewenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbokewenzhangEntity> wrapper);
   	
}

