package goods.service;

import entity.PageResult;
import pojo.TbBrand;

import java.util.List;

public interface BrandService {
    public List<TbBrand> findAll();

    /**
     * 品牌分页
     *
     * @param pagenum
     * @param pagesize
     * @return
     */
    public PageResult findPage(int pagenum, int pagesize);

    /**
     * 增加产品
     *
     * @param tbBrand
     */
    public void add(TbBrand tbBrand);
}
