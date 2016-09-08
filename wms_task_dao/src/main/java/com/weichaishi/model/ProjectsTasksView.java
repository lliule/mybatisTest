package com.weichaishi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
@Table(name="wcs_s.getProjectAndtasks")
public class ProjectsTasksView {

    private Integer projectId;

    private String projectName;

    private String projectDesc;

    private Date projectCreateTime;

    private Date projectUpdateTime;

    private String projectComments;

    private BigDecimal projectOwnerCustomerId;

    private Long projectQuantity;

    private BigDecimal projectValue;

    private Short projectType;

    private Short projectLocationFlag;

    private Short projectDisplaySize;

    private BigDecimal projectOrder;

    private String projectCategories;

    private Short projectFlag;

    private String projectIcon;

    private Short projectStatusIndicator;

    private BigDecimal projectQuantityTried;

    @Column(name = "project_3rd_party_review_flag")
    private Short project3rdPartyReviewFlag;

    private String projectReviewInstruction;

    private Object projectRejectReasons;

    private Object projectReworkReasons;

    private Object projectPreapproveReasons;

    private Short projectDifficultyLevel;

    private String projectCategories2;

    private Date projectPlanEndDate;

    private Date projectActualEndDate;

    private Short saleId;

    private String projectSubject;

    private String projectDetail;

    private BigDecimal projectMaxValue;

    private String projectIcon2;

    private Short projectCategoryFlag;

    private Short projectLocationsFlag;

    private Short projectGroupId;

    private BigDecimal taskId;

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

    private BigDecimal taskPrereqTaskId;

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

    private Short taskPreviewFlag;

    private String taskLocName;

    private String taskLocAddress;

    @JsonIgnore
    private Object taskLocGeo;

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

    private String taskLocSource;

    private String taskLocPhone;

    private String taskLocRefId;

    private String taskDatasource;

    private Short taskDisplayFlag;

    private Short taskReferrableFlag;

    private Short taskReferrableRewardValue;

    private Short taskReferrableRewardPoint;

    private String taskReferrableMessage;

    private Short taskOrder;

    private Short taskRecommendeeRewardValue;

    private Short taskType;

    private String taskEngine;

