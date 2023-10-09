package oit.is.z2129.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JankenController {

  /**
   * sample21というGETリクエストがあったら sample21()を呼び出し，sample21.htmlを返す
   */
  @GetMapping("/index")
  public String index() {
    return "index.html";
  }

  /**
   * POSTを受け付ける場合は@PostMappingを利用する /sample25へのPOSTを受け付けて，FormParamで指定された変数(input
   * name)をsample25()メソッドの引数として受け取ることができる
   *
   * @param name
   * @param model
   * @return
   */
  @PostMapping("/janken")
  public String sample25(@RequestParam String name, ModelMap model) {
    model.addAttribute("name", name);
    return "janken.html";
  }

}
