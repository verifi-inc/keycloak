package org.keycloak.common.util;

import java.security.cert.X509Certificate;
import java.util.Date;

// Verifi custom code.  DO NOT COMMIT TO KEYCLOAK
public class VerifiUtils {

    public static Long getCertificateExpiry(String[] x509CertificateChain) {
        if (x509CertificateChain.length > 0) {
            X509Certificate cert = PemUtils.decodeCertificate(x509CertificateChain[0]);
            Date expires = cert.getNotAfter();
            if (expires != null) {
                return expires.getTime() / 1000;
            }
        }
        return -1L;
    }
}
