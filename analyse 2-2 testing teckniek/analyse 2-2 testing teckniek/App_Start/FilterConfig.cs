using System.Web;
using System.Web.Mvc;

namespace analyse_2_2_testing_teckniek
{
    public class FilterConfig
    {
        public static void RegisterGlobalFilters(GlobalFilterCollection filters)
        {
            filters.Add(new HandleErrorAttribute());
        }
    }
}
