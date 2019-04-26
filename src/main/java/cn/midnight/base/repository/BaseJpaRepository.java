package cn.midnight.base.repository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import cn.midnight.base.entity.BaseEntity;

@NoRepositoryBean
public interface BaseJpaRepository<T extends BaseEntity<ID>, ID extends Serializable> extends JpaRepository<T, ID> {

}
