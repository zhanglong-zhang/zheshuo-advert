package com.zheshuo.advert.controller;


import com.zheshuo.advert.service.OrderInfoService;
import com.zheshuo.advert.request.OrderInfoRequest;
import com.zheshuo.advert.response.OrderInfoResponse;
import com.zheshuo.advert.core.common.OutputDTO;
import com.zheshuo.advert.core.common.PageData;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * (OrderInfo)
 * @author ZhangLong
 * @since 2019-12-12 09:48:28
 */
@RestController
@Api("")
@RequestMapping("/api/orderInfo")
public class OrderInfoController {
    /**
     * 服务对象
     */
    @Resource
    private OrderInfoService orderInfoService;

    /**
     * 分页查询所有数据
     * @param orderInfoRequest 查询实体
     * @return 分页查询
     */
    @GetMapping("/loadPage")
    @ApiOperation("条件分页查询数据")
    public OutputDTO<PageData<OrderInfoResponse>> loadPage( @Validated @RequestBody OrderInfoRequest orderInfoRequest){
       return orderInfoService.loadPage(orderInfoRequest);
    }


    /**
     * 查询列表
     *
     * @param accountInfoRequest 主键
     * @return 单条数据
     */
    @GetMapping("/loadList")
    @ApiOperation("条件列表查询数据")
    public OutputDTO<List<OrderInfoResponse>> loadList(@Validated @RequestBody OrderInfoRequest orderInfoRequest) {
        return orderInfoService.loadList(orderInfoRequest);
    }

    /**
     * 查询详情
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/loadDetail/{id}")
    @ApiOperation("id详情查询数据")
    public OutputDTO<OrderInfoResponse> loadDetail(@PathVariable Serializable id) {
        return orderInfoService.loadDetail(id);
    }

    /**
     * 新增数据
     *
     * @param accountInfoRequest 实体对象
     * @return 新增结果
     */
    @PostMapping("/saveOrderInfo")
    @ApiOperation("保存数据")
    public OutputDTO<Void> saveOrderInfo(@Validated @RequestBody OrderInfoRequest orderInfoRequest) {
        return orderInfoService.saveOrderInfo(orderInfoRequest);
    }

    /**
     * 修改数据
     *
     * @param accountInfoRequest 实体对象
     * @return 修改结果
     */
    @PutMapping("/updateOrderInfo")
    @ApiOperation("修改数据")
    public OutputDTO<Void> updateOrderInfo(@Validated @RequestBody OrderInfoRequest orderInfoRequest) {
        return  orderInfoService.updateOrderInfo(orderInfoRequest);
    }
    
     /**
     * 导出
     * @param accountInfoRequest 条件
     */
    @PutMapping("/exportOrderInfo")
    @ApiOperation("导出数据")
    public void exportOrderInfo(@Validated @RequestBody OrderInfoRequest orderInfoRequest ) {
        orderInfoService.exportOrderInfo(orderInfoRequest);
    }
}