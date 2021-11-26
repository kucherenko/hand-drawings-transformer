package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.model.BwRequirement;
import org.openapitools.model.EventReportingRequirement;
import org.openapitools.model.Exception;
import org.openapitools.model.ExpectedAnalyticsType;
import org.openapitools.model.ExpectedUeBehaviourData;
import org.openapitools.model.MatchingDirection;
import org.openapitools.model.NFType;
import org.openapitools.model.NetworkAreaInfo;
import org.openapitools.model.NetworkPerfRequirement;
import org.openapitools.model.NotificationMethod;
import org.openapitools.model.NsiIdInfo;
import org.openapitools.model.NwdafEvent;
import org.openapitools.model.QosRequirement;
import org.openapitools.model.RetainabilityThreshold;
import org.openapitools.model.Snssai;
import org.openapitools.model.TargetUeInformation;
import org.openapitools.model.ThresholdLevel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents a subscription to a single event.
 */
@ApiModel(description = "Represents a subscription to a single event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class EventSubscription   {
  @JsonProperty("anySlice")
  private Boolean anySlice;

  @JsonProperty("appIds")
  @Valid
  private List<String> appIds = null;

  @JsonProperty("dnns")
  @Valid
  private List<String> dnns = null;

  @JsonProperty("dnais")
  @Valid
  private List<String> dnais = null;

  @JsonProperty("event")
  private NwdafEvent event;

  @JsonProperty("extraReportReq")
  private EventReportingRequirement extraReportReq;

  @JsonProperty("loadLevelThreshold")
  private Integer loadLevelThreshold;

  @JsonProperty("notificationMethod")
  private NotificationMethod notificationMethod;

  @JsonProperty("matchingDir")
  private MatchingDirection matchingDir;

  @JsonProperty("nfLoadLvlThds")
  @Valid
  private List<ThresholdLevel> nfLoadLvlThds = null;

  @JsonProperty("nfInstanceIds")
  @Valid
  private List<UUID> nfInstanceIds = null;

  @JsonProperty("nfSetIds")
  @Valid
  private List<String> nfSetIds = null;

  @JsonProperty("nfTypes")
  @Valid
  private List<NFType> nfTypes = null;

  @JsonProperty("networkArea")
  private NetworkAreaInfo networkArea;

  @JsonProperty("topAppListUlInd")
  private Boolean topAppListUlInd;

  @JsonProperty("topAppListDlInd")
  private Boolean topAppListDlInd;

  @JsonProperty("nsiIdInfos")
  @Valid
  private List<NsiIdInfo> nsiIdInfos = null;

  @JsonProperty("nsiLevelThrds")
  @Valid
  private List<Integer> nsiLevelThrds = null;

  @JsonProperty("qosRequ")
  private QosRequirement qosRequ;

  @JsonProperty("qosFlowRetThds")
  @Valid
  private List<RetainabilityThreshold> qosFlowRetThds = null;

  @JsonProperty("ranUeThrouThds")
  @Valid
  private List<String> ranUeThrouThds = null;

  @JsonProperty("repetitionPeriod")
  private Integer repetitionPeriod;

  @JsonProperty("snssaia")
  @Valid
  private List<Snssai> snssaia = null;

  @JsonProperty("tgtUe")
  private TargetUeInformation tgtUe;

  @JsonProperty("congThresholds")
  @Valid
  private List<ThresholdLevel> congThresholds = null;

  @JsonProperty("nwPerfRequs")
  @Valid
  private List<NetworkPerfRequirement> nwPerfRequs = null;

  @JsonProperty("bwRequs")
  @Valid
  private List<BwRequirement> bwRequs = null;

  @JsonProperty("excepRequs")
  @Valid
  private List<Exception> excepRequs = null;

  @JsonProperty("exptAnaType")
  private ExpectedAnalyticsType exptAnaType;

  @JsonProperty("exptUeBehav")
  private ExpectedUeBehaviourData exptUeBehav;

  public EventSubscription anySlice(Boolean anySlice) {
    this.anySlice = anySlice;
    return this;
  }

  /**
   * FALSE represents not applicable for all slices. TRUE represents applicable for all slices.
   * @return anySlice
  */
  @ApiModelProperty(value = "FALSE represents not applicable for all slices. TRUE represents applicable for all slices.")


  public Boolean getAnySlice() {
    return anySlice;
  }

  public void setAnySlice(Boolean anySlice) {
    this.anySlice = anySlice;
  }

  public EventSubscription appIds(List<String> appIds) {
    this.appIds = appIds;
    return this;
  }

  public EventSubscription addAppIdsItem(String appIdsItem) {
    if (this.appIds == null) {
      this.appIds = new ArrayList<>();
    }
    this.appIds.add(appIdsItem);
    return this;
  }

  /**
   * Identification(s) of application to which the subscription applies.
   * @return appIds
  */
  @ApiModelProperty(value = "Identification(s) of application to which the subscription applies.")

@Size(min = 1) 
  public List<String> getAppIds() {
    return appIds;
  }

  public void setAppIds(List<String> appIds) {
    this.appIds = appIds;
  }

  public EventSubscription dnns(List<String> dnns) {
    this.dnns = dnns;
    return this;
  }

  public EventSubscription addDnnsItem(String dnnsItem) {
    if (this.dnns == null) {
      this.dnns = new ArrayList<>();
    }
    this.dnns.add(dnnsItem);
    return this;
  }

  /**
   * Identification(s) of DNN to which the subscription applies.
   * @return dnns
  */
  @ApiModelProperty(value = "Identification(s) of DNN to which the subscription applies.")

@Size(min = 1) 
  public List<String> getDnns() {
    return dnns;
  }

  public void setDnns(List<String> dnns) {
    this.dnns = dnns;
  }

  public EventSubscription dnais(List<String> dnais) {
    this.dnais = dnais;
    return this;
  }

  public EventSubscription addDnaisItem(String dnaisItem) {
    if (this.dnais == null) {
      this.dnais = new ArrayList<>();
    }
    this.dnais.add(dnaisItem);
    return this;
  }

  /**
   * Get dnais
   * @return dnais
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getDnais() {
    return dnais;
  }

  public void setDnais(List<String> dnais) {
    this.dnais = dnais;
  }

  public EventSubscription event(NwdafEvent event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public NwdafEvent getEvent() {
    return event;
  }

  public void setEvent(NwdafEvent event) {
    this.event = event;
  }

  public EventSubscription extraReportReq(EventReportingRequirement extraReportReq) {
    this.extraReportReq = extraReportReq;
    return this;
  }

  /**
   * Get extraReportReq
   * @return extraReportReq
  */
  @ApiModelProperty(value = "")

  @Valid

  public EventReportingRequirement getExtraReportReq() {
    return extraReportReq;
  }

  public void setExtraReportReq(EventReportingRequirement extraReportReq) {
    this.extraReportReq = extraReportReq;
  }

  public EventSubscription loadLevelThreshold(Integer loadLevelThreshold) {
    this.loadLevelThreshold = loadLevelThreshold;
    return this;
  }

  /**
   * Indicates that the NWDAF shall report the corresponding network slice load level to the NF service consumer where the load level of the network slice identified by snssais is reached.
   * @return loadLevelThreshold
  */
  @ApiModelProperty(value = "Indicates that the NWDAF shall report the corresponding network slice load level to the NF service consumer where the load level of the network slice identified by snssais is reached.")


  public Integer getLoadLevelThreshold() {
    return loadLevelThreshold;
  }

  public void setLoadLevelThreshold(Integer loadLevelThreshold) {
    this.loadLevelThreshold = loadLevelThreshold;
  }

  public EventSubscription notificationMethod(NotificationMethod notificationMethod) {
    this.notificationMethod = notificationMethod;
    return this;
  }

  /**
   * Get notificationMethod
   * @return notificationMethod
  */
  @ApiModelProperty(value = "")

  @Valid

  public NotificationMethod getNotificationMethod() {
    return notificationMethod;
  }

  public void setNotificationMethod(NotificationMethod notificationMethod) {
    this.notificationMethod = notificationMethod;
  }

  public EventSubscription matchingDir(MatchingDirection matchingDir) {
    this.matchingDir = matchingDir;
    return this;
  }

  /**
   * Get matchingDir
   * @return matchingDir
  */
  @ApiModelProperty(value = "")

  @Valid

  public MatchingDirection getMatchingDir() {
    return matchingDir;
  }

  public void setMatchingDir(MatchingDirection matchingDir) {
    this.matchingDir = matchingDir;
  }

  public EventSubscription nfLoadLvlThds(List<ThresholdLevel> nfLoadLvlThds) {
    this.nfLoadLvlThds = nfLoadLvlThds;
    return this;
  }

  public EventSubscription addNfLoadLvlThdsItem(ThresholdLevel nfLoadLvlThdsItem) {
    if (this.nfLoadLvlThds == null) {
      this.nfLoadLvlThds = new ArrayList<>();
    }
    this.nfLoadLvlThds.add(nfLoadLvlThdsItem);
    return this;
  }

  /**
   * Shall be supplied in order to start reporting when an average load level is reached.
   * @return nfLoadLvlThds
  */
  @ApiModelProperty(value = "Shall be supplied in order to start reporting when an average load level is reached.")

  @Valid
@Size(min = 1) 
  public List<ThresholdLevel> getNfLoadLvlThds() {
    return nfLoadLvlThds;
  }

  public void setNfLoadLvlThds(List<ThresholdLevel> nfLoadLvlThds) {
    this.nfLoadLvlThds = nfLoadLvlThds;
  }

  public EventSubscription nfInstanceIds(List<UUID> nfInstanceIds) {
    this.nfInstanceIds = nfInstanceIds;
    return this;
  }

  public EventSubscription addNfInstanceIdsItem(UUID nfInstanceIdsItem) {
    if (this.nfInstanceIds == null) {
      this.nfInstanceIds = new ArrayList<>();
    }
    this.nfInstanceIds.add(nfInstanceIdsItem);
    return this;
  }

  /**
   * Get nfInstanceIds
   * @return nfInstanceIds
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<UUID> getNfInstanceIds() {
    return nfInstanceIds;
  }

  public void setNfInstanceIds(List<UUID> nfInstanceIds) {
    this.nfInstanceIds = nfInstanceIds;
  }

  public EventSubscription nfSetIds(List<String> nfSetIds) {
    this.nfSetIds = nfSetIds;
    return this;
  }

  public EventSubscription addNfSetIdsItem(String nfSetIdsItem) {
    if (this.nfSetIds == null) {
      this.nfSetIds = new ArrayList<>();
    }
    this.nfSetIds.add(nfSetIdsItem);
    return this;
  }

  /**
   * Get nfSetIds
   * @return nfSetIds
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getNfSetIds() {
    return nfSetIds;
  }

  public void setNfSetIds(List<String> nfSetIds) {
    this.nfSetIds = nfSetIds;
  }

  public EventSubscription nfTypes(List<NFType> nfTypes) {
    this.nfTypes = nfTypes;
    return this;
  }

  public EventSubscription addNfTypesItem(NFType nfTypesItem) {
    if (this.nfTypes == null) {
      this.nfTypes = new ArrayList<>();
    }
    this.nfTypes.add(nfTypesItem);
    return this;
  }

  /**
   * Get nfTypes
   * @return nfTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<NFType> getNfTypes() {
    return nfTypes;
  }

  public void setNfTypes(List<NFType> nfTypes) {
    this.nfTypes = nfTypes;
  }

  public EventSubscription networkArea(NetworkAreaInfo networkArea) {
    this.networkArea = networkArea;
    return this;
  }

  /**
   * Get networkArea
   * @return networkArea
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetworkAreaInfo getNetworkArea() {
    return networkArea;
  }

  public void setNetworkArea(NetworkAreaInfo networkArea) {
    this.networkArea = networkArea;
  }

  public EventSubscription topAppListUlInd(Boolean topAppListUlInd) {
    this.topAppListUlInd = topAppListUlInd;
    return this;
  }

  /**
   * Indicates that the list of top applications that contribute the most to the traffic in Uplink direction is requested, if it is included and set to \"true\". Default value is \"false\".
   * @return topAppListUlInd
  */
  @ApiModelProperty(value = "Indicates that the list of top applications that contribute the most to the traffic in Uplink direction is requested, if it is included and set to \"true\". Default value is \"false\".")


  public Boolean getTopAppListUlInd() {
    return topAppListUlInd;
  }

  public void setTopAppListUlInd(Boolean topAppListUlInd) {
    this.topAppListUlInd = topAppListUlInd;
  }

  public EventSubscription topAppListDlInd(Boolean topAppListDlInd) {
    this.topAppListDlInd = topAppListDlInd;
    return this;
  }

  /**
   * Indicates that the list of top applications that contribute the most to the traffic in Downlink direction is requested, if it is included and set to \"true\". Default value is \"false\".
   * @return topAppListDlInd
  */
  @ApiModelProperty(value = "Indicates that the list of top applications that contribute the most to the traffic in Downlink direction is requested, if it is included and set to \"true\". Default value is \"false\".")


  public Boolean getTopAppListDlInd() {
    return topAppListDlInd;
  }

  public void setTopAppListDlInd(Boolean topAppListDlInd) {
    this.topAppListDlInd = topAppListDlInd;
  }

  public EventSubscription nsiIdInfos(List<NsiIdInfo> nsiIdInfos) {
    this.nsiIdInfos = nsiIdInfos;
    return this;
  }

  public EventSubscription addNsiIdInfosItem(NsiIdInfo nsiIdInfosItem) {
    if (this.nsiIdInfos == null) {
      this.nsiIdInfos = new ArrayList<>();
    }
    this.nsiIdInfos.add(nsiIdInfosItem);
    return this;
  }

  /**
   * Get nsiIdInfos
   * @return nsiIdInfos
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<NsiIdInfo> getNsiIdInfos() {
    return nsiIdInfos;
  }

  public void setNsiIdInfos(List<NsiIdInfo> nsiIdInfos) {
    this.nsiIdInfos = nsiIdInfos;
  }

  public EventSubscription nsiLevelThrds(List<Integer> nsiLevelThrds) {
    this.nsiLevelThrds = nsiLevelThrds;
    return this;
  }

  public EventSubscription addNsiLevelThrdsItem(Integer nsiLevelThrdsItem) {
    if (this.nsiLevelThrds == null) {
      this.nsiLevelThrds = new ArrayList<>();
    }
    this.nsiLevelThrds.add(nsiLevelThrdsItem);
    return this;
  }

  /**
   * Get nsiLevelThrds
   * @return nsiLevelThrds
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<Integer> getNsiLevelThrds() {
    return nsiLevelThrds;
  }

  public void setNsiLevelThrds(List<Integer> nsiLevelThrds) {
    this.nsiLevelThrds = nsiLevelThrds;
  }

  public EventSubscription qosRequ(QosRequirement qosRequ) {
    this.qosRequ = qosRequ;
    return this;
  }

  /**
   * Get qosRequ
   * @return qosRequ
  */
  @ApiModelProperty(value = "")

  @Valid

  public QosRequirement getQosRequ() {
    return qosRequ;
  }

  public void setQosRequ(QosRequirement qosRequ) {
    this.qosRequ = qosRequ;
  }

  public EventSubscription qosFlowRetThds(List<RetainabilityThreshold> qosFlowRetThds) {
    this.qosFlowRetThds = qosFlowRetThds;
    return this;
  }

  public EventSubscription addQosFlowRetThdsItem(RetainabilityThreshold qosFlowRetThdsItem) {
    if (this.qosFlowRetThds == null) {
      this.qosFlowRetThds = new ArrayList<>();
    }
    this.qosFlowRetThds.add(qosFlowRetThdsItem);
    return this;
  }

  /**
   * Get qosFlowRetThds
   * @return qosFlowRetThds
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<RetainabilityThreshold> getQosFlowRetThds() {
    return qosFlowRetThds;
  }

  public void setQosFlowRetThds(List<RetainabilityThreshold> qosFlowRetThds) {
    this.qosFlowRetThds = qosFlowRetThds;
  }

  public EventSubscription ranUeThrouThds(List<String> ranUeThrouThds) {
    this.ranUeThrouThds = ranUeThrouThds;
    return this;
  }

  public EventSubscription addRanUeThrouThdsItem(String ranUeThrouThdsItem) {
    if (this.ranUeThrouThds == null) {
      this.ranUeThrouThds = new ArrayList<>();
    }
    this.ranUeThrouThds.add(ranUeThrouThdsItem);
    return this;
  }

  /**
   * Get ranUeThrouThds
   * @return ranUeThrouThds
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getRanUeThrouThds() {
    return ranUeThrouThds;
  }

  public void setRanUeThrouThds(List<String> ranUeThrouThds) {
    this.ranUeThrouThds = ranUeThrouThds;
  }

  public EventSubscription repetitionPeriod(Integer repetitionPeriod) {
    this.repetitionPeriod = repetitionPeriod;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return repetitionPeriod
  */
  @ApiModelProperty(value = "indicating a time in seconds.")


  public Integer getRepetitionPeriod() {
    return repetitionPeriod;
  }

  public void setRepetitionPeriod(Integer repetitionPeriod) {
    this.repetitionPeriod = repetitionPeriod;
  }

  public EventSubscription snssaia(List<Snssai> snssaia) {
    this.snssaia = snssaia;
    return this;
  }

  public EventSubscription addSnssaiaItem(Snssai snssaiaItem) {
    if (this.snssaia == null) {
      this.snssaia = new ArrayList<>();
    }
    this.snssaia.add(snssaiaItem);
    return this;
  }

  /**
   * Identification(s) of network slice to which the subscription applies. It corresponds to snssais in the data model definition of 3GPP TS 29.520.
   * @return snssaia
  */
  @ApiModelProperty(value = "Identification(s) of network slice to which the subscription applies. It corresponds to snssais in the data model definition of 3GPP TS 29.520.")

  @Valid
@Size(min = 1) 
  public List<Snssai> getSnssaia() {
    return snssaia;
  }

  public void setSnssaia(List<Snssai> snssaia) {
    this.snssaia = snssaia;
  }

  public EventSubscription tgtUe(TargetUeInformation tgtUe) {
    this.tgtUe = tgtUe;
    return this;
  }

  /**
   * Get tgtUe
   * @return tgtUe
  */
  @ApiModelProperty(value = "")

  @Valid

  public TargetUeInformation getTgtUe() {
    return tgtUe;
  }

  public void setTgtUe(TargetUeInformation tgtUe) {
    this.tgtUe = tgtUe;
  }

  public EventSubscription congThresholds(List<ThresholdLevel> congThresholds) {
    this.congThresholds = congThresholds;
    return this;
  }

  public EventSubscription addCongThresholdsItem(ThresholdLevel congThresholdsItem) {
    if (this.congThresholds == null) {
      this.congThresholds = new ArrayList<>();
    }
    this.congThresholds.add(congThresholdsItem);
    return this;
  }

  /**
   * Get congThresholds
   * @return congThresholds
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<ThresholdLevel> getCongThresholds() {
    return congThresholds;
  }

  public void setCongThresholds(List<ThresholdLevel> congThresholds) {
    this.congThresholds = congThresholds;
  }

  public EventSubscription nwPerfRequs(List<NetworkPerfRequirement> nwPerfRequs) {
    this.nwPerfRequs = nwPerfRequs;
    return this;
  }

  public EventSubscription addNwPerfRequsItem(NetworkPerfRequirement nwPerfRequsItem) {
    if (this.nwPerfRequs == null) {
      this.nwPerfRequs = new ArrayList<>();
    }
    this.nwPerfRequs.add(nwPerfRequsItem);
    return this;
  }

  /**
   * Get nwPerfRequs
   * @return nwPerfRequs
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<NetworkPerfRequirement> getNwPerfRequs() {
    return nwPerfRequs;
  }

  public void setNwPerfRequs(List<NetworkPerfRequirement> nwPerfRequs) {
    this.nwPerfRequs = nwPerfRequs;
  }

  public EventSubscription bwRequs(List<BwRequirement> bwRequs) {
    this.bwRequs = bwRequs;
    return this;
  }

  public EventSubscription addBwRequsItem(BwRequirement bwRequsItem) {
    if (this.bwRequs == null) {
      this.bwRequs = new ArrayList<>();
    }
    this.bwRequs.add(bwRequsItem);
    return this;
  }

  /**
   * Get bwRequs
   * @return bwRequs
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<BwRequirement> getBwRequs() {
    return bwRequs;
  }

  public void setBwRequs(List<BwRequirement> bwRequs) {
    this.bwRequs = bwRequs;
  }

  public EventSubscription excepRequs(List<Exception> excepRequs) {
    this.excepRequs = excepRequs;
    return this;
  }

  public EventSubscription addExcepRequsItem(Exception excepRequsItem) {
    if (this.excepRequs == null) {
      this.excepRequs = new ArrayList<>();
    }
    this.excepRequs.add(excepRequsItem);
    return this;
  }

  /**
   * Get excepRequs
   * @return excepRequs
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Exception> getExcepRequs() {
    return excepRequs;
  }

  public void setExcepRequs(List<Exception> excepRequs) {
    this.excepRequs = excepRequs;
  }

  public EventSubscription exptAnaType(ExpectedAnalyticsType exptAnaType) {
    this.exptAnaType = exptAnaType;
    return this;
  }

  /**
   * Get exptAnaType
   * @return exptAnaType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExpectedAnalyticsType getExptAnaType() {
    return exptAnaType;
  }

  public void setExptAnaType(ExpectedAnalyticsType exptAnaType) {
    this.exptAnaType = exptAnaType;
  }

  public EventSubscription exptUeBehav(ExpectedUeBehaviourData exptUeBehav) {
    this.exptUeBehav = exptUeBehav;
    return this;
  }

  /**
   * Get exptUeBehav
   * @return exptUeBehav
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExpectedUeBehaviourData getExptUeBehav() {
    return exptUeBehav;
  }

  public void setExptUeBehav(ExpectedUeBehaviourData exptUeBehav) {
    this.exptUeBehav = exptUeBehav;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSubscription eventSubscription = (EventSubscription) o;
    return Objects.equals(this.anySlice, eventSubscription.anySlice) &&
        Objects.equals(this.appIds, eventSubscription.appIds) &&
        Objects.equals(this.dnns, eventSubscription.dnns) &&
        Objects.equals(this.dnais, eventSubscription.dnais) &&
        Objects.equals(this.event, eventSubscription.event) &&
        Objects.equals(this.extraReportReq, eventSubscription.extraReportReq) &&
        Objects.equals(this.loadLevelThreshold, eventSubscription.loadLevelThreshold) &&
        Objects.equals(this.notificationMethod, eventSubscription.notificationMethod) &&
        Objects.equals(this.matchingDir, eventSubscription.matchingDir) &&
        Objects.equals(this.nfLoadLvlThds, eventSubscription.nfLoadLvlThds) &&
        Objects.equals(this.nfInstanceIds, eventSubscription.nfInstanceIds) &&
        Objects.equals(this.nfSetIds, eventSubscription.nfSetIds) &&
        Objects.equals(this.nfTypes, eventSubscription.nfTypes) &&
        Objects.equals(this.networkArea, eventSubscription.networkArea) &&
        Objects.equals(this.topAppListUlInd, eventSubscription.topAppListUlInd) &&
        Objects.equals(this.topAppListDlInd, eventSubscription.topAppListDlInd) &&
        Objects.equals(this.nsiIdInfos, eventSubscription.nsiIdInfos) &&
        Objects.equals(this.nsiLevelThrds, eventSubscription.nsiLevelThrds) &&
        Objects.equals(this.qosRequ, eventSubscription.qosRequ) &&
        Objects.equals(this.qosFlowRetThds, eventSubscription.qosFlowRetThds) &&
        Objects.equals(this.ranUeThrouThds, eventSubscription.ranUeThrouThds) &&
        Objects.equals(this.repetitionPeriod, eventSubscription.repetitionPeriod) &&
        Objects.equals(this.snssaia, eventSubscription.snssaia) &&
        Objects.equals(this.tgtUe, eventSubscription.tgtUe) &&
        Objects.equals(this.congThresholds, eventSubscription.congThresholds) &&
        Objects.equals(this.nwPerfRequs, eventSubscription.nwPerfRequs) &&
        Objects.equals(this.bwRequs, eventSubscription.bwRequs) &&
        Objects.equals(this.excepRequs, eventSubscription.excepRequs) &&
        Objects.equals(this.exptAnaType, eventSubscription.exptAnaType) &&
        Objects.equals(this.exptUeBehav, eventSubscription.exptUeBehav);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anySlice, appIds, dnns, dnais, event, extraReportReq, loadLevelThreshold, notificationMethod, matchingDir, nfLoadLvlThds, nfInstanceIds, nfSetIds, nfTypes, networkArea, topAppListUlInd, topAppListDlInd, nsiIdInfos, nsiLevelThrds, qosRequ, qosFlowRetThds, ranUeThrouThds, repetitionPeriod, snssaia, tgtUe, congThresholds, nwPerfRequs, bwRequs, excepRequs, exptAnaType, exptUeBehav);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubscription {\n");
    
    sb.append("    anySlice: ").append(toIndentedString(anySlice)).append("\n");
    sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
    sb.append("    dnns: ").append(toIndentedString(dnns)).append("\n");
    sb.append("    dnais: ").append(toIndentedString(dnais)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    extraReportReq: ").append(toIndentedString(extraReportReq)).append("\n");
    sb.append("    loadLevelThreshold: ").append(toIndentedString(loadLevelThreshold)).append("\n");
    sb.append("    notificationMethod: ").append(toIndentedString(notificationMethod)).append("\n");
    sb.append("    matchingDir: ").append(toIndentedString(matchingDir)).append("\n");
    sb.append("    nfLoadLvlThds: ").append(toIndentedString(nfLoadLvlThds)).append("\n");
    sb.append("    nfInstanceIds: ").append(toIndentedString(nfInstanceIds)).append("\n");
    sb.append("    nfSetIds: ").append(toIndentedString(nfSetIds)).append("\n");
    sb.append("    nfTypes: ").append(toIndentedString(nfTypes)).append("\n");
    sb.append("    networkArea: ").append(toIndentedString(networkArea)).append("\n");
    sb.append("    topAppListUlInd: ").append(toIndentedString(topAppListUlInd)).append("\n");
    sb.append("    topAppListDlInd: ").append(toIndentedString(topAppListDlInd)).append("\n");
    sb.append("    nsiIdInfos: ").append(toIndentedString(nsiIdInfos)).append("\n");
    sb.append("    nsiLevelThrds: ").append(toIndentedString(nsiLevelThrds)).append("\n");
    sb.append("    qosRequ: ").append(toIndentedString(qosRequ)).append("\n");
    sb.append("    qosFlowRetThds: ").append(toIndentedString(qosFlowRetThds)).append("\n");
    sb.append("    ranUeThrouThds: ").append(toIndentedString(ranUeThrouThds)).append("\n");
    sb.append("    repetitionPeriod: ").append(toIndentedString(repetitionPeriod)).append("\n");
    sb.append("    snssaia: ").append(toIndentedString(snssaia)).append("\n");
    sb.append("    tgtUe: ").append(toIndentedString(tgtUe)).append("\n");
    sb.append("    congThresholds: ").append(toIndentedString(congThresholds)).append("\n");
    sb.append("    nwPerfRequs: ").append(toIndentedString(nwPerfRequs)).append("\n");
    sb.append("    bwRequs: ").append(toIndentedString(bwRequs)).append("\n");
    sb.append("    excepRequs: ").append(toIndentedString(excepRequs)).append("\n");
    sb.append("    exptAnaType: ").append(toIndentedString(exptAnaType)).append("\n");
    sb.append("    exptUeBehav: ").append(toIndentedString(exptUeBehav)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

