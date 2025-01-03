package com.sbs.tutorial1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//개발자가 스프링 부트한테 말한다
//"이 클래스는 웹 요청을 받아서 작업할거야"
//"그리고 해당클래스는 컨트롤러야"
public class HomeControlelr {
    @GetMapping("/home/main")
    //개발자가 말한다
    //만약에 홈메핑 저게 요청이 들어오면 아래 멧드를 실행해줘
    @ResponseBody
            //아래 메서드를 실행한후 리턴값을 응답으로삼아서 바디에 출력해줘
    public String showHome(){
        return "안녕";
    }
}
