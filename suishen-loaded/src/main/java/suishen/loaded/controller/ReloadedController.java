package suishen.loaded.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author :lwy
 * @Date : 2019/7/9 14:53
 * @Description :
 */
@RestController
public class ReloadedController {


    @GetMapping("/load")
    public void load(){
        System.err.println("loaded");
    }

    @GetMapping("/hello")
    public void hello(){
        System.err.println("hello,world.......");
    }
}
