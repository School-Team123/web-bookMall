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

    //根据用户ID获取购物车里的内容
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

    //添加内容进购物车
    @PostMapping("/addBookToShopCar")
    @ResponseBody
    public Result addBookToShopCar(@RequestParam("userId") Integer  userId,
                                   @RequestParam("bookId") Integer  bookId,
                                   @RequestParam("bookNum") Integer  bookNum)
    {
        Result<List<ShopCar>> result = new Result<>();
        ShopCar shopCar = new ShopCar();
        shopCar.setUserId(userId);
        shopCar.setBookId(bookId);
        shopCar.setBookNum(bookNum);

        if(shopCarServiceImpl.insertShopCar(shopCar) != 0)
        {
            result.setResultCode(200);
            result.setMessage("添加购物车成功");
        }
        else
        {
            result.setResultCode(200);
            result.setMessage("添加购物车失败");
        }
        return result;
    }

    //修改购物车内容
    @PostMapping("/updateShopCar")
    @ResponseBody
    public Result updateShopCar(@RequestParam("userId") Integer  userId,
                                   @RequestParam("bookId") Integer  bookId,
                                   @RequestParam("bookNum") Integer  bookNum)
    {
        Result<List<ShopCar>> result = new Result<>();
        ShopCar shopCar = new ShopCar();
        shopCar.setUserId(userId);
        shopCar.setBookId(bookId);
        shopCar.setBookNum(bookNum);

        if(shopCarServiceImpl.updateShopCar(shopCar) != 0)
        {
            result.setResultCode(200);
            result.setMessage("修改内容成功");
        }
        else
        {
            result.setResultCode(200);
            result.setMessage("修改内容失败");
        }
        return result;
    }

    //删除购物车内容
    @PostMapping("/deleteShopCar")
    @ResponseBody
    public Result deleteShopCar(@RequestParam("userId") Integer  userId,
                                @RequestParam("bookId") Integer  bookId)
    {
        Result<List<ShopCar>> result = new Result<>();

        if(shopCarServiceImpl.deleteShopCar(userId,bookId) != 0)
        {
            result.setResultCode(200);
            result.setMessage("删除内容成功");
        }
        else
        {
            result.setResultCode(200);
            result.setMessage("删除内容失败");
        }
        return result;
    }

}
