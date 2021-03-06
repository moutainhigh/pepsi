package com.zking.erp.service.jhui.impl;

import com.zking.erp.mapper.jhui.DepotItemMapperJ;
import com.zking.erp.model.jhui.DepotItem;
import com.zking.erp.service.jhui.IDepotItemJService;
import com.zking.erp.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepotItemJServiceImpl implements IDepotItemJService {
    @Autowired
    private DepotItemMapperJ depotItemMapperJ;

    @Override
    public List<DepotItem> queryDepotItemByMaterialId(DepotItem depotItem) {
        return depotItemMapperJ.queryDepotItemByMaterialId(depotItem);
    }

    @Override
    public List<DepotItem> queryByType(String type, String ProjectId, String MId, String MonthTime, Integer isPrev) {
        return depotItemMapperJ.queryByType(type,ProjectId,MId,MonthTime,isPrev);
    }

    @Override
    public List<DepotItem> queryDepotJoinTable(DepotItem depotItem) {
        return depotItemMapperJ.queryDepotJoinTable(depotItem);
    }

    @Override
    public int insert(DepotItem record) {
        return depotItemMapperJ.insert(record);
    }

    @Override
    public DepotItem selectById(String id) {
        return depotItemMapperJ.selectById(id);
    }

    @Override
    public int updateById(DepotItem record) {
        return depotItemMapperJ.updateById(record);
    }

    @Override
    public int deleteById(String id) {
        return depotItemMapperJ.deleteById(id);
    }

    @Override
    public List<DepotItem> queryByPrice(String type, String ProjectId, String MId, String MonthTime, Integer isPrev) {
        return depotItemMapperJ.queryByPrice(type,ProjectId,MId,MonthTime,isPrev);
    }

    @Override
    public List<DepotItem> totalCountMoney(DepotItem depotItem) {
        if(null!=depotItem.getMaterialIds()&&""!=depotItem.getMaterialIds()) {
            String[] split = depotItem.getMaterialIds().toString().split(",");
            depotItem.setMids(split);
        }
        if(null!=depotItem.getHeadIds()&&""!=depotItem.getHeadIds()) {
            String[] split = depotItem.getHeadIds().toString().split(",");
            depotItem.setHids(split);
        }
        return depotItemMapperJ.totalCountMoney(depotItem);
    }

    @Override
    public List<DepotItem> queryByAllPager(PageBean pageBean, DepotItem depotItem) {
        if(null!=depotItem.getMaterialIds()&&""!=depotItem.getMaterialIds()) {
            String[] split = depotItem.getMaterialIds().toString().split(",");
            depotItem.setMids(split);
        }
        if(null!=depotItem.getHeadIds()&&""!=depotItem.getHeadIds()) {
            String[] split = depotItem.getHeadIds().toString().split(",");
            depotItem.setHids(split);
        }
        return depotItemMapperJ.queryByAllPager(depotItem);
    }
}
