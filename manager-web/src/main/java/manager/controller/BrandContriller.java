package manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import goods.service.BrandService;
import goods.service.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.TbBrand;

import java.util.List;

@RestController
public class BrandContriller {
    @Reference
    private BrandService brandService;

    @Reference
    private Test test;

    @RequestMapping("/findall")
    public List<TbBrand> findAll() {
        return brandService.findAll();
    }

    @ResponseBody
    @RequestMapping("/test")
    public String ha() {
        return test.test();
    }

}
