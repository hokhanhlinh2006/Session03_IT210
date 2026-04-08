package re.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// Định nghĩa đường dẫn chung
@Controller
@RequestMapping("/students")
public class StudentController {
    @RequestMapping(value = "home")
    public String home() {
        // redirect: chuyển tiếp yêu cầu
        return "redirect:/students/success-page";
    }

    @RequestMapping("/success-page")
    public String success() {
        return "success";
    }

    // nhận tham số gửi từ request
    @PostMapping("/submit")
    public String submit(@RequestParam("name") String fullName,
                         @RequestParam("email") String email) {
        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        return "success";
    }

    @GetMapping("/{id}")
    public String getStudentById(@PathVariable("id") int id) {
        System.out.println("Student ID: " + id);
        return "success";
    }
}