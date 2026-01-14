# AiApp

1. Setup Instructions
2. Build the Project
3. Run the Application

# Architecture Overview
src/main/java/com/example/aiapp
 ┣ controller        # REST Controllers (API endpoints)
 ┣ service           # Business logic & AI integration
 ┣ dto               # Request/Response DTOs
 ┣ exception         # Custom exceptions & global handler
 ┣ config            # WebClient/OpenAI configuration
 ┗ AiApplication.java # Main Spring Boot entry point


# AI Service Used
Option 1: OpenAI API  
Integrated via WebClient to call GPT endpoints (requires API key in application.properties).

Option 2: Mocked Responses  
If no API key is provided, the service returns mocked AI responses for demonstration.

# API Endpoints
1. POST /api/summarize
Request

json
{
  "text": "Spring Boot makes it easy to create stand-alone applications..."
}

Response

json
{
  "summary": "Spring Boot simplifies building stand-alone applications."
}

2. Grammar Correction
POST /api/grammar-check

Request

json
{
  "text": "She go to school everyday."
}
Response

json
{
  "correctedText": "She goes to school every day."
}

3. Question & Answer
POST /api/qa

Request

json
{
  "question": "What is Spring Boot?"
}

Response

json
{
  "answer": "Spring Boot is a Java framework that simplifies building stand-alone applications."
}

4. Chat
POST /api/chat

Request

json
{
  "message": "Hello AI, how are you?"
}
Response

json
{
  "reply": "I'm doing great! How can I assist you today?"
}


## Technologies Used ##
Spring Boot (REST APIs, validation, exception handling)

WebClient (for OpenAI API calls)

Lombok (to reduce boilerplate code)

Maven (build tool)


