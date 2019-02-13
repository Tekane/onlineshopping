package net.onlineshopping.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

public class FileUpload {
    private static final String ABS_PATH = "\\home\\kgodisho\\IdeaProjects\\onlineshopping\\src\\main\\webapp\\images\\";
    private static  String REAL_PATH = "";
    private static final Logger LOGGER = LoggerFactory.getLogger(FileUpload.class);

    public static void  uploadFile(HttpServletRequest  httpServletRequest, MultipartFile file,String code){
        //return real path
        REAL_PATH = httpServletRequest.getSession().getServletContext().getRealPath("/webapp/images/");
        LOGGER.info(REAL_PATH);

        /*
        * Check if the directories exits
        * if they don't create them
        * */
        if(!new File(ABS_PATH).exists()){
            new File(ABS_PATH).mkdirs();
        }
        if(!new File(REAL_PATH).exists()){
            new File(REAL_PATH).mkdirs();
        }

        try {
            //Server upload
            file.transferTo(new File( REAL_PATH + code + ".jpg"));
            //Project directory upload
            file.transferTo(new File(ABS_PATH  + code +  ".jpg"));

        }catch (IOException e){
            LOGGER.info(e.getMessage());
        }
    }
}
