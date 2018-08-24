package com.example.post2.Bean;

import java.util.List;

/**
 * Created by lenovo on 2018/8/13.
 */

public class Bean {

    /**
     * code : 0
     * data : {"cursor":"15263136006b9869613a714098a868a1199db92dec","newList":[{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201805/20/222720zez8z7d7x9lxiglp.jpg.thumb.jpg"],"layoutType":"1","newsId":"9aa1e2e863974321b61535df1bfda2b9","origin":"","pageviews":0,"publishTime":"2018-05-20","title":"通航制造频传喜讯；中国无人机产业创新联盟即将成立"},{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201805/19/185144ug7og2ggagcaugog.jpg.thumb.jpg"],"layoutType":"2","newsId":"e15550839c554c9083066c231057483a","origin":"","pageviews":0,"publishTime":"2018-05-19","title":"\u201c中国无人机产业创新联盟\u201d成立大会即将召开"},{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201805/18/094012wi9ningif959cf99.jpg.thumb.jpg"],"layoutType":"2","newsId":"e20b670a4d15448a8d373873103c81fb","origin":"","pageviews":0,"publishTime":"2018-05-18","title":"征求意见啦！中国无人机产业创新联盟建设方案出炉"},{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201805/17/164654r9c8bgl8e1f9eyfg.jpg.thumb.jpg"],"layoutType":"2","newsId":"77df7c859fab437d98fbe187bba3e52b","origin":"","pageviews":0,"publishTime":"2018-05-17","title":"中国邮政EMS水陆两栖无人机试飞成功"},{"imageListThumb":["http://cn.ttfly.com/file/upload/201805/17/1838257812249.jpg"],"layoutType":"1","newsId":"1bb5e07cb58145bc8a96d33f7dce96da","origin":"","pageviews":0,"publishTime":"2018-05-17","title":"邮政EMS水陆两栖无人机性能远超顺丰 　"},{"imageListThumb":["http://cn.ttfly.com/file/upload/201805/16/1642425212255.jpg"],"layoutType":"1","newsId":"146877b855e543aa92317efd00e54273","origin":"","pageviews":0,"publishTime":"2018-05-16","title":"抗议将AI技术用于美国无人机军事 谷歌员工辞职"},{"imageListThumb":["http://cn.ttfly.com/file/upload/201805/15/1913102812249.jpg"],"layoutType":"1","newsId":"6b9869613a714098a868a1199db92dec","origin":"","pageviews":0,"publishTime":"2018-05-15","title":"如何更规划的使用无人机？"}]}
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
         * cursor : 15263136006b9869613a714098a868a1199db92dec
         * newList : [{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201805/20/222720zez8z7d7x9lxiglp.jpg.thumb.jpg"],"layoutType":"1","newsId":"9aa1e2e863974321b61535df1bfda2b9","origin":"","pageviews":0,"publishTime":"2018-05-20","title":"通航制造频传喜讯；中国无人机产业创新联盟即将成立"},{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201805/19/185144ug7og2ggagcaugog.jpg.thumb.jpg"],"layoutType":"2","newsId":"e15550839c554c9083066c231057483a","origin":"","pageviews":0,"publishTime":"2018-05-19","title":"\u201c中国无人机产业创新联盟\u201d成立大会即将召开"},{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201805/18/094012wi9ningif959cf99.jpg.thumb.jpg"],"layoutType":"2","newsId":"e20b670a4d15448a8d373873103c81fb","origin":"","pageviews":0,"publishTime":"2018-05-18","title":"征求意见啦！中国无人机产业创新联盟建设方案出炉"},{"imageListThumb":["http://www.lyunx.com/data/attachment/portal/201805/17/164654r9c8bgl8e1f9eyfg.jpg.thumb.jpg"],"layoutType":"2","newsId":"77df7c859fab437d98fbe187bba3e52b","origin":"","pageviews":0,"publishTime":"2018-05-17","title":"中国邮政EMS水陆两栖无人机试飞成功"},{"imageListThumb":["http://cn.ttfly.com/file/upload/201805/17/1838257812249.jpg"],"layoutType":"1","newsId":"1bb5e07cb58145bc8a96d33f7dce96da","origin":"","pageviews":0,"publishTime":"2018-05-17","title":"邮政EMS水陆两栖无人机性能远超顺丰 　"},{"imageListThumb":["http://cn.ttfly.com/file/upload/201805/16/1642425212255.jpg"],"layoutType":"1","newsId":"146877b855e543aa92317efd00e54273","origin":"","pageviews":0,"publishTime":"2018-05-16","title":"抗议将AI技术用于美国无人机军事 谷歌员工辞职"},{"imageListThumb":["http://cn.ttfly.com/file/upload/201805/15/1913102812249.jpg"],"layoutType":"1","newsId":"6b9869613a714098a868a1199db92dec","origin":"","pageviews":0,"publishTime":"2018-05-15","title":"如何更规划的使用无人机？"}]
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

        public static class NewListBean {
            /**
             * imageListThumb : ["http://www.lyunx.com/data/attachment/portal/201805/20/222720zez8z7d7x9lxiglp.jpg.thumb.jpg"]
             * layoutType : 1
             * newsId : 9aa1e2e863974321b61535df1bfda2b9
             * origin :
             * pageviews : 0
             * publishTime : 2018-05-20
             * title : 通航制造频传喜讯；中国无人机产业创新联盟即将成立
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
