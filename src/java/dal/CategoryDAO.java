/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Category;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author PC
 */
public class CategoryDAO extends DBContext {

    // doc tat ca ban ghi tu table categories
    public List<Category> getAll() {
        List<Category> list = new ArrayList<>();
        String sql = "select * from ThongTinSach1";
        try {

            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Category c = new Category(rs.getInt("id"),
                        rs.getString("Tên sách"),
                        rs.getString("Tác giả"),
                        rs.getString("Năm xuất bản"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    // insert all category
    public void insert(Category c) {
        String sql = "INSERT INTO [ThongTinSach1]\n"
                + "           ([id]\n"
                + "           ,[Tên sách]\n"
                + "           ,[Tác giả]\n"
                + "           ,[Năm xuất bản])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, c.getId());
            st.setString(2, c.getName());
            st.setString(3, c.getAuthor());
            st.setString(4, c.getYear());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    //tim 1 category khi co id
    public Category getCategoryById(int id) {
        String sql = "select * from ThongTinSach1 where id =?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                Category c = new Category(rs.getInt("id"),
                        rs.getString("Tên sách"),
                        rs.getString("Tác giả"),
                        rs.getString("Năm xuất bản"));
                return c;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    public static void main(String[] args) {
        CategoryDAO c = new CategoryDAO();
        List<Category> list = c.getAll();
        System.out.println(list.get(0).getName());
    }

}
