package com.wafflestudio.spring2026.meeting.dto

import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Positive

data class MeetingUpdateRequest(
    // 부분 수정이므로 프로퍼티는 생략할 수 있습니다.
    // @NotBlank와 달리 @Pattern은 null을 검증하지 않으므로, 전달된 값에만 제약이 적용됩니다.
    // "(?s).*\S.*"는 공백이 아닌 문자를 하나 이상 포함해야 한다는 의미입니다.
    @field:Pattern(
        regexp = "(?s).*\\S.*",
        message = "모임 제목은 비어 있을 수 없습니다.",
    )
    val title: String? = null,

    // @Positive 역시 null은 검증하지 않고 통과시킵니다.
    @field:Positive(message = "모임 정원은 1명 이상이어야 합니다.")
    val capacity: Int? = null,
)
