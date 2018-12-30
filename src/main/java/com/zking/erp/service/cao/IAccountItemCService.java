package com.zking.erp.service.cao;

import com.zking.erp.model.cao.AccountItem;

import java.util.List;

public interface IAccountItemCService {

    List<AccountItem> queryAccountItemByHeaderId(AccountItem accountItem);

    /**
     * 单个账户的金额求和-收款、付款、转账、收预付款的单据明细的合计
     *
     * @param id
     * @return
     */
    List<AccountItem>  queryAccountItemByItem(String id,String ids);

}
