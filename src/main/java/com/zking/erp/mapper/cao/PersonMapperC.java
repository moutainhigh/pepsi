package com.zking.erp.mapper.cao;

import com.zking.erp.model.cao.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonMapperC {

    /**
     * 查看所有经手人
     * @return
     */
    List<Person> queryPersonAll();

}