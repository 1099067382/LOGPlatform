package com.example.logplatform.controller;

import com.example.logplatform.entity.District;
import com.example.logplatform.service.DistrictService;
import com.example.logplatform.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("districts")
@RestController
public class DistrictController extends BaseController {

    @Autowired
    private DistrictService districtService;

    @GetMapping({"", "/"})
    public JsonResult<List<District>> getByParent(String parent) {
        List<District> data = districtService.getByParent(parent);
        return new JsonResult<>(OK, data);
    }
}
