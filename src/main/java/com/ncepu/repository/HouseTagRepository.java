package com.ncepu.repository;

import com.ncepu.entity.HouseTag;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Justin
 * 2018/8/20  22:16
 */
public interface HouseTagRepository extends CrudRepository<HouseTag, Long> {
    HouseTag findByNameAndHouseId(String name, Long houseId);

    List<HouseTag> findAllByHouseId(Long id);

    List<HouseTag> findAllByHouseIdIn(List<Long> houseIds);
}
