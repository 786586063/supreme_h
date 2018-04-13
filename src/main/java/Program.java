import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import utils.DateUtils;
import utils.HttpRequest;
import utils.IOUtils;
import utils.JsonUtils;

import java.net.URI;
import java.net.URL;
import java.text.DateFormatSymbols;
import java.util.*;

public class Program {

    public static final String LOGIN_URL = "https://api.xixunyun.com/login/api?platform=android&version=3.3.3";
    public static final String REPORT_URL = "https://api.xixunyun.com/Reports/StudentOperator?platform=android&version=3.3.3";
    public static final String ACCOUNT = "1513640105";
    public static final String PASSWORD = "640105";
    public static void main(String[] args) {
        //发送post请求获取token
//        Map<String,Object> param = new HashMap<String, Object>();
//        param.put("request_source","3");
//        param.put("account",ACCOUNT);
//        param.put("password",PASSWORD);
//        param.put("school_id","222");
//        String res_login = HttpRequest.sendPost(LOGIN_URL, param);
        String res_login = "{\"code\":20000,\"message\":\"\\u6210\\u529f\",\"run_execute_time\":\"0.1191s\",\"data\":{\"user_id\":554754,\"user_type\":1,\"is_bind_phone\":1,\"bind_phone\":\"13081646870\",\"user_number\":\"1513640105\",\"token\":\"1f2f3d5445917bebb81569ab24b1b783\",\"expired\":1523633500,\"user_name\":\"\\u738b\\u8d3a\",\"school_id\":222,\"sex\":\"1\",\"portrait_uri\":\"Public\\/Uploads\\/222\\/portrait\\/2017-11-01\\/59f9ca07e973c.jpg\",\"default_webview_domain\":\"https:\\/\\/www.xixunyun.com\\/\",\"dcwj_webview_domain\":\"https:\\/\\/dcwj.xixunyun.com\\/\",\"dcwj_api_domain\":\"https:\\/\\/dcwj.xixunyun.com\\/\",\"file_domain\":\"https:\\/\\/file.xixunyun.com\\/\",\"wenda_website_domain\":\"http:\\/\\/wenda.xixunyun.com\",\"differ_api\":\"\",\"internship_status\":\"1\",\"tags\":\"222_5940_all,222_5940_student,222_5940_student_2015_2018,222_5940_student_0_2018,222_5940_student_2015_0,222_16497_all,222_16497_student,222_16497_student_2015_2018,222_16497_student_0_2018,222_16497_student_2015_0,222_17104_all,222_17104_student,222_17104_student_2015_2018,222_17104_student_0_2018,222_17104_student_2015_0,222_17108_all,222_17108_student,222_17108_student_2015_2018,222_17108_student_0_2018,222_17108_student_2015_0,222_group_8593_all,222_group_8593_student,222_group_8593_student_2015_2018,222_group_8593_student_0_2018,222_group_8593_student_2015_0\",\"first_login\":false,\"pop_form\":\"0\",\"user_qq\":\"1070920013\",\"user_one_family\":\"\\u738b\\u5fd7\\u5f6c\",\"user_one_family_phone\":\"13071975963\",\"user_two_family\":\"\",\"user_two_family_phone\":\"\",\"user_birthday\":\"\",\"user_birthplace\":\"\",\"user_email\":\"1070920013@qq.com\",\"user_phone\":\"13081646870\",\"point\":\"454\",\"point_rank\":\"2418\",\"class_name\":\"15\\u8f6f\\u4ef6\\u6280\\u672f\\u4e13\\u4e1a1\\u73ed\",\"entrance_year\":\"2015\",\"graduation_year\":\"2018\",\"sign_in_file_config\":\"all\",\"menu\":{\"sign_in\":{\"title\":\"\\u7b7e\\u5230\",\"info\":\"\\u6bcf\\u65e5\\u5b9e\\u4e60\\u7b7e\\u5230\",\"module\":1,\"show\":1},\"day_report\":{\"title\":\"\\u65e5\\u62a5\",\"info\":\"\\u5b9e\\u4e60\\u65e5\\u62a5\\u63d0\\u4ea4\\u67e5\\u770b\",\"module\":1,\"show\":0},\"week_report\":{\"title\":\"\\u5468\\u62a5\",\"info\":\"\\u5b9e\\u4e60\\u5468\\u62a5\\u63d0\\u4ea4\\u67e5\\u770b\",\"module\":1,\"show\":1},\"month_report\":{\"title\":\"\\u6708\\u62a5\",\"info\":\"\\u5b9e\\u4e60\\u6708\\u62a5\\u63d0\\u4ea4\\u67e5\\u770b\",\"module\":1,\"show\":1},\"internship_apply\":{\"title\":\"\\u5b9e\\u4e60\\u7533\\u8bf7\",\"info\":\"\\u5b9e\\u4e60\\u7533\\u8bf7\\u63d0\\u4ea4\",\"uri\":\"internship\",\"module\":1,\"show\":1},\"internship_change\":{\"title\":\"\\u53d8\\u66f4\\u7533\\u8bf7\",\"info\":\"\\u5b9e\\u4e60\\u53d8\\u66f4\\u7533\\u8bf7\\u63d0\\u4ea4\",\"module\":1,\"show\":1},\"internship_end\":{\"title\":\"\\u7ed3\\u675f\\u7533\\u8bf7\",\"info\":\"\\u5b9e\\u4e60\\u7ed3\\u675f\\u7533\\u8bf7\\u63d0\\u4ea4\",\"module\":1,\"show\":1},\"leave\":{\"title\":\"\\u8bf7\\u5047\\u7533\\u8bf7\",\"info\":\"\\u8bf7\\u5047\\u7533\\u8bf7\\u63d0\\u4ea4\",\"module\":1,\"show\":1},\"internship_intention\":{\"title\":\"\\u5b9e\\u4e60\\u610f\\u5411\",\"info\":\"\\u5b9e\\u4e60\\u4f01\\u4e1a\\u548c\\u5c97\\u4f4d\\u610f\\u5411\\u62a5\\u540d\",\"module\":1,\"show\":1},\"evaluate\":{\"title\":\"\\u5b9e\\u4e60\\u8003\\u8bc4\",\"info\":\"\\u591a\\u65b9\\u8bc4\\u4ef7\\u7ed9\\u5b9e\\u4e60\\u6253\\u5206\",\"module\":1,\"show\":1},\"neighbors\":{\"title\":\"\\u9644\\u8fd1\\u5b9e\\u4e60\\u751f\",\"info\":\"\\u67e5\\u770b\\u5728\\u8eab\\u8fb9\\u7684\\u540c\\u6821\\u5b9e\\u4e60\\u751f\",\"module\":1,\"show\":1},\"mission_center\":{\"title\":\"\\u4efb\\u52a1\\u4e2d\\u5fc3\",\"info\":\"\\u5b66\\u4e60\\u4efb\\u52a1\\u3001\\u8c03\\u67e5\\u95ee\\u5377\\u5728\\u7ebf\\u5b8c\\u6210\",\"module\":2,\"show\":1}},\"menu40\":null,\"notification_list\":[{\"notification_id\":\"3743534\",\"title\":\"\\u62a5\\u544a\\u6279\\u9605\\u63d0\\u9192\",\"type\":\"20\",\"create\":\"1523598854\",\"extra\":\"{\\\"report_id\\\":\\\"1659056\\\",\\\"report_type\\\":\\\"week\\\"}\",\"sender_name\":\"\\u7cfb\\u7edf\",\"portrait\":null,\"read\":\"0\",\"like\":\"0\"},{\"notification_id\":\"3696664\",\"title\":\"\\u62a5\\u544a\\u6279\\u9605\\u63d0\\u9192\",\"type\":\"20\",\"create\":\"1523497469\",\"extra\":\"{\\\"report_id\\\":\\\"1657260\\\",\\\"report_type\\\":\\\"week\\\"}\",\"sender_name\":\"\\u7cfb\\u7edf\",\"portrait\":null,\"read\":\"0\",\"like\":\"0\"},{\"notification_id\":\"3265925\",\"title\":\"\\u5173\\u6ce8\\u201c\\u5c71\\u4e1c\\u7701\\u7cae\\u98df\\u804c\\u4e1a\\u6559\\u80b2\\u96c6\\u56e2\\u201d \\u516c\\u4f17\\u5e73\\u53f0\\u7684\\u901a\\u77e5\",\"type\":\"2\",\"create\":\"1521105281\",\"extra\":\"{\\\"structure_cn_name\\\":\\\"\\u5c71\\u4e1c\\u5546\\u52a1\\u804c\\u4e1a\\u5b66\\u9662\\\",\\\"post_cn_name\\\":\\\"\\u5168\\u90e8\\\",\\\"entrance_year\\\":\\\"\\u5168\\u90e8\\\",\\\"graduate_year\\\":\\\"\\u5168\\u90e8\\\"}\",\"sender_name\":\"\\u90ed\\u7eaa\\u826f\",\"portrait\":\"\",\"read\":\"0\",\"like\":\"0\"}]}}\n";
        System.out.println(res_login);
        JSONObject object = JSON.parseObject(res_login);
        String code = object.getString("code");
        String  token = "";
        if (code.equals("20000")){
            System.out.println("登录："+object.getString("message")+"   正在获取token，请稍后。。。");
            //获取token
            token = object.getJSONObject("data").getString("token");
            if (token !=null && !token.equals("")){
                System.out.println("获取token成功！");

            }
            System.out.println(object.getString("message"));
        }else{
            System.out.println(object.getString("message"));
        }
        /**
         * 获取提交时间
         */
        Calendar c_begin = new GregorianCalendar();
        Calendar c_end = new GregorianCalendar();
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] weeks = dfs.getWeekdays();

