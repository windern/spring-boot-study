package com.windern.demo.controller;

import com.windern.demo.domain.LearnResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/learn")
public class LearnResourceController {

    @RequestMapping("")
    public ModelAndView index() {
        List<LearnResource> learnList = new ArrayList<>();
        LearnResource bean = new LearnResource("问你", "问问");
        learnList.add(bean);
        bean = new LearnResource("妮妮", "你两");
        learnList.add(bean);
        bean = new LearnResource("我能", "欧文");
        learnList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }
}
