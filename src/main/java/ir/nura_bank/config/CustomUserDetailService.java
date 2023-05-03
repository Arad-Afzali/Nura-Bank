package ir.nura_bank.config;

import ir.nura_bank.domain.User;
import ir.nura_bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final UserService userService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findUserBySsn(username);

        if (user == null) {
            throw new UsernameNotFoundException("user not found");
        }

        return org.springframework.security.core.userdetails.
                User
                .withUsername(username)
                .password(user.getPassword())
                .authorities(
                        user.getRoles().stream().map(role -> "ROLE_".concat(role.getName()))
                                .distinct().toArray(String[]::new)
                )
                .build();
    }
}
