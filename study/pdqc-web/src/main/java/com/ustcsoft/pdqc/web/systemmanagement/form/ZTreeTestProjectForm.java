package com.ustcsoft.pdqc.web.systemmanagement.form;


    /**
     * 树数据对象.
     * 
     * @author 
     *
     * @param <T> 数据BEAN
     */
    public class ZTreeTestProjectForm<T> extends ZTreeTestProject {
        // 用户数据
        private T userData;

        /**
         * 构造方法.
         */
        public ZTreeTestProjectForm() {
        }

        /**
         * 构造方法.
         * 
         * @param id ID
         * @param name 名字
         * @param pid 父ID
         */
        public ZTreeTestProjectForm(String id, String name, String pid) {
            super(id, name, pid);
        }

        /**
         * userData的GET方法.
         *
         * @return userData
         */
        public final T getUserData() {
            return userData;
        }

        /**
         * userData的SET方法.
         *
         * @param userData userData
         */
        public final void setUserData(T userData) {
            this.userData = userData;
        }

        /**
         * serialVersionUID.
         */
        private static final long serialVersionUID = 5313633172977544057L;
    }

