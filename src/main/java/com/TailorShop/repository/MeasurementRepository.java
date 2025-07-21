package com.TailorShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TailorShop.model.Measurement;

public interface MeasurementRepository extends JpaRepository<Measurement, Long>{

}
