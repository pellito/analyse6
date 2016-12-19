using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(analyse_2_2_testing_teckniek.Startup))]
namespace analyse_2_2_testing_teckniek
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
