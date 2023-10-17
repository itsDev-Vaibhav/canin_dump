package com.trangile.prototype.dbo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCE_UCB_INVENTORY_DUMP")
public class UCBInventoryEntity {
	
	@Id
	private Long Id;
	private String MESSAGE_ID;
	private String WHSEID;
	private String Owner;
	private String SERIALKEY;
	private String Item;
	private String Description;
	private String LPN;
	private String Lot;
	private String Location;
	private Double OnHand;
	private Double Available;
	private String Status;
	private String Lottable01;
	private String Lottable02;
	private String Lottable03;
	private String ManufacturingDate;
	private String ExpirationDate;
	private String Lottable06;
	private String Lottable07;
	private String Lottable08;
	private String Lottable09;
	private String Lottable10;
	private String Lottable11;
	private String Lottable12;
	private LocalDateTime transdate;
	private Double Allocated;
	
	
	
	
	public UCBInventoryEntity() {
		
	}




	public UCBInventoryEntity(Long id, String mESSAGE_ID, String wHSEID, String owner, String sERIALKEY, String item,
			String description, String lPN, String lot, String location, Double onHand, Double available, String status,
			String lottable01, String lottable02, String lottable03, String manufacturingDate, String expirationDate,
			String lottable06, String lottable07, String lottable08, String lottable09, String lottable10,
			String lottable11, String lottable12, LocalDateTime transdate, Double allocated) {
		super();
		Id = id;
		MESSAGE_ID = mESSAGE_ID;
		WHSEID = wHSEID;
		Owner = owner;
		SERIALKEY = sERIALKEY;
		Item = item;
		Description = description;
		LPN = lPN;
		Lot = lot;
		Location = location;
		OnHand = onHand;
		Available = available;
		Status = status;
		Lottable01 = lottable01;
		Lottable02 = lottable02;
		Lottable03 = lottable03;
		ManufacturingDate = manufacturingDate;
		ExpirationDate = expirationDate;
		Lottable06 = lottable06;
		Lottable07 = lottable07;
		Lottable08 = lottable08;
		Lottable09 = lottable09;
		Lottable10 = lottable10;
		Lottable11 = lottable11;
		Lottable12 = lottable12;
		this.transdate = transdate;
		Allocated = allocated;
	}




	public Long getId() {
		return Id;
	}




	public void setId(Long id) {
		Id = id;
	}




	public String getMESSAGE_ID() {
		return MESSAGE_ID;
	}




	public void setMESSAGE_ID(String mESSAGE_ID) {
		MESSAGE_ID = mESSAGE_ID;
	}




	public String getWHSEID() {
		return WHSEID;
	}




	public void setWHSEID(String wHSEID) {
		WHSEID = wHSEID;
	}




	public String getOwner() {
		return Owner;
	}




	public void setOwner(String owner) {
		Owner = owner;
	}




	public String getSERIALKEY() {
		return SERIALKEY;
	}




	public void setSERIALKEY(String sERIALKEY) {
		SERIALKEY = sERIALKEY;
	}




	public String getItem() {
		return Item;
	}




	public void setItem(String item) {
		Item = item;
	}




	public String getDescription() {
		return Description;
	}




	public void setDescription(String description) {
		Description = description;
	}




	public String getLPN() {
		return LPN;
	}




	public void setLPN(String lPN) {
		LPN = lPN;
	}




	public String getLot() {
		return Lot;
	}




	public void setLot(String lot) {
		Lot = lot;
	}




	public String getLocation() {
		return Location;
	}




	public void setLocation(String location) {
		Location = location;
	}




	public Double getOnHand() {
		return OnHand;
	}




	public void setOnHand(Double onHand) {
		OnHand = onHand;
	}




	public Double getAvailable() {
		return Available;
	}




	public void setAvailable(Double available) {
		Available = available;
	}




	public String getStatus() {
		return Status;
	}




	public void setStatus(String status) {
		Status = status;
	}




	public String getLottable01() {
		return Lottable01;
	}




	public void setLottable01(String lottable01) {
		Lottable01 = lottable01;
	}




	public String getLottable02() {
		return Lottable02;
	}




	public void setLottable02(String lottable02) {
		Lottable02 = lottable02;
	}




	public String getLottable03() {
		return Lottable03;
	}




	public void setLottable03(String lottable03) {
		Lottable03 = lottable03;
	}




	public String getManufacturingDate() {
		return ManufacturingDate;
	}




