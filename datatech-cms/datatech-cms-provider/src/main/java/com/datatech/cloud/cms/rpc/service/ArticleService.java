package com.datatech.cloud.cms.rpc.service;

import com.datatech.cloud.cms.api.vo.article.ArticleInfo;
import com.datatech.cloud.cms.biz.ArticleBiz;
import com.datatech.cloud.cms.vo.ArticleInManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArticleService {

    @Autowired
    ArticleBiz articleBiz;

    public List<ArticleInfo> queryForPageBiz(HashMap<String,Object> map){




        return articleBiz.queryForPageBiz(map);

    }

    public List<Map<String,Object>> queryForPageMapBiz(HashMap<String,Object> map){




        return articleBiz.queryForPageMapBiz(map);

    }

    public Long queryForPageCountBiz(HashMap<String,Object> map){




        return articleBiz.queryForPageCountBiz(map);

    }

}
