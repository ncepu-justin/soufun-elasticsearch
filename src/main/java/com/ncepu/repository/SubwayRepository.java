package com.ncepu.repository;

import com.ncepu.entity.Subway;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Justin
 * 2018/8/20  21:29
 */
public interface SubwayRepository extends CrudRepository<Subway, Long> {
    List<Subway> findAllByCityEnName(String cityEnName);
}
