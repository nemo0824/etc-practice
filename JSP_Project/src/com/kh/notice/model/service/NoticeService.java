package com.kh.notice.model.service;

import java.sql.Connection;
import java.util.ArrayList; // JDBCTemplate 클래스의 모든 메소드들을 그냥 가져다 쓸수있음.

import static com.kh.common.JDBCTemplate.*;

import com.kh.common.JDBCTemplate;
import com.kh.member.model.dao.MemberDao;
import com.kh.notice.model.dao.NoticeDao;
import com.kh.notice.model.vo.Notice;

public class NoticeService {
   
   public ArrayList<Notice> selectNoticeList(){
      Connection conn = getConnection();
      
      ArrayList<Notice> list = new NoticeDao().selectNoticeList(conn);
      
      close(conn);
      
      return list;
   }
   
   public int increaseCount(int nno) {
         
         Connection conn = getConnection();
         
         int result = new NoticeDao().increaseCount(conn, nno);
         
         if(result> 0) {
            commit(conn);
         }else {
            rollback(conn);
         }
         close(conn);
         
         return result;
      }
      
      public Notice selectNotice(int nno) {
         
         Connection conn = getConnection();
         
         Notice n = new NoticeDao().selectNotice(conn, nno);
         
         close(conn);
         
         return n;
            
      }
      
     public int insertNotice(Notice n) {
        
        Connection conn = JDBCTemplate.getConnection();
        
        int result = new NoticeDao().insertNotice(conn, n);
         
         // 트랜젝션처리
         if(result>0) {//성공
            //커밋
            JDBCTemplate.commit(conn);
            
            result = new NoticeDao().selectNoticeNo(conn);
         }else { //실패
            //롤백
            JDBCTemplate.rollback(conn);
         }
         
         // 사용한 자원 반납. conn.close();
            JDBCTemplate.close(conn);
         // 컨트룰러에게 결과값 반환(처리된 행의 갯수)
         return result;
        
     }
     
     
     public int updateNotice(Notice n) {
    	 Connection conn = getConnection();
    	 
    	 int result = new NoticeDao().updateNotice(conn, n);
    	 
    	 if(result > 0) {
    		 commit(conn);
    	 }else {
    		 rollback(conn);
    	 }
    	 close(conn);
    	 
    	 return result;
     }
     
     public int deleteNotice(int nno) {
    	 Connection conn = getConnection();
    	 
    	 int result = new NoticeDao().deleteNotice(conn, nno);
    	 
    	 if(result > 0) {
    		 commit(conn);
    	 }else {
    		 rollback(conn);
    	 }
    	 close(conn);
    	 
    	 return result;
    	 
     }
     
     
}   
