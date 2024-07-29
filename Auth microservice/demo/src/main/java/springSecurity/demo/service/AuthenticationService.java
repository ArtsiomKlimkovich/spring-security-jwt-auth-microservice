package springSecurity.demo.service;

import springSecurity.demo.dto.JwtAuthenticationResponse;
import springSecurity.demo.dto.RefreshTokenRequest;
import springSecurity.demo.dto.SignUpRequest;
import springSecurity.demo.dto.SignInRequest;
import springSecurity.demo.entity.User;

public interface AuthenticationService {

    User signUp(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signIn(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}