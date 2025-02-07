package pro15.sec01.ex01;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FileUpload", value = "/upload.do")
public class FileUpload extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        String encoding = "utf-8";
        File currentDirPath = new File("/Users/nekisse/Documents/intellij_workspace/webShop/repo");
        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setRepository(currentDirPath);
        factory.setSizeThreshold(1024 * 1024);

        ServletFileUpload upload = new ServletFileUpload(factory);
        String fileName = null;
        List fileList = new ArrayList();
        try {
            List items = upload.parseRequest(request);
            for (int i = 0; i < items.size(); i++) {
                FileItem fileItem = (FileItem) items.get(i);

                if (fileItem.isFormField()) {
                    System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
                } else {
                    System.out.println("파라미터명 : " + fileItem.getFieldName());
                    System.out.println("파일명 : " + fileItem.getName());
                    System.out.println("파일크기 : " + fileItem.getSize() + "bytes");

                    if (fileItem.getSize() > 0) {
                        int idx = fileItem.getName().lastIndexOf("\\");
                        if (idx == -1) {
                            idx = fileItem.getName().lastIndexOf("/");
                        }
                        fileName = fileItem.getName().substring(idx + 1);
                        fileList.add(fileName);
                        File uploadFile = new File(currentDirPath + "/" + fileName);
                        fileItem.write(uploadFile);
                    } // end if
                } // end if
            } // end for
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("fileList", fileList);
        RequestDispatcher dis = request.getRequestDispatcher("/pro15/test02/result.jsp");
        dis.forward(request, response);

    }

}
