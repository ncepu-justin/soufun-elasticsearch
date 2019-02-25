package com.ncepu.repository;

import com.ncepu.entity.HouseDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Justin
 * 2018/8/20  22:14
 */
public interface HouseDetailRepository extends CrudRepository<HouseDetail, Long> {
    HouseDetail findByHouseId(Long houseId);

    List<HouseDetail> findAllByHouseIdIn(List<Long> houseIds);
}
