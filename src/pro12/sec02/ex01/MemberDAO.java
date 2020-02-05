package pro12.sec02.ex01;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private DataSource dataFactory;

    public MemberDAO() {
        try {
            Context ctx = new InitialContext();
            Context envContext = (Context) ctx.lookup("java:/comp/env");
            dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
        } catch (NamingException e) {
            e.printStackTrace();

        }
    }

    public List listMember(MemberBean memberVO) {
        ArrayList membersList = new ArrayList();
        String _name = memberVO.getName();

        try {
            con = dataFactory.getConnection();
            String query = "select * from t_member";
            if ((_name != null) && _name.length() != 0) {
                query += " where name=?";
                pstmt = con.prepareStatement(query);
                pstmt.setString(1, _name);
            } else {
                pstmt = con.prepareStatement(query);
            }

            System.out.println("prepareStatement: " + query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("joinDate");
                MemberBean vo = new MemberBean();
                vo.setId(id);
                vo.setPwd(pwd);
                vo.setName(name);
                vo.setEmail(email);
                vo.setJoinDate(joinDate);
                membersList.add(vo);
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return membersList;
    }

}
