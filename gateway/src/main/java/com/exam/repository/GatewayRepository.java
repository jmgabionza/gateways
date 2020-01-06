/**
 * 
 */
package com.exam.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exam.domain.Gateway;

/**
 * @author JANMICHAEL.GABIONZA
 *
 */
@Repository
public interface GatewayRepository extends CrudRepository<Gateway, String> {

}
