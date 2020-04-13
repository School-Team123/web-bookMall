package com.book.mall.service;

import com.book.mall.domain.ShopCar;

import java.util.List;

public interface ShopCarService {
    /**
     * 根据用户id获取购物车所有内容
     *
     * @param userId
     * @return
     */
    List<ShopCar> selectShopCarsByUserId(Integer userId);
}
