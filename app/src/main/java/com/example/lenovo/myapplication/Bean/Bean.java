package com.example.lenovo.myapplication.Bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * Created by lenovo on 2018/8/9.
 */

public class Bean {

    /**
     * code : 0
     * data : {"cursor":"1523243700e7a11165106c429c9a153b80bb9a1cbc","newList":[{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201805/04/112318nw9wq6pcrpx1o5oj.jpg.thumb.jpg"],"layoutType":"1","newsId":"272c8a46acec4a6f942145396fc83ca7","origin":"","pageviews":11,"publishTime":"2018-05-04","title":"民航局适航司关于发布改进通用航空适航审定政策实施细则的通知"},{"imageListThumb":["http://www.ga.cn/uploads/allimg/180503/1_180503231542_1-lp.jpg"],"layoutType":"1","newsId":"7df06601f4b945c090d81541e766893a","origin":"","pageviews":11,"publishTime":"2018-05-03","title":"通用航空再迎新利好！中国民航局在金普新区举办培训班解读新政策"},{"imageListThumb":["null"],"layoutType":"0","newsId":"85a0835f2cbb46b9bf417fd52f3fb521","origin":"","pageviews":5,"publishTime":"2018-05-03","title":"关注丨《民航局适航司关于改进 通用航空适航审定政策实施细则》"},{"imageListThumb":["http://cn.ttfly.com/file/upload/201804/14/1029317645.png"],"layoutType":"1","newsId":"9e662fe75b1348d4abfb0f2637648484","origin":"","pageviews":3,"publishTime":"2018-04-14","title":"重庆自贸区推动轻型直升机、通用飞机产业化"},{"imageListThumb":["http://cn.ttfly.com/file/upload/201804/12/1617451412255.png"],"layoutType":"1","newsId":"1cc78885f28542269ceaeb1003ef40e3","origin":"","pageviews":0,"publishTime":"2018-04-12","title":"民航系统派驻纪检组组长纪委书记述职会在京召开"},{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201804/09/141731tqypquyiq6x2pdhm.jpg.thumb.jpg"],"layoutType":"1","newsId":"0bb2d34477a84dd199e5e507281adaea","origin":"","pageviews":2,"publishTime":"2018-04-09","title":"解读 | 《民用无人驾驶航空器经营性飞行活动管理办法（暂行）》"},{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201804/09/111309zikenean7kcifaf9.jpg.thumb.jpg"],"layoutType":"1","newsId":"e7a11165106c429c9a153b80bb9a1cbc","origin":"","pageviews":1,"publishTime":"2018-04-09","title":"完整版全文发布！《民用无人驾驶航空器经营性飞行活动管理办法(暂行)》6月1日起生效"}]}
     * message : 成功
     */

    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * cursor : 1523243700e7a11165106c429c9a153b80bb9a1cbc
         * newList : [{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201805/04/112318nw9wq6pcrpx1o5oj.jpg.thumb.jpg"],"layoutType":"1","newsId":"272c8a46acec4a6f942145396fc83ca7","origin":"","pageviews":11,"publishTime":"2018-05-04","title":"民航局适航司关于发布改进通用航空适航审定政策实施细则的通知"},{"imageListThumb":["http://www.ga.cn/uploads/allimg/180503/1_180503231542_1-lp.jpg"],"layoutType":"1","newsId":"7df06601f4b945c090d81541e766893a","origin":"","pageviews":11,"publishTime":"2018-05-03","title":"通用航空再迎新利好！中国民航局在金普新区举办培训班解读新政策"},{"imageListThumb":["null"],"layoutType":"0","newsId":"85a0835f2cbb46b9bf417fd52f3fb521","origin":"","pageviews":5,"publishTime":"2018-05-03","title":"关注丨《民航局适航司关于改进 通用航空适航审定政策实施细则》"},{"imageListThumb":["http://cn.ttfly.com/file/upload/201804/14/1029317645.png"],"layoutType":"1","newsId":"9e662fe75b1348d4abfb0f2637648484","origin":"","pageviews":3,"publishTime":"2018-04-14","title":"重庆自贸区推动轻型直升机、通用飞机产业化"},{"imageListThumb":["http://cn.ttfly.com/file/upload/201804/12/1617451412255.png"],"layoutType":"1","newsId":"1cc78885f28542269ceaeb1003ef40e3","origin":"","pageviews":0,"publishTime":"2018-04-12","title":"民航系统派驻纪检组组长纪委书记述职会在京召开"},{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201804/09/141731tqypquyiq6x2pdhm.jpg.thumb.jpg"],"layoutType":"1","newsId":"0bb2d34477a84dd199e5e507281adaea","origin":"","pageviews":2,"publishTime":"2018-04-09","title":"解读 | 《民用无人驾驶航空器经营性飞行活动管理办法（暂行）》"},{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201804/09/111309zikenean7kcifaf9.jpg.thumb.jpg"],"layoutType":"1","newsId":"e7a11165106c429c9a153b80bb9a1cbc","origin":"","pageviews":1,"publishTime":"2018-04-09","title":"完整版全文发布！《民用无人驾驶航空器经营性飞行活动管理办法(暂行)》6月1日起生效"}]
         */

        private String cursor;
        private List<NewListBean> newList;

        public String getCursor() {
            return cursor;
        }

        public void setCursor(String cursor) {
            this.cursor = cursor;
        }

        public List<NewListBean> getNewList() {
            return newList;
        }

        public void setNewList(List<NewListBean> newList) {
            this.newList = newList;
        }

        public static class NewListBean  {
            /**
             * imageListThumb : ["http://www.lyunx.com/data/attachment/portal/201805/04/112318nw9wq6pcrpx1o5oj.jpg.thumb.jpg"]
             * layoutType : 1
             * newsId : 272c8a46acec4a6f942145396fc83ca7
             * origin :
             * pageviews : 11
             * publishTime : 2018-05-04
             * title : 民航局适航司关于发布改进通用航空适航审定政策实施细则的通知
             */

            private String layoutType;
            private String newsId;
            private String origin;
            private int pageviews;
            private String publishTime;
            private String title;
            private List<String> imageListThumb;

            public String getLayoutType() {
                return layoutType;
            }

            public void setLayoutType(String layoutType) {
                this.layoutType = layoutType;
            }

            public String getNewsId() {
                return newsId;
            }

            public void setNewsId(String newsId) {
                this.newsId = newsId;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public int getPageviews() {
                return pageviews;
            }

            public void setPageviews(int pageviews) {
                this.pageviews = pageviews;
            }

            public String getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(String publishTime) {
                this.publishTime = publishTime;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<String> getImageListThumb() {
                return imageListThumb;
            }

            public void setImageListThumb(List<String> imageListThumb) {
                this.imageListThumb = imageListThumb;
            }
        }
    }
}
