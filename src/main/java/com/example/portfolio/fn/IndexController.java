package com.example.portfolio.fn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
  
  @RequestMapping("/")
  public String showIndexPage() {
    return "index";
  }

  @RequestMapping("/works01")
  public String showWorks01() {
    return "works/works01";
  }

  @RequestMapping("/works02")
  public String showWorks02() {
    return "works/works02";
  }

  @RequestMapping("/works03")
  public String showWorks03() {
    return "works/works03";
  }

  @RequestMapping("/thanks")
  public String showThanksPage() {
    return "thanks";
  }

}
