package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

public class ArtistServlet extends HttpServlet {
	
	Database db = new Database();
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Artist> artist = db.readAllArtistFromDatabase();
        for (Artist a : artist) {
            resp.getWriter().println(a.getName());
        }
    }
}
