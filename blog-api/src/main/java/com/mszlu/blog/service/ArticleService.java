package com.mszlu.blog.service;

import com.mszlu.blog.vo.ArticleVo;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.param.ArticleParam;
import com.mszlu.blog.vo.param.PageParams;

/**
 * @ClassName:
 * @Description:
 * @author:
 * @date:
 * @Version:
 * @Copyright:
 */
public interface ArticleService {
    /**
     * 分页查询，文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);
    /**
     * 最热文章
     * @param limit
     * @return
     */
    Result hotArticle(int limit);
    /**
     * 最新文章
     * @param limit
     * @return
     */
    Result newArticles(int limit);
    /**
     * 文章归档
     *
     * @return
     */
    Result listArchives();
    /**
     * 查看文章
     *
     * @return
     */
    Result findArticleById(Long id);

    /**
     * 文章发布
     * @param articleParam
     * @return
     */
    Result publish(ArticleParam articleParam);
}
