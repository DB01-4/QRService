package com.example.qrservice.service;

import com.example.qrservice.entity.QRCode;
import com.example.qrservice.repository.QRRepository;
import com.example.qrservice.entity.QRCode;
import com.example.qrservice.repository.QRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.repository.query.parser.Part;
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




    public Boolean CheckIfTableKeyExists(String tableKey){
        ExampleMatcher linkMatcher = ExampleMatcher.matching()
                .withIgnoreNullValues()
                .withIgnorePaths("id");

        QRCode qr = new QRCode();
        qr.link = tableKey;
        Example<QRCode> example = Example.of(qr, linkMatcher);
        return repository.exists(example);
    }

    public int ReturnTableFromKey(String tableKey){
        if (CheckIfTableKeyExists(tableKey)){
            QRCode qrcode = repository.findBylink(tableKey).get(0);
            return qrcode.id;
        }
        return 0;
    }

}
