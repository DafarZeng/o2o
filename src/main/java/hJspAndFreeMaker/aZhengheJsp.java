package hJspAndFreeMaker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class aZhengheJsp {
    /*配置视图解析器详细见application.properties文件。
    * 需要到jstl和jasper jar包*/

    @RequestMapping("/hallo")
    public String hallo(Model model){
        List list =new ArrayList<User>();
        list.add(new User(1,"张三","123"));
        list.add(new User(2,"李四","456"));
        list.add(new User(1,"王五","789"));
        model.addAttribute("msg","hahaha");
        model.addAttribute("list",list);
        return "hallo";
    }

    @RequestMapping("/hallo1")
    public String hallo1(Model model){
        return "upload";
    }


}
