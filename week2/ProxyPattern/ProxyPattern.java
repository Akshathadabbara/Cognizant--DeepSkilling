package week2.ProxyPattern;

public class ProxyPattern {

    public static void main(String[] args) {

        Internet internet = new ProxyInternet();

        internet.connect("google.com");
        internet.connect("facebook.com");
        internet.connect("openai.com");
    }
}

interface Internet {
    void connect(String website);
}

class RealInternet implements Internet {

    @Override
    public void connect(String website) {
        System.out.println("Connected to " + website);
    }
}

class ProxyInternet implements Internet {

    private RealInternet realInternet = new RealInternet();

    @Override
    public void connect(String website) {

        if (website.equalsIgnoreCase("facebook.com")) {
            System.out.println("Access Denied to " + website);
        } else {
            realInternet.connect(website);
        }
    }
}