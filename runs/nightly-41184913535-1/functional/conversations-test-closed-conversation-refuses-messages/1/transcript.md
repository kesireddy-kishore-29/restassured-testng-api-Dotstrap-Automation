# Transcript: A closed conversation refuses new messages with 409

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#closedConversationRefusesMessages` |
| Features | FEAT-CONV-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 248 | `qa-5e290e74-8f96-4f96-ab00-8d8bf7133ea9` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-c310f869-088d-4779-92d2-cb589c1d53f9` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-c1c5cdcb-e9ea-4d10-9245-8de51ee07bf6` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-4b85d7cf-3302-40f6-8722-c09108d2827d` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 9 | `qa-73842db9-4965-4331-92b5-5de52c30ca68` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-c94d232e-4071-4b5e-8d88-60a464917892` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 11 | `qa-728827c7-00f8-4240-a309-d60ea7c64558` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-6c5bec91-afaa-4e82-ac2d-93f2c9809210` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-686ec2c8-cf86-4ccc-a52d-4c175dff31f1` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-ad351ead-b4e8-47c0-94d7-82e5afac7a24` |
| 11 | `POST /v1/auth/token` | 401 | 3 | `qa-621d2de8-71be-4220-af2a-b9a26fbc4bf0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5e290e74-8f96-4f96-ab00-8d8bf7133ea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e290e74-8f96-4f96-ab00-8d8bf7133ea9
Content-Type: application/json

--- request body ---
{"handle":"qa-d259d715e2ca","displayName":"QA d259d715e2ca","password":"****","region":"eu"}

--- response: 201 in 248 ms ---
Date: Sat, 31 Oct 2026 08:31:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e290e74-8f96-4f96-ab00-8d8bf7133ea9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-d259d715e2ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b8e5a56-a438-44d2-81b6-824b2826d235","handle":"qa-d259d715e2ca","displayName":"QA d259d715e2ca","region":"eu","role":"user","createdAt":"2026-10-31T08:31:23.874743239Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c310f869-088d-4779-92d2-cb589c1d53f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c310f869-088d-4779-92d2-cb589c1d53f9
Content-Type: application/json

--- request body ---
{"handle":"qa-5221c2c9ed4a","displayName":"QA 5221c2c9ed4a","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c310f869-088d-4779-92d2-cb589c1d53f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-5221c2c9ed4a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6db3cfed-c5ae-47b6-bb52-9eeb73baf7b5","handle":"qa-5221c2c9ed4a","displayName":"QA 5221c2c9ed4a","region":"eu","role":"user","createdAt":"2026-10-31T08:31:24.145148878Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c1c5cdcb-e9ea-4d10-9245-8de51ee07bf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1c5cdcb-e9ea-4d10-9245-8de51ee07bf6
Content-Type: application/json

--- request body ---
{"handle":"qa-d259d715e2ca","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1c5cdcb-e9ea-4d10-9245-8de51ee07bf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b8e5a56-a438-44d2-81b6-824b2826d235"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4b85d7cf-3302-40f6-8722-c09108d2827d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b85d7cf-3302-40f6-8722-c09108d2827d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5221c2c9ed4a","subject":"Quick question","message":"Hi"}

--- response: 201 in 47 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b85d7cf-3302-40f6-8722-c09108d2827d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_c61a32c4-4412-4069-8752-93c8e6cbd189
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c61a32c4-4412-4069-8752-93c8e6cbd189","subject":"Quick question","status":"open","region":"eu","participants":["qa-d259d715e2ca","qa-5221c2c9ed4a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:24.257693251Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c61a32c4-4412-4069-8752-93c8e6cbd189/close
correlation: qa-73842db9-4965-4331-92b5-5de52c30ca68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73842db9-4965-4331-92b5-5de52c30ca68
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-73842db9-4965-4331-92b5-5de52c30ca68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 283

{"id":"cnv_c61a32c4-4412-4069-8752-93c8e6cbd189","subject":"Quick question","status":"closed","region":"eu","participants":["qa-d259d715e2ca","qa-5221c2c9ed4a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:24.257693251Z","closedAt":"2026-10-31T08:31:24.323065003Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c94d232e-4071-4b5e-8d88-60a464917892

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c94d232e-4071-4b5e-8d88-60a464917892
Content-Type: application/json

--- request body ---
{"handle":"qa-5221c2c9ed4a","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c94d232e-4071-4b5e-8d88-60a464917892
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6db3cfed-c5ae-47b6-bb52-9eeb73baf7b5"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_c61a32c4-4412-4069-8752-93c8e6cbd189/messages
correlation: qa-728827c7-00f8-4240-a309-d60ea7c64558

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-728827c7-00f8-4240-a309-d60ea7c64558
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-728827c7-00f8-4240-a309-d60ea7c64558
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_c61a32c4-4412-4069-8752-93c8e6cbd189/messages","correlationId":"qa-728827c7-00f8-4240-a309-d60ea7c64558"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c5bec91-afaa-4e82-ac2d-93f2c9809210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c5bec91-afaa-4e82-ac2d-93f2c9809210
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c5bec91-afaa-4e82-ac2d-93f2c9809210
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-686ec2c8-cf86-4ccc-a52d-4c175dff31f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-686ec2c8-cf86-4ccc-a52d-4c175dff31f1
Content-Type: application/json

--- request body ---
{"handle":"qa-5221c2c9ed4a","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-686ec2c8-cf86-4ccc-a52d-4c175dff31f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-686ec2c8-cf86-4ccc-a52d-4c175dff31f1"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ad351ead-b4e8-47c0-94d7-82e5afac7a24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad351ead-b4e8-47c0-94d7-82e5afac7a24
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ad351ead-b4e8-47c0-94d7-82e5afac7a24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-621d2de8-71be-4220-af2a-b9a26fbc4bf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-621d2de8-71be-4220-af2a-b9a26fbc4bf0
Content-Type: application/json

--- request body ---
{"handle":"qa-d259d715e2ca","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-621d2de8-71be-4220-af2a-b9a26fbc4bf0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-621d2de8-71be-4220-af2a-b9a26fbc4bf0"}
```
