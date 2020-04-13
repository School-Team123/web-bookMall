package com.book.mall.controller;

import com.book.mall.ServiceImpl.ShopCarServiceImpl;
import com.book.mall.domain.Order;
import com.book.mall.domain.ShopCar;
import com.book.mall.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/shopCar")
public class ShopCarController {

    @Resource
    ShopCarServiceImpl shopCarServiceImpl;

    @PostMapping("/getShopCarsByUserId")
    @ResponseBody
    public Result getShopCarsByUserId(@RequestParam("userId") Integer  userId)
    {
        Result<List<ShopCar>> result = new Result<>();
        result.setResultCode(200);
        result.setMessage("根据用户id获取购物车内容成功");
        result.setData(shopCarServiceImpl.selectShopCarsByUserId(userId));
        return result;
    }

}
