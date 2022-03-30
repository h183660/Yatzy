package no.hvl.dat109.servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import no.hvl.dat109.spiller.Spiller;
import no.hvl.dat109.spiller.SpillerDAO;

@WebServlet(name = "SpillerListeServlet", urlPatterns = "/SpillerListeServlet")
public class SpillerListeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private SpillerDAO spillerDao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Henter sesjonen
		HttpSession sesjon = request.getSession(false);

		// Skjekke om logget inn
		if (sesjon != null && sesjon.getAttribute("spiller") != null) {

			// Henter alle deltagerene sortert etter navn
			List<Spiller> spillere = spillerDao.finnAlleEtterBrukernavn();

			// Setter deltagerene som atributt i requesten, hentes ut i jsp siden...
			request.setAttribute("spillere", spillere);

			// Gå til deltagerlisten
			request.getRequestDispatcher("WEB-INF/jsp/spillerliste.jsp").forward(request, response);

		} else {

			// Ikke logget inn? gå til påmeldingssiden
			response.sendRedirect("RegistrerServlet");

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		// Bruker trykker på ferdig knappen
//		HttpSession sesjon = request.getSession(false);
//
//		// Avslutter sesjonen
//		sesjon.invalidate();
//
//		// Sendes til ferdig siden
//		response.sendRedirect("FerdigServlet");

	}

}
