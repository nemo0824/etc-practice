package com.kh.notice.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;
import com.kh.notice.model.service.NoticeService;
import com.kh.notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeUpdateFormController
 */
@WebServlet("/updateForm.no")
public class NoticeUpdateFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeUpdateFormController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int nno = Integer.parseInt(request.getParameter("nno"));
		
		
		Notice n = new NoticeService().selectNotice(nno);
		
		request.setAttribute("n", n);
		request.getRequestDispatcher("views/notice/noticeUpdateForm.jsp").forward(request, response);
		
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
	      
	      
	      Notice updateNotice = new NoticeService().updateNotice(n);
	      
	      
	      if(updateNotice == null) {// 실패
				
				request.setAttribute("errorMsg", "공지사항 수정에 실패했습니다");
				request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
				
			}else { // 성공
				// 변경된 회원정보를 session영역에 다시한번저장
				HttpSession session = request.getSession();
				session.setAttribute("loginUser", updateNotice); 
				session.setAttribute("alertMsg", "공지사항 수정에 성공하였습니다");
				
				
	}

}
