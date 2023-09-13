package org.example.callback.agi;

import com.dingtalk.open.app.api.callback.OpenDingTalkCallbackListener;
import lombok.extern.slf4j.Slf4j;
import org.example.model.DingTalkAGIPluginRequest;
import org.example.model.DingTalkAGIPluginResponse;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AGIPluginCallbackConsumer implements OpenDingTalkCallbackListener<DingTalkAGIPluginRequest, DingTalkAGIPluginResponse> {
    @Override
    public DingTalkAGIPluginResponse execute(DingTalkAGIPluginRequest request) {
        log.info("receive AGI plugin request={}", request);
        String abilityKey = request.getAbilityKey();
        // dos something with abilityKey
        DingTalkAGIPluginResponse  response = new DingTalkAGIPluginResponse();
        response.setRequestId(request.getRequestId());
        response.setResult("echo");
        return response;
    }
}
