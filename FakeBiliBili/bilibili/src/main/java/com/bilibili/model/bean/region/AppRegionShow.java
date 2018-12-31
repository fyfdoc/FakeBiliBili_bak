package com.bilibili.model.bean.region;

import android.support.annotation.DrawableRes;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jiayiyang on 17/5/2.
 */

public class AppRegionShow {

    private String param;

    private String type;

    private String style;

    private String title;

    private Partition partition;

    private List<Body> body;

    private Banner banner;

    public void setParam(String param) {
        this.param = param;
    }

    public String getParam() {
        return this.param;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return this.style;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public Partition getPartition() {
        return partition;
    }

    public void setPartition(Partition partition) {
        this.partition = partition;
    }

    public void setBody(List<Body> body) {
        this.body = body;
    }

    public List<Body> getBody() {
        return this.body;
    }

    public void setBanner(Banner banner) {
        this.banner = banner;
    }

    public Banner getBanner() {
        return this.banner;
    }

    public class Body {

        private String title;

        private String cover;

        private String uri;

        private String param;

        @SerializedName("goto")
        private String _goto;

        private int play;

        private int danmaku;

        private int favourite;

        private boolean is_ad;

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getCover() {
            return this.cover;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public String getUri() {
            return this.uri;
        }

        public void setParam(String param) {
            this.param = param;
        }

        public String getParam() {
            return this.param;
        }

        public void setGoto(String _goto) {
            this._goto = _goto;
        }

        public String getGoto() {
            return this._goto;
        }

        public void setPlay(int play) {
            this.play = play;
        }

        public int getPlay() {
            return this.play;
        }

        public void setDanmaku(int danmaku) {
            this.danmaku = danmaku;
        }

        public int getDanmaku() {
            return this.danmaku;
        }

        public int getFavourite() {
            return favourite;
        }

        public void setFavourite(int favourite) {
            this.favourite = favourite;
        }

        public void setIs_ad(boolean is_ad) {
            this.is_ad = is_ad;
        }

        public boolean getIs_ad() {
            return this.is_ad;
        }
    }

    public class Banner {
        private List<Top> top;

        public void setTop(List<Top> top) {
            this.top = top;
        }

        public List<Top> getTop() {
            return this.top;
        }

        public class Top {
            private int id;

            private String title;

            private String image;

            private String hash;

            private String uri;

            private int resource_id;

            private String request_id;

            private boolean is_ad;

            private int index;

            private int server_type;

            public void setId(int id) {
                this.id = id;
            }

            public int getId() {
                return this.id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTitle() {
                return this.title;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getImage() {
                return this.image;
            }

            public void setHash(String hash) {
                this.hash = hash;
            }

            public String getHash() {
                return this.hash;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public String getUri() {
                return this.uri;
            }

            public void setResource_id(int resource_id) {
                this.resource_id = resource_id;
            }

            public int getResource_id() {
                return this.resource_id;
            }

            public void setRequest_id(String request_id) {
                this.request_id = request_id;
            }

            public String getRequest_id() {
                return this.request_id;
            }

            public void setIs_ad(boolean is_ad) {
                this.is_ad = is_ad;
            }

            public boolean getIs_ad() {
                return this.is_ad;
            }

            public void setIndex(int index) {
                this.index = index;
            }

            public int getIndex() {
                return this.index;
            }

            public void setServer_type(int server_type) {
                this.server_type = server_type;
            }

            public int getServer_type() {
                return this.server_type;
            }

        }

    }

    public class Partition {

        private String title;

        @DrawableRes
        private int logo;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getLogo() {
            return logo;
        }

        public void setLogo(int logo) {
            this.logo = logo;
        }
    }
}
