package cn.sm1234.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author{张明亮} 2018/10/14 21:34
 * 自定义实现用户权限访问控制
 */
public class MyUserDetailService implements UserDetailsService {
    /**
     * @return a
     * @author {张明亮}
     * @date 2018/10/14 21:35
     * @Parm: null
     * @description {读取用户信息}
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //模拟数据，数据可以在这里从数据库取得，加入数据，封装权限，用户角色
        User user=new User("ml","123456", AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));

        return user;
    }
}
