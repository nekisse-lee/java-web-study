package pro15.sec01.ex02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

//@WebServlet(name = "FileDownload", value = "/download.do")
public class FileDownload extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
        doHandle(request, response);
    }

    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        String file_repo = "/Users/nekisse/Documents/intellij_workspace/webShop/repo";
        String fileName = (String) request.getParameter("fileName");
        System.out.println("fileName=" + fileName);
        OutputStream out = response.getOutputStream();
        String downFile = file_repo + "/" + fileName;
        File f = new File(downFile);
        response.setHeader("Cache-Control", "no-cache");
        response.addHeader("Content-disposition", "attachment; fileName=" + fileName);
        FileInputStream in = new FileInputStream(f);
        byte[] buffer = new byte[1024 * 8];
        while (true) {
            int count = in.read(buffer);
            if (count == -1)
                break;
            out.write(buffer, 0, count);
        }
        in.close();
        out.close();
    }

}
