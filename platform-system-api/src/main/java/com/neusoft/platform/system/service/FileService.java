package com.neusoft.platform.system.service;

import com.neusoft.enjoy.web.api.annotation.Param;
import com.neusoft.enjoy.web.api.entity.FileItem;
import com.neusoft.enjoy.web.api.entity.FileResponse;
import com.neusoft.enjoy.web.api.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * Created by will on 17-5-3.
 */
@Api(value="com.neusoft.platform.system.service.FileService",description="文件操作",tags = "com.neusoft.platform.system.service.FileService")
public interface FileService {
    @ApiOperation(value="上传",notes ="可用于文件的大量上传",httpMethod="POST")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "用户id", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "myfile", value = "文件流", required = true, paramType = "body", dataTypeClass = FileItem.class)
    })
    Response<String> upload(@Param("id") String id, @Param("myfile") FileItem myfile);
    FileResponse download();
}
