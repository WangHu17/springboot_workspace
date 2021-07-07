package com.example.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-21 15:19
 */
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
        //定制请求的授权规则
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP3");

        //开启自动配置的登录功能，没登录就跳转到登录页面，可以自定义登录页面
        http.formLogin().loginPage("/userlogin");

        //开启自动配置的注销功能,注销后跳转到首页
        http.logout().logoutSuccessUrl("/");

        //开启记住我功能
        http.rememberMe().rememberMeParameter("rememberMe");
    }

    //定义认证规则
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
        //在内存中
        auth.inMemoryAuthentication()
                .withUser("1").password("{noop}1").roles("VIP1")
                .and()
                .withUser("2").password("{noop}2").roles("VIP2")
                .and()
                .withUser("3").password("{noop}3").roles("VIP3");
    }
}
