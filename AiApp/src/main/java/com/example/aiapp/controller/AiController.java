package com.example.aiapp.controller;

import com.example.aiapp.dto.SummarizeRequest;
import com.example.aiapp.dto.SummarizeResponse;
import com.example.aiapp.service.AiService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/summarize")
    public ResponseEntity<SummarizeResponse> summarize(@Valid @RequestBody SummarizeRequest request) {
        return ResponseEntity.ok(aiService.summarizeText(request));
    }
}
