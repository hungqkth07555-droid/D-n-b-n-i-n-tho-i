package Model;

public class IphonePartsCatalog {
    private int partId;
    private String partName;

    public IphonePartsCatalog() {
    }

    public IphonePartsCatalog(int partId, String partName) {
        this.partId = partId;
        this.partName = partName;
    }

    public int getPartId() { return partId; }
    public void setPartId(int partId) { this.partId = partId; }

    public String getPartName() { return partName; }
    public void setPartName(String partName) { this.partName = partName; }
}