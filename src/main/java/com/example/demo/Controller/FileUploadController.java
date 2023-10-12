package com.example.demo.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public String up(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException{
        System.out.println(nickname);
        System.out.println(photo.getContentType());

        String Path = request.getServletContext().getRealPath("/uphold");
        System.out.println(Path);
        saveFile(photo,Path);
        return "上传成功";
    }
    public void saveFile(MultipartFile photo, String path) throws IOException{
        File dir = new File(path);
        if(!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(path+photo.getOriginalFilename());
        photo.transferTo(file);
    }
}
