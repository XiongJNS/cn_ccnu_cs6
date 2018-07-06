package cn.rt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.rt.entity.Student;
import cn.rt.service.StudentService;
import cn.rt.service.impl.StudentServiceImpl;

public class StudentServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String action = request.getParameter("action");// 要执行的动作
		System.out.println(action);
		StudentService stuService = new StudentServiceImpl();
		switch (action) {
		case "getAll":// 查询所有

			getAll(request, response, stuService);

			break;
		case "toEdit":// 转到修改页面
			toEdit(request, response, stuService);

			break;
		case "edit":// 修改信息
			editStudent(request, response, stuService);

			break;
		default:
			break;
		}

	}

	private void toEdit(HttpServletRequest request, HttpServletResponse response, StudentService stuService)
			throws ServletException, IOException {
		String stuId = request.getParameter("stuId");// 获取要修改的学生编号
		System.out.println(stuId);
		// 根据编号 查出学生
		Student stu = stuService.getById(stuId);
		request.setAttribute("stu", stu);
		request.getRequestDispatcher("/student/editStudent.jsp").forward(request, response);
	}

	private void editStudent(HttpServletRequest request, HttpServletResponse response, StudentService stuService)
			throws ServletException, IOException {
		String stuId2 = request.getParameter("stuId");
		String stuName = request.getParameter("stuName");
		String phone = request.getParameter("phone");
		String strBri = request.getParameter("brithday");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 简单日期格式化
		Date brithday = null;
		try {
			brithday = sdf.parse(strBri);// 转成日期类型

		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu2 = new Student(stuId2, stuName, brithday, phone);
		boolean b = stuService.editStu(stu2);
		if (b) {// 修改成功
				// 转到列表页面
			getAll(request, response, stuService);

		} else {// 失败 就转回修改页面 重新修改
			request.setAttribute("stu", stu2);
			request.getRequestDispatcher("/student/editStudent.jsp").forward(request, response);

		}
	}

	private void getAll(HttpServletRequest request, HttpServletResponse response, StudentService stuService)
			throws ServletException, IOException {
		// 查询出所有学生信息
		List<Student> stus = stuService.getAll();
		request.setAttribute("stus", stus);// 存储到请求对象
		// 转发到页面
		request.getRequestDispatcher("/student/showInfo.jsp").forward(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
