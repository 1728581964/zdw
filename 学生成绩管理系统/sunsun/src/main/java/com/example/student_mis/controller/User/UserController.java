package com.example.student_mis.controller.User;

import com.example.student_mis.dto.User;
import com.example.student_mis.service.User.UserService;
import com.example.student_mis.utils.PassToken;
import com.example.student_mis.utils.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/4 20:29
 */
@RestController
@UserLoginToken
@RequestMapping("/api/sms/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    @PassToken
    public User getStudentInfo (@RequestParam Map<String, Object> condition) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", condition.get("username").toString());
        map.put("password", condition.get("password").toString());
        map.put("level", condition.get("level"));
        User user = userService.getStudentInfo(map);
//    String token = userService.getToken(user, 60* 60 * 1000); // 有效期1h
        String token = userService.getToken(user, 24*60* 60 * 1000);
        String refreshToken = userService.getToken(user, 24*60*60*1000); // 有效期一天
        user.setToken(token);
        user.setRefreshToken(refreshToken);
        return user;
    }

    @GetMapping("/edit/password")
    public boolean update (@RequestParam Map<String, Object> condition) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", condition.get("username").toString());
        map.put("password", condition.get("password").toString());
        map.put("passwordAgain", condition.get("passwordAgain").toString());;
        map.put("level", condition.get("level").toString());
        return userService.update(map);
    }

    @GetMapping("/getTree")
    public List<Object> getTree () {
        return userService.getTree();
    }

    @PassToken
    @GetMapping("/getSilent")
    public boolean getSilent () {
        return userService.getSilent();
    }
    @PutMapping("/setSilent/{state}")
    public boolean setSilent (@PathVariable("state") Integer state) {
        return userService.setSilent(state);
    }
}
