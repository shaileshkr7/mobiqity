package com.example.mobiqity.controller;

import com.example.mobiqity.service.EncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EncryptionController {

    @Autowired
    private EncryptionService encryptionService;

    @PostMapping("/encrypt")
    public String encrypt(@RequestBody String plainText) {
        return encryptionService.encrypt(plainText);
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestBody String cipherText) {
        return encryptionService.decrypt(cipherText);
    }
}
