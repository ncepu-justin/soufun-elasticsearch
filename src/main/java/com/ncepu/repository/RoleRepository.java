package com.ncepu.repository;

import com.ncepu.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Justin
 * 2018/8/20  10:25
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findRolesByUserId(Long userId);
}
