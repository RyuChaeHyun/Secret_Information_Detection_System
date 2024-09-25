package com.kobot.secret_information_detection_system.service;

import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

  // Slack 알림 전송
  public void sendSlackNotification(String message) throws IOException {
    String webhookUrl = "https://hooks.slack.com/services/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";
    String payload = "{\"text\":\"" + message + "\"}";

    ProcessBuilder processBuilder = new ProcessBuilder("curl", "-X", "POST", "-H", "Content-type: application/json", "--data", payload, webhookUrl);
    processBuilder.start();
  }
}
