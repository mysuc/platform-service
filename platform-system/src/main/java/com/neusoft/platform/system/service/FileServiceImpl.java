package com.neusoft.platform.system.service;

import com.github.excel4j.Excel4j;
import com.neusoft.enjoy.web.api.entity.FileItem;
import com.neusoft.enjoy.web.api.entity.FileResponse;
import com.neusoft.enjoy.web.api.entity.Response;
import com.neusoft.platform.system.model.ExcelEntity;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

/**
 * Created by will on 17-5-3.
 */
@Service
public class FileServiceImpl implements FileService{

    @Override
    public Response<String> upload(String id, FileItem myfile){
        Response<String> response=new Response<>();
        try{
            List<ExcelEntity> list=Excel4j.opsRead(myfile.getContent()).toList(ExcelEntity.class);
            File file=new File("d://bb.xlsx");
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(Excel4j.opsWrite().fromList(list));
            bos.close();
            fos.close();
            response.setResult("");
        }catch (Exception e){
            e.printStackTrace();
            response.setError(e.getMessage());
        }
        return response;
    }

    @Override
    public FileResponse download() {
        FileResponse response=new FileResponse();
        try{
            File file=new File("/home/will/桌面/111.png");
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1)
            {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            response.setFileName("111.png");
            response.setResult(bos.toByteArray());
            response.setFileExtension(FileResponse.FileExtension.PNG);
        }catch (Exception e){
            e.printStackTrace();
        }
        return response;
    }
}
