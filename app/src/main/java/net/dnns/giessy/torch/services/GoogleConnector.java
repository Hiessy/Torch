package net.dnns.giessy.torch.services;

import java.io.IOException;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import net.dnns.giessy.torch.model.google.GoogleResponse;

public class GoogleConnector {

    public final static String GOOGLE_MAP_API_BASEURL = "https://maps.googleapis.com/maps/api/";

    private static String createGoogleRequest(String addressNumber, String streetName, String cityName, String provinceName, String countryName) {
        String baseUrl = "geocode/json?";
        String address = "address=" + addressNumber + "+" + streetName + ",+" + cityName + ",+" + provinceName + ",+" + countryName;
        String requestUrl = GOOGLE_MAP_API_BASEURL + baseUrl + address;
        return (requestUrl);
    }

    public static GoogleResponse getGoogleResponse(String addressNumber, String streetName, String cityName, String provinceName, String countryName) {

        ObjectMapper mapper = new ObjectMapper();
        String requestURL = createGoogleRequest(addressNumber, streetName, cityName, provinceName, countryName).replaceAll(" ", "%20");
        System.out.println(requestURL);
        GoogleResponse serverResponse = null;

        try {

            HttpURLConnection connection = (HttpURLConnection) new URL(requestURL).openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            connection.setRequestMethod("GET");
            InputStream is = connection.getInputStream();
            serverResponse = mapper.readValue(is, GoogleResponse.class);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serverResponse;
    }

}
