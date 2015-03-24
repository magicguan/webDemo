package com.sunday.webDemo.web.service;

import com.sunday.webDemo.web.pojo.Account;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

/**
 * function description.
 * <p><h2>Change History</h2>
 * 2014/7/31 | G | created
 * </p>
 *
 * @author G
 * @version 1.0.0
 */
@Service
public interface BankService {
    @Secured("IS_AUTHENTICATED_ANONYMOUSLY")
    public Account readAccount(Long id);

    @Secured("IS_AUTHENTICATED_ANONYMOUSLY")
    public Account[] findAccounts();

    @Secured("ROLE_TELLER")
    public Account post(Account account, double amount);
}
