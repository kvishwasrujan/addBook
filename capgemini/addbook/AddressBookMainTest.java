package com.capgemini.addbook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.addbook.AddressBookPrintFile.IOservice;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
class AddressBookMainTest {

	@Test
	void printingOnFile() {
		AddressBook[] arrayOfPeople = {
				new AddressBook("Srujan", "Konda", "gdn", "wgl", "telangana", "506001", "808483343", "vishwasrujank@gmail.com"),
				new AddressBook("vishwa", "karna", "advocates colony", "warangal", "Telangana", "78959", "787979879",
						"vishwakarna@gmail.com") };
		AddressBookPrintFile contactList = new AddressBookPrintFile();
		contactList = new AddressBookPrintFile(Arrays.asList(arrayOfPeople));
		contactList.writePersonsData(IOservice.FILE_IO);
	}

}
