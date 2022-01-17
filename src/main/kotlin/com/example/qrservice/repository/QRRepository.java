package com.example.qrservice.repository;

import com.example.qrservice.entity.QRCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QRRepository extends JpaRepository<QRCode, Integer> {

    List<QRCode> findBylink(String link);
}