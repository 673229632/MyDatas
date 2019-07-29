 /**
     * 初始化图片.
     * 
     * @param code String
     * @return JacksonReturn
     */
    @Override
    public JacksonReturn initFile(HttpServletRequest request, String code) {
        KnowledgeTypeCondForm knowledgeTypeCondForm = new KnowledgeTypeCondForm();
        knowledgeTypeCondForm.setCode(code);
        // 创建JSON返回对象
        JacksonListReturn<Map<String, String>> ret = new JacksonListReturn<Map<String, String>>();
        if (!Tools.isblank(code)) {
            KnowledgeTypeResultForm knowledgeTypeResultForm = this.detail(knowledgeTypeCondForm).getData();
            String strp = new String(knowledgeTypeResultForm.getImagepath());
            if (!Tools.isblank(strp)) {
                String relativePath = FileUtil.getRootPath(request) + filePath + strp;
                String picFile = relativePath.replace("\\", "/");
                String[] fileNames = picFile.split("/");
                if (fileNames.length > 0) {
                    String fileName = fileNames[fileNames.length - 1];
                    Map<String, String> map = new HashMap<String, String>();
                    map.put("caption", fileName);
                    map.put("width", "160px");
                    map.put("key", code);
                    map.put("size", "");
                    map.put("file", picFile);
                    ret.getData().add(map);
                }
            }
        }
        return ret;
    }

    /**
     * 上传.
     * 
     * @param response HttpServletResponse
     * @param request HttpServletRequest
     * @param multipartFile MultipartFile
     * @param fileType String
     * @return JacksonCountReturn
     */
    @Override
    public JacksonCountReturn uploadFile(HttpServletResponse response, HttpServletRequest request,
            MultipartFile multipartFile, String fileType) {
        // 创建JSON返回对象
        JacksonCountReturn ret = new JacksonCountReturn();
        if (multipartFile == null) {
            return ret;
        }
        try {

            if (multipartFile != null) {
                InputStream in = multipartFile.getInputStream();
                FileInputStream fin = null;
                // 如果是FileInputStream类型，进行转换
                if (in instanceof FileInputStream) {
                    fin = (FileInputStream) in;
                } else { // 否则，转型失败
                    throw new Exception("转型失败");
                }
                // 获取文件上传路径
                String path = filePath + multipartFile.getOriginalFilename();
                // String path = filePath + FileUtil.encodingFilename(multipartFile.getOriginalFilename());
                String relativePath = FileUtil.getRootPath(request) + path;

                File desc = new File(FileUtil.getRootPath(request) + filePath);
                if (!desc.exists()) {
                    desc.mkdirs();
                }

                // 存入硬盘
                multipartFile.transferTo(new File(relativePath));
                ret.setSuccessCount(1);
                return ret;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ret;
    }
