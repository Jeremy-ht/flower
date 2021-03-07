package com.isoft.dao;

import com.isoft.pojo.entity.Flowers;
import com.isoft.pojo.entity.Ordercent;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.isoft.pojo.vo.EchartsVo;
import com.isoft.pojo.vo.FlowersVo2;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}

 */
public interface OrdercentMapper extends BaseMapper<Ordercent> {

    List<EchartsVo> getEchartsOrder();

    List<EchartsVo> getEchartsCate();

    List<Flowers> selectList2();

}
