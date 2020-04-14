package com.book.mall.ServiceImpl;

import com.book.mall.dao.ShopCarDao;
import com.book.mall.domain.ShopCar;
import com.book.mall.service.ShopCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopCarServiceImpl implements ShopCarService {

    @Resource
    ShopCarDao shopCarDao;

    @Override
    public List<ShopCar> selectShopCarsByUserId(Integer userId)
    {
        return shopCarDao.selectShopCarsByUserId(userId);
    }

    @Override
    public Integer insertShopCar(ShopCar shopCar)
    {
        return shopCarDao.insertShopCar(shopCar);
    }

    @Override
    public Integer deleteShopCar(Integer userId,Integer bookId)
    {
        return shopCarDao.deleteShopCar(userId,bookId);
    }

    @Override
    public Integer updateShopCar(ShopCar shopCar)
    {
        return shopCarDao.updateShopCar(shopCar);
    }
}
