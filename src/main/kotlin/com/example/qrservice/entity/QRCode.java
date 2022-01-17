package com.example.qrservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "qrcode")

public class QRCode {

    @Id
    public int id;
    public String link;

    public QRCode(String _link){
        link = _link;
    }

    public QRCode() {
    }
}