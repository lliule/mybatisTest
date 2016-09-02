package com.weichaishi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "labac_tasks")
public class LabacTasks implements Serializable {

    @Id
    private Integer taskId;

    private BigDecimal taskProjectId;

    private Short taskLocationFlag;

    private Integer taskCityId;

    private Date taskBeginTime;

    private Date taskEndTime;

    private Short taskRewardValue;

    private Short taskQuantity;

    private Short taskQuantityUsed;

    private Date taskCreateTime;

    private Date taskUpdateTime;

    private Short taskPhotoNumber;

    private Short taskQuestionNumber;

    private Short taskActionNumber;

    private String taskSubject;

    private Short taskRewardPoint;

    private String taskDetail;

    private Short taskFlag;

    private Short taskGiftFlag;

    private String taskTitle;

    private Short taskApprovalFlag;

    private String taskApprovalQuestion;

    private Short taskMultipleAssignmentAllow;

    private Long taskDetailId;

    private String taskRefId;

    private Integer taskCategoryId;

    private Short taskSubmitDuration;

    private Short taskProvinceId;

    private Short taskDifficultyLevel;

    private Short taskRewardType;

    private Short taskResponseKeyStep;

    //    @JsonIgnore
    private BigDecimal taskPrereqTaskId;

    //    @JsonIgnore
    private BigDecimal taskPostTaskId;
    private Short taskRewardPayableFlag;

    private Short taskRuleFlag;
    private Short taskRewardUnitValue;
    private Short taskMaxMultipleAssignAllow;


    private Short taskReviewDuration;

    private Short taskReviewFlag;

    private Short taskSupportDeviceType;

    private String taskDefinition;

    private Short taskAutoApproveFlag;

    private Short taskMultipleSubmissionAllow;

    private String taskReferDetail;

    private BigDecimal taskExceptionDetailId;

    private String taskExceptionMessage;

    private Short saleId;

    private Short taskPreviewFlag;

    private String taskLocName;

    private String taskLocSource;

    private String taskLocAddress;

    @JsonIgnore
    private Object taskLocGeo;

    public Object getTaskLocGeo() {
        return taskLocGeo;
    }

    public void setTaskLocGeo(Object taskLocGeo) {
        this.taskLocGeo = taskLocGeo;
    }

    @Transient
    private Object taskSdoGtype;

    @Transient
    private Object taskSdosrid;

    @Transient
    private BigDecimal taskSdoPointX;

    @Transient
    private BigDecimal taskSdoPointY;

    @Transient
    private BigDecimal taskSdoPointZ;

    @Transient
    private Object taskSdoOrdinates;

    @Transient
    private Object taskSdoElemInfo;



    private String taskLocPhone;

    private String taskLocRefId;


    private String taskDatasource;


    private Short taskDisplayFlag;


    private Short taskReferrableFlag;


    private Short taskReferrableRewardValue;

    private Short taskReferrableRewardPoint;


    private String taskReferrableMessage;


    private BigDecimal taskOrder;


    private Short taskRecommendeeRewardValue;


    private Short taskType;


    private String taskEngine;

    public LabacTasks() {
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }


    public BigDecimal getTaskProjectId() {
        return taskProjectId;
    }

    public void setTaskProjectId(BigDecimal taskProjectId) {
        this.taskProjectId = taskProjectId;
    }


    public Short getTaskLocationFlag() {
        return taskLocationFlag;
    }


    public void setTaskLocationFlag(Short taskLocationFlag) {
        this.taskLocationFlag = taskLocationFlag;
    }


    public Integer getTaskCityId() {
        return taskCityId;
    }


    public void setTaskCityId(Integer taskCityId) {
        this.taskCityId = taskCityId;
    }


    public Date getTaskBeginTime() {
        return taskBeginTime;
    }


    public void setTaskBeginTime(Date taskBeginTime) {
        this.taskBeginTime = taskBeginTime;
    }


    public Date getTaskEndTime() {
        return taskEndTime;
    }


    public void setTaskEndTime(Date taskEndTime) {
        this.taskEndTime = taskEndTime;
    }


    public Short getTaskRewardValue() {
        return taskRewardValue;
    }


    public void setTaskRewardValue(Short taskRewardValue) {
        this.taskRewardValue = taskRewardValue;
    }


    public Short getTaskQuantity() {
        return taskQuantity;
    }


