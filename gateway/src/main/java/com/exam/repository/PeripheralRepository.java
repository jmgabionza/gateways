/**
 * 
 */
package com.exam.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exam.domain.Peripheral;

/**
 * @author JANMICHAEL.GABIONZA
 *
 */
@Repository
public interface PeripheralRepository extends CrudRepository<Peripheral, String> {
}
