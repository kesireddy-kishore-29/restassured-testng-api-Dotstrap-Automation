# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 451 | `qa-d0686daa-687f-4ac3-9d97-95e18eacdab5` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-83f965e0-02f4-4882-906c-fb25a6a830f3` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-5a1e79f8-9b9e-446a-a764-3a2fdc7383dc` |
| 4 | `POST /v1/conversations` | 201 | 55 | `qa-eaa69201-5cf3-422b-8efb-e1433196edb9` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 59 | `qa-937fee34-0d44-4286-8614-b85dde8c8283` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-5c59dbdb-6ee9-4f54-ab0a-3d4d9f24f985` |
| 7 | `GET /v1/conversations/{id}` | 200 | 24 | `qa-b51cb56a-4682-41de-982d-dd56db98be44` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 26 | `qa-358dc70e-ff6a-4e0c-8ad7-34c70d63794d` |
| 9 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-a060459f-5934-45a2-8b28-109d0bbb60b2` |
| 10 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-227ae3a5-a5d3-4fb5-a5c0-ed301018e0ad` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-f0f1a51c-34a3-4e0c-9af3-2a408c93c696` |
| 12 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b61bf4e3-c416-4220-8156-4328a5103035` |
| 13 | `POST /v1/auth/token` | 401 | 12 | `qa-2f175e99-3677-4b70-a376-8e6a70a24d11` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d0686daa-687f-4ac3-9d97-95e18eacdab5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0686daa-687f-4ac3-9d97-95e18eacdab5
Content-Type: application/json

--- request body ---
{"handle":"qa-56fd2c63d6b2","displayName":"QA 56fd2c63d6b2","password":"****","region":"eu"}

--- response: 201 in 451 ms ---
Date: Tue, 24 Nov 2026 12:38:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0686daa-687f-4ac3-9d97-95e18eacdab5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-56fd2c63d6b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_71b3f285-ab82-493f-b850-ba234ed8dac0","handle":"qa-56fd2c63d6b2","displayName":"QA 56fd2c63d6b2","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.030213573Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-83f965e0-02f4-4882-906c-fb25a6a830f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83f965e0-02f4-4882-906c-fb25a6a830f3
Content-Type: application/json

--- request body ---
{"handle":"qa-f4d24ac7e105","displayName":"QA f4d24ac7e105","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-83f965e0-02f4-4882-906c-fb25a6a830f3
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
Location: /v1/accounts/qa-f4d24ac7e105
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13137a95-b189-49a1-b37d-473d6a8e75b0","handle":"qa-f4d24ac7e105","displayName":"QA f4d24ac7e105","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.431618681Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5a1e79f8-9b9e-446a-a764-3a2fdc7383dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a1e79f8-9b9e-446a-a764-3a2fdc7383dc
Content-Type: application/json

--- request body ---
{"handle":"qa-56fd2c63d6b2","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a1e79f8-9b9e-446a-a764-3a2fdc7383dc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_71b3f285-ab82-493f-b850-ba234ed8dac0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-eaa69201-5cf3-422b-8efb-e1433196edb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaa69201-5cf3-422b-8efb-e1433196edb9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f4d24ac7e105","subject":"Updates","message":"First"}

--- response: 201 in 55 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaa69201-5cf3-422b-8efb-e1433196edb9
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
Location: /v1/conversations/cnv_0e38f8de-d47d-44f1-8616-4bbfee90ec77
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_0e38f8de-d47d-44f1-8616-4bbfee90ec77","subject":"Updates","status":"open","region":"eu","participants":["qa-56fd2c63d6b2","qa-f4d24ac7e105"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:04.605835485Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_0e38f8de-d47d-44f1-8616-4bbfee90ec77/messages
correlation: qa-937fee34-0d44-4286-8614-b85dde8c8283

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-937fee34-0d44-4286-8614-b85dde8c8283
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 59 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-937fee34-0d44-4286-8614-b85dde8c8283
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
Content-Length: 197

{"id":"msg_5c6912bc-0560-4184-a4e4-f24619716e07","conversationId":"cnv_0e38f8de-d47d-44f1-8616-4bbfee90ec77","sender":"qa-56fd2c63d6b2","body":"Second","createdAt":"2026-11-24T12:38:04.744420735Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5c59dbdb-6ee9-4f54-ab0a-3d4d9f24f985

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c59dbdb-6ee9-4f54-ab0a-3d4d9f24f985
Content-Type: application/json

--- request body ---
{"handle":"qa-f4d24ac7e105","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c59dbdb-6ee9-4f54-ab0a-3d4d9f24f985
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13137a95-b189-49a1-b37d-473d6a8e75b0"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_0e38f8de-d47d-44f1-8616-4bbfee90ec77
correlation: qa-b51cb56a-4682-41de-982d-dd56db98be44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b51cb56a-4682-41de-982d-dd56db98be44
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b51cb56a-4682-41de-982d-dd56db98be44
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_0e38f8de-d47d-44f1-8616-4bbfee90ec77","subject":"Updates","status":"open","region":"eu","participants":["qa-56fd2c63d6b2","qa-f4d24ac7e105"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-24T12:38:04.605835485Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_0e38f8de-d47d-44f1-8616-4bbfee90ec77/read
correlation: qa-358dc70e-ff6a-4e0c-8ad7-34c70d63794d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-358dc70e-ff6a-4e0c-8ad7-34c70d63794d
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-358dc70e-ff6a-4e0c-8ad7-34c70d63794d
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
Content-Length: 77

{"conversationId":"cnv_0e38f8de-d47d-44f1-8616-4bbfee90ec77","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_0e38f8de-d47d-44f1-8616-4bbfee90ec77
correlation: qa-a060459f-5934-45a2-8b28-109d0bbb60b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a060459f-5934-45a2-8b28-109d0bbb60b2
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a060459f-5934-45a2-8b28-109d0bbb60b2
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_0e38f8de-d47d-44f1-8616-4bbfee90ec77","subject":"Updates","status":"open","region":"eu","participants":["qa-56fd2c63d6b2","qa-f4d24ac7e105"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-24T12:38:04.605835485Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-227ae3a5-a5d3-4fb5-a5c0-ed301018e0ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-227ae3a5-a5d3-4fb5-a5c0-ed301018e0ad
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-227ae3a5-a5d3-4fb5-a5c0-ed301018e0ad
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
correlation: qa-f0f1a51c-34a3-4e0c-9af3-2a408c93c696

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0f1a51c-34a3-4e0c-9af3-2a408c93c696
Content-Type: application/json

--- request body ---
{"handle":"qa-f4d24ac7e105","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0f1a51c-34a3-4e0c-9af3-2a408c93c696
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f0f1a51c-34a3-4e0c-9af3-2a408c93c696"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b61bf4e3-c416-4220-8156-4328a5103035

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b61bf4e3-c416-4220-8156-4328a5103035
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b61bf4e3-c416-4220-8156-4328a5103035
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-2f175e99-3677-4b70-a376-8e6a70a24d11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f175e99-3677-4b70-a376-8e6a70a24d11
Content-Type: application/json

--- request body ---
{"handle":"qa-56fd2c63d6b2","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f175e99-3677-4b70-a376-8e6a70a24d11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2f175e99-3677-4b70-a376-8e6a70a24d11"}
```
