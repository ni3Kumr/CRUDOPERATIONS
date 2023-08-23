import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeRegistrationService {

  constructor(private http:HttpClient) { }
  public  doRegistration(employee:any){
    return this.http.post("http://localhost:8080/addEmployee",employee,{responseType:'text' as 'json'})

  }
  public getEmployee(){
    return this.http.get("http://localhost:8080/Employee");
  }
  public getEmployeeByEmail(email:any){
    return this.http.get("http://localhost:8080/email/"+email);
  }
  public deleteEmployeeById(id:number){
    return this.http.delete("http://localhost:8080/delete/"+id);
  }
}
