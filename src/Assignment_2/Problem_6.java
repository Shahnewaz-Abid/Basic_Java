package Assignment_2;

// <html>
//<body>
//<div>
//<p>Transaction Successful</p>
//<p>Trnx ID: TXN5164870</p>
//</div>
//
//
//</body>
//</html>
//
//
//Extract only transaction ID from the HTML

public class Problem_6 {
    public static void main(String[] args) {
        String html_str = "<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        String transaction_id = html_str.substring(html_str.indexOf("TXN"), 72);
        System.out.println(transaction_id);
    }
}
