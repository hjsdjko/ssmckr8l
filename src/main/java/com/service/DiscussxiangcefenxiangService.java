package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxiangcefenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxiangcefenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxiangcefenxiangView;


/**
 * 相册分享评论表
 *
 * @author 
 * @email 
 * @date 2021-05-28 23:53:30
 */
public interface DiscussxiangcefenxiangService extends IService<DiscussxiangcefenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxiangcefenxiangVO> selectListVO(Wrapper<DiscussxiangcefenxiangEntity> wrapper);
   	
   	DiscussxiangcefenxiangVO selectVO(@Param("ew") Wrapper<DiscussxiangcefenxiangEntity> wrapper);
   	
   	List<DiscussxiangcefenxiangView> selectListView(Wrapper<DiscussxiangcefenxiangEntity> wrapper);
   	
   	DiscussxiangcefenxiangView selectView(@Param("ew") Wrapper<DiscussxiangcefenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxiangcefenxiangEntity> wrapper);
   	
}

