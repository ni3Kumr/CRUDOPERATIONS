import { Component,OnInit } from '@angular/core';
import { EmployeeRegistrationService } from '../employee-registration.service';
@Component({
  selector: 'app-search-delete',
  templateUrl: './search-delete.component.html',
  styleUrls: ['./search-delete.component.css']
})
export class SearchDeleteComponent implements OnInit{
employees:any;
email:any;
  constructor(private service:EmployeeRegistrationService){

  }
ngOnInit(){
    let resp =this.service.getEmployee();
    resp.subscribe((data)=>this.employees=data)
}
public findEmployeeByEmailId(email:any){
    let resp= this.service.getEmployeeByEmail(email);
  resp.subscribe((data)=>this.employees=data)


}
public deleteEmployee(id:number){
  let resp= this.service.deleteEmployeeById(id);
  resp.subscribe((data)=>this.employees=data)
}
}
