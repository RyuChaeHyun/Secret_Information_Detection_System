package com.kobot.secret_information_detection_system.service;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Value;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

  @Value("${slack.webhook}")
  private String webhookUrl;

  // Slack 알림 전송
  public void sendSlackNotification(String message) throws IOException {
    String payload = "{\"text\":\"" + message + "\"}";

    ProcessBuilder processBuilder = new ProcessBuilder("curl", "-X", "POST", "-H", "Content-type: application/json", "--data", payload, webhookUrl);
    processBuilder.start();
  }
}
