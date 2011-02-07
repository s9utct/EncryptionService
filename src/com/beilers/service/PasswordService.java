package com.beilers.service;

import com.beilers.service.dao.PasswordDaoInterface;
import com.beilers.service.dao.password.PasswordKeyInfo;

public class PasswordService {

    private PasswordDaoInterface passwordDao;

    public void setPasswordDao(final PasswordDaoInterface passwordDao) {
        this.passwordDao = passwordDao;
    }

    public void save(final String userId, final String key, final String password) {
    }

    public String find(final String userId, final String key) {
        return passwordDao.find(new PasswordKeyInfo(userId, key));
    }
}
