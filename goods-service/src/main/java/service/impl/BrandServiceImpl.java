package service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import goods.service.BrandService;
import mapper.TbBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.TbBrand;


import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private TbBrandMapper tbBrandMapper;


    @Override
    public List<TbBrand> findAll() {
        return tbBrandMapper.selectByExample(null);
    }
}
