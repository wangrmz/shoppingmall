package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wrmeng
 * @create 2023-10-05 -14:42
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTest {

    @Autowired
    private BrandService brandService;

    @Test
    public void contextLoads(){
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("测试插入");
//        brandEntity.setName("华为");
//        boolean save = brandService.save(brandEntity);
//        if(save){
//            System.out.println("保存成功！");
//        }
    }
}
