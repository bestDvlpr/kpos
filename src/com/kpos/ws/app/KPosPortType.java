package com.kpos.ws.app;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.8
 * Fri Jun 01 22:28:18 EDT 2012
 * Generated source version: 2.2.8
 * 
 */
 
@WebService(targetNamespace = "http://ws.kpos.com/app", name = "KPosPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface KPosPortType {

    @WebResult(name = "ListStaffResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListStaff", action = "http://ws.kpos.com/ListStaff")
    public ListStaffResponseType listStaff(
        @WebParam(partName = "parameters", name = "ListStaffType", targetNamespace = "http://ws.kpos.com/app")
        ListStaffType parameters
    );

    @WebResult(name = "DeleteCategoryOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "DeleteCategoryOption", action = "http://ws.kpos.com/DeleteCategoryOption")
    public DeleteCategoryOptionResponseType deleteCategoryOption(
        @WebParam(partName = "parameters", name = "DeleteCategoryOptionType", targetNamespace = "http://ws.kpos.com/app")
        DeleteCategoryOptionType parameters
    );

    @WebResult(name = "SaveSeatingAreaResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "SaveSeatingArea", action = "http://ws.kpos.com/SaveSeatingArea")
    public SaveSeatingAreaResponseType saveSeatingArea(
        @WebParam(partName = "parameters", name = "SaveSeatingAreaType", targetNamespace = "http://ws.kpos.com/app")
        SaveSeatingAreaType parameters
    );

    @WebResult(name = "SaveStaffResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "SaveStaff", action = "http://ws.kpos.com/SaveStaff")
    public SaveStaffResponseType saveStaff(
        @WebParam(partName = "parameters", name = "SaveStaffType", targetNamespace = "http://ws.kpos.com/app")
        SaveStaffType parameters
    );

    @WebResult(name = "CreateCategoryOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "CreateCategoryOption", action = "http://ws.kpos.com/CreateCategoryOption")
    public CreateCategoryOptionResponseType createCategoryOption(
        @WebParam(partName = "parameters", name = "CreateCategoryOptionType", targetNamespace = "http://ws.kpos.com/app")
        CreateCategoryOptionType parameters
    );

    @WebResult(name = "ListTablesResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListTables", action = "http://ws.kpos.com/ListTables")
    public ListTablesResponseType listTables(
        @WebParam(partName = "parameters", name = "ListTablesType", targetNamespace = "http://ws.kpos.com/app")
        ListTablesType parameters
    );

    @WebResult(name = "SaveTableResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "SaveTable", action = "http://ws.kpos.com/SaveTable")
    public SaveTableResponseType saveTable(
        @WebParam(partName = "parameters", name = "SaveTableType", targetNamespace = "http://ws.kpos.com/app")
        SaveTableType parameters
    );

    @WebResult(name = "ListPrintersResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListPrinters", action = "http://ws.kpos.com/ListPrinters")
    public ListPrintersResponseType listPrinters(
        @WebParam(partName = "parameters", name = "ListPrintersType", targetNamespace = "http://ws.kpos.com/app")
        ListPrintersType parameters
    );

    @WebResult(name = "ListCategoryOptionHTMLResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListCategoryOptionHTML", action = "http://ws.kpos.com/ListCategoryOptionHTML")
    public ListCategoryOptionHTMLResponseType listCategoryOptionHTML(
        @WebParam(partName = "parameters", name = "ListCategoryOptionHTMLType", targetNamespace = "http://ws.kpos.com/app")
        ListCategoryOptionHTMLType parameters
    );

    @WebResult(name = "ListSaleItemOptionsResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListSaleItemOptions", action = "http://ws.kpos.com/ListSaleItemOptions")
    public ListSaleItemOptionsResponseType listSaleItemOptions(
        @WebParam(partName = "parameters", name = "ListSaleItemOptionsType", targetNamespace = "http://ws.kpos.com/app")
        ListSaleItemOptionsType parameters
    );

    @WebResult(name = "DeleteTableResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "DeleteTable", action = "http://ws.kpos.com/DeleteTable")
    public DeleteTableResponseType deleteTable(
        @WebParam(partName = "parameters", name = "DeleteTableType", targetNamespace = "http://ws.kpos.com/app")
        DeleteTableType parameters
    );

    @WebResult(name = "UpdateCategoryOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "UpdateCategoryOption", action = "http://ws.kpos.com/UpdateCategoryOption")
    public UpdateCategoryOptionResponseType updateCategoryOption(
        @WebParam(partName = "parameters", name = "UpdateCategoryOptionType", targetNamespace = "http://ws.kpos.com/app")
        UpdateCategoryOptionType parameters
    );

    @WebResult(name = "UpdateGlobalOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "UpdateGlobalOption", action = "http://ws.kpos.com/UpdateGlobalOption")
    public UpdateGlobalOptionResponseType updateGlobalOption(
        @WebParam(partName = "parameters", name = "UpdateGlobalOptionType", targetNamespace = "http://ws.kpos.com/app")
        UpdateGlobalOptionType parameters
    );

    @WebResult(name = "DeleteGlobalOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "DeleteGlobalOption", action = "http://ws.kpos.com/DeleteGlobalOption")
    public DeleteGlobalOptionResponseType deleteGlobalOption(
        @WebParam(partName = "parameters", name = "DeleteGlobalOptionType", targetNamespace = "http://ws.kpos.com/app")
        DeleteGlobalOptionType parameters
    );

    @WebResult(name = "ListPrintersHTMLResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListPrintersHTML", action = "http://ws.kpos.com/ListPrinters")
    public ListPrintersHTMLResponseType listPrintersHTML(
        @WebParam(partName = "parameters", name = "ListPrintersHTMLType", targetNamespace = "http://ws.kpos.com/app")
        ListPrintersHTMLType parameters
    );

    @WebResult(name = "DeleteCategoryResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "DeleteCategory", action = "http://ws.kpos.com/DeleteCategory")
    public DeleteCategoryResponseType deleteCategory(
        @WebParam(partName = "parameters", name = "DeleteCategoryType", targetNamespace = "http://ws.kpos.com/app")
        DeleteCategoryType parameters
    );

    @WebResult(name = "UpdateSaleItemOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "UpdateSaleItemOption", action = "http://ws.kpos.com/UpdateSaleItemOption")
    public UpdateSaleItemOptionResponseType updateSaleItemOption(
        @WebParam(partName = "parameters", name = "UpdateSaleItemOptionType", targetNamespace = "http://ws.kpos.com/app")
        UpdateSaleItemOptionType parameters
    );

    @WebResult(name = "DeleteSaleItemResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "DeleteSaleItem", action = "http://ws.kpos.com/DeleteSaleItem")
    public DeleteSaleItemResponseType deleteSaleItem(
        @WebParam(partName = "parameters", name = "DeleteSaleItemType", targetNamespace = "http://ws.kpos.com/app")
        DeleteSaleItemType parameters
    );

    @WebResult(name = "DeleteSaleItemOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "DeleteSaleItemOption", action = "http://ws.kpos.com/DeleteSaleItemOption")
    public DeleteSaleItemOptionResponseType deleteSaleItemOption(
        @WebParam(partName = "parameters", name = "DeleteSaleItemOptionType", targetNamespace = "http://ws.kpos.com/app")
        DeleteSaleItemOptionType parameters
    );

    @WebResult(name = "UpdateSaleItemResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "UpdateSaleItem", action = "http://ws.kpos.com/UpdateSaleItem")
    public UpdateSaleItemResponseType updateSaleItem(
        @WebParam(partName = "parameters", name = "UpdateSaleItemType", targetNamespace = "http://ws.kpos.com/app")
        UpdateSaleItemType parameters
    );

    @WebResult(name = "DeletePrinterResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "DeletePrinter", action = "http://ws.kpos.com/DeletePrinter")
    public DeletePrinterResponseType deletePrinter(
        @WebParam(partName = "parameters", name = "DeletePrinterType", targetNamespace = "http://ws.kpos.com/app")
        DeletePrinterType parameters
    );

    @WebResult(name = "AddAttendanceResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "AddAttendance", action = "http://ws.kpos.com/AddAttendance")
    public AddAttendanceResponseType addAttendance(
        @WebParam(partName = "parameters", name = "AddAttendanceType", targetNamespace = "http://ws.kpos.com/app")
        AddAttendanceType parameters
    );

    @WebResult(name = "ListSaleItemsForCategoryHTMLResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListSaleItemsForCategoryHTML", action = "http://ws.kpos.com/ListSaleItemsForCategoryHTML")
    public ListSaleItemsForCategoryHTMLResponseType listSaleItemsForCategoryHTML(
        @WebParam(partName = "parameters", name = "ListSaleItemsForCategoryHTMLType", targetNamespace = "http://ws.kpos.com/app")
        ListSaleItemsForCategoryHTMLType parameters
    );

    @WebResult(name = "ListCategoryResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListCategory", action = "http://ws.kpos.com/ListCategory")
    public ListCategoryResponseType listCategory(
        @WebParam(partName = "parameters", name = "ListCategoryType", targetNamespace = "http://ws.kpos.com/app")
        ListCategoryType parameters
    );

    @WebResult(name = "CreateCategoryResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "CreateCategory", action = "http://ws.kpos.com/CreateCategory")
    public CreateCategoryResponseType createCategory(
        @WebParam(partName = "parameters", name = "CreateCategoryType", targetNamespace = "http://ws.kpos.com/app")
        CreateCategoryType parameters
    );

    @WebResult(name = "DeleteStaffResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "DeleteStaff", action = "http://ws.kpos.com/DeleteStaff")
    public DeleteStaffResponseType deleteStaff(
        @WebParam(partName = "parameters", name = "DeleteStaffType", targetNamespace = "http://ws.kpos.com/app")
        DeleteStaffType parameters
    );

    @WebResult(name = "SettleOrderResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "SettleOrder", action = "http://ws.kpos.com/SettleOrder")
    public SettleOrderResponseType settleOrder(
        @WebParam(partName = "parameters", name = "SettleOrderType", targetNamespace = "http://ws.kpos.com/app")
        SettleOrderType parameters
    );

    @WebResult(name = "CreateGlobalOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "CreateGlobalOption", action = "http://ws.kpos.com/CreateGlobalOption")
    public CreateGlobalOptionResponseType createGlobalOption(
        @WebParam(partName = "parameters", name = "CreateGlobalOptionType", targetNamespace = "http://ws.kpos.com/app")
        CreateGlobalOptionType parameters
    );

    @WebResult(name = "FetchSeatingAreaResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "FetchSeatingArea", action = "http://ws.kpos.com/FetchSeatingArea")
    public FetchSeatingAreaResponseType fetchSeatingArea(
        @WebParam(partName = "parameters", name = "FetchSeatingAreaType", targetNamespace = "http://ws.kpos.com/app")
        FetchSeatingAreaType parameters
    );

    @WebResult(name = "ListGlobalOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListGlobalOption", action = "http://ws.kpos.com/ListGlobalOption")
    public ListGlobalOptionResponseType listGlobalOption(
        @WebParam(partName = "parameters", name = "ListGlobalOptionType", targetNamespace = "http://ws.kpos.com/app")
        ListGlobalOptionType parameters
    );

    @WebResult(name = "GetUserFunctionsHTMLResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "GetUserFunctionsHTML", action = "http://ws.kpos.com/GetUserFunctionsHTML")
    public GetUserFunctionsHTMLResponseType getUserFunctionsHTML(
        @WebParam(partName = "parameters", name = "GetUserFunctionsHTMLType", targetNamespace = "http://ws.kpos.com/app")
        GetUserFunctionsHTMLType parameters
    );

    @WebResult(name = "FetchSaleItemOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "FetchSaleItemOption", action = "http://ws.kpos.com/FetchSaleItemOption")
    public FetchSaleItemOptionResponseType fetchSaleItemOption(
        @WebParam(partName = "parameters", name = "FetchSaleItemOptionType", targetNamespace = "http://ws.kpos.com/app")
        FetchSaleItemOptionType parameters
    );

    @WebResult(name = "CreateSaleItemOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "CreateSaleItemOption", action = "http://ws.kpos.com/CreateSaleItemOption")
    public CreateSaleItemOptionResponseType createSaleItemOption(
        @WebParam(partName = "parameters", name = "CreateSaleItemOptionType", targetNamespace = "http://ws.kpos.com/app")
        CreateSaleItemOptionType parameters
    );

    @WebResult(name = "ListCategoryOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListCategoryOption", action = "http://ws.kpos.com/ListCategoryOption")
    public ListCategoryOptionResponseType listCategoryOption(
        @WebParam(partName = "parameters", name = "ListCategoryOptionType", targetNamespace = "http://ws.kpos.com/app")
        ListCategoryOptionType parameters
    );

    @WebResult(name = "DeleteSeatingAreaResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "DeleteSeatingArea", action = "http://ws.kpos.com/DeleteSeatingArea")
    public DeleteSeatingAreaResponseType deleteSeatingArea(
        @WebParam(partName = "parameters", name = "DeleteSeatingAreaType", targetNamespace = "http://ws.kpos.com/app")
        DeleteSeatingAreaType parameters
    );

    @WebResult(name = "CreatePrinterResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "CreatePrinter", action = "http://ws.kpos.com/CreatePrinter")
    public CreatePrinterResponseType createPrinter(
        @WebParam(partName = "parameters", name = "CreatePrinterType", targetNamespace = "http://ws.kpos.com/app")
        CreatePrinterType parameters
    );

    @WebResult(name = "UpdatePrinterResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "UpdatePrinter", action = "http://ws.kpos.com/UpdatePrinter")
    public UpdatePrinterResponseType updatePrinter(
        @WebParam(partName = "parameters", name = "UpdatePrinterType", targetNamespace = "http://ws.kpos.com/app")
        UpdatePrinterType parameters
    );

    @WebResult(name = "DeleteOrderResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "DeleteOrder", action = "http://ws.kpos.com/DeleteOrder")
    public DeleteOrderResponseType deleteOrder(
        @WebParam(partName = "parameters", name = "DeleteOrderType", targetNamespace = "http://ws.kpos.com/app")
        DeleteOrderType parameters
    );

    @WebResult(name = "SaveOrderResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "SaveOrder", action = "http://ws.kpos.com/SaveOrder")
    public SaveOrderResponseType saveOrder(
        @WebParam(partName = "parameters", name = "SaveOrderType", targetNamespace = "http://ws.kpos.com/app")
        SaveOrderType parameters
    );

    @WebResult(name = "CheckPrivilegeResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "CheckPrivilege", action = "http://ws.kpos.com/CheckPrivilege")
    public CheckPrivilegeResponseType checkPrivilege(
        @WebParam(partName = "parameters", name = "CheckPrivilegeType", targetNamespace = "http://ws.kpos.com/app")
        CheckPrivilegeType parameters
    );

    @WebResult(name = "ListCategoryHTMLResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListCategoryHTML", action = "http://ws.kpos.com/ListCategoryHTML")
    public ListCategoryHTMLResponseType listCategoryHTML(
        @WebParam(partName = "parameters", name = "ListCategoryHTMLType", targetNamespace = "http://ws.kpos.com/app")
        ListCategoryHTMLType parameters
    );

    @WebResult(name = "ListAreasResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListAreas", action = "http://ws.kpos.com/ListAreas")
    public ListAreasResponseType listAreas(
        @WebParam(partName = "parameters", name = "ListAreasType", targetNamespace = "http://ws.kpos.com/app")
        ListAreasType parameters
    );

    @WebResult(name = "FetchSaleItemResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "FetchSaleItem", action = "http://ws.kpos.com/FetchSaleItem")
    public FetchSaleItemResponseType fetchSaleItem(
        @WebParam(partName = "parameters", name = "FetchSaleItemType", targetNamespace = "http://ws.kpos.com/app")
        FetchSaleItemType parameters
    );

    @WebResult(name = "FetchTableResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "FetchTable", action = "http://ws.kpos.com/FetchTable")
    public FetchTableResponseType fetchTable(
        @WebParam(partName = "parameters", name = "FetchTableType", targetNamespace = "http://ws.kpos.com/app")
        FetchTableType parameters
    );

    @WebResult(name = "FetchGlobalOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "FetchGlobalOption", action = "http://ws.kpos.com/FetchGlobalOption")
    public FetchGlobalOptionResponseType fetchGlobalOption(
        @WebParam(partName = "parameters", name = "FetchGlobalOptionType", targetNamespace = "http://ws.kpos.com/app")
        FetchGlobalOptionType parameters
    );

    @WebResult(name = "ListSaleItemsForCategoryResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListSaleItemsForCategory", action = "http://ws.kpos.com/ListSaleItemsForCategory")
    public ListSaleItemsForCategoryResponseType listSaleItemsForCategory(
        @WebParam(partName = "parameters", name = "ListSaleItemsForCategoryType", targetNamespace = "http://ws.kpos.com/app")
        ListSaleItemsForCategoryType parameters
    );

    @WebResult(name = "UpdateCategoryResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "UpdateCategory", action = "http://ws.kpos.com/UpdateCategory")
    public UpdateCategoryResponseType updateCategory(
        @WebParam(partName = "parameters", name = "UpdateCategoryType", targetNamespace = "http://ws.kpos.com/app")
        UpdateCategoryType parameters
    );

    @WebResult(name = "ListGlobalOptionHTMLResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "ListGlobalOptionHTML", action = "http://ws.kpos.com/ListGlobalOptionHTML")
    public ListGlobalOptionHTMLResponseType listGlobalOptionHTML(
        @WebParam(partName = "parameters", name = "ListGlobalOptionHTMLType", targetNamespace = "http://ws.kpos.com/app")
        ListGlobalOptionHTMLType parameters
    );

    @WebResult(name = "CreateSaleItemResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "CreateSaleItem", action = "http://ws.kpos.com/CreateSaleItem")
    public CreateSaleItemResponseType createSaleItem(
        @WebParam(partName = "parameters", name = "CreateSaleItemType", targetNamespace = "http://ws.kpos.com/app")
        CreateSaleItemType parameters
    );

    @WebResult(name = "FetchCategoryOptionResponseType", targetNamespace = "http://ws.kpos.com/app", partName = "parameters")
    @WebMethod(operationName = "FetchCategoryOption", action = "http://ws.kpos.com/FetchCategoryOption")
    public FetchCategoryOptionResponseType fetchCategoryOption(
        @WebParam(partName = "parameters", name = "FetchCategoryOptionType", targetNamespace = "http://ws.kpos.com/app")
        FetchCategoryOptionType parameters
    );
}
