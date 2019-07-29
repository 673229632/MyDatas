    
     MYMESSAGE.code = '0816RiT41BdsXL1awgU41WfxT416RiT0';
------------------------------------------------------------------------------------------------------------------------
    @Autowired
    HttpClientService httpClientService;s
------------------------------------------------------------------------------------------------------------------------
    @RequestMapping(value = "/getWXUserInfo")
    public JacksonJsonpReturn getWXUserInfo(@Param("jsonpcallback") String jsonpcallback, String code) {
        
        // 获取URL地址
        Map<String, Object> map = new HashMap<>();
        map.put("code", code);
        String address = "center/myMessages/getWXUserInfo";
        String url = CommonUtils.getUrls(jsonpcallback, address, map);

        // 发送http请求
        String jsonString = httpClientService.httpClientGet(url);

        // json串转实体类
        MyMessagesForm resultForm = JSONObject.parseObject(CommonUtils.getJsonString(jsonString, jsonpcallback),
                MyMessagesForm.class);

        // 为返回result赋值
        JacksonJsonpReturn result = new JacksonJsonpReturn();
        result.setData(resultForm);
        result.setJsonpFunction(jsonpcallback);
        return result;
    }
------------------------------------------------------------------------------------------------------------------------
    @SuppressWarnings({ "rawtypes" })
    @RequestMapping(value = "/deleteMyMessageInfo")
    public JacksonJsonpReturn deleteMyMessageInfo(@Param("jsonpcallback") String jsonpcallback, String openid) {

        // 获取URL地址
        Map<String, Object> map = new HashMap<>();
        map.put("openid", openid);
        String address = "center/myMessages/deleteMyMessageInfo";
        String url = CommonUtils.getUrls(jsonpcallback, address, map);

        // 发送http请求
        String jsonString = httpClientService.httpClientGet(url);

        //json串转object实体
        JSONObject jo = JSON.parseObject(CommonUtils.getJsonString(jsonString, jsonpcallback));

        // 为返回result赋值
        JacksonJsonpReturn result = new JacksonJsonpReturn();
        result.setData(jo.get("data"));
        result.setJsonpFunction(jsonpcallback);
        return result;
    }

------------------------------------------------------------------------------------------------------------------------
     @RequestMapping(value = "/getPatientAllergy")
    public JacksonJsonpReturn getPatientAllergy(@Param("jsonpcallback") String jsonpcallback, AllergyReqForm form) {

        // 获取URL地址
        Map<String, Object> map = new HashMap<>();
        map = CommonUtils.getBeanToMap(form);
        String address = "improveAllergy/getPatientAllergy";
        String url = CommonUtils.getUrls(jsonpcallback, address, map);

        // 发送http请求
        String jsonString = httpClientService.httpClientGet(url);

        // json串转集合
        List<AllergyRspForm> resultFormList = JSONObject
                .parseArray(CommonUtils.getJsonString(jsonString, jsonpcallback), AllergyRspForm.class);

        // 为返回result赋值
        JacksonJsonpReturn<List<AllergyRspForm>> result = new JacksonJsonpReturn<List<AllergyRspForm>>();
        result.setData(resultFormList);
        result.setJsonpFunction(jsonpcallback);
        return result;
    }
------------------------------------------------------------------------------------------------------------------------
    @SuppressWarnings({ "rawtypes" })
    @RequestMapping(value = "/insertPatientAllergy")
    public JacksonJsonpReturn insertPatientAllergy(@Param("jsonpcallback") String jsonpcallback, AllergyReqForm form) {

        // 获取URL地址
        Map<String, Object> map = new HashMap<>();
        map = CommonUtils.getBeanToMap(form);
        String address = "improveAllergy/insertPatientAllergy";
        String url = CommonUtils.getUrls(jsonpcallback, address, map);

        // 发送http请求
        String jsonString = httpClientService.httpClientGet(url);

        // 为返回result赋值
        JacksonJsonpReturn<Integer> result = new JacksonJsonpReturn<Integer>();
        result.setData(Integer.valueOf(CommonUtils.getJsonString(jsonString, jsonpcallback) + ""));
        result.setJsonpFunction(jsonpcallback);
        return result;
    }
    ------------------------------------------------------------------------------------------------------------------------