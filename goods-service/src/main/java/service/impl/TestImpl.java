package service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import goods.service.Test;
@Service
public class TestImpl implements Test{
    @Override
    public String test() {
        return "Success";
    }
}
