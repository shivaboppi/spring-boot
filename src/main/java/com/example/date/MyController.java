package com.example.date;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@RestController
public class MyController {
        
         @GetMapping("/")
        public String todayDate(){
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyy"); 
            String formatDateTime = now.format(format1);
            return formatDateTime;
        }
}
