package Model;

public class InspectionComponentCheck {
    private int componentCheckId;
    private int ticketId;
    private int partId;
    private boolean isOriginal;
    private boolean isGenuineReplaced;
    private String icloudStatus;
    private String simLockStatus;
    private String blacklistedCheck;
    private String proofImageUrl; 

    public InspectionComponentCheck() {
    }

    public InspectionComponentCheck(int componentCheckId, int ticketId, int partId, boolean isOriginal, boolean isGenuineReplaced, String icloudStatus, String simLockStatus, String blacklistedCheck, String proofImageUrl) {
        this.componentCheckId = componentCheckId;
        this.ticketId = ticketId;
        this.partId = partId;
        this.isOriginal = isOriginal;
        this.isGenuineReplaced = isGenuineReplaced;
        this.icloudStatus = icloudStatus;
        this.simLockStatus = simLockStatus;
        this.blacklistedCheck = blacklistedCheck;
        this.proofImageUrl = proofImageUrl;
    }

    public int getComponentCheckId() { return componentCheckId; }
    public void setComponentCheckId(int componentCheckId) { this.componentCheckId = componentCheckId; }

    public int getTicketId() { return ticketId; }
    public void setTicketId(int ticketId) { this.ticketId = ticketId; }

    public int getPartId() { return partId; }
    public void setPartId(int partId) { this.partId = partId; }

    public boolean isOriginal() { return isOriginal; }
    public void setOriginal(boolean isOriginal) { this.isOriginal = isOriginal; }

    public boolean isGenuineReplaced() { return isGenuineReplaced; }
    public void setGenuineReplaced(boolean isGenuineReplaced) { this.isGenuineReplaced = isGenuineReplaced; }

    public String getIcloudStatus() { return icloudStatus; }
    public void setIcloudStatus(String icloudStatus) { this.icloudStatus = icloudStatus; }

    public String getSimLockStatus() { return simLockStatus; }
    public void setSimLockStatus(String simLockStatus) { this.simLockStatus = simLockStatus; }

    public String getBlacklistedCheck() { return blacklistedCheck; }
    public void setBlacklistedCheck(String blacklistedCheck) { this.blacklistedCheck = blacklistedCheck; }

    public String getProofImageUrl() { return proofImageUrl; }
    public void setProofImageUrl(String proofImageUrl) { this.proofImageUrl = proofImageUrl; }
}