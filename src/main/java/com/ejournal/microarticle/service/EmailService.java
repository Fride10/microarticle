package com.ejournal.microarticle.service;

import com.ejournal.microarticle.entity.EmailDetails;

public interface EmailService {
    String sendSimpleMail(EmailDetails details);
    String sendMailWithAttachment(EmailDetails details);
}
