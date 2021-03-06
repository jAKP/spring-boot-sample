import { Component, OnInit } from '@angular/core';
import { BookService, GiphyService } from '../shared';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books: Array<any>;

  constructor(private bookService: BookService, private giphyService: GiphyService) { }

  ngOnInit() {
    this.bookService.getAll().subscribe(
      data => {
        this.books = data;
        for (const book of this.books) {
          this.giphyService.get(book.name).subscribe(url => book.giphyUrl = url);
        }
      },
      error => console.log(error)
    );
  }

}
