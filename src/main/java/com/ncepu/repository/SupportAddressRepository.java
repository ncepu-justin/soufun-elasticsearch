package com.ncepu.repository;

import com.ncepu.entity.SupportAddress;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Justin
 * 2018/8/20  17:57
 */
public interface SupportAddressRepository extends CrudRepository<SupportAddress, Long> {
    /**
     * 获取所有对应行政级别的信息
     * @return
     */
    List<SupportAddress> findAllByLevel(String level);

    SupportAddress findByEnNameAndLevel(String enName, String level);

    SupportAddress findByEnNameAndBelongTo(String enName, String belongTo);

    List<SupportAddress> findAllByLevelAndBelongTo(String level, String belongTo);

}