        c_begin.set(2018, 1, 1); //Calendar的月从0-11，所以4月是3.
        c_end.set(2018, 2, 22); //Calendar的月从0-11，所以5月是4.

        int count = 1;
       // c_end.add(Calendar.DAY_OF_YEAR, 1);  //结束日期下滚一天是为了包含最后一天

        List<String> times = new ArrayList<String>();

        while(c_begin.before(c_end)){
         //   System.out.println("第"+count+"周  日期："+new java.sql.Date(c_begin.getTime().getTime())+","+weeks[c_begin.get(Calendar.DAY_OF_WEEK)]);
            String startTime = "";
            String endTIme = "";

            startTime = DateUtils.formatTime(c_begin.getTime());
            c_begin.add(Calendar.DAY_OF_YEAR, 7);
            endTIme = DateUtils.formatTime(c_begin.getTime());
          //  System.out.println(startTime+"  - "+endTIme);
            if (!startTime.equals("")&&!endTIme.equals("")){
                System.out.println(startTime+"  - "+endTIme);
                //构建content参数
                String content = getContent();
                Map<String,Object> param = new HashMap<String, Object>();
                param.put("end_date",endTIme);
                param.put("attachment","");
                param.put("business_type","week");
                param.put("content",content);
                param.put("start_date",startTime);

                String report = REPORT_URL +"&token="+token;
                //发送Post请求
                String res = HttpRequest.sendPost(report, param);


            }


            c_begin.add(Calendar.DAY_OF_YEAR, 1);


        }


    }

    public static String getContent() {
        String parentPath = "E:/";
        Random random = new Random(10);

        IOUtils.readFileByLines(parentPath+random.nextInt()+".txt");
        List<Map<String,String>> list = new ArrayList<Map<String, String>>();
        for (int i = 0; i<3 ;i++){
            Map<String,String> map = new LinkedHashMap<String, String>();
            if (i == 0){
                map.put("content", IOUtils.readFileByLines(parentPath+random.nextInt()+".txt"));
                map.put("require","1");
                map.put("sort","1");
                map.put("title","本周工作总结");
            }else if (i ==1){
                map.put("content",IOUtils.readFileByLines(parentPath+random.nextInt()+".txt"));
                map.put("require","0");
                map.put("sort","2");
                map.put("title","本周心得体会");
            }else if (i ==2){
                map.put("content",IOUtils.readFileByLines(parentPath+random.nextInt()+".txt"));
                map.put("require","0");
                map.put("sort","3");
                map.put("title","实习问题反馈");
            }
            list.add(map);

        }


        return JsonUtils.obj2JsonString(list);
    }
}
