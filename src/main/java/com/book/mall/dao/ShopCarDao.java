package com.book.mall.dao;

import com.book.mall.domain.ShopCar;

import java.util.List;

public interface ShopCarDao {

    /**
     * 根据用户id获取购物车所有内容
     *
     * @param userId
     * @return
     */
    List<ShopCar> selectShopCarsByUserId(Integer userId);

    /**
     * 往购物车里插入数据
     *
     * @param shopCar
     * @return
     */
    Integer insertShopCar(ShopCar shopCar);

    /**
     * 修改购物车里数量
     *
     * @param shopCar
     * @return
     */
    Integer updateShopCar(ShopCar shopCar);

    /**
     * 删除购物车里的条目
     *
     * @return
     */
    Integer deleteShopCar(Integer userId,Integer bookId);
}
