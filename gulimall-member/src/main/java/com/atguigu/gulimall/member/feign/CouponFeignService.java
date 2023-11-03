package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wrmeng
 * @create 2023-10-05 -23:17
 **/

/**
 * @FeignClient:声明这是一个远程调用客户端
 * 声明式的远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    /**
     * 需要写完整的路径
     * @return
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
