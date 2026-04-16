import {Page,Locator} from "@playwright/test";
export class Cartpageclass
{
    private readonly addcartbtn_top:Locator;
    private readonly page:Page;
    constructor(page:Page){
        this.page=page;
        this.addcartbtn_top=this.page.locator("//a[.='Cart']");


    }
    async addcartbtnclick(){
        await this.addcartbtn_top.click();
    }
    
}