	public void setManufacturingDate(String manufacturingDate) {
		ManufacturingDate = manufacturingDate;
	}




	public String getExpirationDate() {
		return ExpirationDate;
	}




	public void setExpirationDate(String expirationDate) {
		ExpirationDate = expirationDate;
	}




	public String getLottable06() {
		return Lottable06;
	}




	public void setLottable06(String lottable06) {
		Lottable06 = lottable06;
	}




	public String getLottable07() {
		return Lottable07;
	}




	public void setLottable07(String lottable07) {
		Lottable07 = lottable07;
	}




	public String getLottable08() {
		return Lottable08;
	}




	public void setLottable08(String lottable08) {
		Lottable08 = lottable08;
	}




	public String getLottable09() {
		return Lottable09;
	}




	public void setLottable09(String lottable09) {
		Lottable09 = lottable09;
	}




	public String getLottable10() {
		return Lottable10;
	}




	public void setLottable10(String lottable10) {
		Lottable10 = lottable10;
	}




	public String getLottable11() {
		return Lottable11;
	}




	public void setLottable11(String lottable11) {
		Lottable11 = lottable11;
	}




	public String getLottable12() {
		return Lottable12;
	}




	public void setLottable12(String lottable12) {
		Lottable12 = lottable12;
	}




	public LocalDateTime getTransdate() {
		return transdate;
	}




	public void setTransdate(LocalDateTime transdate) {
		this.transdate = transdate;
	}




	public Double getAllocated() {
		return Allocated;
	}




