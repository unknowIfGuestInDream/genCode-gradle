package com.tlcsdm.gen.controller;

import com.tlcsdm.gen.annotation.Log;
import com.tlcsdm.gen.base.BaseUtils;
import com.tlcsdm.gen.service.RpcService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

/**
 * git信息
 *
 * @author: TangLiang
 * @date: 2021/11/26 9:52
 * @since: 1.0
 */
@RestController
@RequiredArgsConstructor
public class GitInfoController {

	private final RpcService rpcService;

	/**
	 * 获取git信息
	 */
	@GetMapping("getGitInfo")
	@Log
	public Map<String, Object> getGitInfo() throws IOException {
		return BaseUtils.success(rpcService.getGitInfo());
	}

}
