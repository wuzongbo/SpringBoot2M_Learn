package com.holding.po;

import java.util.ArrayList;
import java.util.List;

public class DeskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeskExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andXaxisIsNull() {
            addCriterion("xAxis is null");
            return (Criteria) this;
        }

        public Criteria andXaxisIsNotNull() {
            addCriterion("xAxis is not null");
            return (Criteria) this;
        }

        public Criteria andXaxisEqualTo(Integer value) {
            addCriterion("xAxis =", value, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisNotEqualTo(Integer value) {
            addCriterion("xAxis <>", value, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisGreaterThan(Integer value) {
            addCriterion("xAxis >", value, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisGreaterThanOrEqualTo(Integer value) {
            addCriterion("xAxis >=", value, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisLessThan(Integer value) {
            addCriterion("xAxis <", value, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisLessThanOrEqualTo(Integer value) {
            addCriterion("xAxis <=", value, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisIn(List<Integer> values) {
            addCriterion("xAxis in", values, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisNotIn(List<Integer> values) {
            addCriterion("xAxis not in", values, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisBetween(Integer value1, Integer value2) {
            addCriterion("xAxis between", value1, value2, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisNotBetween(Integer value1, Integer value2) {
            addCriterion("xAxis not between", value1, value2, "xaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisIsNull() {
            addCriterion("yAxis is null");
            return (Criteria) this;
        }

        public Criteria andYaxisIsNotNull() {
            addCriterion("yAxis is not null");
            return (Criteria) this;
        }

        public Criteria andYaxisEqualTo(Integer value) {
            addCriterion("yAxis =", value, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisNotEqualTo(Integer value) {
            addCriterion("yAxis <>", value, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisGreaterThan(Integer value) {
            addCriterion("yAxis >", value, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisGreaterThanOrEqualTo(Integer value) {
            addCriterion("yAxis >=", value, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisLessThan(Integer value) {
            addCriterion("yAxis <", value, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisLessThanOrEqualTo(Integer value) {
            addCriterion("yAxis <=", value, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisIn(List<Integer> values) {
            addCriterion("yAxis in", values, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisNotIn(List<Integer> values) {
            addCriterion("yAxis not in", values, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisBetween(Integer value1, Integer value2) {
            addCriterion("yAxis between", value1, value2, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisNotBetween(Integer value1, Integer value2) {
            addCriterion("yAxis not between", value1, value2, "yaxis");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Integer value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Integer value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Integer value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Integer value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Integer value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Integer> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Integer> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Integer value1, Integer value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andXmaxnumIsNull() {
            addCriterion("xMaxNum is null");
            return (Criteria) this;
        }

        public Criteria andXmaxnumIsNotNull() {
            addCriterion("xMaxNum is not null");
            return (Criteria) this;
        }

        public Criteria andXmaxnumEqualTo(Integer value) {
            addCriterion("xMaxNum =", value, "xmaxnum");
            return (Criteria) this;
        }

        public Criteria andXmaxnumNotEqualTo(Integer value) {
            addCriterion("xMaxNum <>", value, "xmaxnum");
            return (Criteria) this;
        }

        public Criteria andXmaxnumGreaterThan(Integer value) {
            addCriterion("xMaxNum >", value, "xmaxnum");
            return (Criteria) this;
        }

        public Criteria andXmaxnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("xMaxNum >=", value, "xmaxnum");
            return (Criteria) this;
        }

        public Criteria andXmaxnumLessThan(Integer value) {
            addCriterion("xMaxNum <", value, "xmaxnum");
            return (Criteria) this;
        }

        public Criteria andXmaxnumLessThanOrEqualTo(Integer value) {
            addCriterion("xMaxNum <=", value, "xmaxnum");
            return (Criteria) this;
        }

        public Criteria andXmaxnumIn(List<Integer> values) {
            addCriterion("xMaxNum in", values, "xmaxnum");
            return (Criteria) this;
        }

        public Criteria andXmaxnumNotIn(List<Integer> values) {
            addCriterion("xMaxNum not in", values, "xmaxnum");
            return (Criteria) this;
        }

        public Criteria andXmaxnumBetween(Integer value1, Integer value2) {
            addCriterion("xMaxNum between", value1, value2, "xmaxnum");
            return (Criteria) this;
        }

        public Criteria andXmaxnumNotBetween(Integer value1, Integer value2) {
            addCriterion("xMaxNum not between", value1, value2, "xmaxnum");
            return (Criteria) this;
        }

        public Criteria andYmaxnumIsNull() {
            addCriterion("yMaxNum is null");
            return (Criteria) this;
        }

        public Criteria andYmaxnumIsNotNull() {
            addCriterion("yMaxNum is not null");
            return (Criteria) this;
        }

        public Criteria andYmaxnumEqualTo(Integer value) {
            addCriterion("yMaxNum =", value, "ymaxnum");
            return (Criteria) this;
        }

        public Criteria andYmaxnumNotEqualTo(Integer value) {
            addCriterion("yMaxNum <>", value, "ymaxnum");
            return (Criteria) this;
        }

        public Criteria andYmaxnumGreaterThan(Integer value) {
            addCriterion("yMaxNum >", value, "ymaxnum");
            return (Criteria) this;
        }

        public Criteria andYmaxnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("yMaxNum >=", value, "ymaxnum");
            return (Criteria) this;
        }

        public Criteria andYmaxnumLessThan(Integer value) {
            addCriterion("yMaxNum <", value, "ymaxnum");
            return (Criteria) this;
        }

        public Criteria andYmaxnumLessThanOrEqualTo(Integer value) {
            addCriterion("yMaxNum <=", value, "ymaxnum");
            return (Criteria) this;
        }

        public Criteria andYmaxnumIn(List<Integer> values) {
            addCriterion("yMaxNum in", values, "ymaxnum");
            return (Criteria) this;
        }

        public Criteria andYmaxnumNotIn(List<Integer> values) {
            addCriterion("yMaxNum not in", values, "ymaxnum");
            return (Criteria) this;
        }

        public Criteria andYmaxnumBetween(Integer value1, Integer value2) {
            addCriterion("yMaxNum between", value1, value2, "ymaxnum");
            return (Criteria) this;
        }

        public Criteria andYmaxnumNotBetween(Integer value1, Integer value2) {
            addCriterion("yMaxNum not between", value1, value2, "ymaxnum");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNull() {
            addCriterion("roomId is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomId is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Integer value) {
            addCriterion("roomId =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Integer value) {
            addCriterion("roomId <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Integer value) {
            addCriterion("roomId >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomId >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Integer value) {
            addCriterion("roomId <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Integer value) {
            addCriterion("roomId <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Integer> values) {
            addCriterion("roomId in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Integer> values) {
            addCriterion("roomId not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Integer value1, Integer value2) {
            addCriterion("roomId between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("roomId not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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