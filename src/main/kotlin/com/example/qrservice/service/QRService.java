package com.example.qrservice.service;

import com.example.qrservice.entity.QRCode;
import com.example.qrservice.repository.QRRepository;
import com.example.qrservice.entity.QRCode;
import com.example.qrservice.repository.QRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QRService {

    @Autowired
    private QRRepository repository;

    //get QR
    public List<QRCode> getQRs() {
        return repository.findAll();
    }

    public QRCode getQRById (int id) {
        return repository.findById(id).orElse(null);
    }

}
