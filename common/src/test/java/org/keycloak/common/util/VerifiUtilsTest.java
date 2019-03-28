package org.keycloak.common.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Verifi custom code.  DO NOT COMMIT TO KEYCLOAK
public class VerifiUtilsTest {

    @Test
    public void testGetCertificateExpiryNoCerts() {
        String[] certs = new String[] {};
        assertEquals(-1L, VerifiUtils.getCertificateExpiry(certs).longValue());
    }

    @Test
    public void testGetCertificateExpiryValid() {
        String[] certs = generateTestCert();
        assertEquals(1585349500L, VerifiUtils.getCertificateExpiry(certs).longValue());
    }

    private String[] generateTestCert() {
        String testPemCert =
        "MIID1zCCAr+gAwIBAgIJALCD2cbjgN3mMA0GCSqGSIb3DQEBCwUAMIGBMQswCQYD" +
        "VQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTESMBAGA1UEBwwJU2FuIERpZWdv" +
        "MQ8wDQYDVQQKDAZWZXJpZmkxFzAVBgNVBAMMDmRldi52ZXJpZmkuY29tMR8wHQYJ" +
        "KoZIhvcNAQkBFhBhdGxhc0B2ZXJpZmkuY29tMB4XDTE5MDMyODIyNTE0MFoXDTIw" +
        "MDMyNzIyNTE0MFowgYExCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlh" +
        "MRIwEAYDVQQHDAlTYW4gRGllZ28xDzANBgNVBAoMBlZlcmlmaTEXMBUGA1UEAwwO" +
        "ZGV2LnZlcmlmaS5jb20xHzAdBgkqhkiG9w0BCQEWEGF0bGFzQHZlcmlmaS5jb20w" +
        "ggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCnd+RHPnK9DNh/oS4NqfxC" +
        "zUCvjMfLM4CfPTeAE3G+aN9eoao45c2smHDEPb82TIRCkscs4We87NbhGoi8+DFJ" +
        "JCZj2yVQ1LAcUWsa2wwGjJq4DlQnqHuo0AIkVI8s7ZjGk6u/wZBlEpHyngYi7oUN" +
        "1SPTL1DlL6bWY7gikIcVr5m9lHCjfMBGK9GhCQWd7FgajYHaIxnmd0ZuVkT/PYgo" +
        "SSN3NyinfdNpm2kY6J7/mPN/Dee5nTRySOepKAgLmZW3NqvzwjvkERbY3P/nomx4" +
        "C48cJtrcgYt9NYRKpKP4cch3N/HOBOzYea9o3yBK+vSMTPGdjce+BR7cO1/FDYIr" +
        "AgMBAAGjUDBOMB0GA1UdDgQWBBQd2liL0ClYTBuSWoPgxhlWRwZ83zAfBgNVHSME" +
        "GDAWgBQd2liL0ClYTBuSWoPgxhlWRwZ83zAMBgNVHRMEBTADAQH/MA0GCSqGSIb3" +
        "DQEBCwUAA4IBAQBch7lai31PaOfjkziHOZIQtm9tdXqsPYovRYV+OrS63RBoFPw/" +
        "npRqsXr+Mx2XD/LskzvJSXoHlK3x8YeV9nWDhDo+W2IT3d23c7XgyMS1N0OiBo9Q" +
        "cso2KeQNeSdbI4Y6aokDISRTG3MBDdiYhmoSlBLGwhHEGeuq/FfCnGtV5aZESHvZ" +
        "0VYDpGUEbOwGc9YjbS/8HvWlZK2nXAYJDSox7qZu0TjKnuLTMe/te27AFRAav91P" +
        "xp3fjZYP4v5Jb6+wCmUy6R3yr0ID6JmCgd7sEtY5ZkTACKCWrdvSbyJ1kXHg4Ys2" +
        "Tx+pYw0WsEENJnHgs/wO5wuOyQ+CvGdTTqUf";
        return new String[] {testPemCert};
    }
}
