# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 389 | `qa-3dae5da8-f054-45b6-a7f6-c724b6ebc685` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-35e7a9b1-9ba0-4d69-96e3-c4a42e5dbc18` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-f89c421e-915f-4b81-8085-b185a60ce9ba` |
| 4 | `POST /v1/conversations` | 201 | 59 | `qa-607a16d3-487f-4eac-8b44-a608be7e4d6f` |
| 5 | `POST /v1/auth/token` | 200 | 28 | `qa-3ed086f9-3753-4df4-b373-4a2cf245aae5` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 30 | `qa-52be27f2-f0f0-46c0-9c7a-a5e101da46a6` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-3c89b2b1-6b70-4754-a8ac-f386bc07a8c5` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-7be6e6b4-7d5f-424f-8971-aa2c6c16f6c0` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-411e3a64-535b-4cde-8c9b-2369fd249e96` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-77e4a7bf-2a1e-4c98-a636-d0400d3d4c93` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-df020d5d-03b3-4a03-842e-d4c9e552d3c2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3dae5da8-f054-45b6-a7f6-c724b6ebc685

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dae5da8-f054-45b6-a7f6-c724b6ebc685
Content-Type: application/json

--- request body ---
{"handle":"qa-3fd418415dfa","displayName":"QA 3fd418415dfa","password":"****","region":"eu"}

--- response: 201 in 389 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3dae5da8-f054-45b6-a7f6-c724b6ebc685
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-3fd418415dfa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74f2b6d3-d7cd-424f-874c-fff9b1b0a648","handle":"qa-3fd418415dfa","displayName":"QA 3fd418415dfa","region":"eu","role":"user","createdAt":"2026-11-21T09:57:06.824313573Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-35e7a9b1-9ba0-4d69-96e3-c4a42e5dbc18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35e7a9b1-9ba0-4d69-96e3-c4a42e5dbc18
Content-Type: application/json

--- request body ---
{"handle":"qa-fda3aef0c253","displayName":"QA fda3aef0c253","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-35e7a9b1-9ba0-4d69-96e3-c4a42e5dbc18
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
Location: /v1/accounts/qa-fda3aef0c253
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7ee8e696-ba3b-4985-aff7-3366e14248d7","handle":"qa-fda3aef0c253","displayName":"QA fda3aef0c253","region":"eu","role":"user","createdAt":"2026-11-21T09:57:07.205084289Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f89c421e-915f-4b81-8085-b185a60ce9ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f89c421e-915f-4b81-8085-b185a60ce9ba
Content-Type: application/json

--- request body ---
{"handle":"qa-3fd418415dfa","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f89c421e-915f-4b81-8085-b185a60ce9ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74f2b6d3-d7cd-424f-874c-fff9b1b0a648"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-607a16d3-487f-4eac-8b44-a608be7e4d6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-607a16d3-487f-4eac-8b44-a608be7e4d6f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fda3aef0c253","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 59 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-607a16d3-487f-4eac-8b44-a608be7e4d6f
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
Location: /v1/conversations/cnv_08788077-fefe-4948-bf50-23525da9aeb2
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_08788077-fefe-4948-bf50-23525da9aeb2","subject":"Lunch?","status":"open","region":"eu","participants":["qa-3fd418415dfa","qa-fda3aef0c253"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:07.357246455Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-3ed086f9-3753-4df4-b373-4a2cf245aae5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ed086f9-3753-4df4-b373-4a2cf245aae5
Content-Type: application/json

--- request body ---
{"handle":"qa-fda3aef0c253","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ed086f9-3753-4df4-b373-4a2cf245aae5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7ee8e696-ba3b-4985-aff7-3366e14248d7"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_08788077-fefe-4948-bf50-23525da9aeb2/messages
correlation: qa-52be27f2-f0f0-46c0-9c7a-a5e101da46a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52be27f2-f0f0-46c0-9c7a-a5e101da46a6
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-52be27f2-f0f0-46c0-9c7a-a5e101da46a6
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
Content-Length: 203

{"id":"msg_ca6b70a6-a830-4187-98d9-3d59ded09238","conversationId":"cnv_08788077-fefe-4948-bf50-23525da9aeb2","sender":"qa-fda3aef0c253","body":"Friday works","createdAt":"2026-11-21T09:57:07.542475967Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_08788077-fefe-4948-bf50-23525da9aeb2/messages
correlation: qa-3c89b2b1-6b70-4754-a8ac-f386bc07a8c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c89b2b1-6b70-4754-a8ac-f386bc07a8c5
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c89b2b1-6b70-4754-a8ac-f386bc07a8c5
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
Content-Length: 432

{"items":[{"id":"msg_0725fcd8-c7bf-4392-aa2d-0c1f91e594b2","conversationId":"cnv_08788077-fefe-4948-bf50-23525da9aeb2","sender":"qa-3fd418415dfa","body":"Free on Friday?","createdAt":"2026-11-21T09:57:07.357492677Z"},{"id":"msg_ca6b70a6-a830-4187-98d9-3d59ded09238","conversationId":"cnv_08788077-fefe-4948-bf50-23525da9aeb2","sender":"qa-fda3aef0c253","body":"Friday works","createdAt":"2026-11-21T09:57:07.542475967Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7be6e6b4-7d5f-424f-8971-aa2c6c16f6c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7be6e6b4-7d5f-424f-8971-aa2c6c16f6c0
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7be6e6b4-7d5f-424f-8971-aa2c6c16f6c0
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
correlation: qa-411e3a64-535b-4cde-8c9b-2369fd249e96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-411e3a64-535b-4cde-8c9b-2369fd249e96
Content-Type: application/json

--- request body ---
{"handle":"qa-fda3aef0c253","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-411e3a64-535b-4cde-8c9b-2369fd249e96
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-411e3a64-535b-4cde-8c9b-2369fd249e96"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-77e4a7bf-2a1e-4c98-a636-d0400d3d4c93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77e4a7bf-2a1e-4c98-a636-d0400d3d4c93
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-77e4a7bf-2a1e-4c98-a636-d0400d3d4c93
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
correlation: qa-df020d5d-03b3-4a03-842e-d4c9e552d3c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df020d5d-03b3-4a03-842e-d4c9e552d3c2
Content-Type: application/json

--- request body ---
{"handle":"qa-3fd418415dfa","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df020d5d-03b3-4a03-842e-d4c9e552d3c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-df020d5d-03b3-4a03-842e-d4c9e552d3c2"}
```
