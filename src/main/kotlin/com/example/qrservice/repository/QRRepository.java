package com.example.qrservice.repository;

import com.example.qrservice.entity.QRCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QRRepository extends JpaRepository<QRCode, Integer> {
}