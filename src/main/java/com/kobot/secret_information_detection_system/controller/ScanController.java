package com.kobot.secret_information_detection_system.controller;

import com.kobot.secret_information_detection_system.service.NotificationService;
import com.kobot.secret_information_detection_system.service.TrivyScanService;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/scan")
public class ScanController {

  private final TrivyScanService trivyScanService;

  private final NotificationService notificationService;

  @PostMapping
  public String scanRepository(@RequestParam String repoUrl) {
    try {
      String result = trivyScanService.scanRepository(repoUrl);

      // 비밀 정보가 발견되었을 때 알림 전송
      if (result.contains("Secrets detected")) {
        notificationService.sendSlackNotification("Secret detected in repository: " + repoUrl);
      }
      // 이상이 없을 때 알림
      else{
        notificationService.sendSlackNotification("The results of the detected in repository are clear");
      }

      return result;
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
      return "Error occurred while scanning repository.";
    }
  }
}
