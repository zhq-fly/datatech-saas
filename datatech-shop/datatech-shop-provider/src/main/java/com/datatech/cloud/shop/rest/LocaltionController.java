package com.datatech.cloud.shop.rest;


import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.shop.biz.LocaltionBiz;
import com.datatech.cloud.shop.entity.Localtion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("localtion")
public class LocaltionController extends BaseController<LocaltionBiz, Localtion> {

}