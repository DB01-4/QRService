package com.example.qrservice.service;

import com.example.qrservice.entity.QRCode;
import com.example.qrservice.repository.QRRepository;
import com.example.qrservice.entity.QRCode;
import com.example.qrservice.repository.QRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.qrservice.service.RandomString;

import java.util.List;
import java.util.Random;

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

    //update QR
    public QRCode UpdateQR(int id){
        QRCode existingCode=repository.findById(id).orElse(null);
        RandomString rand = new RandomString();
        existingCode.link = rand.GenerateNewKey();

        return repository.save(existingCode);
    }

}
