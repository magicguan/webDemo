package org.nsfw.webDemo.web.service;

import org.nsfw.webDemo.web.pojo.Account;
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
    Account readAccount(Long id);

    Account[] findAccounts();

    Account post(Account account, double amount);
}
