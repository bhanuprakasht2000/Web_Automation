import {Locator,Page} from "@playwright/test";
export class Loginpageclass {
   private readonly page: Page;
   private readonly Loginlink: Locator;
   private readonly username: Locator;
   private readonly password: Locator;
    private readonly loginButton: Locator;
    constructor(page: Page) {
        this.page=page;
        this.Loginlink=this.page.locator("#login2");
        this.username=this.page.locator('#loginusername');
        this.password=this.page.locator('#loginpassword');
        this.loginButton=this.page.locator('[onclick="logIn()"]');
    }
    async clickloginlink()
    {
        await this.Loginlink.click();
    }
    async Usernamefill(User_data:string)
    {
        await (this.username).fill(User_data);
    }
     async Passwordfill(Passs_data:string)
    {
        await this.password.fill(Passs_data);
    }
    async Loginbuttonclick()
    {
        await this.loginButton.click();
    }
    async allloginmethodcalls(usernamefield_data:string,passwordfield_data:string)
    {
        await this.clickloginlink();
        await this.Usernamefill(usernamefield_data);
        await this.Passwordfill(passwordfield_data);
        await this.Loginbuttonclick();

    }
}