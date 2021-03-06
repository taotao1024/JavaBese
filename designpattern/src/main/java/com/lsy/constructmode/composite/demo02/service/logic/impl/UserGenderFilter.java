package com.lsy.constructmode.composite.demo02.service.logic.impl;


import com.lsy.constructmode.composite.demo02.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author TT
 */
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }

}
