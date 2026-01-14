package com.example.aiapp.service;

import com.example.aiapp.dto.SummarizeRequest;
import com.example.aiapp.dto.SummarizeResponse;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    public SummarizeResponse summarizeText(SummarizeRequest request) {
        // Mock AI response (replace with OpenAI API call if needed)
        String summary = "This is a mock summary of: " + request.getText();
        return new SummarizeResponse(summary);
    }
}
