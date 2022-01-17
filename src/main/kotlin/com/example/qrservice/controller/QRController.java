package com.example.qrservice.controller;
import com.example.qrservice.entity.QRCode;
import com.example.qrservice.repository.QRRepository;
import com.example.qrservice.service.QRService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("api/")
@RestController
public class QRController {

    @Autowired
    private QRService service;

    //Get qr codes
    @GetMapping("/qrs")
    public List<QRCode> getQRs() {
        return service.getQRs();
    }

    //Get qr code by id
    @GetMapping("/qr/{id}")
    public QRCode findQRById(@PathVariable int id) {
        return service.getQRById(id);
    }

    @PutMapping("/update/{id}")
    public void updateUser(@PathVariable int id) {
        service.UpdateQR(id);
    }

    @GetMapping("/check/{tableKey}")
    public Boolean CheckTableKey(@PathVariable String tableKey) { return service.CheckIfTableKeyExists(tableKey); }

    @GetMapping("/gettable/{tableKey}")
    public int ReturnTableFromKey(@PathVariable String tableKey){ return service.ReturnTableFromKey(tableKey);}




}
