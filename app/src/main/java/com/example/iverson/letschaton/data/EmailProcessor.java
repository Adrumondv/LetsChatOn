package com.example.iverson.letschaton.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmailProcessor {

    public String sanitizedEmail(String email){
        return email.replace("@", "AT").replace(".", "DOT");
    }

    public String keyEmails(String otherEmail){
        String currentEmail = new CurrentUser().email();
        List<String> emails = new ArrayList<>();
        emails.add(sanitizedEmail(currentEmail));
        emails.add(sanitizedEmail(otherEmail));
        Collections.sort(emails);
        return emails.get(0) + " - " + emails.get(1);

    }


}
