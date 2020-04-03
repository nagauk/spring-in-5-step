package com.in28minutes.spring.basics.springin5step.controller;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/***
 **@Author:Nagaraju Ukkalam
 @Version:1.0
 @Date:28-07-2019 20:23
 **/

@RestController
public class ImageController {

    @Autowired
    private ServletContext servletContext;

   /* @RequestMapping(value = "/image-byte-array", method = RequestMethod.GET,produces = MediaType.ALL_VALUE)
    @ResponseBody
    public Map<String,ByteArrayOutputStream> getImageAsByteArray() throws IOException {
        InputStream in = servletContext.getResourceAsStream("C:\\Users\\Nagaraju Ukkalam\\Desktop\\n.jpg");

        File file = new File("C:\\Users\\Nagaraju Ukkalam\\Desktop\\n.jpg");
        BufferedImage bufferedImage = ImageIO.read(file);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "jpg", outputStream);
        String str = Base64.encode(outputStream.toByteArray());
        Map<String,ByteArrayOutputStream> map = new HashMap<>();
        map.put("image",outputStream);
        return map;
    }*/
    @GetMapping("test")
    public ResponseEntity<String> testOpenShift(){
        String str = "Hello Naga!!! testing openshift";
        return new ResponseEntity<String>(str,HttpStatus.ACCEPTED);
    }
}
