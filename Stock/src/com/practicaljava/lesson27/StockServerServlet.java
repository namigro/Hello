package com.practicaljava.lesson27;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StockServerServlet
 */
@WebServlet("/StockServerServlet")
public class StockServerServlet extends HttpServlet {
	private StockQuoteGenerator stockQuoteGenerator = new StockQuoteGenerator();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StockServerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String symbol = request.getParameter("symbol");
		String price = stockQuoteGenerator.getPrice(symbol);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("<h2>Stock symbol: " + symbol + "</h2>");
		out.println("<h2>Price: " + price + "</h2>");
		out.println("</body></html>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
