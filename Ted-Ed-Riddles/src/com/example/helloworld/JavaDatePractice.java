package com.example.helloworld;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

// https://www.google.com/search?q=how+to+remove+timestamp+from+date+in+java&oq=how+to+remove+timestamp+from+ja&gs_lcrp=EgZjaHJvbWUqCAgBEAAYFhgeMgYIABBFGDkyCAgBEAAYFhgeMggIAhAAGBYYHjINCAMQABiGAxiABBiKBTIHCAQQABjvBTIHCAUQABjvBTIHCAYQABjvBTIKCAcQABiABBiiBNIBCTEwNzY3ajBqN6gCCLACAfEF4L8r3snPipTxBeC_K97Jz4qU&sourceid=chrome&source=chrome.ob&ie=UTF-8


public class JavaDatePractice {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now(); // 2026-08-22T08:30:00

        // Extract only the date portion
        LocalDate dateOnly = dateTime.toLocalDate();

        System.out.println(dateOnly); // Outputs: 2026-08-22

        // Convert LocalDate to java.util.Date
        Date date = Date.from(dateOnly.atStartOfDay(ZoneId.systemDefault()).toInstant());

        System.out.println(date);
    }


}