	public void setAllocated(Double allocated) {
		Allocated = allocated;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Allocated == null) ? 0 : Allocated.hashCode());
		result = prime * result + ((Available == null) ? 0 : Available.hashCode());
		result = prime * result + ((Description == null) ? 0 : Description.hashCode());
		result = prime * result + ((ExpirationDate == null) ? 0 : ExpirationDate.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Item == null) ? 0 : Item.hashCode());
		result = prime * result + ((LPN == null) ? 0 : LPN.hashCode());
		result = prime * result + ((Location == null) ? 0 : Location.hashCode());
		result = prime * result + ((Lot == null) ? 0 : Lot.hashCode());
		result = prime * result + ((Lottable01 == null) ? 0 : Lottable01.hashCode());
		result = prime * result + ((Lottable02 == null) ? 0 : Lottable02.hashCode());
		result = prime * result + ((Lottable03 == null) ? 0 : Lottable03.hashCode());
		result = prime * result + ((Lottable06 == null) ? 0 : Lottable06.hashCode());
		result = prime * result + ((Lottable07 == null) ? 0 : Lottable07.hashCode());
		result = prime * result + ((Lottable08 == null) ? 0 : Lottable08.hashCode());
		result = prime * result + ((Lottable09 == null) ? 0 : Lottable09.hashCode());
		result = prime * result + ((Lottable10 == null) ? 0 : Lottable10.hashCode());
		result = prime * result + ((Lottable11 == null) ? 0 : Lottable11.hashCode());
		result = prime * result + ((Lottable12 == null) ? 0 : Lottable12.hashCode());
		result = prime * result + ((MESSAGE_ID == null) ? 0 : MESSAGE_ID.hashCode());
		result = prime * result + ((ManufacturingDate == null) ? 0 : ManufacturingDate.hashCode());
		result = prime * result + ((OnHand == null) ? 0 : OnHand.hashCode());
		result = prime * result + ((Owner == null) ? 0 : Owner.hashCode());
		result = prime * result + ((SERIALKEY == null) ? 0 : SERIALKEY.hashCode());
		result = prime * result + ((Status == null) ? 0 : Status.hashCode());
		result = prime * result + ((WHSEID == null) ? 0 : WHSEID.hashCode());
		result = prime * result + ((transdate == null) ? 0 : transdate.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UCBInventoryEntity other = (UCBInventoryEntity) obj;
		if (Allocated == null) {
			if (other.Allocated != null)
				return false;
		} else if (!Allocated.equals(other.Allocated))
			return false;
		if (Available == null) {
			if (other.Available != null)
				return false;
		} else if (!Available.equals(other.Available))
			return false;
		if (Description == null) {
			if (other.Description != null)
				return false;
		} else if (!Description.equals(other.Description))
			return false;
		if (ExpirationDate == null) {
			if (other.ExpirationDate != null)
				return false;
		} else if (!ExpirationDate.equals(other.ExpirationDate))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Item == null) {
			if (other.Item != null)
				return false;
		} else if (!Item.equals(other.Item))
			return false;
		if (LPN == null) {
			if (other.LPN != null)
				return false;
		} else if (!LPN.equals(other.LPN))
			return false;
		if (Location == null) {
			if (other.Location != null)
				return false;
		} else if (!Location.equals(other.Location))
			return false;
		if (Lot == null) {
			if (other.Lot != null)
				return false;
		} else if (!Lot.equals(other.Lot))
			return false;
		if (Lottable01 == null) {
			if (other.Lottable01 != null)
				return false;
		} else if (!Lottable01.equals(other.Lottable01))
			return false;
		if (Lottable02 == null) {
			if (other.Lottable02 != null)
				return false;
		} else if (!Lottable02.equals(other.Lottable02))
			return false;
		if (Lottable03 == null) {
			if (other.Lottable03 != null)
				return false;
		} else if (!Lottable03.equals(other.Lottable03))
			return false;
		if (Lottable06 == null) {
			if (other.Lottable06 != null)
				return false;
		} else if (!Lottable06.equals(other.Lottable06))
			return false;
		if (Lottable07 == null) {
			if (other.Lottable07 != null)
				return false;
		} else if (!Lottable07.equals(other.Lottable07))
			return false;
		if (Lottable08 == null) {
			if (other.Lottable08 != null)
				return false;
		} else if (!Lottable08.equals(other.Lottable08))
			return false;
		if (Lottable09 == null) {
			if (other.Lottable09 != null)
				return false;
		} else if (!Lottable09.equals(other.Lottable09))
			return false;
		if (Lottable10 == null) {
			if (other.Lottable10 != null)
				return false;
		} else if (!Lottable10.equals(other.Lottable10))
			return false;
		if (Lottable11 == null) {
			if (other.Lottable11 != null)
				return false;
		} else if (!Lottable11.equals(other.Lottable11))
			return false;
		if (Lottable12 == null) {
			if (other.Lottable12 != null)
				return false;
		} else if (!Lottable12.equals(other.Lottable12))
			return false;
		if (MESSAGE_ID == null) {
			if (other.MESSAGE_ID != null)
				return false;
		} else if (!MESSAGE_ID.equals(other.MESSAGE_ID))
			return false;
		if (ManufacturingDate == null) {
			if (other.ManufacturingDate != null)
				return false;
		} else if (!ManufacturingDate.equals(other.ManufacturingDate))
			return false;
		if (OnHand == null) {
			if (other.OnHand != null)
				return false;
		} else if (!OnHand.equals(other.OnHand))
			return false;
		if (Owner == null) {
			if (other.Owner != null)
				return false;
		} else if (!Owner.equals(other.Owner))
			return false;
		if (SERIALKEY == null) {
			if (other.SERIALKEY != null)
				return false;
		} else if (!SERIALKEY.equals(other.SERIALKEY))
			return false;
		if (Status == null) {
			if (other.Status != null)
				return false;
		} else if (!Status.equals(other.Status))
			return false;
		if (WHSEID == null) {
			if (other.WHSEID != null)
				return false;
		} else if (!WHSEID.equals(other.WHSEID))
			return false;
		if (transdate == null) {
			if (other.transdate != null)
				return false;
		} else if (!transdate.equals(other.transdate))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "UCBInventoryEntity [Id=" + Id + ", MESSAGE_ID=" + MESSAGE_ID + ", WHSEID=" + WHSEID + ", Owner=" + Owner
				+ ", SERIALKEY=" + SERIALKEY + ", Item=" + Item + ", Description=" + Description + ", LPN=" + LPN
				+ ", Lot=" + Lot + ", Location=" + Location + ", OnHand=" + OnHand + ", Available=" + Available
				+ ", Status=" + Status + ", Lottable01=" + Lottable01 + ", Lottable02=" + Lottable02 + ", Lottable03="
				+ Lottable03 + ", ManufacturingDate=" + ManufacturingDate + ", ExpirationDate=" + ExpirationDate
				+ ", Lottable06=" + Lottable06 + ", Lottable07=" + Lottable07 + ", Lottable08=" + Lottable08
				+ ", Lottable09=" + Lottable09 + ", Lottable10=" + Lottable10 + ", Lottable11=" + Lottable11
				+ ", Lottable12=" + Lottable12 + ", transdate=" + transdate + ", Allocated=" + Allocated + "]";
	}
	
	

}
