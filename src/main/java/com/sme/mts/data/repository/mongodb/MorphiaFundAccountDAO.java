package com.sme.mts.data.repository.mongodb;

import com.sme.mts.data.document.FundAccount;
import com.sme.mts.data.repository.DocDAO;
import com.sme.mts.data.repository.FundAccountDocDAO;
import org.springframework.stereotype.Repository;

@Repository
public class MorphiaFundAccountDAO extends MorphiaDAO<FundAccount,DocDAO.Filter> implements FundAccountDocDAO {

    @Override
    protected Class<FundAccount> entityClass(Filter filter) {
        return FundAccount.class;
    }
}
