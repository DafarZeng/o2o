package gWenjianShangchuan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller  //该注解表示该controller下的所有方法的返回值都会以json的形式返回
public class TestUpload {

    @RequestMapping("upload1")
    public String upload1()  {
        return  "upload";
    }

    @RequestMapping("upload2")
    public Map<String,String> upload2(MultipartFile uploadFile, HttpServletRequest request) throws IOException {
        Map<String,String> map=new HashMap();
        //获取项目路径
        String realPath = request.getServletContext().getRealPath("/static/upload");
        //判断路径是否存在，不存在就创建
        File file = new File(realPath);
        if(!file.exists()){
            file.mkdirs();
        }
        System.out.println(realPath);
        //获取文件名称，并将文件名改写
        String originalFilename = uploadFile.getOriginalFilename();
        //改写文件名
        String str = UUID.randomUUID().toString().replace("-", "");
        originalFilename=str+originalFilename;
        //将上传文件写入硬盘
        uploadFile.transferTo(new File(realPath,originalFilename));
        map.put("msg","上传成功");
        return map;

        /*限制上传文件大小，详细见resources文件夹下的application.properties文件*/
    }
}
