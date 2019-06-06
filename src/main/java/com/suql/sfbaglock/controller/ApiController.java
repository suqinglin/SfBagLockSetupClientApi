package com.suql.sfbaglock.controller;

import com.suql.sfbaglock.bean.ProjectsResponse;
import com.suql.sfbaglock.bean.RxLogin;
import com.suql.sfbaglock.rest.ResponseData;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bll-admin/open-api")
public class ApiController {

    @PostMapping("/login")
    public ResponseData login(@RequestBody RxLogin rxLogin) {
//        if ("18580250664".equals(rxLogin.getUserPhone())) {
//            return "success";
//        } else {
//            return "failure";
//        }
        ResponseData result = ResponseData.success();
        result.addData("token", "12345678");
        result.addData("userName", "操作员");
        return result;
    }

    @PostMapping("/projects")
    public ResponseData getProjects() {
        ResponseData result = ResponseData.success();
        List<ProjectsResponse.ProjectBean> projectList = new ArrayList<>();
        projectList.add(new ProjectsResponse.ProjectBean("F8QL20190523194925943", "SCH20190520110305649", "1号箱", "0119100001", "0119101000"));
        projectList.add(new ProjectsResponse.ProjectBean("F8QL20190523194925943", "SC15586126810486836", "2号箱", "0119200001", "0119205000"));
        projectList.add(new ProjectsResponse.ProjectBean("F8QL20190523194925943", "SC15586126886193586", "3号箱", "0119300001", "0119301000"));
        result.addData("projects", projectList);
        result.addData("userId", "12345678");
        result.addData("userKey", "1234567890abcd");
        return result;
    }

    @PostMapping("/box/import")
    public ResponseData uploadCsv(@RequestBody MultipartFile file) {
        return ResponseData.success();
    }
}
