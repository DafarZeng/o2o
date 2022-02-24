package iThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;

import javax.jws.soap.SOAPBinding;
import java.util.*;

@Controller
public class aDemo1 {
 /*
 * 1.导入jar包
 * 2.在resources/templates 文件夹下创建html文件
 * 3.会出现元素标签必须由</>结束，解决方法：1.补全标签，2.将jar包升级到2.0以上，详细见pom.xml文件
 *
 *
 * */
    @RequestMapping("/thyme1")
    public String thyme1(Model model){
        model.addAttribute("msg","hahaha");
        return "thyme1";
    }

    //常用的Thymeleaf函数
    @RequestMapping("/thymehanshu")
    public String thymehanshu(Model model){
        List list =new ArrayList<User>();
        list.add(new User(1,"张三","123"));
        list.add(new User(2,"李四","456"));
        list.add(new User(1,"王五","789"));
        Map<String, User> map = new HashMap<String, User>();
        map.put("u1",new User(1,"张三","123"));
        map.put("u2",new User(2,"李四","456"));
        map.put("u3",new User(1,"王五","789"));
        model.addAttribute("msg","HAhaha");
        model.addAttribute("date", new Date());
        model.addAttribute("num",2);
        model.addAttribute("list",list);
        return "thymehanshu";
    }

    /*if,switch条件判断；遍历list，map*/
    @RequestMapping("/thymehanshu2")
    public String thymehanshu2(Model model){
        List list =new ArrayList<User>();
        list.add(new User(1,"张三","123"));
        list.add(new User(2,"李四","456"));
        list.add(new User(1,"王五","789"));
        Map<String, User> map = new HashMap<String, User>();
        map.put("u1",new User(1,"张三","123"));
        map.put("u2",new User(2,"李四","456"));
        map.put("u3",new User(1,"王五","789"));
        model.addAttribute("msg","HAhaha");
        model.addAttribute("date", new Date());
        model.addAttribute("num",2);
        model.addAttribute("list",list);
        return "thymehanshu2";
    }
}
