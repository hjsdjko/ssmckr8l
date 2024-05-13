package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangcefenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangcefenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangcefenxiangView;


/**
 * 相册分享
 *
 * @author 
 * @email 
 * @date 2021-05-28 23:53:30
 */
public interface XiangcefenxiangService extends IService<XiangcefenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangcefenxiangVO> selectListVO(Wrapper<XiangcefenxiangEntity> wrapper);
   	
   	XiangcefenxiangVO selectVO(@Param("ew") Wrapper<XiangcefenxiangEntity> wrapper);
   	
   	List<XiangcefenxiangView> selectListView(Wrapper<XiangcefenxiangEntity> wrapper);
   	
   	XiangcefenxiangView selectView(@Param("ew") Wrapper<XiangcefenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangcefenxiangEntity> wrapper);
   	
}

