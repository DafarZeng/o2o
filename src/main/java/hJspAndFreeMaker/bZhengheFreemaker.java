package hJspAndFreeMaker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;

import java.util.ArrayList;
import java.util.List;

/*
* 1.导jar包，详细见pom文件
* 2.新建FreeMaker文件，文件后缀为ftl
* 3.新建的ftl文件必须放在resources/templates文件夹下
*
*
* 注意：创建FreeMaker文件模板的方法：https://www.cnblogs.com/youcoding/p/12996570.html
* */
@Controller
public class bZhengheFreemaker {

    @RequestMapping("/ftl1")
    public  String ftl1(Model model){
        List list =new ArrayList<User>();
        list.add(new User(1,"张三","123"));
        list.add(new User(2,"李四","456"));
        list.add(new User(1,"王五","789"));
        model.addAttribute("list",list);
        return "demo1";  /*不用配置视图解析器，会自动配置*/
    }
}
