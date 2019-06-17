package com.qiqiim.webserver.user.example;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

import java.util.ArrayList;
import java.util.List;

public class UserGroupExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public UserGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
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
        super.clear();
        oredCriteria.clear();
    }

    protected abstract static class GeneratedCriteria extends BaseCriteria {

        public Criteria andIdIsNull() {
            addCriterion("userGroup.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("userGroup.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("userGroup.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("userGroup.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("userGroup.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("userGroup.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("userGroup.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("userGroup.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("userGroup.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("userGroup.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("userGroup.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("userGroup.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("userGroup.avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("userGroup.avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("userGroup.avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("userGroup.avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("userGroup.avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("userGroup.avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("userGroup.avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("userGroup.avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("userGroup.avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("userGroup.avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("userGroup.avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("userGroup.avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("userGroup.avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("userGroup.avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("userGroup.group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("userGroup.group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("userGroup.group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("userGroup.group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("userGroup.group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("userGroup.group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("userGroup.group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("userGroup.group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("userGroup.group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("userGroup.group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("userGroup.group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("userGroup.group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("userGroup.group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("userGroup.group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andMembersIsNull() {
            addCriterion("userGroup.members is null");
            return (Criteria) this;
        }

        public Criteria andMembersIsNotNull() {
            addCriterion("userGroup.members is not null");
            return (Criteria) this;
        }

        public Criteria andMembersEqualTo(String value) {
            addCriterion("userGroup.members =", value, "members");
            return (Criteria) this;
        }

        public Criteria andMembersNotEqualTo(String value) {
            addCriterion("userGroup.members <>", value, "members");
            return (Criteria) this;
        }

        public Criteria andMembersGreaterThan(String value) {
            addCriterion("userGroup.members >", value, "members");
            return (Criteria) this;
        }

        public Criteria andMembersGreaterThanOrEqualTo(String value) {
            addCriterion("userGroup.members >=", value, "members");
            return (Criteria) this;
        }

        public Criteria andMembersLessThan(String value) {
            addCriterion("userGroup.members <", value, "members");
            return (Criteria) this;
        }

        public Criteria andMembersLessThanOrEqualTo(String value) {
            addCriterion("userGroup.members <=", value, "members");
            return (Criteria) this;
        }

        public Criteria andMembersLike(String value) {
            addCriterion("userGroup.members like", value, "members");
            return (Criteria) this;
        }

        public Criteria andMembersNotLike(String value) {
            addCriterion("userGroup.members not like", value, "members");
            return (Criteria) this;
        }

        public Criteria andMembersIn(List<String> values) {
            addCriterion("userGroup.members in", values, "members");
            return (Criteria) this;
        }

        public Criteria andMembersNotIn(List<String> values) {
            addCriterion("userGroup.members not in", values, "members");
            return (Criteria) this;
        }

        public Criteria andMembersBetween(String value1, String value2) {
            addCriterion("userGroup.members between", value1, value2, "members");
            return (Criteria) this;
        }

        public Criteria andMembersNotBetween(String value1, String value2) {
            addCriterion("userGroup.members not between", value1, value2, "members");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("userGroup.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("userGroup.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("userGroup.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("userGroup.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("userGroup.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("userGroup.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("userGroup.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("userGroup.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("userGroup.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("userGroup.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("userGroup.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("userGroup.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("userGroup.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("userGroup.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}