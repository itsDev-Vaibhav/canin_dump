package com.trangile.prototype.dbo.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCE_LEGRAND_INVENTORY_DUMP")
public class LegInventoryEntity {
	
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
	
	public LegInventoryEntity() {
		
	}

	public LegInventoryEntity(Long id, String mESSAGE_ID, String wHSEID, String owner, String sERIALKEY, String item,
			String description, String lPN, String lot, String location, Double onHand, Double available, String status,
			String lottable01, String lottable02, String lottable03, String manufacturingDate, String expirationDate,
			String lottable06, String lottable07, String lottable08, String lottable09, String lottable10,
			String lottable11, String lottable12) {
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

	@Override
	public int hashCode() {
		return Objects.hash(Available, Description, ExpirationDate, Id, Item, LPN, Location, Lot, Lottable01,
				Lottable02, Lottable03, Lottable06, Lottable07, Lottable08, Lottable09, Lottable10, Lottable11,
				Lottable12, MESSAGE_ID, ManufacturingDate, OnHand, Owner, SERIALKEY, Status, WHSEID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LegInventoryEntity other = (LegInventoryEntity) obj;
		return Objects.equals(Available, other.Available) && Objects.equals(Description, other.Description)
				&& Objects.equals(ExpirationDate, other.ExpirationDate) && Objects.equals(Id, other.Id)
				&& Objects.equals(Item, other.Item) && Objects.equals(LPN, other.LPN)
				&& Objects.equals(Location, other.Location) && Objects.equals(Lot, other.Lot)
				&& Objects.equals(Lottable01, other.Lottable01) && Objects.equals(Lottable02, other.Lottable02)
				&& Objects.equals(Lottable03, other.Lottable03) && Objects.equals(Lottable06, other.Lottable06)
				&& Objects.equals(Lottable07, other.Lottable07) && Objects.equals(Lottable08, other.Lottable08)
				&& Objects.equals(Lottable09, other.Lottable09) && Objects.equals(Lottable10, other.Lottable10)
				&& Objects.equals(Lottable11, other.Lottable11) && Objects.equals(Lottable12, other.Lottable12)
				&& Objects.equals(MESSAGE_ID, other.MESSAGE_ID)
				&& Objects.equals(ManufacturingDate, other.ManufacturingDate) && Objects.equals(OnHand, other.OnHand)
				&& Objects.equals(Owner, other.Owner) && Objects.equals(SERIALKEY, other.SERIALKEY)
				&& Objects.equals(Status, other.Status) && Objects.equals(WHSEID, other.WHSEID);
	}

	@Override
	public String toString() {
		return "LegInventoryEntity [Id=" + Id + ", MESSAGE_ID=" + MESSAGE_ID + ", WHSEID=" + WHSEID + ", Owner=" + Owner
				+ ", SERIALKEY=" + SERIALKEY + ", Item=" + Item + ", Description=" + Description + ", LPN=" + LPN
				+ ", Lot=" + Lot + ", Location=" + Location + ", OnHand=" + OnHand + ", Available=" + Available
				+ ", Status=" + Status + ", Lottable01=" + Lottable01 + ", Lottable02=" + Lottable02 + ", Lottable03="
				+ Lottable03 + ", ManufacturingDate=" + ManufacturingDate + ", ExpirationDate=" + ExpirationDate
				+ ", Lottable06=" + Lottable06 + ", Lottable07=" + Lottable07 + ", Lottable08=" + Lottable08
				+ ", Lottable09=" + Lottable09 + ", Lottable10=" + Lottable10 + ", Lottable11=" + Lottable11
				+ ", Lottable12=" + Lottable12 + "]";
	}
}
