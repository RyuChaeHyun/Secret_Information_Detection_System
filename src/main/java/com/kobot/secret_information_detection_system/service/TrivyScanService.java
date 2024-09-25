package com.kobot.secret_information_detection_system.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.stereotype.Service;

@Service
public class TrivyScanService {

  public String scanRepository(String repoUrl) throws IOException, InterruptedException {
    ProcessBuilder processBuilder = new ProcessBuilder("./scan.sh", repoUrl);
    processBuilder.redirectErrorStream(true);
    Process process = processBuilder.start();

    StringBuilder result = new StringBuilder();

    // 표준 출력 로그 처리
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
    String line;
    while ((line = reader.readLine()) != null) {
      result.append(line).append("\n");
    }

    // 프로세스가 종료될 때까지 기다림
    int exitCode = process.waitFor();

    // 비정상 종료일 경우 에러 처리
    if (exitCode != 0) {
      result.append("Error occurred while scanning repository. Exit code: ").append(exitCode).append("\n");
    }
    return result.toString();
  }
}
