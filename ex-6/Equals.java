class CreditCard {
	private final String owner;
	private final double monthlyAllowance;
	private final long cardNumber;
	private final int verificationCode;

	public CreditCard(String owner, double monthlyAllowance, long cardNumber, int verificationCode) {
		this.owner = owner;
		this.monthlyAllowance = monthlyAllowance;
		this.cardNumber = cardNumber;
		this.verificationCode = verificationCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof CreditCard))
			return false;
		CreditCard other = (CreditCard) obj;
		if (cardNumber != other.cardNumber)
			return false;
		if (monthlyAllowance != other.monthlyAllowance)
			return false;
		if (verificationCode != other.verificationCode)
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}
}
