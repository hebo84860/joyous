package com.joyous.common.client.path;



public enum BusinessClientPath {

    /** 保存或者修改会员信息 */
    SAVE_OR_UPDATE_USERS(Path.SAVE_OR_UPDATE_USERS,"保存或者修改会员信息"),
    SELECT_HLH_USER_ENTITY_BY_ID(Path.SELECT_HLH_USER_ENTITY_BY_ID,"根据主键id查询用户会员"),
    QUERY_UPDATE_USER_LIST(Path.QUERY_UPDATE_USER_LIST,"查询（条件）会员列表");

    public String path;
    public String cnName;

    public static class Path {

		public final static String basePath = "business/";
        public final static String memberPath = "member/";

        /** 会员信息 */
        public final static String SAVE_OR_UPDATE_USERS = basePath + memberPath + "saveOrUpdateUsers";
        public final static String QUERY_UPDATE_USER_LIST = basePath + memberPath + "queryUpdateUsers";
        public final static String SELECT_HLH_USER_ENTITY_BY_ID = basePath + memberPath + "selectHlhUserEntityById";
    }

    BusinessClientPath(String path, String cnName) {
        this.path = path;
        this.cnName = cnName;
    }

    public String getPath() {
        return path;
    }

    public String getCnName() {
        return cnName;
    }

    public String url(String baseUrl) {
        if (!baseUrl.contains("http")) {
            baseUrl = "";
        }
        if (baseUrl.endsWith("/")) {
            return baseUrl + this.path;
        }
        return baseUrl + "/" + this.path;
    }

    public String url(String baseUrl, Object... args) {
        String url = url(baseUrl);
        String pat = "\\{\\w*\\}";
        return String.format(url.replaceAll(pat, "%s"), args);
    }
}
