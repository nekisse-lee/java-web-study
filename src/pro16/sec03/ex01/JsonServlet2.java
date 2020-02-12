package pro16.sec03.ex01;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@WebServlet(name = "JsonServlet2", value = "/json2")
public class JsonServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter writer = response.getWriter();

        JSONObject totalObject = new JSONObject();
        JSONArray membersArray = new JSONArray();
        JSONObject memberInfo = new JSONObject();

        memberInfo.put("name", "박지성");
        memberInfo.put("age", "25");
        memberInfo.put("gender", "남자");
        memberInfo.put("nickname", "날센돌이");
        //  배열에 입력
        membersArray.add(memberInfo);

        memberInfo = new JSONObject();
        memberInfo.put("name", "김연아");
        memberInfo.put("age", "21");
        memberInfo.put("gender", "여자");
        memberInfo.put("nickname", "칼치");

        membersArray.add(memberInfo);
        totalObject.put("members", membersArray);

        String jsonInfo = totalObject.toJSONString();
        System.out.println(jsonInfo);
        writer.println(jsonInfo);
    }

}
