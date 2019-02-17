package com.example.bookservice.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.example.bookservice.model.Book;
import com.example.bookservice.repository.BookRepository;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceImplTest {

	@Mock
	private BookRepository bookRepository;
	
	@InjectMocks
	private BookServiceImpl bookServiceImpl;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	/*@Test
	public void testFindAllBooks() {
		fail("Not yet implemented");
	}*/

	@Test
	@Ignore
	public void testFindBook() {
		
		Book book = new Book(1L, "Spring in Action", "Craig Walls", "9781932394887");
		when(bookServiceImpl.findBook(1L)).thenReturn(book);

		Book resultBook = bookServiceImpl.findBook(1L);

		// API was called exactly once
		verify(bookRepository, times(1)).findById(1L);
		// API invocation result & data validation
		Assert.assertTrue(resultBook != null);
		Assert.assertEquals(resultBook.getTitle(), "Spring in Action");

		
	}

}
