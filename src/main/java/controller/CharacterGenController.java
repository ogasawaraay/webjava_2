package controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CharacterGenController {

  @RequestMapping("/CharacterGen") // URLとのマッピング
  public String index(HttpSession session, Model model,
                            @RequestParam(name = "name", required = false) String name) {

    // Viewに渡すデータを設定
    model.addAttribute("name", name);
//    キャラ種別を設定するようにへんこうする
//    model.addAttribute("message", new java.util.Date());

    // Viewのテンプレート名を返す
    return "CharacterGen";
  }
}
