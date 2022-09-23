package com.citi.FeedGenerator.service;

import java.io.IOException;
import java.util.ArrayList;

import com.citi.FeedGenerator.dto.AllTransactionFile;
import com.citi.FeedGenerator.dto.Transaction;

public interface TransactionService {

	public ArrayList<ArrayList<Transaction>> readFile(String fileName);
	public boolean isValid(Transaction transaction);
	public ArrayList<ArrayList<Transaction>> validate(ArrayList<Transaction> allTransactions) throws IOException;
	public boolean saveValidTransactions(ArrayList<Transaction> validTransactions) throws IOException;
}
