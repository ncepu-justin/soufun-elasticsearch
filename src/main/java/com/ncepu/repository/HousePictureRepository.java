package com.ncepu.repository;

import com.ncepu.entity.HousePicture;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Justin
 * 2018/8/20  22:14
 */
public interface HousePictureRepository extends CrudRepository<HousePicture, Long> {
    List<HousePicture> findAllByHouseId(Long id);
}
