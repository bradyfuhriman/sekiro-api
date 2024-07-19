package com.sekiroapi.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sekiroapi.rest.models.Merchant;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Integer> {

}
