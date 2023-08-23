import { Component,OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeRegistrationService } from '../employee-registration.service';
@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit{
  employee:Employee= new Employee("","",0,"");
  message:any;
constructor(private service:EmployeeRegistrationService){

}
  ngOnInit() {
  }
  public registerNow(){
    let resp = this.service.doRegistration(this.employee);
    resp.subscribe((data)=>this.message=data)
  }
}  
