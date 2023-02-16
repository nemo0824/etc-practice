package com.kh.notice.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;
import com.kh.notice.model.service.NoticeService;
import com.kh.notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeInsertController
 */
@WebServlet("/insert.no")
public class NoticeInsertController extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeInsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      response.getWriter().append("Served at: ").append(request.getContextPath());
      
   }

   
   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
     request.setCharacterEncoding("UTF-8"); 
     
     String userNo = request.getParameter("userNo");
      String content = request.getParameter("content");
      String title = request.getParameter("title");
      
      Notice n = new Notice();
      n.setNoticeTitle(title);
      n.setNoticeContent(content);
      n.setNoticeWriter(userNo);
      
      //3) 요청처리 (서비스 메소드호출 후 결과값 돌려받기)
      int result = new NoticeService().insertNotice(n);
      
      //4) 처리 결과를 가지고 사용자가보게될 응답화면을 지정
      if(result > 0) { // 성공 => list.no로 이동
         request.getSession().setAttribute("alertMsg", "공지사항등록에 성공하였습니다.");
         
         //response.sendRedirect(request.getContextPath()+"/list.no");
   
         // 글 등록에 성공하였을때 내가 작성한 게시글로 곧바로 이동
         response.sendRedirect(request.getContextPath()+"/detail.no?nno=" + result);
      }else { // 실패 => 에러페이지 포워딩
         request.setAttribute("errorMsg", "공지사항 등록 실패");
         request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
      }
   }

}