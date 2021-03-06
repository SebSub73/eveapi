package com.beimin.eveapi.response.corporation;

import com.beimin.eveapi.model.shared.ContactList;
import com.beimin.eveapi.response.shared.AbstractContactListResponse;

public class ContactListResponse extends AbstractContactListResponse {
	public ContactList getCorporateContactList() {
		return contactLists.get("corporateContactList");
	}

	public ContactList getAllianceContactList() {
		return contactLists.get("allianceContactList");
	}

}