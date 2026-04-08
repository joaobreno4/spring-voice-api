package com.joaobreno.sentinelvoiceapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/voice")
public class VoiceController {

    @PostMapping("/transcribe")
    public ResponseEntity<String> receiveAudio(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Arquivo vazio.");
        }
        return ResponseEntity.ok("Sentinel recebeu: " + file.getOriginalFilename());
    }
}