    public void setTaskQuantity(Short taskQuantity) {
        this.taskQuantity = taskQuantity;
    }


    public Short getTaskQuantityUsed() {
        return taskQuantityUsed;
    }


    public void setTaskQuantityUsed(Short taskQuantityUsed) {
        this.taskQuantityUsed = taskQuantityUsed;
    }


    public Date getTaskCreateTime() {
        return taskCreateTime;
    }


    public void setTaskCreateTime(Date taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
    }

    public Date getTaskUpdateTime() {
        return taskUpdateTime;
    }


    public void setTaskUpdateTime(Date taskUpdateTime) {
        this.taskUpdateTime = taskUpdateTime;
    }

    public Short getTaskPhotoNumber() {
        return taskPhotoNumber;
    }

    public void setTaskPhotoNumber(Short taskPhotoNumber) {
        this.taskPhotoNumber = taskPhotoNumber;
    }

    public Short getTaskQuestionNumber() {
        return taskQuestionNumber;
    }

    public void setTaskQuestionNumber(Short taskQuestionNumber) {
        this.taskQuestionNumber = taskQuestionNumber;
    }

    public Short getTaskActionNumber() {
        return taskActionNumber;
    }

    public void setTaskActionNumber(Short taskActionNumber) {
        this.taskActionNumber = taskActionNumber;
    }

    public String getTaskSubject() {
        return taskSubject;
    }

    public void setTaskSubject(String taskSubject) {
        this.taskSubject = taskSubject == null ? null : taskSubject.trim();
    }

    public Short getTaskRewardPoint() {
        return taskRewardPoint;
    }

    public void setTaskRewardPoint(Short taskRewardPoint) {
        this.taskRewardPoint = taskRewardPoint;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail == null ? null : taskDetail.trim();
    }

    public Short getTaskFlag() {
        return taskFlag;
    }

    public void setTaskFlag(Short taskFlag) {
        this.taskFlag = taskFlag;
    }

    public Short getTaskGiftFlag() {
        return taskGiftFlag;
    }

    public void setTaskGiftFlag(Short taskGiftFlag) {
        this.taskGiftFlag = taskGiftFlag;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle == null ? null : taskTitle.trim();
    }

    public Short getTaskApprovalFlag() {
        return taskApprovalFlag;
    }

    public void setTaskApprovalFlag(Short taskApprovalFlag) {
        this.taskApprovalFlag = taskApprovalFlag;
    }

    public String getTaskApprovalQuestion() {
        return taskApprovalQuestion;
    }

    public void setTaskApprovalQuestion(String taskApprovalQuestion) {
        this.taskApprovalQuestion = taskApprovalQuestion == null ? null : taskApprovalQuestion.trim();
    }

    public Short getTaskMultipleAssignmentAllow() {
        return taskMultipleAssignmentAllow;
    }

    public void setTaskMultipleAssignmentAllow(Short taskMultipleAssignmentAllow) {
        this.taskMultipleAssignmentAllow = taskMultipleAssignmentAllow;
    }

    public Long getTaskDetailId() {
        return taskDetailId;
    }

    public void setTaskDetailId(Long taskDetailId) {
        this.taskDetailId = taskDetailId;
    }

    public String getTaskRefId() {
        return taskRefId;
    }

    public void setTaskRefId(String taskRefId) {
        this.taskRefId = taskRefId == null ? null : taskRefId.trim();
    }

    public Integer getTaskCategoryId() {
        return taskCategoryId;
    }

    public void setTaskCategoryId(Integer taskCategoryId) {
        this.taskCategoryId = taskCategoryId;
    }

    public Short getTaskSubmitDuration() {
        return taskSubmitDuration;
    }

    public void setTaskSubmitDuration(Short taskSubmitDuration) {
        this.taskSubmitDuration = taskSubmitDuration;
    }


    public Short getTaskProvinceId() {
        return taskProvinceId;
    }


    public void setTaskProvinceId(Short taskProvinceId) {
        this.taskProvinceId = taskProvinceId;
    }


    public Short getTaskDifficultyLevel() {
        return taskDifficultyLevel;
    }

    public void setTaskDifficultyLevel(Short taskDifficultyLevel) {
        this.taskDifficultyLevel = taskDifficultyLevel;
    }


    public Short getTaskRewardType() {
        return taskRewardType;
    }


    public void setTaskRewardType(Short taskRewardType) {
        this.taskRewardType = taskRewardType;
    }


