package com.isoft.dao;

import com.isoft.pojo.entity.Cart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.isoft.pojo.vo.CartVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ${author}
 */
public interface CartMapper extends BaseMapper<Cart> {

    List<CartVo> list1(Integer id);

    @Update("update cart set amount = #{value} where id = #{id}")
    int updAmount(@Param("uid") Integer uid, @Param("id") Integer id, @Param("value") Integer value);

    @Delete("delete from cart where userid = #{userid} and flowerid = #{id}")
    int removeById2(@Param("userid") Integer userid, @Param("id") Integer id);
}
