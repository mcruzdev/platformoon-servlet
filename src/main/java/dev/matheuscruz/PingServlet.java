package dev.matheuscruz;


import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "PingServlet",
        urlPatterns = "/ping"
)
public class PingServlet extends HttpServlet {

    private final PingService pingService;

    @Inject
    PingServlet(PingService pingService) {
        this.pingService = pingService;
    }

    private static final String TEXT_PLAIN = "text/plain";

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType(TEXT_PLAIN);
        try (PrintWriter printWriter = new PrintWriter(resp.getWriter())) {
            printWriter.println(this.pingService.ping());
        }
    }
}
