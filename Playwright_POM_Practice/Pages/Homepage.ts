import {Page,Locator} from "@playwright/test"
export class Homepageclass {
    private readonly prodlink:Locator;
    private readonly page:Page;
    private readonly addcart:Locator;
    constructor(page:Page) {
        this.page=page;
        this.prodlink=this.page.locator("//a[.='Samsung galaxy s6']");
        this.addcart=this.page.locator("//a[@class='btn btn-success btn-lg']");
        
    }
    async clickonprodlink()
    {
        await this.prodlink.click();
    }
    async addtocartbtn_inthepage(){
        await this.addcart.click();
    }
}