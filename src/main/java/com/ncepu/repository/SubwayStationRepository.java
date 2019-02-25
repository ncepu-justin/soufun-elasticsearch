package com.ncepu.repository;

import com.ncepu.entity.SubwayStation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Justin
 * 2018/8/20  21:29
 */
public interface SubwayStationRepository extends CrudRepository<SubwayStation, Long> {
    List<SubwayStation> findAllBySubwayId(Long subwayId);
}
