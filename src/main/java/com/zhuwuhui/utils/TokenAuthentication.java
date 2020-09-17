package com.zhuwuhui.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenAuthentication {

    /**
     * 校验token是否正确
     *
     * @param token 密钥
     * @return 是否正确
     */
    public static boolean verify(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(JwtUtil.TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm)
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    /**
     * 生成签名，15min后过期
     */
    public static String sign(String userName, String userId){

        try {

            Date date = new Date(System.currentTimeMillis() + JwtUtil.EXPIRE_TIME);
            Algorithm algorithm = Algorithm.HMAC256(JwtUtil.TOKEN_SECRET);
            Map<String, Object> header = new HashMap<>(2);
            header.put("typ","JWT");
            header.put("alg","HMAC256");

            return JWT.create()
                    .withHeader(header)
                    .withClaim("loginName",userName)
                    .withClaim("userId",userId)
                    .withExpiresAt(date)
                    .sign(algorithm);
        }catch (Exception e){
            return null;
        }
    }
}
