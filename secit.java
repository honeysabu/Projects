public class Test extends TestCase
{
 
    private boolean pTrue = true;
    private boolean pFalse = false;

    public void BB(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (pTrue)
        {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test\">");
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            response.getWriter().println("Password: <input name=\"password\" type=\"text\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-bad\" /></form>");
        }
    }

}