    public Short getTaskResponseKeyStep() {
        return taskResponseKeyStep;
    }


    public void setTaskResponseKeyStep(Short taskResponseKeyStep) {
        this.taskResponseKeyStep = taskResponseKeyStep;
    }


    public BigDecimal getTaskPrereqTaskId() {
        return taskPrereqTaskId;
    }


    public void setTaskPrereqTaskId(BigDecimal taskPrereqTaskId) {
        this.taskPrereqTaskId = taskPrereqTaskId;
    }

    public BigDecimal getTaskPostTaskId() {
        return taskPostTaskId;
    }


    public void setTaskPostTaskId(BigDecimal taskPostTaskId) {
        this.taskPostTaskId = taskPostTaskId;
    }


    public Short getTaskRewardPayableFlag() {
        return taskRewardPayableFlag;
    }


    public void setTaskRewardPayableFlag(Short taskRewardPayableFlag) {
        this.taskRewardPayableFlag = taskRewardPayableFlag;
    }


    public Short getTaskRuleFlag() {
        return taskRuleFlag;
    }


    public void setTaskRuleFlag(Short taskRuleFlag) {
        this.taskRuleFlag = taskRuleFlag;
    }


    public Short getTaskRewardUnitValue() {
        return taskRewardUnitValue;
    }


    public void setTaskRewardUnitValue(Short taskRewardUnitValue) {
        this.taskRewardUnitValue = taskRewardUnitValue;
    }


    public Short getTaskMaxMultipleAssignAllow() {
        return taskMaxMultipleAssignAllow;
    }


    public void setTaskMaxMultipleAssignAllow(Short taskMaxMultipleAssignAllow) {
        this.taskMaxMultipleAssignAllow = taskMaxMultipleAssignAllow;
    }


    public Short getTaskReviewDuration() {
        return taskReviewDuration;
    }


    public void setTaskReviewDuration(Short taskReviewDuration) {
        this.taskReviewDuration = taskReviewDuration;
    }


    public Short getTaskReviewFlag() {
        return taskReviewFlag;
    }


    public void setTaskReviewFlag(Short taskReviewFlag) {
        this.taskReviewFlag = taskReviewFlag;
    }


    public Short getTaskSupportDeviceType() {
        return taskSupportDeviceType;
    }


    public void setTaskSupportDeviceType(Short taskSupportDeviceType) {
        this.taskSupportDeviceType = taskSupportDeviceType;
    }


