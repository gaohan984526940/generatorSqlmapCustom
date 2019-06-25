package com.tellhow.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Long value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Long value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Long value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Long value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Long value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Long> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Long> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Long value1, Long value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Long value1, Long value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNull() {
            addCriterion("PCODE is null");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNotNull() {
            addCriterion("PCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPcodeEqualTo(String value) {
            addCriterion("PCODE =", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotEqualTo(String value) {
            addCriterion("PCODE <>", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThan(String value) {
            addCriterion("PCODE >", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PCODE >=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThan(String value) {
            addCriterion("PCODE <", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThanOrEqualTo(String value) {
            addCriterion("PCODE <=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLike(String value) {
            addCriterion("PCODE like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotLike(String value) {
            addCriterion("PCODE not like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeIn(List<String> values) {
            addCriterion("PCODE in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotIn(List<String> values) {
            addCriterion("PCODE not in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeBetween(String value1, String value2) {
            addCriterion("PCODE between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotBetween(String value1, String value2) {
            addCriterion("PCODE not between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodesIsNull() {
            addCriterion("PCODES is null");
            return (Criteria) this;
        }

        public Criteria andPcodesIsNotNull() {
            addCriterion("PCODES is not null");
            return (Criteria) this;
        }

        public Criteria andPcodesEqualTo(String value) {
            addCriterion("PCODES =", value, "pcodes");
            return (Criteria) this;
        }

        public Criteria andPcodesNotEqualTo(String value) {
            addCriterion("PCODES <>", value, "pcodes");
            return (Criteria) this;
        }

        public Criteria andPcodesGreaterThan(String value) {
            addCriterion("PCODES >", value, "pcodes");
            return (Criteria) this;
        }

        public Criteria andPcodesGreaterThanOrEqualTo(String value) {
            addCriterion("PCODES >=", value, "pcodes");
            return (Criteria) this;
        }

        public Criteria andPcodesLessThan(String value) {
            addCriterion("PCODES <", value, "pcodes");
            return (Criteria) this;
        }

        public Criteria andPcodesLessThanOrEqualTo(String value) {
            addCriterion("PCODES <=", value, "pcodes");
            return (Criteria) this;
        }

        public Criteria andPcodesLike(String value) {
            addCriterion("PCODES like", value, "pcodes");
            return (Criteria) this;
        }

        public Criteria andPcodesNotLike(String value) {
            addCriterion("PCODES not like", value, "pcodes");
            return (Criteria) this;
        }

        public Criteria andPcodesIn(List<String> values) {
            addCriterion("PCODES in", values, "pcodes");
            return (Criteria) this;
        }

        public Criteria andPcodesNotIn(List<String> values) {
            addCriterion("PCODES not in", values, "pcodes");
            return (Criteria) this;
        }

        public Criteria andPcodesBetween(String value1, String value2) {
            addCriterion("PCODES between", value1, value2, "pcodes");
            return (Criteria) this;
        }

        public Criteria andPcodesNotBetween(String value1, String value2) {
            addCriterion("PCODES not between", value1, value2, "pcodes");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("SORT is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("SORT =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("SORT <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("SORT >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("SORT <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("SORT <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("SORT in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("SORT not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("SORT between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andLevelsIsNull() {
            addCriterion("LEVELS is null");
            return (Criteria) this;
        }

        public Criteria andLevelsIsNotNull() {
            addCriterion("LEVELS is not null");
            return (Criteria) this;
        }

        public Criteria andLevelsEqualTo(Integer value) {
            addCriterion("LEVELS =", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotEqualTo(Integer value) {
            addCriterion("LEVELS <>", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsGreaterThan(Integer value) {
            addCriterion("LEVELS >", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEVELS >=", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsLessThan(Integer value) {
            addCriterion("LEVELS <", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsLessThanOrEqualTo(Integer value) {
            addCriterion("LEVELS <=", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsIn(List<Integer> values) {
            addCriterion("LEVELS in", values, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotIn(List<Integer> values) {
            addCriterion("LEVELS not in", values, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsBetween(Integer value1, Integer value2) {
            addCriterion("LEVELS between", value1, value2, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotBetween(Integer value1, Integer value2) {
            addCriterion("LEVELS not between", value1, value2, "levels");
            return (Criteria) this;
        }

        public Criteria andMenuFlagIsNull() {
            addCriterion("MENU_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMenuFlagIsNotNull() {
            addCriterion("MENU_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMenuFlagEqualTo(String value) {
            addCriterion("MENU_FLAG =", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagNotEqualTo(String value) {
            addCriterion("MENU_FLAG <>", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagGreaterThan(String value) {
            addCriterion("MENU_FLAG >", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_FLAG >=", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagLessThan(String value) {
            addCriterion("MENU_FLAG <", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagLessThanOrEqualTo(String value) {
            addCriterion("MENU_FLAG <=", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagLike(String value) {
            addCriterion("MENU_FLAG like", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagNotLike(String value) {
            addCriterion("MENU_FLAG not like", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagIn(List<String> values) {
            addCriterion("MENU_FLAG in", values, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagNotIn(List<String> values) {
            addCriterion("MENU_FLAG not in", values, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagBetween(String value1, String value2) {
            addCriterion("MENU_FLAG between", value1, value2, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagNotBetween(String value1, String value2) {
            addCriterion("MENU_FLAG not between", value1, value2, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagIsNull() {
            addCriterion("NEW_PAGE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagIsNotNull() {
            addCriterion("NEW_PAGE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagEqualTo(String value) {
            addCriterion("NEW_PAGE_FLAG =", value, "newPageFlag");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagNotEqualTo(String value) {
            addCriterion("NEW_PAGE_FLAG <>", value, "newPageFlag");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagGreaterThan(String value) {
            addCriterion("NEW_PAGE_FLAG >", value, "newPageFlag");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_PAGE_FLAG >=", value, "newPageFlag");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagLessThan(String value) {
            addCriterion("NEW_PAGE_FLAG <", value, "newPageFlag");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagLessThanOrEqualTo(String value) {
            addCriterion("NEW_PAGE_FLAG <=", value, "newPageFlag");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagLike(String value) {
            addCriterion("NEW_PAGE_FLAG like", value, "newPageFlag");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagNotLike(String value) {
            addCriterion("NEW_PAGE_FLAG not like", value, "newPageFlag");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagIn(List<String> values) {
            addCriterion("NEW_PAGE_FLAG in", values, "newPageFlag");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagNotIn(List<String> values) {
            addCriterion("NEW_PAGE_FLAG not in", values, "newPageFlag");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagBetween(String value1, String value2) {
            addCriterion("NEW_PAGE_FLAG between", value1, value2, "newPageFlag");
            return (Criteria) this;
        }

        public Criteria andNewPageFlagNotBetween(String value1, String value2) {
            addCriterion("NEW_PAGE_FLAG not between", value1, value2, "newPageFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIsNull() {
            addCriterion("OPEN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIsNotNull() {
            addCriterion("OPEN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOpenFlagEqualTo(String value) {
            addCriterion("OPEN_FLAG =", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotEqualTo(String value) {
            addCriterion("OPEN_FLAG <>", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagGreaterThan(String value) {
            addCriterion("OPEN_FLAG >", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_FLAG >=", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLessThan(String value) {
            addCriterion("OPEN_FLAG <", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLessThanOrEqualTo(String value) {
            addCriterion("OPEN_FLAG <=", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLike(String value) {
            addCriterion("OPEN_FLAG like", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotLike(String value) {
            addCriterion("OPEN_FLAG not like", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIn(List<String> values) {
            addCriterion("OPEN_FLAG in", values, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotIn(List<String> values) {
            addCriterion("OPEN_FLAG not in", values, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagBetween(String value1, String value2) {
            addCriterion("OPEN_FLAG between", value1, value2, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotBetween(String value1, String value2) {
            addCriterion("OPEN_FLAG not between", value1, value2, "openFlag");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Long value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Long value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Long value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Long value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Long> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Long> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Long value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Long value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Long value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Long value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Long> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Long> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Long value1, Long value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}