    private Short rowId;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc == null ? null : projectDesc.trim();
    }

    public Date getProjectCreateTime() {
        return projectCreateTime;
    }

    public void setProjectCreateTime(Date projectCreateTime) {
        this.projectCreateTime = projectCreateTime;
    }

    public Date getProjectUpdateTime() {
        return projectUpdateTime;
    }

    public void setProjectUpdateTime(Date projectUpdateTime) {
        this.projectUpdateTime = projectUpdateTime;
    }

    public String getProjectComments() {
        return projectComments;
    }

    public void setProjectComments(String projectComments) {
        this.projectComments = projectComments == null ? null : projectComments.trim();
    }

    public BigDecimal getProjectOwnerCustomerId() {
        return projectOwnerCustomerId;
    }

    public void setProjectOwnerCustomerId(BigDecimal projectOwnerCustomerId) {
        this.projectOwnerCustomerId = projectOwnerCustomerId;
    }

    public Long getProjectQuantity() {
        return projectQuantity;
    }

    public void setProjectQuantity(Long projectQuantity) {
        this.projectQuantity = projectQuantity;
    }

    public BigDecimal getProjectValue() {
        return projectValue;
    }

    public void setProjectValue(BigDecimal projectValue) {
        this.projectValue = projectValue;
    }

    public Short getProjectType() {
        return projectType;
    }

    public void setProjectType(Short projectType) {
        this.projectType = projectType;
    }

    public Short getProjectLocationFlag() {
        return projectLocationFlag;
    }

    public void setProjectLocationFlag(Short projectLocationFlag) {
        this.projectLocationFlag = projectLocationFlag;
    }

    public Short getProjectDisplaySize() {
        return projectDisplaySize;
    }

    public void setProjectDisplaySize(Short projectDisplaySize) {
        this.projectDisplaySize = projectDisplaySize;
    }

    public BigDecimal getProjectOrder() {
        return projectOrder;
    }

    public void setProjectOrder(BigDecimal projectOrder) {
        this.projectOrder = projectOrder;
    }

    public String getProjectCategories() {
        return projectCategories;
    }

    public void setProjectCategories(String projectCategories) {
        this.projectCategories = projectCategories == null ? null : projectCategories.trim();
    }

    public Short getProjectFlag() {
        return projectFlag;
    }

    public void setProjectFlag(Short projectFlag) {
        this.projectFlag = projectFlag;
    }

    public String getProjectIcon() {
        return projectIcon;
    }

    public void setProjectIcon(String projectIcon) {
        this.projectIcon = projectIcon == null ? null : projectIcon.trim();
    }

    public Short getProjectStatusIndicator() {
        return projectStatusIndicator;
    }

    public void setProjectStatusIndicator(Short projectStatusIndicator) {
        this.projectStatusIndicator = projectStatusIndicator;
    }

    public BigDecimal getProjectQuantityTried() {
        return projectQuantityTried;
    }

    public void setProjectQuantityTried(BigDecimal projectQuantityTried) {
        this.projectQuantityTried = projectQuantityTried;
    }

    public Short getProject3rdPartyReviewFlag() {
        return project3rdPartyReviewFlag;
    }

    public void setProject3rdPartyReviewFlag(Short project3rdPartyReviewFlag) {
        this.project3rdPartyReviewFlag = project3rdPartyReviewFlag;
    }

    public String getProjectReviewInstruction() {
        return projectReviewInstruction;
    }

    public void setProjectReviewInstruction(String projectReviewInstruction) {
        this.projectReviewInstruction = projectReviewInstruction == null ? null : projectReviewInstruction.trim();
    }

    public Object getProjectRejectReasons() {
        return projectRejectReasons;
    }

    public void setProjectRejectReasons(Object projectRejectReasons) {
        this.projectRejectReasons = projectRejectReasons;
    }

    public Object getProjectReworkReasons() {
        return projectReworkReasons;
    }

    public void setProjectReworkReasons(Object projectReworkReasons) {
        this.projectReworkReasons = projectReworkReasons;
    }

    public Object getProjectPreapproveReasons() {
        return projectPreapproveReasons;
    }

    public void setProjectPreapproveReasons(Object projectPreapproveReasons) {
        this.projectPreapproveReasons = projectPreapproveReasons;
    }

    public Short getProjectDifficultyLevel() {
        return projectDifficultyLevel;
    }

    public void setProjectDifficultyLevel(Short projectDifficultyLevel) {
        this.projectDifficultyLevel = projectDifficultyLevel;
    }

    public String getProjectCategories2() {
        return projectCategories2;
    }

    public void setProjectCategories2(String projectCategories2) {
        this.projectCategories2 = projectCategories2 == null ? null : projectCategories2.trim();
    }

    public Date getProjectPlanEndDate() {
        return projectPlanEndDate;
    }

    public void setProjectPlanEndDate(Date projectPlanEndDate) {
        this.projectPlanEndDate = projectPlanEndDate;
    }

    public Date getProjectActualEndDate() {
        return projectActualEndDate;
    }

    public void setProjectActualEndDate(Date projectActualEndDate) {
        this.projectActualEndDate = projectActualEndDate;
    }

    public Short getSaleId() {
        return saleId;
    }

    public void setSaleId(Short saleId) {
        this.saleId = saleId;
    }

    public String getProjectSubject() {
        return projectSubject;
    }

    public void setProjectSubject(String projectSubject) {
        this.projectSubject = projectSubject == null ? null : projectSubject.trim();
    }

    public String getProjectDetail() {
        return projectDetail;
    }

    public void setProjectDetail(String projectDetail) {
        this.projectDetail = projectDetail == null ? null : projectDetail.trim();
    }

    public BigDecimal getProjectMaxValue() {
        return projectMaxValue;
    }

    public void setProjectMaxValue(BigDecimal projectMaxValue) {
        this.projectMaxValue = projectMaxValue;
    }

    public String getProjectIcon2() {
        return projectIcon2;
    }

    public void setProjectIcon2(String projectIcon2) {
        this.projectIcon2 = projectIcon2 == null ? null : projectIcon2.trim();
    }

    public Short getProjectCategoryFlag() {
        return projectCategoryFlag;
    }

    public void setProjectCategoryFlag(Short projectCategoryFlag) {
        this.projectCategoryFlag = projectCategoryFlag;
    }

    public Short getProjectLocationsFlag() {
        return projectLocationsFlag;
    }

    public void setProjectLocationsFlag(Short projectLocationsFlag) {
        this.projectLocationsFlag = projectLocationsFlag;
    }

    public Short getProjectGroupId() {
        return projectGroupId;
    }

    public void setProjectGroupId(Short projectGroupId) {
        this.projectGroupId = projectGroupId;
    }

    public BigDecimal getTaskId() {
        return taskId;
    }

    public void setTaskId(BigDecimal taskId) {
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

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition == null ? null : taskDefinition.trim();
    }

    public Short getTaskAutoApproveFlag() {
        return taskAutoApproveFlag;
    }

    public void setTaskAutoApproveFlag(Short taskAutoApproveFlag) {
        this.taskAutoApproveFlag = taskAutoApproveFlag;
    }

    public Short getTaskMultipleSubmissionAllow() {
        return taskMultipleSubmissionAllow;
    }

    public void setTaskMultipleSubmissionAllow(Short taskMultipleSubmissionAllow) {
        this.taskMultipleSubmissionAllow = taskMultipleSubmissionAllow;
    }

    public String getTaskReferDetail() {
        return taskReferDetail;
    }

    public void setTaskReferDetail(String taskReferDetail) {
        this.taskReferDetail = taskReferDetail == null ? null : taskReferDetail.trim();
    }

    public BigDecimal getTaskExceptionDetailId() {
        return taskExceptionDetailId;
    }

    public void setTaskExceptionDetailId(BigDecimal taskExceptionDetailId) {
        this.taskExceptionDetailId = taskExceptionDetailId;
    }

    public String getTaskExceptionMessage() {
        return taskExceptionMessage;
    }

    public void setTaskExceptionMessage(String taskExceptionMessage) {
        this.taskExceptionMessage = taskExceptionMessage == null ? null : taskExceptionMessage.trim();
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

    public void setTaskLocName(String taskLocName) {
        this.taskLocName = taskLocName == null ? null : taskLocName.trim();
    }

    public String getTaskLocAddress() {
        return taskLocAddress;
    }

    public void setTaskLocAddress(String taskLocAddress) {
        this.taskLocAddress = taskLocAddress == null ? null : taskLocAddress.trim();
    }

    public Object getTaskLocGeo() {
        return taskLocGeo;
    }

    public void setTaskLocGeo(Object taskLocGeo) {
        this.taskLocGeo = taskLocGeo;
    }

    public String getTaskLocSource() {
        return taskLocSource;
    }

    public void setTaskLocSource(String taskLocSource) {
        this.taskLocSource = taskLocSource == null ? null : taskLocSource.trim();
    }

    public String getTaskLocPhone() {
        return taskLocPhone;
    }

    public void setTaskLocPhone(String taskLocPhone) {
        this.taskLocPhone = taskLocPhone == null ? null : taskLocPhone.trim();
    }

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

    public Short getTaskOrder() {
        return taskOrder;
    }

    public void setTaskOrder(Short taskOrder) {
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

    public void setTaskType(Short taskType) {
        this.taskType = taskType;
    }

    public String getTaskEngine() {
        return taskEngine;
    }

    public void setTaskEngine(String taskEngine) {
        this.taskEngine = taskEngine == null ? null : taskEngine.trim();
    }

    public Short getRowId() {
        return rowId;
    }

    public void setRowId(Short rowId) {
        this.rowId = rowId;
    }
}