    public String getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.TASK_DEFINITION
     *
     * @param taskDefinition the value for LABAC_TASKS.TASK_DEFINITION
     * @mbggenerated
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition == null ? null : taskDefinition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LABAC_TASKS.TASK_AUTO_APPROVE_FLAG
     *
     * @return the value of LABAC_TASKS.TASK_AUTO_APPROVE_FLAG
     * @mbggenerated
     */
    public Short getTaskAutoApproveFlag() {
        return taskAutoApproveFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.TASK_AUTO_APPROVE_FLAG
     *
     * @param taskAutoApproveFlag the value for LABAC_TASKS.TASK_AUTO_APPROVE_FLAG
     * @mbggenerated
     */
    public void setTaskAutoApproveFlag(Short taskAutoApproveFlag) {
        this.taskAutoApproveFlag = taskAutoApproveFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LABAC_TASKS.TASK_MULTIPLE_SUBMISSION_ALLOW
     *
     * @return the value of LABAC_TASKS.TASK_MULTIPLE_SUBMISSION_ALLOW
     * @mbggenerated
     */
    public Short getTaskMultipleSubmissionAllow() {
        return taskMultipleSubmissionAllow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.TASK_MULTIPLE_SUBMISSION_ALLOW
     *
     * @param taskMultipleSubmissionAllow the value for LABAC_TASKS.TASK_MULTIPLE_SUBMISSION_ALLOW
     * @mbggenerated
     */
    public void setTaskMultipleSubmissionAllow(Short taskMultipleSubmissionAllow) {
        this.taskMultipleSubmissionAllow = taskMultipleSubmissionAllow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LABAC_TASKS.TASK_REFER_DETAIL
     *
     * @return the value of LABAC_TASKS.TASK_REFER_DETAIL
     * @mbggenerated
     */
    public String getTaskReferDetail() {
        return taskReferDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.TASK_REFER_DETAIL
     *
     * @param taskReferDetail the value for LABAC_TASKS.TASK_REFER_DETAIL
     * @mbggenerated
     */
    public void setTaskReferDetail(String taskReferDetail) {
        this.taskReferDetail = taskReferDetail == null ? null : taskReferDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LABAC_TASKS.TASK_EXCEPTION_DETAIL_ID
     *
     * @return the value of LABAC_TASKS.TASK_EXCEPTION_DETAIL_ID
     * @mbggenerated
     */
    public BigDecimal getTaskExceptionDetailId() {
        return taskExceptionDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.TASK_EXCEPTION_DETAIL_ID
     *
     * @param taskExceptionDetailId the value for LABAC_TASKS.TASK_EXCEPTION_DETAIL_ID
     * @mbggenerated
     */
    public void setTaskExceptionDetailId(BigDecimal taskExceptionDetailId) {
        this.taskExceptionDetailId = taskExceptionDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LABAC_TASKS.TASK_EXCEPTION_MESSAGE
     *
     * @return the value of LABAC_TASKS.TASK_EXCEPTION_MESSAGE
     * @mbggenerated
     */
    public String getTaskExceptionMessage() {
        return taskExceptionMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.TASK_EXCEPTION_MESSAGE
     *
     * @param taskExceptionMessage the value for LABAC_TASKS.TASK_EXCEPTION_MESSAGE
     * @mbggenerated
     */
    public void setTaskExceptionMessage(String taskExceptionMessage) {
        this.taskExceptionMessage = taskExceptionMessage == null ? null : taskExceptionMessage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LABAC_TASKS.SALE_ID
     *
     * @return the value of LABAC_TASKS.SALE_ID
     * @mbggenerated
     */
    public Short getSaleId() {
        return saleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.SALE_ID
     *
     * @param saleId the value for LABAC_TASKS.SALE_ID
     * @mbggenerated
     */
    public void setSaleId(Short saleId) {
        this.saleId = saleId;
    }

    public Short getTaskPreviewFlag() {
        return taskPreviewFlag;
    }

    public void setTaskPreviewFlag(Short taskPreviewFlag) {
        this.taskPreviewFlag = taskPreviewFlag;
    }
    public String getTaskLocName() {
        return taskLocName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.TASK_LOC_NAME
     *
     * @param taskLocName the value for LABAC_TASKS.TASK_LOC_NAME
     * @mbggenerated
     */
    public void setTaskLocName(String taskLocName) {
        this.taskLocName = taskLocName == null ? null : taskLocName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LABAC_TASKS.TASK_LOC_ADDRESS
     *
     * @return the value of LABAC_TASKS.TASK_LOC_ADDRESS
     * @mbggenerated
     */
    public String getTaskLocAddress() {
        return taskLocAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.TASK_LOC_ADDRESS
     *
     * @param taskLocAddress the value for LABAC_TASKS.TASK_LOC_ADDRESS
     * @mbggenerated
     */
    public void setTaskLocAddress(String taskLocAddress) {
        this.taskLocAddress = taskLocAddress == null ? null : taskLocAddress.trim();
    }


    public String getTaskLocSource() {
        return taskLocSource;
    }

    public void setTaskLocSource(String taskLocSource) {
        this.taskLocSource = taskLocSource == null ? null : taskLocSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LABAC_TASKS.TASK_LOC_PHONE
     *
     * @return the value of LABAC_TASKS.TASK_LOC_PHONE
     * @mbggenerated
     */
    public String getTaskLocPhone() {
        return taskLocPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.TASK_LOC_PHONE
     *
     * @param taskLocPhone the value for LABAC_TASKS.TASK_LOC_PHONE
     * @mbggenerated
     */
    public void setTaskLocPhone(String taskLocPhone) {
        this.taskLocPhone = taskLocPhone == null ? null : taskLocPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LABAC_TASKS.TASK_LOC_REF_ID
     *
     * @return the value of LABAC_TASKS.TASK_LOC_REF_ID
     * @mbggenerated
     */
    public String getTaskLocRefId() {
        return taskLocRefId;
    }


    public void setTaskLocRefId(String taskLocRefId) {
        this.taskLocRefId = taskLocRefId == null ? null : taskLocRefId.trim();
    }


    public String getTaskDatasource() {
        return taskDatasource;
    }

    public void setTaskDatasource(String taskDatasource) {
        this.taskDatasource = taskDatasource == null ? null : taskDatasource.trim();
    }

    public Short getTaskDisplayFlag() {
        return taskDisplayFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.TASK_DISPLAY_FLAG
     *
     * @param taskDisplayFlag the value for LABAC_TASKS.TASK_DISPLAY_FLAG
     * @mbggenerated
     */
    public void setTaskDisplayFlag(Short taskDisplayFlag) {
        this.taskDisplayFlag = taskDisplayFlag;
    }


    public Short getTaskReferrableFlag() {
        return taskReferrableFlag;
    }


    public void setTaskReferrableFlag(Short taskReferrableFlag) {
        this.taskReferrableFlag = taskReferrableFlag;
    }


    public Short getTaskReferrableRewardValue() {
        return taskReferrableRewardValue;
    }

    public void setTaskReferrableRewardValue(Short taskReferrableRewardValue) {
        this.taskReferrableRewardValue = taskReferrableRewardValue;
    }


    public Short getTaskReferrableRewardPoint() {
        return taskReferrableRewardPoint;
    }


    public void setTaskReferrableRewardPoint(Short taskReferrableRewardPoint) {
        this.taskReferrableRewardPoint = taskReferrableRewardPoint;
    }


    public String getTaskReferrableMessage() {
        return taskReferrableMessage;
    }

    public void setTaskReferrableMessage(String taskReferrableMessage) {
        this.taskReferrableMessage = taskReferrableMessage == null ? null : taskReferrableMessage.trim();
    }

    public BigDecimal getTaskOrder() {
        return taskOrder;
    }

    public void setTaskOrder(BigDecimal taskOrder) {
        this.taskOrder = taskOrder;
    }


    public Short getTaskRecommendeeRewardValue() {
        return taskRecommendeeRewardValue;
    }


    public void setTaskRecommendeeRewardValue(Short taskRecommendeeRewardValue) {
        this.taskRecommendeeRewardValue = taskRecommendeeRewardValue;
    }


    public Short getTaskType() {
        return taskType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.TASK_TYPE
     *
     * @param taskType the value for LABAC_TASKS.TASK_TYPE
     * @mbggenerated
     */
    public void setTaskType(Short taskType) {
        this.taskType = taskType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LABAC_TASKS.TASK_ENGINE
     *
     * @return the value of LABAC_TASKS.TASK_ENGINE
     * @mbggenerated
     */
    public String getTaskEngine() {
        return taskEngine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LABAC_TASKS.TASK_ENGINE
     *
     * @param taskEngine the value for LABAC_TASKS.TASK_ENGINE
     * @mbggenerated
     */
    public void setTaskEngine(String taskEngine) {
        this.taskEngine = taskEngine == null ? null : taskEngine.trim();
    }


    public Object getTaskSdoGtype() {
        return taskSdoGtype;
    }

    public void setTaskSdoGtype(Object taskSdoGtype) {
        this.taskSdoGtype = taskSdoGtype;
    }

    public Object getTaskSdosrid() {
        return taskSdosrid;
    }

    public void setTaskSdosrid(Object taskSdosrid) {
        this.taskSdosrid = taskSdosrid;
    }

    public BigDecimal getTaskSdoPointX() {
        return taskSdoPointX;
    }

    public void setTaskSdoPointX(BigDecimal taskSdoPointX) {
        this.taskSdoPointX = taskSdoPointX;
    }

    public BigDecimal getTaskSdoPointY() {
        return taskSdoPointY;
    }

    public void setTaskSdoPointY(BigDecimal taskSdoPointY) {
        this.taskSdoPointY = taskSdoPointY;
    }

    public BigDecimal getTaskSdoPointZ() {
        return taskSdoPointZ;
    }

    public void setTaskSdoPointZ(BigDecimal taskSdoPointZ) {
        this.taskSdoPointZ = taskSdoPointZ;
    }

    public Object getTaskSdoOrdinates() {
        return taskSdoOrdinates;
    }

    public void setTaskSdoOrdinates(Object taskSdoOrdinates) {
        this.taskSdoOrdinates = taskSdoOrdinates;
    }

    public Object getTaskSdoElemInfo() {
        return taskSdoElemInfo;
    }

    public void setTaskSdoElemInfo(Object taskSdoElemInfo) {
        this.taskSdoElemInfo = taskSdoElemInfo;
    }
}