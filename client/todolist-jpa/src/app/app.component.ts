import { TodoElement } from './dto';
import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  todo: string = "";
  list: TodoElement[] = [];
  search: string = "";

  // inject the http client object
  constructor(private http: HttpClient) {
    // at startup
    // get the already existing pending tasks
    let obs: Observable<TodoElement[]> = this.http
      .get<TodoElement[]>("http://localhost:8080/get-all");
    obs.subscribe(r => {
      this.list = r;
    });
  }

  // invokes server to add a new task to the todo list
  addTodo() {
    // create a new element with the task property set to input field value
    let e: TodoElement = new TodoElement();
    e.task = this.todo;

    // call the server to add the element e
    let obs: Observable<TodoElement[]> = this.http
      .post<TodoElement[]>("http://localhost:8080/add", e);
    obs.subscribe(r => {
      this.list = r;
    });
    
    // empties input field
    this.todo = "";
  }

  delete(e: TodoElement) {
    // call the server to add the element e
    let obs: Observable<TodoElement[]> = this.http
      .post<TodoElement[]>("http://localhost:8080/remove", e);
    obs.subscribe(r => {
      this.list = r;
    });
   }

   searchFor(){
     // create a new element with the task property set to input field value
    let e: TodoElement = new TodoElement();
    e.task = this.search;

    // call the server to search the element e
    let obs: Observable<TodoElement[]> = this.http
      .post<TodoElement[]>("http://localhost:8080/search-for", e);
    obs.subscribe(r => {
      this.list = r;
    });
    
    // empties input field
    this.todo = "";
   }
}
