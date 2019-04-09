package manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import entity.PageResult;
import entity.Result;
import goods.service.BrandService;
import goods.service.Test;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("/findPage")
    public PageResult findpage(int page, int sizee) {
        return brandService.findPage(page, sizee);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody TbBrand brand) {
        try {
            brandService.add(brand);
            return new Result(true, "success");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "fail");
        }
    }


}
