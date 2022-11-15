package com.fitness.auth;

public class JwtConfig {
    public static final String RSA_PRIVADA="-----BEGIN RSA PRIVATE KEY-----\r\n"
            + "MIIEpQIBAAKCAQEAyS+whnpWYyoOIXol9j6uU34LL402vocPQv4eX+KrKwue+F/X\r\n"
            + "B9qYql3cPAGNj23HI6wUpnXUViQJJrlCtc+hxFXxT+U2j27azcDOUDRQNxWiq7Kl\r\n"
            + "ssoOtXa5jyGH6j0tcJOvWesqzWvM1WwVfmL+JUja4UXoleS80snZKoF2InWgX/QK\r\n"
            + "mbmpS7tc691D7JtMGwiRg+Uqzwgk+5d+DV0FAyNhqE8b3asn/0eT9Y8zOmeEklZo\r\n"
            + "YBHKvik5Ni/oncF1g3FixWE1OAFKECIJRtaLDgDKx5tR9pGrO+wqOiL39txPofQC\r\n"
            + "AmQjPTGuud81tLo/KI5wbEhLDZus6zUtSef10QIDAQABAoIBAQCW0eN5zLh6OorB\r\n"
            + "WfqfcTnqaXElQq2pg0JTrIFEzH4ZFOsls2NWBe+wuBBkA54Fyfwhp90LNQXrVbRu\r\n"
            + "jS+PcIoKz4rJpEGUoTvyRvnjcnQ390YthQ1mzMbeDpTo0fA8D4TDAlPQCtXZjVjP\r\n"
            + "Hem3B6sSdF1xx6CmzgUn2B2vGcJf7Y3ybYzVflYslwDMiRDEc6UJI4tjnEzIusSk\r\n"
            + "QhOnwjFNJH15UGgdxUXSnYoMSl1fYZ23UxlfzZvBnuXuamxTZkmRYppfSM70Q6xw\r\n"
            + "VLY5jIhjAbsvVAkTMbjEhzgyEBwJq8ewEeQTIF2HnfeJDzR9CDtq2oY/xi+8L4HP\r\n"
            + "jcjp6aQBAoGBAOYorztASdSikudO13zJYBIlQjQ3J7YqY9RO6xEKPE2cms2/Pdcp\r\n"
            + "1qOE5movUNn4reGwjZl0F30YhLG7VYWdFAWgTcpcCS/Xi1L54+OP2LvlFc76xvvX\r\n"
            + "KI3C+dKzpxubF/uVi34dcR2zHruv19NjILEKXp/iQeW1dDZ+YMQsC0NxAoGBAN/G\r\n"
            + "QzLQxpxheVeyNbg6KqNo0BsLm72WS0Skl+AbM61+SOkgbRqmxoC/b0KBTeYniqaz\r\n"
            + "om7tG8oSQsTgItpRQITIov9VSXtkjZjbcIq/jce+A+kRRTfaTXewSLMfRPXu/XDH\r\n"
            + "5o96QOBAfdsV6mzv1WRf9ML4Emy11d+/e8EAVehhAoGBAIkbmW/hl1ndU0gKFqKW\r\n"
            + "z+1fVrYGWVjSnc+/B5eKEmxlq25/y5YerWeR5zVAZJjE5Mi6xU+x8cAq1/mM0KCc\r\n"
            + "9212loDDHRHsBGp0xMYuTf14teosSFeET/tLOEnFjfoLBVlxN7z0SwtXRiqm0Rpz\r\n"
            + "RelRdRcn0PvHgaho1rpmRntxAoGBAJRLSGcZkjU6J3blY9JFwdHu+NKje79FJXZE\r\n"
            + "+V0LydB0uw67bXJXCX9y3eGd3SjkFW9p5gBK47qjJVphCtfRNseISvSY6Yx7U5bz\r\n"
            + "/X4FeYjgNKk0x8E+y03BJjyGQWYVziD6aKG2q92w/3a77FHrEmhlasf2LAec7TJN\r\n"
            + "LE730PahAoGAJ/oJo3HZaBGFe82jnpvrV7qkKVHcQ0fGAYE3ghUtoaASTNximgvU\r\n"
            + "7nbsiVd5krB7RD9Tlaa3EXCc3sCCV0mbPrXk8op5uRsuoEYi4jQ5NgFcLvQembnf\r\n"
            + "1GyophWaPc+1nmUaXw5sICdkKPfdJIrQ1A/3js4vNcprfFwA/5etyiw=\r\n"
            + "-----END RSA PRIVATE KEY-----";
    
    public static final String RSA_PUBLICA="-----BEGIN PUBLIC KEY-----\r\n"
            + "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyS+whnpWYyoOIXol9j6u\r\n"
            + "U34LL402vocPQv4eX+KrKwue+F/XB9qYql3cPAGNj23HI6wUpnXUViQJJrlCtc+h\r\n"
            + "xFXxT+U2j27azcDOUDRQNxWiq7KlssoOtXa5jyGH6j0tcJOvWesqzWvM1WwVfmL+\r\n"
            + "JUja4UXoleS80snZKoF2InWgX/QKmbmpS7tc691D7JtMGwiRg+Uqzwgk+5d+DV0F\r\n"
            + "AyNhqE8b3asn/0eT9Y8zOmeEklZoYBHKvik5Ni/oncF1g3FixWE1OAFKECIJRtaL\r\n"
            + "DgDKx5tR9pGrO+wqOiL39txPofQCAmQjPTGuud81tLo/KI5wbEhLDZus6zUtSef1\r\n"
            + "0QIDAQAB\r\n"
            + "-----END PUBLIC KEY-----"; 
}
